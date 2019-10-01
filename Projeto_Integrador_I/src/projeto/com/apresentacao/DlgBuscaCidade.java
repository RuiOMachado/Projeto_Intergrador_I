package projeto.com.apresentacao;
import java.awt.Event;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import projeto.com.dao.DaoCidade;
import projeto.com.negocio.Municipios;

/**
 *
 * @author Douglas
 */
public class DlgBuscaCidade extends javax.swing.JDialog {

    IfrProjeto ifrProjeto;

    public DlgBuscaCidade(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public DlgBuscaCidade(java.awt.Frame parent, boolean modal, IfrProjeto ifrProjeto) {
        super(parent, modal);
        initComponents();
        this.ifrProjeto = ifrProjeto;
        DaoCidade.listarCidade(tblCidade);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuscar = new javax.swing.JButton();
        tfdPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCidade = new javax.swing.JTable();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tfdPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdPesquisaActionPerformed(evt);
            }
        });
        tfdPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfdPesquisaKeyReleased(evt);
            }
        });

        tblCidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "#", "Nome", "UF", "Latitude"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
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
        tblCidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCidadeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCidade);
        if (tblCidade.getColumnModel().getColumnCount() > 0) {
            tblCidade.getColumnModel().getColumn(0).setResizable(false);
            tblCidade.getColumnModel().getColumn(1).setResizable(false);
            tblCidade.getColumnModel().getColumn(2).setResizable(false);
            tblCidade.getColumnModel().getColumn(3).setResizable(false);
        }

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSair))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfdPesquisa)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tfdPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdPesquisaActionPerformed

    }//GEN-LAST:event_tfdPesquisaActionPerformed

    private void tfdPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdPesquisaKeyReleased
        if (evt.getKeyCode() == Event.ENTER) {
            buscar();
        }
    }//GEN-LAST:event_tfdPesquisaKeyReleased

    private void tblCidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCidadeMouseClicked
        defineValor();
    }//GEN-LAST:event_tblCidadeMouseClicked

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    
    private void buscar(){
        List resultado = null;

        DefaultTableModel modelo = (DefaultTableModel) tblCidade.getModel();
        modelo.setNumRows(0);

        resultado = DaoCidade.pesquisaCidade(tfdPesquisa.getText());

        for (Object o : resultado) {
            Municipios cid = (Municipios) o;
            modelo.addRow(new Object[]{
                cid.getCodigoIbge(), cid.getNome(), cid.getCodigoUf().getUf(), cid.getLatitude()
            });
        }
    }
    
    public void defineValor(){
        List resultado = null;
        Municipios cidade = new Municipios();
        String idString = String.valueOf(tblCidade.getValueAt(tblCidade.getSelectedRow(), 0));
        int codigoTabela = Integer.parseInt(idString);

        resultado = DaoCidade.buscaIdCidade(codigoTabela);

        for (Object o : resultado) {
            Municipios cid = (Municipios) o;
            cidade = cid;
        }
        ifrProjeto.definirValorCidade(String.valueOf(codigoTabela), cidade.getNome());
        dispose();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCidade;
    private javax.swing.JTextField tfdPesquisa;
    // End of variables declaration//GEN-END:variables
}
