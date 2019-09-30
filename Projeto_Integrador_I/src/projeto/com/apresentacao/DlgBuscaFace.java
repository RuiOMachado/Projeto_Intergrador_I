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
    String Dados_OLD = "";

    public DlgBuscaFace(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public DlgBuscaFace(java.awt.Frame parent, boolean modal, DlgCalculo dlgCalculo) {
        super(parent, modal);
        initComponents();
        this.dlgCalculo = dlgCalculo;
        DaoProjeto.listarFace(jTable1,DlgCalculo.AMBIENTE.getId());
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

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Parece", "Cobertura", "Piso" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfdDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAdicionarFace, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoverFace, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionarFace)
                    .addComponent(btnRemoverFace)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

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
        }
        dlgCalculo.definirValorFace(String.valueOf(codigoTabela), face.getNome());
        dispose();
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnAdicionarFaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarFaceActionPerformed
        try {
            Face face = new Face();

            if (tfdDescricao.getText().length() > 0 && (!cmbTipo.getSelectedItem().toString().equals("Selecione"))) {
                face.setNome(tfdDescricao.getText());
                face.setTipo(cmbTipo.getSelectedItem().toString());
                face.setId_ambiente(DlgCalculo.AMBIENTE.getId());

                if (codigoTabela == 0) {
                    DaoGenerico.saveOrUpdate(face, codigoTabela);
                    DaoAuditoria.saveAuditoria("Face", face.subString(), Dados_OLD, codigoTabela, "INCLUIR");
                } else {
                    face.setId(idUpdate);
                    DaoGenerico.saveOrUpdate(face, idUpdate);
                    DaoAuditoria.saveAuditoria("Face", face.subString(), Dados_OLD, codigoTabela, "EDITAR");
                }
                JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao inserir Registro!");
            }
            tfdDescricao.setText("");
            cmbTipo.setSelectedIndex(0);
            DaoProjeto.listarFace(jTable1,DlgCalculo.AMBIENTE.getId());  //metodo atualiza tabela

        } catch (Exception ex) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + ex), 0);
        }
    }//GEN-LAST:event_btnAdicionarFaceActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarFace;
    private javax.swing.JButton btnRemoverFace;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tfdDescricao;
    // End of variables declaration//GEN-END:variables
}
