/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.almeida.test;

import br.com.almeida.controller.EmpresaController;
import br.com.almeida.controller.SolucaoController;
import br.com.almeida.model.Solucao;
import br.com.almeida.view.FrmMain;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tales
 */
public class Main {

    public static void main(String[] args) {

        SolucaoController sc = new SolucaoController();
        //Solucao sol =  new Solucao();

        /*
        try{
            sol = sc.buscarId(13);
            
            System.out.println("res:\n "+sol.getDescricao());
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
         */
        FrmMain form = new FrmMain();

        form.show();

        /*
        Solucao sol = new Solucao();

        sol.setAssunto("realizando um novo teste de post");
        sol.setDescricao("novamentes está sendo realizado um novo teste de post na api");
        sol.setIdEmpresa(7);
        sol.setIdSistema(10);
        sol.setIdNivelVisualizacao(12);

        System.out.println("chama gravação");
        try {
            System.out.println("resposta: " + sc.Cadastrar(sol));

        } catch (IOException ex) {
            ex.printStackTrace();

        }
         */
    }

}
