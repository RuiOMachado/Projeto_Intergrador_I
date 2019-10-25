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
import projeto.com.dao.DaoProjeto;
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
    float latitude;
    IfrProjeto ifrProjeto;
    public static Ambiente AMBIENTE = null;
    String Dados_OLD = "";

    public DlgCalculo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public DlgCalculo(java.awt.Frame parent, boolean modal, IfrProjeto ifrProjeto, float latitude) {
        super(parent, modal);
        initComponents();
        this.ifrProjeto = ifrProjeto;
        definirValorProjeto();
        AMBIENTE = new Ambiente();
        this.latitude = latitude;
        redimencionarTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        tfdArea = new javax.swing.JTextField();
        tfdQfo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        tfdCodigoCalculo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfdDescricaoCalculo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAdicionarCalculo = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        btnExcluirCalculo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItemMaterialidade = new javax.swing.JTable();
        btnAdicionar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnPesquisarMaterial = new javax.swing.JButton();
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
        jLabel14 = new javax.swing.JLabel();
        tfdCodigoCalculo1 = new javax.swing.JTextField();
        tfdDescricaoCalculo1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
                    .addComponent(btnProcurarFace))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel2.setText("Resistência Total (rt)");

        jLabel5.setText("Transmitância (U)");

        tfdRt.setEnabled(false);

        tfdTransmitancia.setEnabled(false);

        jLabel6.setText("F. Térmico (qfo)");
        jLabel6.setToolTipText("");

        tfdFluxoTermico.setToolTipText("Fluxo térmico pelo fechamento opaco");
        tfdFluxoTermico.setEnabled(false);

        tfdAbsorvidade.setText("0.0");
        tfdAbsorvidade.setToolTipText("Claras (0,2 a 0,5), Escuras (0,7 a 0,9) e Médias (0,5 a 0,7) ");

        jLabel7.setText("Absorvidade");

        jLabel8.setText("Radiação");

        tfdRadiacao.setText("0.0");
        tfdRadiacao.setEnabled(false);

        tfdArea.setText("0.0");

        tfdQfo.setEnabled(false);

        jLabel10.setText("Área");

        jLabel11.setText("F. Térmico (Q)");

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tfdCodigoCalculo.setEnabled(false);

        jLabel12.setText("Código");

        tfdDescricaoCalculo.setEnabled(false);

        jLabel13.setText("Descrição");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Projeto", "Face", "Comodo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        btnAdicionarCalculo.setText("+");
        btnAdicionarCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarCalculoActionPerformed(evt);
            }
        });

        jLabel15.setText("QFO");

        jTextField1.setEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel22.setText("QFT");

        jTextField2.setEnabled(false);

        btnExcluirCalculo.setText("-");
        btnExcluirCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCalculoActionPerformed(evt);
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
                        .addGap(4, 4, 4)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(tfdCodigoCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel13)
                        .addGap(26, 26, 26)
                        .addComponent(tfdDescricaoCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdicionarCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluirCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel22)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdCodigoCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(tfdDescricaoCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(btnAdicionarCalculo)
                    .addComponent(btnExcluirCalculo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cálculo", jPanel2);

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

        btnPesquisarMaterial.setText("...");
        btnPesquisarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarMaterialActionPerformed(evt);
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

        tfdTe.setText("0");
        tfdTe.setToolTipText("Temperatura Externa");
        tfdTe.setEnabled(false);

        tfdTi.setText("0");
        tfdTi.setToolTipText("Temperatura Interna");
        tfdTi.setEnabled(false);

        jLabel14.setText("Cálculo");

        tfdCodigoCalculo1.setEnabled(false);

        tfdDescricaoCalculo1.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfdIdMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(tfdCodigoCalculo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(tfdTe)))
                    .addComponent(tfdDescricaoCalculo1))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfdTi)
                    .addComponent(btnPesquisarMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(tfdResistenciaInterna))
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tfdCodigoCalculo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdDescricaoCalculo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfdDescricaoMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdIdMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarMaterial))
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
                .addContainerGap())
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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Materialidades", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfdArea, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfdQfo)
                                    .addComponent(tfdFluxoTermico, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                    .addComponent(tfdTransmitancia, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfdRt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfdAbsorvidade, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfdRadiacao, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnSalvar)
                                        .addGap(531, 531, 531)
                                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
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
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfdArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfdQfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(btnSalvar))
                        .addGap(24, 24, 24))))
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
                item.setIdCalculo(Integer.parseInt(tfdCodigoCalculo1.getText()));
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
                DaoCalculo.listarItemMaterial(tblItemMaterialidade, face.getId(), Integer.parseInt(tfdCodigoCalculo1.getText()));
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

    private void btnPesquisarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarMaterialActionPerformed
        DlgBuscaMaterial busca = new DlgBuscaMaterial(null, true, this);
        busca.setLocationRelativeTo(this);
        busca.setVisible(true);
        btnAdicionar.setEnabled(true);
    }//GEN-LAST:event_btnPesquisarMaterialActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        double areaM = Double.parseDouble(tfdArea.getText());
        double q = Double.parseDouble(tfdFluxoTermico.getText());
        double qfo = areaM * q;
        tfdQfo.setText(String.valueOf(Calcular.arredondar(qfo, 4, 1)));
        tfdArea.setText("");
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
        DlgBuscaFace busca = new DlgBuscaFace(null, true, this, latitude);
        busca.setLocationRelativeTo(this);
        busca.setVisible(true);
        DaoProjeto.listarCalculo(jTable1, Integer.parseInt(tfdIdProjeto2.getText()), Integer.parseInt(tfdIdComodo2.getText()), Integer.parseInt(tfdIdFace.getText()));
        DaoCalculo.listarItemMaterial(tblItemMaterialidade, Integer.parseInt(tfdIdFace.getText()), Integer.parseInt(tfdCodigoCalculo1.getText()));
    }//GEN-LAST:event_btnProcurarFaceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double rst = Calcular.somarColuna(tblItemMaterialidade, 3, rt);
        double rse = Double.parseDouble(tfdResistenciaExterna.getText());
        double u = 1 / rst;
        double deltaT = Double.parseDouble(tfdTe.getText()) - Double.parseDouble(tfdTi.getText());
        double absorv = Double.parseDouble(tfdAbsorvidade.getText());
        double i = Double.parseDouble(tfdRadiacao.getText());
        double q = u * ((absorv * i * rse) + deltaT);
        tfdFluxoTermico.setText(String.valueOf(Calcular.arredondar(q, 4, 1)));
        tfdAbsorvidade.setText("");
        tfdRadiacao.setText("");
        Calculo cal = new Calculo();
        Projeto pro = new Projeto();
        Ambiente amb = new Ambiente();
        amb.setId(Integer.parseInt(tfdIdComodo2.getText()));
        pro.setId(Integer.parseInt(tfdIdProjeto2.getText()));
        cal.setIdAmbiente(amb);
        cal.setId(Integer.parseInt(tfdCodigoCalculo1.getText()));
        cal.setQfo(BigDecimal.valueOf(Double.parseDouble(tfdFluxoTermico.getText())));
        cal.setIdProjeto(pro);
        cal.setIdFace(Integer.parseInt(tfdIdFace.getText()));
        DaoGenerico.saveOrUpdate(cal, 1);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount() == 2) {
            String idString = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0));
            int codigoTabela = Integer.parseInt(idString);
            tfdCodigoCalculo1.setText(String.valueOf(codigoTabela));
            tfdDescricaoCalculo1.setText("Calculo - " + codigoTabela);
            jTabbedPane1.setSelectedIndex(1);
            DaoCalculo.listarItemMaterial(tblItemMaterialidade, Integer.parseInt(tfdIdFace.getText()), Integer.parseInt(tfdCodigoCalculo1.getText()));
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnAdicionarCalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarCalculoActionPerformed
        try {
            Calculo cal = new Calculo();

            if (tfdIdFace.getText().length() > 0 && tfdIdProjeto2.getText().length() > 0 && tfdIdComodo2.getText().length() > 0) {
                Projeto pro = new Projeto();
                Ambiente am = new Ambiente();
                pro.setId(Integer.parseInt(tfdIdProjeto2.getText()));
                am.setId(Integer.parseInt(tfdIdComodo2.getText()));
                cal.setIdAmbiente(am);
                cal.setIdProjeto(pro);
                cal.setIdFace(Integer.parseInt(tfdIdFace.getText()));

                if (codigoTabela == 0) {
                    DaoGenerico.saveOrUpdate(cal, codigoTabela);
                    //DaoAuditoria.saveAuditoria("Face", face.subString(), Dados_OLD, codigoTabela, "INCLUIR");
                    tfdCodigoCalculo.setText(String.valueOf(cal.getId()));
                    tfdDescricaoCalculo.setText("Calculo - " + cal.getId());
                } else {
                    cal.setId(idUpdate);
                    DaoGenerico.saveOrUpdate(cal, idUpdate);
                    tfdCodigoCalculo.setText(String.valueOf(cal.getId()));
                    tfdDescricaoCalculo.setText("Calculo - " + cal.getId());
                    //DaoAuditoria.saveAuditoria("Face", face.subString(), Dados_OLD, codigoTabela, "EDITAR");
                }
                JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao inserir Registro!");
            }
            DaoProjeto.listarCalculo(jTable1, Integer.parseInt(tfdIdProjeto2.getText()), Integer.parseInt(tfdIdComodo2.getText()), Integer.parseInt(tfdIdFace.getText()));  //metodo atualiza tabela

        } catch (Exception ex) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + ex), 0);
        }
    }//GEN-LAST:event_btnAdicionarCalculoActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnExcluirCalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCalculoActionPerformed
        Calculo cal = new Calculo();
        List resultado = null;
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?") == JOptionPane.YES_OPTION) {

            String idString = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0));
            resultado = DaoGenerico.buscaId(Integer.parseInt(idString), "Calculo");
            for (Object o : resultado) {
                cal = (Calculo) o;
            }
            DaoGenerico.delete(cal);
            //DaoAuditoria.saveAuditoria("Calculo", cal.subString(), Dados_OLD, Integer.valueOf(idString), "DELETAR");
            JOptionPane.showMessageDialog(null, "Registro deletado com sucesso!");
            DaoProjeto.listarCalculo(jTable1, Integer.parseInt(tfdIdProjeto2.getText()), Integer.parseInt(tfdIdComodo2.getText()), Integer.parseInt(tfdIdFace.getText()));  //metodo atualiza tabela

        }
    }//GEN-LAST:event_btnExcluirCalculoActionPerformed

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

    public void definirValorRaidacao(float latitude, String RadiacaoSolar) {
        int valor = DaoCalculo.converteCoordenadas(latitude, RadiacaoSolar);
        tfdRadiacao.setText(String.valueOf(valor));
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

    public void redimencionarTabela() {
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(10);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(200);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAdicionarCalculo;
    private javax.swing.JButton btnExcluirCalculo;
    private javax.swing.JButton btnPesquisarMaterial;
    private javax.swing.JButton btnProcurarComodo;
    private javax.swing.JButton btnProcurarFace;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tblItemMaterialidade;
    private javax.swing.JTextField tfdAbsorvidade;
    private javax.swing.JTextField tfdArea;
    private javax.swing.JTextField tfdCodigoCalculo;
    private javax.swing.JTextField tfdCodigoCalculo1;
    private javax.swing.JTextField tfdDescricaoCalculo;
    private javax.swing.JTextField tfdDescricaoCalculo1;
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
    private javax.swing.JTextField tfdQfo;
    private javax.swing.JTextField tfdRadiacao;
    private javax.swing.JTextField tfdResistenciaExterna;
    private javax.swing.JTextField tfdResistenciaInterna;
    private javax.swing.JTextField tfdRt;
    private javax.swing.JTextField tfdTe;
    private javax.swing.JTextField tfdTi;
    private javax.swing.JTextField tfdTransmitancia;
    // End of variables declaration//GEN-END:variables
}
