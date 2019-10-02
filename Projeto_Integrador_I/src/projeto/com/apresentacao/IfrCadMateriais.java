package projeto.com.apresentacao;

import java.math.BigDecimal;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projeto.com.dao.DaoAuditoria;
import projeto.com.dao.DaoGenerico;
import projeto.com.dao.DaoLog;
import projeto.com.dao.DaoMaterial;
import projeto.com.dao.DaoPermissao;
import projeto.com.negocio.Log;
import projeto.com.negocio.Material;

/**
 *
 * @author ruiwa
 */
public class IfrCadMateriais extends javax.swing.JInternalFrame {

    int codigoTabela = 0;
    int idUpdate = 0;
    String Dados_OLD = "";

    /**
     * Creates new form IfrCad_Materiais
     */
    public IfrCadMateriais() {
        initComponents();
        DaoPermissao.definirPermissao(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jmConsultaMaterial = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfdDescricaoMaterial = new javax.swing.JTextField();
        tfdCondutividadeMaterial = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfdDesnsidadeMaterial = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcbCorMaterial = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        tfdCalorMaterial = new javax.swing.JTextField();
        tfdFatorSolarMaterial = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jBPesquisa = new javax.swing.JButton();
        cPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabela = new javax.swing.JTable();
        btnExcluirMaterial = new javax.swing.JButton();
        btnEditarMaterial = new javax.swing.JButton();
        btnSalvarMaterial = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setTitle("Cadastro de Materiais");

        jmConsultaMaterial.setName("jmConsultarMaterial"); // NOI18N
        jmConsultaMaterial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jmConsultaMaterialFocusLost(evt);
            }
        });

        jPanel1.setEnabled(false);

        jLabel1.setText("<html> <font>Descrição </font> <font color=RED>*</font> <font>:</font> </html>");

        tfdDescricaoMaterial.setToolTipText("Descrição do material");

        tfdCondutividadeMaterial.setToolTipText("Condutividade térmica do material");
        tfdCondutividadeMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdCondutividadeMaterialActionPerformed(evt);
            }
        });

        jLabel3.setText("<html> <font>Condutividade Térmica (W/mK )</font> <font color=RED>*</font> <font>:</font> </html>");

        tfdDesnsidadeMaterial.setToolTipText("Densidade do material");

        jLabel5.setText("<html> <font>Densidade Equivalente (Kg/m³) </font> <font color=RED>*</font> <font>:</font> </html>");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("*Todos os campos são obrigatórios");

        jLabel6.setText("<html> <font>Cor </font> <font color=RED>*</font> <font>:</font> </html>");

        jcbCorMaterial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Escura", "Média", "Clara" }));

        jLabel7.setText("<html> <font> Calor Específico (kJ/kg K) </font> <font color=RED>*</font> <font>:</font> </html>");

        tfdCalorMaterial.setToolTipText("Calor específico do Material");
        tfdCalorMaterial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfdCalorMaterialKeyReleased(evt);
            }
        });

        jLabel2.setText("Fator Solar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdDescricaoMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jcbCorMaterial, javax.swing.GroupLayout.Alignment.LEADING, 0, 210, Short.MAX_VALUE)
                                .addComponent(tfdCalorMaterial, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfdDesnsidadeMaterial, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfdCondutividadeMaterial, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(tfdFatorSolarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 205, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdDescricaoMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbCorMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdCondutividadeMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdDesnsidadeMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdCalorMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdFatorSolarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        jmConsultaMaterial.addTab("Cadastro", jPanel1);

        jBPesquisa.setText("Busca");
        jBPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisaActionPerformed(evt);
            }
        });

        jTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Descrição", "Cor", "Densidade", "Calor", "Fator Solar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
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
        jScrollPane1.setViewportView(jTabela);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBPesquisa)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBPesquisa)
                    .addComponent(cPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jmConsultaMaterial.addTab("Consulta", jPanel2);

        btnExcluirMaterial.setText("Excluir");
        btnExcluirMaterial.setEnabled(false);
        btnExcluirMaterial.setName("btnExcluirMaterial"); // NOI18N
        btnExcluirMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirMaterialActionPerformed(evt);
            }
        });

        btnEditarMaterial.setText("Editar");
        btnEditarMaterial.setEnabled(false);
        btnEditarMaterial.setName("btnEditarMaterial"); // NOI18N
        btnEditarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarMaterialActionPerformed(evt);
            }
        });

        btnSalvarMaterial.setText("Salvar");
        btnSalvarMaterial.setEnabled(false);
        btnSalvarMaterial.setName("btnSalvarMaterial"); // NOI18N
        btnSalvarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarMaterialActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jmConsultaMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExcluirMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jmConsultaMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarMaterial)
                    .addComponent(btnSair)
                    .addComponent(btnSalvarMaterial)
                    .addComponent(btnExcluirMaterial))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarMaterialActionPerformed
        try {
            Material mat = new Material();

            if (tfdDescricaoMaterial.getText().length() > 0 && (!jcbCorMaterial.getSelectedItem().toString().equals("Selecione")) && tfdCondutividadeMaterial.getText().length() > 0 && tfdDesnsidadeMaterial.getText().length() > 0 && tfdCondutividadeMaterial.getText().length() > 0) {
                mat.setDescricao(tfdDescricaoMaterial.getText());
                mat.setCor(jcbCorMaterial.getSelectedItem().toString());
                mat.setCondutividade(BigDecimal.valueOf(Double.valueOf(tfdCondutividadeMaterial.getText())));
                mat.setDencidade(BigDecimal.valueOf(Double.valueOf(tfdDesnsidadeMaterial.getText())));
                mat.setCalor(BigDecimal.valueOf(Double.valueOf(tfdCalorMaterial.getText())));
                mat.setFatorsolar(BigDecimal.valueOf(Double.valueOf(tfdFatorSolarMaterial.getText())));

                if (codigoTabela == 0) {
                    DaoGenerico.saveOrUpdate(mat, codigoTabela);
                    DaoAuditoria.saveAuditoria("Material", mat.subString(), Dados_OLD, codigoTabela, "INCLUIR");
                } else {
                    mat.setId(idUpdate);
                    DaoGenerico.saveOrUpdate(mat, idUpdate);
                    DaoAuditoria.saveAuditoria("Material", mat.subString(), Dados_OLD, codigoTabela, "EDITAR");
                }
                JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao inserir Registro!");
            }
            tfdDescricaoMaterial.setText("");
            jcbCorMaterial.setSelectedIndex(0);
            tfdCondutividadeMaterial.setText("");
            tfdDesnsidadeMaterial.setText("");
            tfdFatorSolarMaterial.setText("");
            jmConsultaMaterial.setSelectedIndex(1);
            DaoMaterial.listarMaterial(jTabela);  //metodo atualiza tabela

        } catch (Exception ex) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + ex), 0);
        }
    }//GEN-LAST:event_btnSalvarMaterialActionPerformed

    private void jBPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisaActionPerformed
        List resultado = null;

        DefaultTableModel modelo = (DefaultTableModel) jTabela.getModel();
        modelo.setNumRows(0);

        resultado = DaoMaterial.pesquisaMaterial(cPesquisa.getText());

        for (Object o : resultado) {
            Material mat = (Material) o;
            modelo.addRow(new Object[]{
                mat.getId(), mat.getDescricao(), mat.getCor(), mat.getCondutividade(), mat.getDencidade(), mat.getCalor(), mat.getFatorsolar()
            });
        }
    }//GEN-LAST:event_jBPesquisaActionPerformed

    private void btnEditarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarMaterialActionPerformed
        List resultado = null;
        String idString = String.valueOf(jTabela.getValueAt(jTabela.getSelectedRow(), 0));
        codigoTabela = Integer.parseInt(idString);

        resultado = DaoMaterial.buscaIdMaterial(codigoTabela);

        for (Object o : resultado) {
            Material mat = (Material) o;

            idUpdate = mat.getId();
            tfdDescricaoMaterial.setText(mat.getDescricao());
            tfdCondutividadeMaterial.setText(String.valueOf(mat.getCondutividade()));
            tfdDesnsidadeMaterial.setText(String.valueOf(mat.getDencidade()));
            tfdCalorMaterial.setText(String.valueOf(mat.getCalor()));
            tfdFatorSolarMaterial.setText(String.valueOf(mat.getFatorsolar()));
            Dados_OLD = "%" + mat.getDescricao() + "%" + mat.getCor() + "%" + mat.getCondutividade() + "%" + mat.getDencidade() + "%" + mat.getCalor() + "%" + mat.getFatorsolar() + "%";
        }
        jmConsultaMaterial.setSelectedIndex(0);
        tfdDescricaoMaterial.requestFocus();
    }//GEN-LAST:event_btnEditarMaterialActionPerformed

    private void jmConsultaMaterialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jmConsultaMaterialFocusLost
        if (jmConsultaMaterial.getSelectedIndex() == 1) {
            //btnEditarMaterial.setEnabled (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado, 2, true));
            //btnExcluirMaterial.setEnabled(DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado, 3, true));
            //btnSalvarMaterial.setEnabled (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado, 1, false));
            jBPesquisa.requestFocus();
            
        } else {
            //btnEditarMaterial.setEnabled (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado, 2, false));
            //btnExcluirMaterial.setEnabled(DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado, 3, false));
            //btnSalvarMaterial.setEnabled (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado, 1, true));
        }
    }//GEN-LAST:event_jmConsultaMaterialFocusLost

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnExcluirMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirMaterialActionPerformed
        Material mat = new Material();
        List resultado = null;
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?") == JOptionPane.YES_OPTION) {

            String idString = String.valueOf(jTabela.getValueAt(jTabela.getSelectedRow(), 0));
            resultado = DaoMaterial.buscaIdMaterial(Integer.parseInt(idString));

            for (Object o : resultado) {
                mat = (Material) o;
            }

            DaoGenerico.delete(mat);
            DaoAuditoria.saveAuditoria("Material", mat.subString(), Dados_OLD, Integer.valueOf(idString), "DELETAR");
            JOptionPane.showMessageDialog(null, "Registro deletado com sucesso!");

            jBPesquisaActionPerformed(evt);

        }
    }//GEN-LAST:event_btnExcluirMaterialActionPerformed

    private void tfdCalorMaterialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdCalorMaterialKeyReleased
       
    }//GEN-LAST:event_tfdCalorMaterialKeyReleased

    private void tfdCondutividadeMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdCondutividadeMaterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdCondutividadeMaterialActionPerformed


    //tentar fazer este metodo generico, mas vamos deixar em observação pra esta sprint
    public void startComponents() {
            btnSalvarMaterial.setEnabled       (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,1,true));
            btnEditarMaterial.setEnabled       (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,2,true));
            btnExcluirMaterial.setEnabled      (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,3,true));
            jmConsultaMaterial.setEnabledAt    (0, DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,5,true));
            jmConsultaMaterial.setEnabledAt    (1, DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,4,true));
            
            ///componentes menu cadastro
            tfdDescricaoMaterial.setEnabled     (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,5,true));
            tfdCondutividadeMaterial.setEditable(DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,5,true));
            jcbCorMaterial.setEnabled          (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,5,true));
            tfdCalorMaterial.setEnabled         (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,5,true));
            tfdDesnsidadeMaterial.setEnabled     (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,5,true));
            
            //componentes menu consulta
            cPesquisa.setEnabled      (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,4,true));
            jBPesquisa.setEnabled     (DaoPermissao.inserirPermissaoComponente(NewLogin.usuarioLogado,4,true));
            
    }
   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarMaterial;
    private javax.swing.JButton btnExcluirMaterial;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvarMaterial;
    private javax.swing.JTextField cPesquisa;
    private javax.swing.JButton jBPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabela;
    private javax.swing.JComboBox<String> jcbCorMaterial;
    private javax.swing.JTabbedPane jmConsultaMaterial;
    private javax.swing.JTextField tfdCalorMaterial;
    private javax.swing.JTextField tfdCondutividadeMaterial;
    private javax.swing.JTextField tfdDescricaoMaterial;
    private javax.swing.JTextField tfdDesnsidadeMaterial;
    private javax.swing.JTextField tfdFatorSolarMaterial;
    // End of variables declaration//GEN-END:variables
}
