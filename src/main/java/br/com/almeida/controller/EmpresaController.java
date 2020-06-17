/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.almeida.controller;

import br.com.almeida.model.Empresa;
import br.com.almeida.util.UriPadrao;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.ClientResponse;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
//import javax.ws.rs.core.Response;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tfa
 */
public class EmpresaController {

    private UriPadrao uri = new UriPadrao();
    WebTarget baseTarget;
    private Client client = ClientBuilder.newClient();
    private Response response;
    private String retorno;
    private Empresa empresa;
    private Gson gson = new Gson();

    List<Empresa> lista;

    public List<Empresa> listaDeEmpresa() throws Exception {
        return null;

        /*
        Invocation.Builder invocationBuilder = baseTarget.request(MediaType.APPLICATION_JSON);
        Response response = invocationBuilder.get();

        if (response.getStatus() != Response.Status.OK.getStatusCode()) {
            throw new RuntimeException("Erro listando contatos");
        }

        java.lang.reflect.Type collectionType = new TypeToken<List<Empresa>>() {
        }.getType();
        lista = gson.fromJson(retorno, collectionType);
        
        System.out.println("lista: "+lista.get(0).getNome());
        
        return lista;
         */

    }

}
