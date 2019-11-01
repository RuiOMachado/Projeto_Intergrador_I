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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        tfdCodigoCalculo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfdDescricaoCalculo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAdicionarCalculo = new javax.swing.JButton();
        btnExcluirCalculo = new javax.swing.JButton();
        cmbTipoCalculo = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItemMaterialidade = new javax.swing.JTable();
        btnAdicionarMaterialidade = new javax.swing.JButton();
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
        tfdArea = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfdQFO = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfdRt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfdTransmitancia = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfdQfo = new javax.swing.JTextField();
        tfdAbsorvidade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfdRadiacao = new javax.swing.JTextField();
        btnGravar = new javax.swing.JButton();
        btnRemoverMaterialidade = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        tfdCodigoCalculo.setEnabled(false);

        jLabel12.setText("Código");

        tfdDescricaoCalculo.setEnabled(false);

        jLabel13.setText("Descrição");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Projeto", "Face", "Comodo", "qfo", "qft"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        btnAdicionarCalculo.setText("+");
        btnAdicionarCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarCalculoActionPerformed(evt);
            }
        });

        btnExcluirCalculo.setText("-");
        btnExcluirCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCalculoActionPerformed(evt);
            }
        });

        cmbTipoCalculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Fech. Opaco", "Fech. Translúcido" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                        .addComponent(btnExcluirCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbTipoCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(129, Short.MAX_VALUE))
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
                    .addComponent(btnExcluirCalculo)
                    .addComponent(cmbTipoCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
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

        btnAdicionarMaterialidade.setText("+");
        btnAdicionarMaterialidade.setDoubleBuffered(true);
        btnAdicionarMaterialidade.setEnabled(false);
        btnAdicionarMaterialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarMaterialidadeActionPerformed(evt);
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

        tfdArea.setText("0.0");

        jLabel2.setText("Resistência Total (rt)");

        tfdQFO.setEnabled(false);

        jLabel5.setText("Transmitância (U)");

        jLabel10.setText("Área");

        tfdRt.setEnabled(false);

        jLabel11.setText("F. Térmico (Qfo)");

        tfdTransmitancia.setEnabled(false);

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("qfo");
        jLabel6.setToolTipText("");

        tfdQfo.setToolTipText("Fluxo térmico pelo fechamento opaco");
        tfdQfo.setEnabled(false);

        tfdAbsorvidade.setText("0.0");
        tfdAbsorvidade.setToolTipText("Claras (0,2 a 0,5), Escuras (0,7 a 0,9) e Médias (0,5 a 0,7) ");

        jLabel7.setText("Absorvidade");

        jLabel8.setText("Radiação");

        tfdRadiacao.setText("0.0");
        tfdRadiacao.setEnabled(false);

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        btnRemoverMaterialidade.setText("-");
        btnRemoverMaterialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverMaterialidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAdicionarMaterialidade, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(btnRemoverMaterialidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfdArea, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfdQFO)
                            .addComponent(tfdQfo)
                            .addComponent(tfdTransmitancia, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfdRt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfdAbsorvidade, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfdRadiacao, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGravar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6))
                .addGap(33, 33, 33))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnAdicionarMaterialidade)
                                .addGap(8, 8, 8)
                                .addComponent(btnRemoverMaterialidade)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfdRt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tfdTransmitancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tfdAbsorvidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tfdRadiacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfdQfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfdArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfdQFO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGravar)
                            .addComponent(jButton1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Materialidades", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(btnSair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarMaterialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarMaterialidadeActionPerformed
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

    }//GEN-LAST:event_btnAdicionarMaterialidadeActionPerformed

    private void btnPesquisarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarMaterialActionPerformed
        DlgBuscaMaterial busca = new DlgBuscaMaterial(null, true, this);
        busca.setLocationRelativeTo(this);
        busca.setVisible(true);
        btnAdicionarMaterialidade.setEnabled(true);
        btnRemoverMaterialidade.setEnabled(true);
    }//GEN-LAST:event_btnPesquisarMaterialActionPerformed

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
        tfdQfo.setText(String.valueOf(Calcular.arredondar(q, 4, 1)));
        double areaM = Double.parseDouble(tfdArea.getText());
        double Q = Double.parseDouble(tfdQfo.getText());
        double qfo = areaM * Q;
        tfdQFO.setText(String.valueOf(Calcular.arredondar(qfo, 4, 1)));
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount() == 2) {
            String idString = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0));
            int codigoTabela = Integer.parseInt(idString);
            tfdCodigoCalculo1.setText(String.valueOf(codigoTabela));
            tfdDescricaoCalculo1.setText("Calculo - " + codigoTabela);
            jTabbedPane1.setSelectedIndex(1);
            DaoCalculo.listarItemMaterial(tblItemMaterialidade, Integer.parseInt(tfdIdFace.getText()), Integer.parseInt(tfdCodigoCalculo1.getText()));
            atualizarResultados();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnAdicionarCalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarCalculoActionPerformed
        try {
            Calculo cal = new Calculo();

            if (tfdIdFace.getText().length() > 0 && tfdIdProjeto2.getText().length() > 0 && tfdIdComodo2.getText().length() > 0 && (!cmbTipoCalculo.getSelectedItem().toString().equals("Selecione"))) {
                Projeto pro = new Projeto();
                Ambiente am = new Ambiente();
                pro.setId(Integer.parseInt(tfdIdProjeto2.getText()));
                am.setId(Integer.parseInt(tfdIdComodo2.getText()));
                cal.setIdAmbiente(am);
                cal.setIdProjeto(pro);
                cal.setIdFace(Integer.parseInt(tfdIdFace.getText()));
                cal.setTipo(cmbTipoCalculo.getSelectedItem().toString());

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

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        
        if (tfdArea.getText().length() > 0 && tfdAbsorvidade.getText().length() > 0){
        Calculo cal = new Calculo();
        Projeto pro = new Projeto();
        Ambiente amb = new Ambiente();
        amb.setId(Integer.parseInt(tfdIdComodo2.getText()));
        pro.setId(Integer.parseInt(tfdIdProjeto2.getText()));
        cal.setIdAmbiente(amb);
        cal.setId(Integer.parseInt(tfdCodigoCalculo1.getText()));
        cal.setQfo(BigDecimal.valueOf(Double.parseDouble(tfdQfo.getText())));
        //cal.setQft(BigDecimal.valueOf(Double.parseDouble(tfdQft.getText())));
        cal.setIdProjeto(pro);
        cal.setIdFace(Integer.parseInt(tfdIdFace.getText()));
        cal.setArea(BigDecimal.valueOf(Double.parseDouble(tfdArea.getText())));
        DaoGenerico.saveOrUpdate(cal, 1);
        JOptionPane.showMessageDialog(null, "Gravado!"); 
        limparCampos();
        }else{
           JOptionPane.showMessageDialog(null, "Erro ao Gravar!"); 
        }
        
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnRemoverMaterialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverMaterialidadeActionPerformed
        ItemMaterial mat = new ItemMaterial();
        List resultado = null;
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?") == JOptionPane.YES_OPTION) {

            String idString = String.valueOf(tblItemMaterialidade.getValueAt(tblItemMaterialidade.getSelectedRow(), 0));
            resultado = DaoGenerico.buscaId(Integer.parseInt(idString), "ItemMaterial");
            
            for (Object o : resultado) {
                mat = (ItemMaterial) o;
            }

            DaoGenerico.delete(mat);
            DaoAuditoria.saveAuditoria("Item_Material", mat.subString(), Dados_OLD, Integer.valueOf(idString), "DELETAR");
            JOptionPane.showMessageDialog(null, "Registro deletado com sucesso!");
            DaoCalculo.listarItemMaterial(tblItemMaterialidade, Integer.parseInt(tfdIdFace.getText()), Integer.parseInt(tfdCodigoCalculo1.getText()));
        }
        
    }//GEN-LAST:event_btnRemoverMaterialidadeActionPerformed

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
        tfdRt.setText(String.valueOf(Calcular.arredondar(Calcular.somarColuna(tblItemMaterialidade, 3, rt), 4,1)));
        tfdTransmitancia.setText(String.valueOf(Calcular.arredondar(1 / Calcular.somarColuna(tblItemMaterialidade, 3, rt), 4, 1)));

    }

    public void redimencionarTabela() {
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(10);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(200);
    }
    
    public void limparCampos(){
        tfdArea.setText("");
        tfdAbsorvidade.setText("");
        tfdQFO.setText("");
        tfdQfo.setText("");
        tfdTransmitancia.setText("");
        tfdRt.setText("");
        tfdRadiacao.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarCalculo;
    private javax.swing.JButton btnAdicionarMaterialidade;
    private javax.swing.JButton btnExcluirCalculo;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnPesquisarMaterial;
    private javax.swing.JButton btnProcurarComodo;
    private javax.swing.JButton btnProcurarFace;
    private javax.swing.JButton btnRemoverMaterialidade;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cmbTipoCalculo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
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
    private javax.swing.JTextField tfdIdComodo2;
    private javax.swing.JTextField tfdIdFace;
    private javax.swing.JTextField tfdIdMaterial;
    private javax.swing.JTextField tfdIdProjeto2;
    private javax.swing.JTextField tfdQFO;
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
