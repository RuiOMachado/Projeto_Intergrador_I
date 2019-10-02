package projeto.com.apresentacao;

import java.awt.Color;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.List;
import javax.swing.JOptionPane;
import projeto.com.apoio.Calcular;
import projeto.com.dao.DaoAuditoria;
import projeto.com.dao.DaoCalculo;
import projeto.com.dao.DaoGenerico;
import projeto.com.dao.DaoLog;
import projeto.com.dao.DaoMaterial;
import projeto.com.negocio.Ambiente;
import projeto.com.negocio.Calculo;
import projeto.com.negocio.Face;
import projeto.com.negocio.ItemMaterial;
import projeto.com.negocio.Log;
import projeto.com.negocio.Material;
import projeto.com.negocio.Projeto;

/**
 *
 * @author Douglas
 */
public class DlgCalculo extends javax.swing.JDialog {

    int codigoTabela = 0;
    int idUpdate = 0;
    double rt = 0;
    IfrProjeto ifrProjeto;
    public static Ambiente AMBIENTE = null;
    String Dados_OLD = "";

    public DlgCalculo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public DlgCalculo(java.awt.Frame parent, boolean modal, IfrProjeto ifrProjeto) {
        super(parent, modal);
        initComponents();
        this.ifrProjeto = ifrProjeto;
        definirValorProjeto();
        AMBIENTE = new Ambiente();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItemMaterialidade = new javax.swing.JTable();
        btnAdicionar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnPesquisar = new javax.swing.JButton();
        tfdDescricaoMaterial = new javax.swing.JTextField();
        tfdIdMaterial = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfdEspessuraMaterialidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfdResistenciaExterna = new javax.swing.JTextField();
        tfdResistenciaInterna = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfdTe = new javax.swing.JTextField();
        tfdTi = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tfdIdProjeto2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tfdDescricaoComodo2 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        tfdDescricaoProjeto2 = new javax.swing.JTextField();
        tfdIdComodo2 = new javax.swing.JTextField();
        btnProcurarComodo = new javax.swing.JButton();
        tfdIdFace = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        tfdDescricaoFace = new javax.swing.JTextField();
        btnProcurarFace = new javax.swing.JButton();
        btnCriarCalculo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfdRt = new javax.swing.JTextField();
        tfdTransmitancia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfdFluxoTermico = new javax.swing.JTextField();
        tfdAbsorvidade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfdRadiacao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Inclusão de Materiais"));

        tblItemMaterialidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "#", "Código Material", "Descrição", "Resistência"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblItemMaterialidade);

        btnAdicionar.setText("+");
        btnAdicionar.setDoubleBuffered(true);
        btnAdicionar.setEnabled(false);
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnPesquisar.setText("...");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tfdDescricaoMaterial.setEnabled(false);

        tfdIdMaterial.setToolTipText("Código do Material");
        tfdIdMaterial.setEnabled(false);

        jLabel9.setText("Material");

        jLabel1.setText("Espessura");

        tfdEspessuraMaterialidade.setToolTipText("Espessura da Materialidade em \"cm\"");

        jLabel4.setText("Resistência");

        tfdResistenciaExterna.setText("0.00");
        tfdResistenciaExterna.setToolTipText("Resistência Externa");
        tfdResistenciaExterna.setEnabled(false);
        tfdResistenciaExterna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdResistenciaExternaActionPerformed(evt);
            }
        });

        tfdResistenciaInterna.setText("0.00");
        tfdResistenciaInterna.setToolTipText("Resistência Interna");

        jLabel3.setText("Temperatura");

        tfdTe.setText("0°");
        tfdTe.setToolTipText("Temperatura Externa");
        tfdTe.setEnabled(false);

        tfdTi.setText("0°");
        tfdTi.setToolTipText("Temperatura Interna");
        tfdTi.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfdIdMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfdDescricaoMaterial)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfdEspessuraMaterialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfdResistenciaExterna, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(tfdTe))))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfdTi)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(tfdResistenciaInterna))
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfdDescricaoMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdIdMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfdEspessuraMaterialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdResistenciaInterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdResistenciaExterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfdTe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdTi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnSalvar.setText("Calcular");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        jLabel16.setText("Descrição Projeto");

        jLabel17.setText("Código");

        tfdIdProjeto2.setEnabled(false);

        jLabel18.setText("Descrição Comodo");

        tfdDescricaoComodo2.setEnabled(false);

        jLabel19.setText("Código");

        tfdDescricaoProjeto2.setEnabled(false);

        tfdIdComodo2.setToolTipText("ID");
        tfdIdComodo2.setEnabled(false);

        btnProcurarComodo.setText("...");
        btnProcurarComodo.setToolTipText("Procurar Comôdo");
        btnProcurarComodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarComodoActionPerformed(evt);
            }
        });

        tfdIdFace.setEnabled(false);

        jLabel20.setText("Código");

        jLabel21.setText("Descrição Face");

        tfdDescricaoFace.setEnabled(false);

        btnProcurarFace.setText("...");
        btnProcurarFace.setToolTipText("Procurar Face");
        btnProcurarFace.setEnabled(false);
        btnProcurarFace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarFaceActionPerformed(evt);
            }
        });

        btnCriarCalculo.setText("Criar Cálculo");
        btnCriarCalculo.setToolTipText("Criar Cálculo");
        btnCriarCalculo.setEnabled(false);
        btnCriarCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarCalculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel19)
                        .addComponent(jLabel17))
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tfdIdFace, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(tfdIdComodo2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfdIdProjeto2, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel16)
                    .addComponent(jLabel21))
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfdDescricaoProjeto2, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(tfdDescricaoComodo2)
                    .addComponent(tfdDescricaoFace))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnProcurarComodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProcurarFace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnCriarCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdDescricaoProjeto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(tfdIdProjeto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(tfdIdComodo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(tfdDescricaoComodo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProcurarComodo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfdIdFace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(tfdDescricaoFace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProcurarFace)))
                    .addComponent(btnCriarCalculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel2.setText("Resistência Total (rt)");

        jLabel5.setText("Transmitância (U)");

        tfdRt.setEnabled(false);

        tfdTransmitancia.setEnabled(false);

        jLabel6.setText("F. Térmico (q)");

        tfdFluxoTermico.setEnabled(false);

        tfdAbsorvidade.setText("0.0");
        tfdAbsorvidade.setToolTipText("Claras (0,2 a 0,5), Escuras (0,7 a 0,9) e Médias (0,5 a 0,7) ");

        jLabel7.setText("Absorvidade");

        jLabel8.setText("Radiação");

        tfdRadiacao.setText("0.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(34, 34, 34)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfdFluxoTermico, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfdTransmitancia)
                                    .addComponent(tfdRt)
                                    .addComponent(tfdAbsorvidade)
                                    .addComponent(tfdRadiacao))
                                .addGap(18, 18, 18)
                                .addComponent(btnSalvar)
                                .addGap(518, 518, 518))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfdRt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfdTransmitancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfdAbsorvidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tfdRadiacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfdFluxoTermico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvar))
                        .addGap(25, 51, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        Double rt = Double.parseDouble(tfdResistenciaExterna.getText()) + Double.parseDouble(tfdResistenciaInterna.getText());
        BigDecimal espessura = BigDecimal.valueOf(Double.parseDouble(tfdEspessuraMaterialidade.getText()));
        try {
            ItemMaterial item = new ItemMaterial();
            Face face = new Face();
            Material material = new Material();
            List resultado = null;

            resultado = DaoMaterial.buscaIdMaterial(Integer.parseInt(tfdIdMaterial.getText()));

            for (Object o : resultado) {
                Material mat = (Material) o;
                item.setResistencia(espessura.divide(mat.getCondutividade(), MathContext.DECIMAL128).setScale(2, RoundingMode.HALF_EVEN));
            }

            if (tfdDescricaoMaterial.getText().length() > 0 && tfdEspessuraMaterialidade.getText().length() > 0) {
                face.setId(Integer.parseInt(tfdIdFace.getText()));
                material.setId(Integer.parseInt(tfdIdMaterial.getText()));
                item.setResistenciaInt(BigDecimal.valueOf(Double.valueOf(tfdResistenciaInterna.getText())));
                item.setResistenciaExt(BigDecimal.valueOf(Double.valueOf(tfdResistenciaExterna.getText())));
                item.setIdFace(face);
                item.setIdMaterial(material);
                item.setEspessura(BigDecimal.valueOf(Double.valueOf(tfdEspessuraMaterialidade.getText())));
                //item.setResistenciaTotal(BigDecimal.valueOf(Calcular.somarColuna(tblItemMaterialidade, 3, rt)));

                if (codigoTabela == 0) {
                    DaoGenerico.saveOrUpdate(item, codigoTabela);
                    //DaoAuditoria.saveAuditoria("Item_Material", mat.subString(), Dados_OLD, codigoTabela, "INCLUIR");
                    JOptionPane.showMessageDialog(rootPane, "Registro adicionado!");
                } else {
                    item.setId(idUpdate);
                    DaoGenerico.saveOrUpdate(item, idUpdate);
                    //DaoAuditoria.saveAuditoria("Item_Material", mat.subString(), Dados_OLD, codigoTabela, "EDITAR");
                    JOptionPane.showMessageDialog(rootPane, "Registro editada!");
                }
                DaoCalculo.listarItemMaterial(tblItemMaterialidade, face.getId());
                atualizarResultados();
            } else {
                tfdIdMaterial.setBackground(Color.red);
                tfdDescricaoMaterial.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "Material Inválido!");
                tfdIdMaterial.setBackground(Color.white);
                tfdDescricaoMaterial.setBackground(Color.white);
            }
        } catch (Exception ex) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + ex), 0);
        }

    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        DlgBuscaMaterial busca = new DlgBuscaMaterial(null, true, this);
        busca.setLocationRelativeTo(this);
        busca.setVisible(true);
        btnAdicionar.setEnabled(true);
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        double rst    = Calcular.somarColuna(tblItemMaterialidade, 3, rt);
        double rse    = Double.parseDouble(tfdResistenciaExterna.getText());
        double u      = 1/rst;
        double deltaT = Double.parseDouble(tfdTe.getText()) - Double.parseDouble(tfdTi.getText());
        double absorv = Double.parseDouble(tfdAbsorvidade.getText());
        double i      = Double.parseDouble(tfdRadiacao.getText());;
        double q      = u * ((absorv*i*rse)+deltaT); 
        tfdFluxoTermico.setText(String.valueOf(Calcular.arredondar(q, 4, 1)));
        tfdAbsorvidade.setText("");
        tfdRadiacao.setText("");
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnProcurarComodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarComodoActionPerformed
        DlgBuscaComodo busca = new DlgBuscaComodo(null, true, this);
        busca.setLocationRelativeTo(this);
        busca.setVisible(true);
        AMBIENTE.setId(Integer.parseInt(tfdIdComodo2.getText()));
        btnProcurarFace.setEnabled(true);
    }//GEN-LAST:event_btnProcurarComodoActionPerformed

    private void tfdResistenciaExternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdResistenciaExternaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdResistenciaExternaActionPerformed

    private void btnProcurarFaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarFaceActionPerformed
        DlgBuscaFace busca = new DlgBuscaFace(null, true, this);
        busca.setLocationRelativeTo(this);
        busca.setVisible(true);

        btnCriarCalculo.setEnabled(true);
    }//GEN-LAST:event_btnProcurarFaceActionPerformed

    private void btnCriarCalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarCalculoActionPerformed
        Projeto projeto = new Projeto();
        Ambiente ambiente = new Ambiente();
        if (tfdDescricaoFace.getText().length() > 0) {
            Calculo cal = new Calculo();
            projeto.setId(Integer.parseInt(tfdIdProjeto2.getText()));
            ambiente.setId(Integer.parseInt(tfdIdComodo2.getText()));
            cal.setIdAmbiente(ambiente);
            cal.setIdProjeto(projeto);

            if (codigoTabela == 0) {
                DaoGenerico.saveOrUpdate(cal, codigoTabela);
                DaoAuditoria.saveAuditoria("Cálculo", cal.subString(), Dados_OLD, codigoTabela, "INCLUIR");
            } else {
                cal.setId(idUpdate);
                DaoGenerico.saveOrUpdate(cal, idUpdate);
                DaoAuditoria.saveAuditoria("Cálculo", cal.subString(), Dados_OLD, codigoTabela, "EDITAR");
            }
            JOptionPane.showMessageDialog(null, "Cálculo criado!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao criar cálculo!");
        }
    }//GEN-LAST:event_btnCriarCalculoActionPerformed

    public void definirValorMaterial(String id, String descricao) {
        tfdIdMaterial.setText(id);
        tfdDescricaoMaterial.setText(descricao);
    }

    public void definirValorProjeto() {
        tfdIdProjeto2.setText(String.valueOf(IfrProjeto.PROJETO.getId()));
        tfdDescricaoProjeto2.setText(IfrProjeto.PROJETO.getDescricao());
    }

    public void definirValorAmbiente(String id, String descricao) {
        tfdIdComodo2.setText(id);
        tfdDescricaoComodo2.setText(descricao);
    }

    public void definirValorFace(String id, String descricao) {
        tfdIdFace.setText(id);
        tfdDescricaoFace.setText(descricao);
    }

    public void definirValorResistencias(String tipo) {

        if ("Parede".equals(tipo)) {
            tfdResistenciaInterna.setText("0.13");
            tfdResistenciaExterna.setText("0.04");
        } else if ("Piso".equals(tipo)) {
            tfdResistenciaInterna.setText("0.17");
            tfdResistenciaExterna.setText("0.04");
        } else if ("Cobertura".equals(tipo)) {
            tfdResistenciaInterna.setText("0.10");
            tfdResistenciaExterna.setText("0.04");
        } else {
            tfdResistenciaInterna.setText("0.00");
            tfdResistenciaExterna.setText("0.00");
        }
    }

    public void definirValorEstacoes(String tipo) {

        if ("Inverno".equals(tipo)) {
            tfdTe.setText("22");
            tfdTi.setText("18");
        } else if ("Verão".equals(tipo)) {
            tfdTe.setText("33");
            tfdTi.setText("23");
        } else {
            tfdTe.setText("0°");
            tfdTi.setText("0°");
        }
    }

    public void atualizarResultados() {
        tfdRt.setText(String.valueOf(Calcular.somarColuna(tblItemMaterialidade, 3, rt)));
        tfdTransmitancia.setText(String.valueOf(Calcular.arredondar(1 / Calcular.somarColuna(tblItemMaterialidade, 3, rt), 4, 1)));
    
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCriarCalculo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnProcurarComodo;
    private javax.swing.JButton btnProcurarFace;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblItemMaterialidade;
    private javax.swing.JTextField tfdAbsorvidade;
    private javax.swing.JTextField tfdDescricaoComodo2;
    private javax.swing.JTextField tfdDescricaoFace;
    private javax.swing.JTextField tfdDescricaoMaterial;
    private javax.swing.JTextField tfdDescricaoProjeto2;
    private javax.swing.JTextField tfdEspessuraMaterialidade;
    private javax.swing.JTextField tfdFluxoTermico;
    private javax.swing.JTextField tfdIdComodo2;
    private javax.swing.JTextField tfdIdFace;
    private javax.swing.JTextField tfdIdMaterial;
    private javax.swing.JTextField tfdIdProjeto2;
    private javax.swing.JTextField tfdRadiacao;
    private javax.swing.JTextField tfdResistenciaExterna;
    private javax.swing.JTextField tfdResistenciaInterna;
    private javax.swing.JTextField tfdRt;
    private javax.swing.JTextField tfdTe;
    private javax.swing.JTextField tfdTi;
    private javax.swing.JTextField tfdTransmitancia;
    // End of variables declaration//GEN-END:variables
}
