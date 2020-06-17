/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.almeida.controller;

import br.com.almeida.model.Solucao;
import br.com.almeida.model.ViewSistemasPorEmpresa;
import br.com.almeida.util.UriPadrao;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.*;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ProcessBuilder.Redirect.Type;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.jboss.resteasy.spi.HttpResponse;

/**
 *
 * @author tfa
 */
public class SolucaoController {

    Solucao solucao = null;

    String applicationType = "application/json";
    ClientResponse response = null;
    String uriPrincipal = "http://192.168.0.13:8080/resolucoes-api/";
    String retorno = "";
    Gson gson = new Gson();
    List<Solucao> lista = null;
    UriPadrao uri = new UriPadrao();

    SistemaController sistemaController = new SistemaController();
    List<ViewSistemasPorEmpresa> listaDeSistemaPorEmpresa = new ArrayList<ViewSistemasPorEmpresa>();
    ViewSistemasPorEmpresa viewSistemasPorEmpresa;

    /**
     * GERENCIA A INFRAESTRUTURA DE COMUNIÇÃO DO LADO CLIENTE PARA EXECUTAR AS
     * SOLICITAÇÕES REALIZADAS
     */
    /**
     * URL DO SERVIÇO REST QUE VAMOS ACESSAR
     */
    //private final String URL_SERVICE = "http://localhost:8081/WebServiceRest/rest/service/";
    private final String URL_SERVICE = "http://localhost:8080/resolucoes-api/";

    //http://192.168.0.13:8080/resolucoes-api/
    public Solucao buscarId(Integer id) throws Exception {

        Client cli = Client.create();
        WebResource web = cli.resource(uriPrincipal + "solucao/buscaid/" + id);
        response = web.accept(applicationType).get(ClientResponse.class);

        if (response.getStatus() != 200) {
            System.out.println("Failed: HTTTP erro code : " + response.getStatus());
        } else {
            retorno = response.getEntity(String.class);
            System.out.println("resposta: " + retorno);
            solucao = new Solucao();
            solucao = gson.fromJson(retorno, Solucao.class);
        }

        return solucao;
    }

    public List<Solucao> buscarAssunto(String assunto) throws FileNotFoundException {

        if (assunto.length() > 3) {
            lista = new ArrayList<Solucao>();

            Client cli = Client.create();
            WebResource web = cli.resource(uriPrincipal + "solucao/buscanome/" + assunto);
            response = web.accept(applicationType).get(ClientResponse.class);

            if (response.getStatus() != 200) {
                System.out.println("Failed: HTTTP erro code : " + response.getStatus());
            } else {
                retorno = response.getEntity(String.class);
                System.out.println("resposta: " + retorno);
                solucao = new Solucao();
                // lista = (List) gson.fromJson(retorno, Solucao.class);

                java.lang.reflect.Type collectionType = new TypeToken<List<Solucao>>() {
                }.getType();
                lista = gson.fromJson(retorno, collectionType);

                System.out.println("lista\n: " + lista.get(0).getId());
            }

        }

        return lista;
    }

    public String Cadastrar(Solucao solucao) throws UnsupportedEncodingException, IOException, Exception {

        retorno = "";

        
        solucao.setIdSistema(retornaIdSistemaSelecionado(solucao.getSistema(), 7));
        solucao.setIdEmpresa(7);//EMPRESA MATERA
        
        
        String postUrl = uri.getUri() + "solucao";// put in your url
        Gson gson = new Gson();
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost(postUrl);
        StringEntity postingString = new StringEntity(gson.toJson(solucao));//gson.tojson() converts your pojo to json
        post.setEntity(postingString);
        post.setHeader("Content-type", "application/json");

        org.apache.http.HttpResponse response = httpClient.execute(post);

        //return Response.status(200).entity(response.getEntity().getContent()).build().toString();
        return response.getEntity().getContent().toString();

    }

    public Integer retornaIdSistemaSelecionado(String sistema, int idEmpresa) throws Exception {

        listaDeSistemaPorEmpresa = sistemaController.listaDeSistemaPorEmpresa(idEmpresa);
        //viewSistemasPorEmpresa = new ViewSistemasPorEmpresa();
        int idRetornado = 0;
        System.out.println("Obtendo id so sistema selecionado.");
        for (ViewSistemasPorEmpresa viewSistemasPorEmpresa : listaDeSistemaPorEmpresa) {

            if (sistema.equals(viewSistemasPorEmpresa.getNomeSistema())) {
                idRetornado = viewSistemasPorEmpresa.getId();
            }

        }

        if (idRetornado > 0) {
            System.out.println("id do sistema obtido: " + idRetornado);
        } else {
            System.out.println("Não foi possível obeter o id do sistema: " + idRetornado);
        }

        return idRetornado;
    }
}

/*

site: https://www.devmedia.com.br/rest-tutorial/28912

public Contact add(Contact contact) {
  Invocation.Builder invocationBuilder = baseTarget.request
 (MediaType.APPLICATION_JSON);
  Response response = invocationBuilder.post(Entity.entity
  (contact,MediaType.APPLICATION_JSON));
  
  if (response.getStatus() != Response.Status.OK.getStatusCode()) {
   throw new RuntimeException("Erro criando contato");
  }
  return response.readEntity(Contact.class);
 }


 */
