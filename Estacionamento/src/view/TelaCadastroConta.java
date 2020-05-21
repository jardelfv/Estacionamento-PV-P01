/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.PatioDAO;
import controller.GerenciaCliente;
import controller.GerenciaConta;
import controller.GerenciaVeiculo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.internal.objects.NativeArray;
import model.Cliente;
import model.Patio;
import model.PatioComboboxModel;
import model.Veiculo;

/**
 *
 * @author jardel
 */
public class TelaCadastroConta extends javax.swing.JFrame {
    ArrayList<Cliente> arrayClientes = new ArrayList<>();
    GerenciaCliente gc = new GerenciaCliente();
    ArrayList<Veiculo> veiculos = new ArrayList<>();
    GerenciaVeiculo gv = new GerenciaVeiculo();
    ArrayList<Patio> patios = new ArrayList<>();
    PatioDAO patioDao = new PatioDAO();
    GerenciaConta gConta = new GerenciaConta();
    String modo;
    String filtro = "geral";
    
    private PatioComboboxModel patioComboBoxModel;
    /**
     * Creates new form TelaCadastroConta
     */
    public TelaCadastroConta() {
        initComponents();
        manipulaComponentes();
        patioComboBoxModel = new PatioComboboxModel();
        carregarCombobox();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPesquisaCliente = new javax.swing.JTable();
        btnPesquisaCliente = new javax.swing.JButton();
        tfPesquisarPorCodigo = new javax.swing.JTextField();
        btnAtualizar = new javax.swing.JButton();
        tfCodigoCliente = new javax.swing.JTextField();
        tfNomeCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        tfPesquisarPorPlaca = new javax.swing.JTextField();
        btnPesquisaVeiculo = new javax.swing.JButton();
        btnAtualizar1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPesquisaVeiculo = new javax.swing.JTable();
        tfPlaca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfModelo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cbNomePatio = new javax.swing.JComboBox<>();
        btnSelecionar = new javax.swing.JButton();
        tfCodigoPatio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro Conta");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Escolher Cliente"));

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

        btnPesquisaCliente.setText("Pesquisar");
        btnPesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaClienteActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        jLabel2.setText("Código:");

        jLabel3.setText("Nome:");

        jLabel8.setText("Pesquisar por código:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(tfPesquisarPorCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisaCliente)
                                .addGap(37, 37, 37)
                                .addComponent(btnAtualizar))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisaCliente)
                    .addComponent(tfPesquisarPorCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cliente", jPanel1);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Escolher Veículo"));

        btnPesquisaVeiculo.setText("Pesquisar");
        btnPesquisaVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaVeiculoActionPerformed(evt);
            }
        });

        btnAtualizar1.setText("Atualizar");
        btnAtualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizar1ActionPerformed(evt);
            }
        });

        tblPesquisaVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Placa", "Marca", "Modelo", "Ano Fabricação", "Ano Modelo", "Chassi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPesquisaVeiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPesquisaVeiculoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPesquisaVeiculo);

        tfPlaca.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tfPlaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setText("Placa:");

        jLabel5.setText("Modelo:");

        jLabel9.setText("Pesquisar por Placa:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(tfPesquisarPorPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisaVeiculo)
                                .addGap(41, 41, 41)
                                .addComponent(btnAtualizar1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(tfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPesquisarPorPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisaVeiculo)
                    .addComponent(btnAtualizar1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Veículo", jPanel5);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Escolher Pátio"));

        jLabel6.setText("Escolha o Pátio:");

        cbNomePatio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbNomePatioMouseClicked(evt);
            }
        });
        cbNomePatio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNomePatioActionPerformed(evt);
            }
        });

        btnSelecionar.setText("Selecionar");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        jLabel7.setText("Código:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbNomePatio, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(tfCodigoPatio, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSelecionar))
                    .addComponent(jLabel7))
                .addContainerGap(571, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbNomePatio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(8, 8, 8)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCodigoPatio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelecionar))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Pátio", jPanel6);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblPesquisaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPesquisaClienteMouseClicked
        int index = tblPesquisaCliente.getSelectedRow();
        arrayClientes = null;
        arrayClientes = gc.listar();

        if (filtro.equals("geral")) {
            if (index >= 0 && index < arrayClientes.size()) {
                Cliente c = arrayClientes.get(index);

                tfNomeCliente.setText(c.getNome());
                tfCodigoCliente.setText(String.valueOf(c.getCodigo()));
            }
        }
    }//GEN-LAST:event_tblPesquisaClienteMouseClicked

    private void btnPesquisaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaClienteActionPerformed
        String pesquisar = tfPesquisarPorCodigo.getText();
        try {
            int codigo = Integer.valueOf(pesquisar).intValue();

            Cliente c = gc.buscarPorCodigo(codigo);
            filtro = "pesquisa";
            if (c != null) {
                arrayClientes = null;
                arrayClientes = gc.listar();

                Object colunas[] = {"código", "nome", "logradouro", "número", "bairro", "município", "estado", "CEP", "telefone"};
                DefaultTableModel modelo = new DefaultTableModel(colunas, 0);
                System.out.println("Tem esse código, indice: " + arrayClientes.indexOf(c.getCodigo()));
                System.out.println("Código encontrado: " + c.getCodigo());
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
                tfNomeCliente.setText(c.getNome());
                tfCodigoCliente.setText(String.valueOf(c.getCodigo()));

            } else {
                JOptionPane.showMessageDialog(this, "Não encontrado");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ATENÇÃO! Digite somente números");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ATENÇÃO! Tente novamente");
        }

    }//GEN-LAST:event_btnPesquisaClienteActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        carregarTabelaCliente();
        filtro = "geral";
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnPesquisaVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaVeiculoActionPerformed
        Veiculo v = gv.buscarPorPlaca(tfPesquisarPorPlaca.getText());
        filtro = "pesquisa";

        if (v != null) {
            veiculos = null;
            veiculos = gv.listar();

            Object colunas[] = {"código","Placa","Marca","Modelo","Ano Fabricação","Ano Modelo","Chassi"};
            DefaultTableModel modelo = new DefaultTableModel(colunas,0);
            System.out.println("Tem esse código, indice: "+veiculos.indexOf(v.getCodigo()));
            System.out.println("Placa encontrado: "+v.getPlaca());
            Object linhas[] = new Object[] {
                v.getCodigo(),
                v.getPlaca(),
                v.getMarca(),
                v.getModelo(),
                v.getAnoFabricacao(),
                v.getAnoModelo(),
                v.getChassi()
            };
            modelo.addRow(linhas);
            tblPesquisaVeiculo.setModel(modelo);

            tfPlaca.setText(v.getPlaca());
            tfModelo.setText(v.getModelo());

        }else{
            JOptionPane.showMessageDialog(this, "Não encontrado");
        }

    }//GEN-LAST:event_btnPesquisaVeiculoActionPerformed

    private void btnAtualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizar1ActionPerformed
        carregarTabelaVeiculo();
        filtro = "geral";

    }//GEN-LAST:event_btnAtualizar1ActionPerformed

    private void tblPesquisaVeiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPesquisaVeiculoMouseClicked
        int index = tblPesquisaVeiculo.getSelectedRow();
        veiculos = null;
        veiculos = gv.listar();

        if (filtro.equals("geral")) {
            if (index >= 0 && index < veiculos.size()) {
                Veiculo v = veiculos.get(index);

                tfPlaca.setText(v.getPlaca());
                tfModelo.setText(v.getModelo());

            }
        }

    }//GEN-LAST:event_tblPesquisaVeiculoMouseClicked

    private void cbNomePatioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNomePatioActionPerformed
        
        
    }//GEN-LAST:event_cbNomePatioActionPerformed

    private void cbNomePatioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbNomePatioMouseClicked
      
        
    }//GEN-LAST:event_cbNomePatioMouseClicked

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        Patio pselecionado = (Patio) this.cbNomePatio.getSelectedItem();
        tfCodigoPatio.setText(String.valueOf(pselecionado.getCodigo()));
        
        
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(tfCodigoCliente.getText().length() > 0 
                && tfPlaca.getText().length() > 0 
                && tfCodigoPatio.getText().length() > 0){
            int codCliente = Integer.parseInt(tfCodigoCliente.getText()), codPatio = Integer.parseInt(tfCodigoPatio.getText());
            String placa = tfPlaca.getText();
            
            String mensagem = gConta.cadastrarConta(codCliente, placa, codPatio);
            if(mensagem.equals("ok")){
                JOptionPane.showMessageDialog(this, "Conta cadastrada com sucesso");
            }else{
                JOptionPane.showMessageDialog(this, "Não foi possível cadastrar: "+mensagem);
            }
            
        }else{
            JOptionPane.showMessageDialog(this, "Atenção, está faltando preecher algum campo!");
        }
        
    }//GEN-LAST:event_btnSalvarActionPerformed
    public void carregarTabelaCliente(){
        ArrayList<Cliente> arrayClientes = new ArrayList<>();
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
    
    public void carregarTabelaVeiculo(){
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos = gv.listar();
        
        Object colunas[] = {"código","Placa","Marca","Modelo","Ano Fabricação","Ano Modelo","Chassi"};
        DefaultTableModel modelo = new DefaultTableModel(colunas,0);
        
        for(int i=0; i < veiculos.size(); i++){
            Object linhas[] = new Object[] {
                veiculos.get(i).getCodigo(),
                veiculos.get(i).getPlaca(),
                veiculos.get(i).getMarca(),
                veiculos.get(i).getModelo(),
                veiculos.get(i).getAnoFabricacao(),
                veiculos.get(i).getAnoModelo(),
                veiculos.get(i).getChassi()
            };
            modelo.addRow(linhas);
        }
        
        tblPesquisaVeiculo.setModel(modelo);
    }
    
    public void manipulaComponentes() {
        tfModelo.setEditable(false);
        tfPlaca.setEditable(false);
        tfNomeCliente.setEditable(false);
        tfCodigoCliente.setEditable(false);
        tfCodigoPatio.setEditable(false);
    }
    
    public void carregarCombobox(){
        ArrayList<Patio> arrayCB = new ArrayList<>();
        arrayCB = patioDao.listar();
        
        /*
        for(int i = 0; i < arrayCB.size(); i++){
            cbNomePatio.addItem(arrayCB.get(i).getNome());
        }
        */
        for (Patio p : arrayCB) {
            patioComboBoxModel.addPatio(p);
            this.cbNomePatio.setModel(patioComboBoxModel);
            
        }
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
            java.util.logging.Logger.getLogger(TelaCadastroConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroConta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnAtualizar1;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnPesquisaCliente;
    private javax.swing.JButton btnPesquisaVeiculo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbNomePatio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblPesquisaCliente;
    private javax.swing.JTable tblPesquisaVeiculo;
    private javax.swing.JTextField tfCodigoCliente;
    private javax.swing.JTextField tfCodigoPatio;
    private javax.swing.JTextField tfModelo;
    private javax.swing.JTextField tfNomeCliente;
    private javax.swing.JTextField tfPesquisarPorCodigo;
    private javax.swing.JTextField tfPesquisarPorPlaca;
    private javax.swing.JTextField tfPlaca;
    // End of variables declaration//GEN-END:variables
}
