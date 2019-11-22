package projeto.com.apresentacao;

import java.util.List;
import javax.swing.JOptionPane;
import projeto.com.dao.DaoAuditoria;
import projeto.com.dao.DaoGenerico;
import projeto.com.dao.DaoLog;
import projeto.com.dao.DaoProjeto;
import projeto.com.negocio.Face;
import projeto.com.negocio.Log;

/**
 *
 * @author Douglas
 */
public class DlgBuscaFace extends javax.swing.JDialog {

    DlgCalculo dlgCalculo;
    int codigoTabela = 0;
    int idUpdate = 0;
    float latitude;
    String Dados_OLD = "";
    public static Face FACE = null;

    public DlgBuscaFace(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public DlgBuscaFace(java.awt.Frame parent, boolean modal, DlgCalculo dlgCalculo, float latitude) {
        super(parent, modal);
        initComponents();
        this.dlgCalculo = dlgCalculo;
        DaoProjeto.listarFace(jTable1, DlgCalculo.AMBIENTE.getId());
        FACE = new Face();
        this.latitude = latitude;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        tfdDescricao = new javax.swing.JTextField();
        btnAdicionarFace = new javax.swing.JButton();
        btnRemoverFace = new javax.swing.JButton();
        cmbTipo = new javax.swing.JComboBox<>();
        cmbPosicaoRadiacao = new javax.swing.JComboBox<>();
        cmbEstacao = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "#", "Descrição", "Tipo", "Cod_Ambiente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAdicionarFace.setText("+");
        btnAdicionarFace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarFaceActionPerformed(evt);
            }
        });

        btnRemoverFace.setText("-");
        btnRemoverFace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverFaceActionPerformed(evt);
            }
        });

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Parede", "Cobertura", "Piso" }));
        cmbTipo.setToolTipText("Tipo de face");

        cmbPosicaoRadiacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Norte", "Sul", "Leste", "Oeste", "Nordeste", "Noroeste", "Sudeste", "Sudoeste", "H" }));
        cmbPosicaoRadiacao.setToolTipText("Ponto de ascendência do sol");

        cmbEstacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Inverno", "Verão" }));
        cmbEstacao.setToolTipText("Estação");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jLabel1.setText("Tipo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jLabel2.setText("Nome da face");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jLabel3.setText("Incidência Solar");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jLabel4.setText("Estação do ano");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfdDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbPosicaoRadiacao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbEstacao, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdicionarFace, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoverFace, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addGap(84, 84, 84)
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addComponent(jLabel3)
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionarFace)
                    .addComponent(btnRemoverFace)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPosicaoRadiacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEstacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount() == 2) {
            List resultado = null;
            Face face = new Face();
            String idString = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0));
            int codigoTabela = Integer.parseInt(idString);

            resultado = DaoGenerico.buscaId(codigoTabela, "Face");

            for (Object o : resultado) {
                Face fac = (Face) o;
                face.setNome(fac.getNome());
                face.setTipo(fac.getTipo());
                face.setId_ambiente(fac.getId_ambiente());
                FACE.setId(fac.getId());
                FACE.setTipo(fac.getTipo());
                FACE.setRegiaoSolar(fac.getRegiaoSolar());
                FACE.setEstacao(fac.getEstacao());
            }
            dlgCalculo.definirValorResistencias(FACE.getTipo());
            dlgCalculo.definirValorFace(String.valueOf(codigoTabela), face.getNome());
            dlgCalculo.definirValorEstacoes(FACE.getEstacao());
            dlgCalculo.definirValorRaidacao(latitude, FACE.getRegiaoSolar());
            dispose();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnAdicionarFaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarFaceActionPerformed
        int idFace = 0;
        try {
            Face face = new Face();

            if (tfdDescricao.getText().length() > 0 && (!cmbTipo.getSelectedItem().toString().equals("Selecione")) && (!cmbPosicaoRadiacao.getSelectedItem().toString().equals("Selecione")) && (!cmbEstacao.getSelectedItem().toString().equals("Selecione"))) {
                face.setNome(tfdDescricao.getText());
                face.setTipo(cmbTipo.getSelectedItem().toString());
                face.setId_ambiente(DlgCalculo.AMBIENTE.getId());
                face.setRegiaoSolar(cmbPosicaoRadiacao.getSelectedItem().toString());
                face.setEstacao(cmbEstacao.getSelectedItem().toString());

                if (codigoTabela == 0) {
                    DaoGenerico.saveOrUpdate(face, codigoTabela);     
                } 
                JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
                
                System.out.println("id face--"+face.getId());
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao inserir Registro!");
            }
            tfdDescricao.setText("");
            cmbTipo.setSelectedIndex(0);
            DaoAuditoria.saveAuditoria("Face", face.subString(), Dados_OLD, 10, "INCLUIR");
            DaoProjeto.listarFace(jTable1, DlgCalculo.AMBIENTE.getId());  //metodo atualiza tabela

        } catch (Exception ex) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + ex), 0);
        }
    }//GEN-LAST:event_btnAdicionarFaceActionPerformed

    private void btnRemoverFaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverFaceActionPerformed
        Face face = new Face();
        List resultado = null;
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?") == JOptionPane.YES_OPTION) {

            String idString = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0));

            resultado = DaoGenerico.buscaId(Integer.parseInt(idString), "Face");

            for (Object o : resultado) {
                face = (Face) o;
            }

            DaoGenerico.delete(face);
            DaoAuditoria.saveAuditoria("Face", face.subString(), Dados_OLD, face.getId(), "DELETAR");
            
            JOptionPane.showMessageDialog(null, "Registro deletado com sucesso!");
            DaoProjeto.listarFace(jTable1, DlgCalculo.AMBIENTE.getId());  //metodo atualiza tabela


        }
    }//GEN-LAST:event_btnRemoverFaceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarFace;
    private javax.swing.JButton btnRemoverFace;
    private javax.swing.JComboBox<String> cmbEstacao;
    private javax.swing.JComboBox<String> cmbPosicaoRadiacao;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tfdDescricao;
    // End of variables declaration//GEN-END:variables
}
