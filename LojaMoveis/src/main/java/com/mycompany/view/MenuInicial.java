package com.mycompany.view;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Luka
 */
public class MenuInicial extends javax.swing.JFrame {

    public MenuInicial() {
        initComponents();

        //Centralizar a tela
        setLocationRelativeTo(null);

        //Maximizar a tela
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuCadastrarCliente = new javax.swing.JMenuItem();
        mnuManterCliente = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuCadastrarProduto = new javax.swing.JMenuItem();
        mnuManterProduto = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnuRealizarVenda = new javax.swing.JMenuItem();
        mnuRelatórioVendas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Inicial");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Loja KELLPC", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Fax", 0, 18))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1043, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 605, Short.MAX_VALUE)
        );

        jMenu1.setText("Arquivo");

        mnuSair.setText("Sair");
        mnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSairActionPerformed(evt);
            }
        });
        jMenu1.add(mnuSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cliente");

        mnuCadastrarCliente.setText("Cadastrar");
        mnuCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastrarClienteActionPerformed(evt);
            }
        });
        jMenu2.add(mnuCadastrarCliente);

        mnuManterCliente.setText("Consultar / Alterar");
        mnuManterCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManterClienteActionPerformed(evt);
            }
        });
        jMenu2.add(mnuManterCliente);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Produto");

        mnuCadastrarProduto.setText("Cadastrar");
        mnuCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastrarProdutoActionPerformed(evt);
            }
        });
        jMenu3.add(mnuCadastrarProduto);

        mnuManterProduto.setText("Consultar / Alterar");
        mnuManterProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManterProdutoActionPerformed(evt);
            }
        });
        jMenu3.add(mnuManterProduto);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Venda");

        mnuRealizarVenda.setText("Realizar Venda");
        mnuRealizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRealizarVendaActionPerformed(evt);
            }
        });
        jMenu4.add(mnuRealizarVenda);

        mnuRelatórioVendas.setText("Relatório");
        mnuRelatórioVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRelatórioVendasActionPerformed(evt);
            }
        });
        jMenu4.add(mnuRelatórioVendas);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 592, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastrarClienteActionPerformed
        CadastroCliente telaCadastroCliente = new CadastroCliente();
        telaCadastroCliente.setVisible(true);
    }//GEN-LAST:event_mnuCadastrarClienteActionPerformed

    private void mnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuSairActionPerformed

    private void mnuManterClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuManterClienteActionPerformed
        ConsultaCliente telaConsultaCliente = new ConsultaCliente();
        telaConsultaCliente.setVisible(true);
    }//GEN-LAST:event_mnuManterClienteActionPerformed

    private void mnuCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastrarProdutoActionPerformed
        CadastroProduto telaCadastroProduto = new CadastroProduto();
        telaCadastroProduto.setVisible(true);
    }//GEN-LAST:event_mnuCadastrarProdutoActionPerformed

    private void mnuManterProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuManterProdutoActionPerformed
        ConsultaProduto telaConsultaProduto = new ConsultaProduto();
        telaConsultaProduto.setVisible(true);
    }//GEN-LAST:event_mnuManterProdutoActionPerformed

    private void mnuRealizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRealizarVendaActionPerformed
        VendaProduto telaVenda = new VendaProduto();
        telaVenda.setVisible(true);
    }//GEN-LAST:event_mnuRealizarVendaActionPerformed

    private void mnuRelatórioVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRelatórioVendasActionPerformed
        RelatorioSintetico telaRelatorio = new RelatorioSintetico();
        telaRelatorio.setVisible(true);
    }//GEN-LAST:event_mnuRelatórioVendasActionPerformed

    public static void main(String args[]) {
        try {
            // Set cross-platform Java L&F (also called "Metal")
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException e) {
            // handle exception
        } catch (ClassNotFoundException e) {
            // handle exception
        } catch (InstantiationException e) {
            // handle exception
        } catch (IllegalAccessException e) {
            // handle exception
        }

        new MenuInicial(); //Create and show the GUI.

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem mnuCadastrarCliente;
    private javax.swing.JMenuItem mnuCadastrarProduto;
    private javax.swing.JMenuItem mnuManterCliente;
    private javax.swing.JMenuItem mnuManterProduto;
    private javax.swing.JMenuItem mnuRealizarVenda;
    private javax.swing.JMenuItem mnuRelatórioVendas;
    private javax.swing.JMenuItem mnuSair;
    // End of variables declaration//GEN-END:variables
}
