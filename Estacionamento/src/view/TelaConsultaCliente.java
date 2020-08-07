/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.GerenciaCliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;

/**
 *
 * @author Jardel
 */
public class TelaConsultaCliente extends javax.swing.JFrame {
    ArrayList<Cliente> arrayClientes = new ArrayList<>();
    GerenciaCliente gc = new GerenciaCliente();
    
    /**
     * Creates new form TelaConsultaCliente
     */
    public TelaConsultaCliente() {
        initComponents();
        //arrayClientes = null;
        //arrayClientes = gc.listar();
        carregarTabela();
        estadoBotaoExcluir(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        tfNome = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        tfLogradouro = new javax.swing.JTextField();
        tfNumero = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfBairro = new javax.swing.JTextField();
        tfMunicipio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfEstado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfCep = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfTelefone = new javax.swing.JTextField();
        tfPesquisarPorCodigo = new javax.swing.JTextField();
        btnPesquisa = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPesquisaCliente = new javax.swing.JTable();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        tfCodigo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel7.setText("Estado:");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consulta Clientes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel2.setText("Nome:");

        tfEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEstadoActionPerformed(evt);
            }
        });

        jLabel3.setText("Logradouro:");

        jLabel8.setText("CEP:");

        jLabel4.setText("Número:");

        jLabel9.setText("Telefone:");

        jLabel5.setText("Bairro:");

        jLabel6.setText("Município:");

        btnPesquisa.setText("Pesquisar");
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        jLabel10.setText("Pesquisar por código:");

        tblPesquisaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Logradouro", "Número", "Bairro", "Município", "Estado", "CEP", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPesquisaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPesquisaClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPesquisaCliente);

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel11.setText("CÓDIGO:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar)
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9)
                            .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(tfCep, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfPesquisarPorCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfLogradouro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnPesquisa)
                                        .addGap(32, 32, 32)
                                        .addComponent(btnAtualizar))))
                            .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(86, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPesquisarPorCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisa)
                    .addComponent(btnAtualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar)
                    .addComponent(btnExcluir))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEstadoActionPerformed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        Cliente c = gc.buscarPorCodigo(Integer.parseInt(tfPesquisarPorCodigo.getText()));
        
        if (c != null) {
            arrayClientes = null;
            arrayClientes = gc.listar();

            Object colunas[] = {"código", "nome", "logradouro", "número", "bairro", "município", "estado", "CEP", "telefone"};
            DefaultTableModel modelo = new DefaultTableModel(colunas, 0);
            System.out.println("Tem esse código, indice: "+arrayClientes.indexOf(c.getCodigo()));
            System.out.println("Código encontrado: "+c.getCodigo());
            Object linhas[] = new Object[]{
                c.getCodigo(),
                c.getNome(),
                c.getLogradouro(),
                c.getNumero(),
                c.getBairro(),
                c.getMunicipio(),
                c.getEstado(),
                c.getCep(),
                c.getTelefone()
            };
            modelo.addRow(linhas);

            tblPesquisaCliente.setModel(modelo);
            tfNome.setText(c.getNome());
            tfLogradouro.setText(c.getLogradouro());
            tfNumero.setText(c.getNumero());
            tfMunicipio.setText(c.getMunicipio());
            tfBairro.setText(c.getBairro());
            tfEstado.setText(c.getEstado());
            tfCep.setText(c.getCep());
            tfTelefone.setText(c.getTelefone());
            tfCodigo.setText(String.valueOf(c.getCodigo()));
            
        }else{
            JOptionPane.showMessageDialog(this, "Não encontrado");
        }

    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        String nome = tfNome.getText(),
                logradouro = tfLogradouro.getText(),
                numero = tfNumero.getText(),
                bairro = tfBairro.getText(),
                municipio = tfMunicipio.getText(),
                estado = tfEstado.getText(),
                cep = tfCep.getText(),
                telefone = tfTelefone.getText();
        int codigo = Integer.parseInt(tfCodigo.getText());

        String mensagem = gc.editar(codigo, nome, logradouro, numero, bairro, municipio, estado, cep);

        if (mensagem.equals("ok")) {
            carregarTabela();
            JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
            limpaTela();
        } else {
            JOptionPane.showMessageDialog(this, "Erro! " + mensagem);
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        carregarTabela();
        
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void tblPesquisaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPesquisaClienteMouseClicked
        int index = tblPesquisaCliente.getSelectedRow();
        //arrayClientes = null;
        //arrayClientes = gc.listar();

        if (index >= 0 && index < arrayClientes.size()) {
            Cliente c = arrayClientes.get(index);
            System.out.println("Cliente: "+c.getNome());
            
            tfNome.setText(c.getNome());
            tfLogradouro.setText(c.getLogradouro());
            tfNumero.setText(c.getNumero());
            tfMunicipio.setText(c.getMunicipio());
            tfBairro.setText(c.getBairro());
            tfEstado.setText(c.getEstado());
            tfCep.setText(c.getCep());
            tfTelefone.setText(c.getTelefone());
            tfCodigo.setText(String.valueOf(c.getCodigo()));
            
            estadoBotaoExcluir(true);
        }

    }//GEN-LAST:event_tblPesquisaClienteMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpaTela();
        estadoBotaoExcluir(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tfCodigo.getText().trim() != null) {
            int resp = JOptionPane.showConfirmDialog(null,
                    "Realmente quer excluir?",
                    "Confirmação de exclusão", JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            System.out.println("resposta: " + resp);

            if (resp == JOptionPane.YES_OPTION) {
                String mensagem = gc.excluir(Integer.parseInt(tfCodigo.getText()));

                if (mensagem.equals("ok")) {
                    carregarTabela();
                    JOptionPane.showMessageDialog(this, "Excluído com sucesso!");
                    limpaTela();
                } else {
                    JOptionPane.showMessageDialog(this, "Erro! " + mensagem);
                }
            }else {
                System.out.println("Exclusão cancelada!");
                JOptionPane.showMessageDialog(null, "Exclusão cancelada!", "Informação", JOptionPane.INFORMATION_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Atenção, está faltando preecher algum campo!");
        }

    }//GEN-LAST:event_btnExcluirActionPerformed
    
    public void carregarTabela(){
        //ArrayList<Cliente> arrayClientes = new ArrayList<>();
        arrayClientes = null;
        arrayClientes = gc.listar();
        
        Object colunas[] = {"código","nome","logradouro","número","bairro","município","estado","CEP","telefone"};
        DefaultTableModel modelo = new DefaultTableModel(colunas,0);
        
        for(int i=0; i < arrayClientes.size(); i++){
            Object linhas[] = new Object[] {
                arrayClientes.get(i).getCodigo(),
                arrayClientes.get(i).getNome(),
                arrayClientes.get(i).getLogradouro(),
                arrayClientes.get(i).getNumero(),
                arrayClientes.get(i).getBairro(),
                arrayClientes.get(i).getMunicipio(),
                arrayClientes.get(i).getEstado(),
                arrayClientes.get(i).getCep(),
                arrayClientes.get(i).getTelefone()
            };
            modelo.addRow(linhas);
        }
        
        tblPesquisaCliente.setModel(modelo);
    }
    
    public void limpaTela(){
        tfNome.setText("");
        tfLogradouro.setText("");
        tfNumero.setText("");
        tfMunicipio.setText("");
        tfBairro.setText("");
        tfEstado.setText("");
        tfCep.setText("");
        tfTelefone.setText("");
        tfCodigo.setText("");
    }
    public void estadoBotaoExcluir(boolean estado){
        btnExcluir.setEnabled(estado);
    }
    
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
            java.util.logging.Logger.getLogger(TelaConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPesquisaCliente;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfCep;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfEstado;
    private javax.swing.JTextField tfLogradouro;
    private javax.swing.JTextField tfMunicipio;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfPesquisarPorCodigo;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
