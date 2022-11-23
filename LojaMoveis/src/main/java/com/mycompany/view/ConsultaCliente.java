package com.mycompany.view;

import com.mycompany.DAO.ClienteDAO;
import java.sql.Date;
import com.mycompany.model.Cliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luka
 */
public class ConsultaCliente extends javax.swing.JFrame {

    Cliente objCliente;

    public ConsultaCliente() {
        initComponents();

        setLocationRelativeTo(null);
        objCliente = new Cliente();

        //Carregar todos os clientes na tabela ao iniciar este JFrame
        CarregarJTable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPesquisar = new javax.swing.JButton();
        txtBuscaNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscaCPF = new javax.swing.JFormattedTextField();
        btnPesquisarCPF = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnAlterar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta Vendas");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busque pelo nome ou CPF do cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Fax", 0, 18))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N

        btnPesquisar.setFont(new java.awt.Font("Lucida Fax", 1, 13)); // NOI18N
        btnPesquisar.setText("Pesquisar Nome");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        jLabel2.setText("CPF:");

        try {
            txtBuscaCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnPesquisarCPF.setFont(new java.awt.Font("Lucida Fax", 1, 13)); // NOI18N
        btnPesquisarCPF.setText("Pesquisar CPF");
        btnPesquisarCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarCPFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBuscaNome, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
                    .addComponent(txtBuscaCPF))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarCPF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(txtBuscaNome, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBuscaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jScrollPane1.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N

        tblCliente.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "Sexo", "Estado Civil", "E-mail", "Telefone", "Data de Nascimento", "Endereço", "CEP"
            }
        ));
        jScrollPane1.setViewportView(tblCliente);

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
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
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
                .addContainerGap(98, Short.MAX_VALUE))
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 917, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        //Peço à classe DAO para consultar os clientes
        ArrayList<Cliente> listaClientes = ClienteDAO.consultarClientes(txtBuscaNome.getText());

        DefaultTableModel tmCliente = new DefaultTableModel();
        tmCliente.addColumn("ID");
        tmCliente.addColumn("Nome");
        tmCliente.addColumn("CPF");
        tmCliente.addColumn("Sexo");
        tmCliente.addColumn("Estado Civil");
        tmCliente.addColumn("E-mail");
        tmCliente.addColumn("Telefone");
        tmCliente.addColumn("Data de Nascimento");
        tmCliente.addColumn("Endereço");
        tmCliente.addColumn("CEP");
        tblCliente.setModel(tmCliente);

        //Limpo a tabela, excluindo todas as linhas para depois mostrar os dados novamente
        tmCliente.setRowCount(0);

        //Para cada cliente resgatado do banco de dados, atualizo a tabela
        for (Cliente c : listaClientes) {
            tmCliente.addRow(new Object[]{c.getId(), c.getNome(), c.getCPF(), c.getSexo(), c.getEstadoCivil(), c.getEmail(), c.getTelefone(), c.getDataCliente(), c.getRua(), c.getCEP()});
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (tblCliente.getRowCount() > 0) {
            //Resgato o número da linha pelo JTable
            int numeroLinha = tblCliente.getSelectedRow();

            //Resgato o ID (oculto) do cliente pelo JTableModel
            int id_cliente = Integer.parseInt(tblCliente.getModel().getValueAt(numeroLinha, 0).toString());
            String nome = tblCliente.getModel().getValueAt(numeroLinha, 1).toString();
            String cpf = tblCliente.getModel().getValueAt(numeroLinha, 2).toString();
            String sexo = tblCliente.getModel().getValueAt(numeroLinha, 3).toString();
            String estadoCivil = tblCliente.getModel().getValueAt(numeroLinha, 4).toString();
            String email = tblCliente.getModel().getValueAt(numeroLinha, 5).toString();
            String telefone = tblCliente.getModel().getValueAt(numeroLinha, 6).toString();
            Date data = Date.valueOf(tblCliente.getModel().getValueAt(numeroLinha, 7).toString());
            String rua = tblCliente.getModel().getValueAt(numeroLinha, 8).toString();
            String cep = tblCliente.getModel().getValueAt(numeroLinha, 9).toString();

            objCliente.setId(id_cliente);
            objCliente.setNome(nome);
            objCliente.setCPF(cpf);
            objCliente.setSexo(sexo);
            objCliente.setEstadoCivil(estadoCivil);
            objCliente.setEmail(email);
            objCliente.setTelefone(telefone);
            objCliente.setDataCliente(data);
            objCliente.setRua(rua);
            objCliente.setCEP(cep);

            //Passo o objeto para a tela de Cadastro informando que é alteração
            CadastroCliente telaCadastroCliente = new CadastroCliente(objCliente);
            telaCadastroCliente.modoTela = "Alteração";

            //Exibir o JFrame
            this.dispose();
            telaCadastroCliente.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um cliente da tabela!");
        }

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.dispose();
        CadastroCliente telaCadastroCliente = new CadastroCliente();
        telaCadastroCliente.setVisible(true);

    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        //Resgato as informações da linha para passar a tela de Cadastro/Alteração
        if (tblCliente.getRowCount() > 0) {
            //Resgato o número da linha pelo JTable
            //Resgato o número da linha pelo JTable
            int numeroLinha = tblCliente.getSelectedRow();

            //Resgato o ID (oculto) do cliente pelo JTableModel
            int id_cliente = Integer.parseInt(tblCliente.getModel().getValueAt(numeroLinha, 0).toString());
            String nome = tblCliente.getModel().getValueAt(numeroLinha, 1).toString();
            String cpf = tblCliente.getModel().getValueAt(numeroLinha, 2).toString();
            String sexo = tblCliente.getModel().getValueAt(numeroLinha, 3).toString();
            String estadoCivil = tblCliente.getModel().getValueAt(numeroLinha, 4).toString();
            String email = tblCliente.getModel().getValueAt(numeroLinha, 5).toString();
            String telefone = tblCliente.getModel().getValueAt(numeroLinha, 6).toString();
            Date data = Date.valueOf(tblCliente.getModel().getValueAt(numeroLinha, 7).toString());
            String rua = tblCliente.getModel().getValueAt(numeroLinha, 8).toString();
            String cep = tblCliente.getModel().getValueAt(numeroLinha, 9).toString();

            objCliente.setId(id_cliente);
            objCliente.setNome(nome);
            objCliente.setCPF(cpf);
            objCliente.setSexo(sexo);
            objCliente.setEstadoCivil(estadoCivil);
            objCliente.setEmail(email);
            objCliente.setTelefone(telefone);
            objCliente.setDataCliente(data);
            objCliente.setRua(rua);
            objCliente.setCEP(cep);

            if (ClienteDAO.excluir(objCliente.getId())) {
                JOptionPane.showMessageDialog(this, "Cliente excluído com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Falha o excluir cliente!");
            }

            //Consulto novamente a base de dados
            CarregarJTable();

        } else {
            JOptionPane.showMessageDialog(this, "Selecione um cliente da tabela!");
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarCPFActionPerformed
        // TODO add your handling code here:
        ArrayList<Cliente> listaClientes = ClienteDAO.consultarCPFCliente(txtBuscaCPF.getText());

        DefaultTableModel tmCliente = new DefaultTableModel();
        tmCliente.addColumn("ID");
        tmCliente.addColumn("Nome");
        tmCliente.addColumn("CPF");
        tmCliente.addColumn("Sexo");
        tmCliente.addColumn("Estado Civil");
        tmCliente.addColumn("E-mail");
        tmCliente.addColumn("Telefone");
        tmCliente.addColumn("Data de Nascimento");
        tmCliente.addColumn("Endereço");
        tmCliente.addColumn("CEP");
        tblCliente.setModel(tmCliente);

        //Limpo a tabela, excluindo todas as linhas para depois mostrar os dados novamente
        tmCliente.setRowCount(0);

        //Para cada cliente resgatado do banco de dados, atualizo a tabela
        for (Cliente c : listaClientes) {
            tmCliente.addRow(new Object[]{c.getId(), c.getNome(), c.getCPF(), c.getSexo(), c.getEstadoCivil(), c.getEmail(), c.getTelefone(), c.getDataCliente(), c.getRua(), c.getCEP()});
        }
    }//GEN-LAST:event_btnPesquisarCPFActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    public void CarregarJTable() {

        ArrayList<Cliente> listaClientes = ClienteDAO.consultarClientes();

        DefaultTableModel tmCliente = new DefaultTableModel();
        tmCliente.addColumn("ID");
        tmCliente.addColumn("Nome");
        tmCliente.addColumn("CPF");
        tmCliente.addColumn("Sexo");
        tmCliente.addColumn("Estado Civil");
        tmCliente.addColumn("E-mail");
        tmCliente.addColumn("Telefone");
        tmCliente.addColumn("Data de Nascimento");
        tmCliente.addColumn("Endereço");
        tmCliente.addColumn("CEP");

        //Defina sua estrutura com a estrutura tmClientes;
        tblCliente.setModel(tmCliente);

        //Limpo a tabela, excluindo todas as linhas para depois mostrar os dados novamente
        tmCliente.setRowCount(0);

        for (Cliente c : listaClientes) {
            tmCliente.addRow(new Object[]{c.getId(), c.getNome(), c.getCPF(), c.getSexo(), c.getEstadoCivil(), c.getEmail(), c.getTelefone(), c.getDataCliente(), c.getRua(), c.getCEP()});
        }

    }

    public static void main(String args[]) {
        try {
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

        new ConsultaCliente(); //Create and show the GUI.

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPesquisarCPF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCliente;
    private javax.swing.JFormattedTextField txtBuscaCPF;
    private javax.swing.JTextField txtBuscaNome;
    // End of variables declaration//GEN-END:variables
}
