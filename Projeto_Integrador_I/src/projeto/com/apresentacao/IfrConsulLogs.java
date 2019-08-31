package projeto.com.apresentacao;

import java.util.List;
import projeto.com.dao.DaoGenerico;
import projeto.com.dao.DaoLog;
import projeto.com.negocio.Log;

/**
 *
 * @author Douglas
 */
public class IfrConsulLogs extends javax.swing.JInternalFrame {

    /**
     * Creates new form IfrConsul
     */
    public IfrConsulLogs() {
        initComponents();
        DaoLog.listarLogs(tblLogs);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblLogs = new javax.swing.JTable();
        btnSair = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Consultas registro de Logs");

        tblLogs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "#", "Usuário ", "Data_Horário                     ", "Descrição                         "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLogs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLogsMouseClicked(evt);
            }
        });
        tblLogs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblLogsKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblLogs);
        if (tblLogs.getColumnModel().getColumnCount() > 0) {
            tblLogs.getColumnModel().getColumn(0).setMinWidth(5);
            tblLogs.getColumnModel().getColumn(0).setPreferredWidth(1);
            tblLogs.getColumnModel().getColumn(1).setPreferredWidth(1);
        }

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jTextArea.setToolTipText("Informações detalhadas do log de erro");
        jTextArea.setEnabled(false);
        jScrollPane2.setViewportView(jTextArea);

        jLabel1.setText("Detalhes do Log");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSair)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void tblLogsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblLogsKeyPressed

    }//GEN-LAST:event_tblLogsKeyPressed

    private void tblLogsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLogsMouseClicked

        List resultado = null;
        String idString = String.valueOf(tblLogs.getValueAt(tblLogs.getSelectedRow(), 0));
        int codigoTabela = Integer.parseInt(idString);

        resultado = DaoLog.buscaIdLog(codigoTabela);

        for (Object o : resultado) {
            Log log = (Log) o;
          
            jTextArea.setText("Informações Sobre o Erro ! "+
                              "Código : "+log.getId()+"|"+
                              "Descrição : "+log.getDescricao());
            jTextArea.setLineWrap(true);
        }
    }//GEN-LAST:event_tblLogsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JTable tblLogs;
    // End of variables declaration//GEN-END:variables
}
