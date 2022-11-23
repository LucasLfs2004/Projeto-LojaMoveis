package com.mycompany.view;

import com.mycompany.DAO.ProdutoDAO;
import com.mycompany.model.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luka
 */
public class ConsultaProduto extends javax.swing.JFrame {

    Produto objProduto;

    public ConsultaProduto() {
        initComponents();

        setLocationRelativeTo(null);
        objProduto = new Produto();

        //Carregar todos os clientes na tabela ao iniciar este JFrame
        CarregarJTable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPesquisar = new javax.swing.JButton();
        txtBuscaTipo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnAlterar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta Vendas");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busque pelo tipo de produto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Fax", 0, 18))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N

        btnPesquisar.setFont(new java.awt.Font("Lucida Fax", 1, 13)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        jLabel1.setText("Tipo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtBuscaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jScrollPane1.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N

        tblProduto.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo", "Preço", "Cor", "Quantidade", "Descrição"
            }
        ));
        jScrollPane1.setViewportView(tblProduto);

        jPanel2.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N

        btnAlterar.setFont(new java.awt.Font("Lucida Fax", 1, 13)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnNovo.setFont(new java.awt.Font("Lucida Fax", 1, 13)); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Lucida Fax", 1, 13)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnMenu.setFont(new java.awt.Font("Lucida Fax", 1, 13)); // NOI18N
        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("Busque pela categoria do produto\n");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        //Peço à classe DAO para consultar os clientes
        ArrayList<Produto> listaProdutos = ProdutoDAO.consultarProdutos(txtBuscaTipo.getText());

        DefaultTableModel tmProduto = new DefaultTableModel();
        tmProduto.addColumn("ID");
        tmProduto.addColumn("Tipo");
        tmProduto.addColumn("Preço");
        tmProduto.addColumn("Cor");
        tmProduto.addColumn("Quantidade");
        tmProduto.addColumn("Descrção");
        tblProduto.setModel(tmProduto);

        //Limpo a tabela, excluindo todas as linhas para depois mostrar os dados novamente
        tmProduto.setRowCount(0);

        //Para cada cliente resgatado do banco de dados, atualizo a tabela
        for (Produto c : listaProdutos) {
            tmProduto.addRow(new Object[]{c.getId(), c.getTipo(), c.getPreco(), c.getCor(), c.getQuantidade(), c.getDescricao()});
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (tblProduto.getRowCount() > 0) {
            //Resgato o número da linha pelo JTable
            int numeroLinha = tblProduto.getSelectedRow();

            //Resgato o ID (oculto) do cliente pelo JTableModel
            int id_produto = Integer.parseInt(tblProduto.getModel().getValueAt(numeroLinha, 0).toString());
            String tipo = tblProduto.getModel().getValueAt(numeroLinha, 1).toString();
            double preco = Double.parseDouble(tblProduto.getModel().getValueAt(numeroLinha, 2).toString());
            String cor = tblProduto.getModel().getValueAt(numeroLinha, 3).toString();
            int quantidade = Integer.parseInt(tblProduto.getModel().getValueAt(numeroLinha, 4).toString());
            String descricao = tblProduto.getModel().getValueAt(numeroLinha, 5).toString();

            objProduto.setId(id_produto);
            objProduto.setTipo(tipo);
            objProduto.setPreco(preco);
            objProduto.setCor(cor);
            objProduto.setQuantidade(quantidade);
            objProduto.setDescricao(descricao);

            //Passo o objeto para a tela de Cadastro informando que é alteração
            CadastroProduto telaCadastroProduto = new CadastroProduto(objProduto);
            telaCadastroProduto.modoTela = "Alteração";

            //Exibir o JFrame
            this.dispose();
            telaCadastroProduto.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um produto da tabela!");
        }

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.dispose();
        CadastroProduto telaCadastroProduto = new CadastroProduto();
        telaCadastroProduto.setVisible(true);

    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        //Resgato as informações da linha para passar a tela de Cadastro/Alteração
        if (tblProduto.getRowCount() > 0) {
            //Resgato o número da linha pelo JTable
            //Resgato o número da linha pelo JTable
            int numeroLinha = tblProduto.getSelectedRow();

            //Resgato o ID (oculto) do cliente pelo JTableModel
            int id_produto = Integer.parseInt(tblProduto.getModel().getValueAt(numeroLinha, 0).toString());
            String tipo = tblProduto.getModel().getValueAt(numeroLinha, 1).toString();
            double preco = Double.parseDouble(tblProduto.getModel().getValueAt(numeroLinha, 2).toString());
            String cor = tblProduto.getModel().getValueAt(numeroLinha, 3).toString();
            int quantidade = Integer.parseInt(tblProduto.getModel().getValueAt(numeroLinha, 4).toString());
            String descricao = tblProduto.getModel().getValueAt(numeroLinha, 5).toString();

            objProduto.setId(id_produto);
            objProduto.setTipo(tipo);
            objProduto.setPreco(preco);
            objProduto.setCor(cor);
            objProduto.setQuantidade(quantidade);
            objProduto.setDescricao(descricao);

            if (ProdutoDAO.excluir(objProduto.getId())) {
                JOptionPane.showMessageDialog(this, "Produto excluído com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Falha ao excluir produto!");
            }

            //Consulto novamente a base de dados
            CarregarJTable();

        } else {
            JOptionPane.showMessageDialog(this, "Selecione um produto da tabela!");
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    public void CarregarJTable() {

        ArrayList<Produto> listaProdutos = ProdutoDAO.consultarProdutos();

        DefaultTableModel tmProduto = new DefaultTableModel();
        tmProduto.addColumn("ID");
        tmProduto.addColumn("Tipo");
        tmProduto.addColumn("Preço");
        tmProduto.addColumn("Cor");
        tmProduto.addColumn("Quantidade");
        tmProduto.addColumn("Descrição");

        //Defina sua estrutura com a estrutura tmClientes;
        tblProduto.setModel(tmProduto);

        //Limpo a tabela, excluindo todas as linhas para depois mostrar os dados novamente
        tmProduto.setRowCount(0);

        for (Produto c : listaProdutos) {
            tmProduto.addRow(new Object[]{c.getId(), c.getTipo(), c.getPreco(), c.getCor(), c.getQuantidade(), c.getDescricao()});
        }

    }

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

        new ConsultaProduto(); //Create and show the GUI.

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextField txtBuscaTipo;
    // End of variables declaration//GEN-END:variables
}
