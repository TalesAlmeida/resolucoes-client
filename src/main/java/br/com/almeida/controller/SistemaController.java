/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.almeida.controller;
import br.com.almeida.model.Sistema;
import br.com.almeida.model.ViewSistemasPorEmpresa;
import br.com.almeida.util.UriPadrao;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author tfa
 */
public class SistemaController {
     private UriPadrao uri = new UriPadrao();

    private String retorno;
    private Sistema sistema;
    private ViewSistemasPorEmpresa viewSistemasPorEmpresa;
    private Gson gson = new Gson();
    ClientResponse response = null;
    String applicationType = "application/json";

    List<ViewSistemasPorEmpresa> listaDeSistema;

    public List<ViewSistemasPorEmpresa> listaDeSistemaPorEmpresa(int idEmpresa) throws Exception {

        listaDeSistema = new ArrayList<ViewSistemasPorEmpresa>();

        Client cli = Client.create();
        WebResource web = cli.resource(uri.getUri() + "sistema/sistemasporempresa/"+idEmpresa);
        response = web.accept(applicationType).get(ClientResponse.class);
        

        if (response.getStatus() != 200) {
            System.out.println("Failed: HTTTP erro code : " + response.getStatus());
        } else {
            retorno = response.getEntity(String.class);
            System.out.println("resposta: " + retorno);
            viewSistemasPorEmpresa = new ViewSistemasPorEmpresa();
            // lista = (List) gson.fromJson(retorno, Solucao.class);

            java.lang.reflect.Type collectionType = new TypeToken<List<ViewSistemasPorEmpresa>>() {
            }.getType();
            listaDeSistema = gson.fromJson(retorno, collectionType);

            System.out.println("lista\n: " + listaDeSistema.get(0).getId());
        }

        return listaDeSistema;

    }
}
