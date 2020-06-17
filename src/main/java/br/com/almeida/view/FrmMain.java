/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.almeida.view;

import br.com.almeida.controller.EmpresaController;
import br.com.almeida.controller.SistemaController;
import br.com.almeida.controller.SolucaoController;
import br.com.almeida.model.Empresa;
import br.com.almeida.model.Sistema;
import br.com.almeida.model.Solucao;
import br.com.almeida.model.ViewSistemasPorEmpresa;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author tfa
 */
public class FrmMain extends javax.swing.JFrame {

    /**
     * Creates new form FrmMain
     */
    public FrmMain() {
        initComponents();
        inicio();
        this.setLocationRelativeTo(null);
    }

    List<Solucao> lista = new ArrayList<Solucao>();
    List<Empresa> listaEmpresa = new ArrayList<>();
    List<ViewSistemasPorEmpresa> listaDeSistemas = new ArrayList<>();
    Solucao solucao;
    int i = 0;
    int j = 0;
    EmpresaController empresaController = new EmpresaController();
    SistemaController sistemaContrller = new SistemaController();
    SolucaoController solucaoController = new SolucaoController();
    Empresa empresa;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        listEmpresa = new java.awt.Choice();
        jLabel2 = new javax.swing.JLabel();
        listSistema = new java.awt.Choice();
        jLabel3 = new javax.swing.JLabel();
        textRegistro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textAssunto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaDescricao = new javax.swing.JTextArea();
        btnBuscarRegistro = new javax.swing.JButton();
        btnBuscarAssunto = new javax.swing.JButton();
        btnVoltaTudo = new javax.swing.JButton();
        btnVoltaUm = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAvancaUm = new javax.swing.JButton();
        btnAvancaTudo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Resoluçoes-Client");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Empresa:");

        listEmpresa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        listEmpresa.setName("ListEmpresa"); // NOI18N
        listEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listEmpresaMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Sistema:");

        listSistema.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        listSistema.setName("ListSistema"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Registro:");

        textRegistro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textRegistroActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Assunto:");

        textAssunto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textAssunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAssuntoActionPerformed(evt);
            }
        });

        textAreaDescricao.setColumns(20);
        textAreaDescricao.setRows(5);
        jScrollPane1.setViewportView(textAreaDescricao);

        btnBuscarRegistro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscarRegistro.setText("Buscar");
        btnBuscarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRegistroActionPerformed(evt);
            }
        });

        btnBuscarAssunto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscarAssunto.setText("Buscar");
        btnBuscarAssunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAssuntoActionPerformed(evt);
            }
        });

        btnVoltaTudo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVoltaTudo.setText("<<");
        btnVoltaTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltaTudoActionPerformed(evt);
            }
        });

        btnVoltaUm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVoltaUm.setText("<");
        btnVoltaUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltaUmActionPerformed(evt);
            }
        });

        btnNovo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAvancaUm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAvancaUm.setText(">");
        btnAvancaUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancaUmActionPerformed(evt);
            }
        });

        btnAvancaTudo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAvancaTudo.setText(">>");
        btnAvancaTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancaTudoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnVoltaTudo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(btnVoltaUm, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAvancaUm, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAvancaTudo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarRegistro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarAssunto))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(listEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(listSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(textAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarRegistro)
                    .addComponent(btnBuscarAssunto))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltaTudo)
                    .addComponent(btnVoltaUm)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar)
                    .addComponent(btnAvancaUm)
                    .addComponent(btnAvancaTudo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textRegistroActionPerformed

    private void textAssuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAssuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAssuntoActionPerformed

    private void btnBuscarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRegistroActionPerformed
        // TODO add your handling code here:
        SolucaoController sc = new SolucaoController();
        Solucao solucao = new Solucao();
        try {
            solucao = sc.buscarId(Integer.valueOf(textRegistro.getText()));
            if (solucao.getId() > 0) {

                encontrouId();

                textRegistro.setText(String.valueOf(solucao.getId()));
                textAssunto.setText(solucao.getAssunto());
                textAreaDescricao.setText(solucao.getDescricao());

                listEmpresa.addItem(solucao.getEmpresa());
                listSistema.addItem(solucao.getSistema());

            } else {
                JOptionPane.showMessageDialog(rootPane, "Não encontrado !");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Não encontrado !\n");
            e.printStackTrace();
        }


    }//GEN-LAST:event_btnBuscarRegistroActionPerformed

    private void btnBuscarAssuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAssuntoActionPerformed
        // TODO add your handling code here:
        if (textAssunto.getText().length() > 3) {
            SolucaoController sc = new SolucaoController();
            //List<Solucao> lista = new ArrayList<Solucao>();

            try {
                lista = sc.buscarAssunto(textAssunto.getText());

                System.out.println("tam: " + lista.size());

                if (lista != null) {
                    System.out.println("lista Form: \n" + lista.get(0).getDescricao());
                    textRegistro.setText(String.valueOf(lista.get(0).getId()));
                    textAssunto.setText(lista.get(0).getAssunto());
                    textAreaDescricao.setText(lista.get(0).getDescricao());
                    encontrouId();
                    if (lista.size() > 1) {
                        listaMaiorQueUm();

                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }//GEN-LAST:event_btnBuscarAssuntoActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        novo();
        listaDeSistemasPorEmpresa(7);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:

        inicio();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        if (validaAntesDeSalvar()) {
            if (textRegistro.getText().length() == 0) {

                try {
                    //salvar
                    solucao = new Solucao();

                    solucao.setAssunto(textAssunto.getText());
                    solucao.setDescricao(textAreaDescricao.getText());
                    solucao.setEmpresa(listEmpresa.getSelectedItem());//MATERA
                    solucao.setSistema(listSistema.getSelectedItem());
                    solucaoController.Cadastrar(solucao);

                    JOptionPane.showMessageDialog(rootPane, "Inserido com sucesso !\nId:");
                    inicio();

                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(rootPane, "Erro:\n" + e.getMessage());
                }

            } else {
                //atualizar
                //Aqui será feita a chamada do controller para fazer a atualização do recurso
            }
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAvancaUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancaUmActionPerformed
        // TODO add your handling code here:
        botaoAvancaUm();

    }//GEN-LAST:event_btnAvancaUmActionPerformed

    private void btnAvancaTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancaTudoActionPerformed
        // TODO add your handling code here:
        botaoAvancaTudo();
    }//GEN-LAST:event_btnAvancaTudoActionPerformed

    private void btnVoltaUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltaUmActionPerformed
        // TODO add your handling code here:
        botaoVoltaUm();
    }//GEN-LAST:event_btnVoltaUmActionPerformed

    private void btnVoltaTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltaTudoActionPerformed
        // TODO add your handling code here:
        botaoVoltaUm();
    }//GEN-LAST:event_btnVoltaTudoActionPerformed

    private void listEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listEmpresaMouseClicked
        eventoClickDoMouseListDeSistema();
    }//GEN-LAST:event_listEmpresaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    public void inicio() {

        //this.setLocationRelativeTo(null);
        textRegistro.setEnabled(true);
        textAssunto.setEnabled(true);
        textAreaDescricao.setEditable(false);

        textRegistro.setText("");
        textAreaDescricao.setText("");
        textAssunto.setText("");

        btnVoltaTudo.setEnabled(false);
        btnVoltaUm.setEnabled(false);
        btnNovo.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnAvancaUm.setEnabled(false);
        btnAvancaTudo.setEnabled(false);

        listEmpresa.removeAll();
        listSistema.removeAll();

    }

    public void encontrouId() {
        textRegistro.setEnabled(false);
        textAssunto.setEnabled(true);
        textAreaDescricao.setEnabled(true);

        btnCancelar.setEnabled(true);
        btnNovo.setEnabled(false);
        btnSalvar.setEnabled(true);

        listarEmpresa();

        //eventoClickDoMouseListDeSistema();
    }

    public void novo() {

        textRegistro.setEnabled(false);
        textAssunto.setEnabled(true);
        textAreaDescricao.setEditable(true);

        textRegistro.setText("");
        textAreaDescricao.setText("");
        textAssunto.setText("");

        btnVoltaTudo.setEnabled(false);
        btnVoltaUm.setEnabled(false);
        btnNovo.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnAvancaUm.setEnabled(false);
        btnAvancaTudo.setEnabled(false);

        listarEmpresa();

    }

    public void listaMaiorQueUm() {

        btnVoltaTudo.setEnabled(true);
        btnVoltaUm.setEnabled(true);
        btnAvancaUm.setEnabled(true);
        btnAvancaTudo.setEnabled(true);

        i = 0;
        j = lista.size();
    }

    public void botaoAvancaUm() {

        i++;
        if (i < lista.size()) {

            textRegistro.setText(String.valueOf(lista.get(i).getId()));
            textAssunto.setText(lista.get(i).getAssunto());
            textAreaDescricao.setText(lista.get(i).getDescricao());

            btnVoltaUm.setEnabled(true);
            btnVoltaTudo.setEnabled(true);

            System.out.println("i = " + i);
        } else {
            btnAvancaUm.setEnabled(false);
            btnAvancaTudo.setEnabled(false);
        }
    }

    public void botaoAvancaTudo() {

        i = lista.size() - 1;

        textRegistro.setText(String.valueOf(lista.get(i).getId()));
        textAssunto.setText(lista.get(i).getAssunto());
        textAreaDescricao.setText(lista.get(i).getDescricao());

        btnAvancaTudo.setEnabled(false);
        btnAvancaUm.setEnabled(false);

        btnVoltaUm.setEnabled(true);
        btnVoltaTudo.setEnabled(true);

    }

    public void botaoVoltaUm() {

        i--;
        textRegistro.setText(String.valueOf(lista.get(i).getId()));
        textAssunto.setText(lista.get(i).getAssunto());
        textAreaDescricao.setText(lista.get(i).getDescricao());

        System.out.println("i = " + i);

        btnAvancaUm.setEnabled(true);
        btnAvancaTudo.setEnabled(true);
        if (i == 0 || i < 0) {
            btnVoltaUm.setEnabled(false);
            btnVoltaTudo.setEnabled(false);

        }
    }

    public void botaoVotaTudo() {

        i = 0;

        textRegistro.setText(String.valueOf(lista.get(i).getId()));
        textAssunto.setText(lista.get(i).getAssunto());
        textAreaDescricao.setText(lista.get(i).getDescricao());

        btnAvancaTudo.setEnabled(true);
        btnAvancaUm.setEnabled(true);

        btnVoltaUm.setEnabled(false);
        btnVoltaTudo.setEnabled(false);

    }

    public void listarEmpresa() {
        try {
            listaEmpresa = empresaController.listaDeEmpresa();

            if (!listaEmpresa.isEmpty()) {
                for (int i = 0; i < listaEmpresa.size(); i++) {
                    listEmpresa.add(listaEmpresa.get(i).getNome());
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Lista de empresa vázia !");
            }

        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }

    }

    public void listaDeSistemasPorEmpresa(int idEmpresa) {

        try {

            listaDeSistemas = sistemaContrller.listaDeSistemaPorEmpresa(idEmpresa);

            if (listaDeSistemas != null) {
                for (int i = 0; i < listaDeSistemas.size(); i++) {
                    listSistema.add(listaDeSistemas.get(i).getNomeSistema());
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Lista de sistema vázia !");
            }

        } catch (Exception ex) {
            Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Erro:\n" + ex.getMessage());
        }

    }

    public void eventoClickDoMouseListDeSistema() {
        if (listEmpresa != null) {
            listSistema.removeAll();
            if (listEmpresa.getSelectedItem().equals("MATERA")) {
                listaDeSistemasPorEmpresa(7);
            }
        }
    }

    public boolean validaAntesDeSalvar() {

        boolean retorno = false;

        if (textAssunto.getText().length() > 3) {

            if (textAreaDescricao.getText().length() > 3) {

                //if (listEmpresa.getSelectedItem().length() >= 0) {
                if (listSistema.getSelectedItem().length() > 3) {

                    retorno = true;

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Informe um sistema válida !");
                }

                //} else {
                //JOptionPane.showMessageDialog(rootPane, "Informe uma empresa válida !");
                //}
            } else {
                JOptionPane.showMessageDialog(rootPane, "A descrição deve conter pelo menos três caracteres !");
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "O assunto deve conter pelo menos três caracteres !");
        }

        return retorno;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvancaTudo;
    private javax.swing.JButton btnAvancaUm;
    private javax.swing.JButton btnBuscarAssunto;
    private javax.swing.JButton btnBuscarRegistro;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltaTudo;
    private javax.swing.JButton btnVoltaUm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Choice listEmpresa;
    private java.awt.Choice listSistema;
    private javax.swing.JTextArea textAreaDescricao;
    private javax.swing.JTextField textAssunto;
    private javax.swing.JTextField textRegistro;
    // End of variables declaration//GEN-END:variables
}
