package projeto.com.apresentacao;

import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import projeto.com.dao.DaoAuditoria;
import projeto.com.dao.DaoGenerico;
import projeto.com.dao.DaoLog;
import projeto.com.dao.DaoProjeto;
import projeto.com.negocio.Log;
import projeto.com.negocio.Municipios;
import projeto.com.negocio.Projeto;

/**
 *
 * @author Douglas
 */
public class IfrProjeto extends javax.swing.JInternalFrame {

    int codigoTabela = 0;
    int idUpdate = 0;
    String Dados_OLD = "";
    DlgCalculo dlgCalculo;
    float latitude;
    public static Projeto PROJETO = null;

    public IfrProjeto() {
        initComponents();
        DaoProjeto.listarProjeto(tblProjeto);
        PROJETO = new Projeto();
    }

    public IfrProjeto(DlgCalculo dlgCalculo) {
        initComponents();
        this.dlgCalculo = dlgCalculo;
        DaoProjeto.listarProjeto(tblProjeto);
        PROJETO = new Projeto();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfdNomeCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfdSatus = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfdDescricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfdQtdComodo = new javax.swing.JTextField();
        tfdCodCidade = new javax.swing.JTextField();
        tfdDescricaoCidade = new javax.swing.JTextField();
        btnBuscarProjeto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProjeto = new javax.swing.JTable();
        btnSair = new javax.swing.JButton();
        btnEditarProjeto = new javax.swing.JButton();
        btnSalvarProjeto = new javax.swing.JButton();
        btnExcluirProjeto = new javax.swing.JButton();
        btnCalcularFacesProjeto = new javax.swing.JButton();

        setTitle("Lançamento de projeto");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Projeto"));

        jLabel1.setText("Nome Completo do Cliente");

        jLabel2.setText("Cidade do Projeto");

        tfdSatus.setToolTipText("Status do projeto");
        tfdSatus.setEnabled(false);

        jLabel3.setText("Status");

        tfdDescricao.setToolTipText("Descrição do projeto");

        jLabel4.setText("Descrição");

        jLabel8.setText("Qtd de Comodo");

        tfdQtdComodo.setToolTipText("Quantidade de comôdos dos projeto");

        tfdCodCidade.setEnabled(false);

        tfdDescricaoCidade.setEnabled(false);

        btnBuscarProjeto.setText("...");
        btnBuscarProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProjetoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(tfdCodCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfdDescricaoCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnBuscarProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfdSatus, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(tfdDescricao)
                        .addComponent(tfdNomeCliente))
                    .addComponent(tfdQtdComodo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfdNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfdSatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tfdCodCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdDescricaoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProjeto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfdQtdComodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblProjeto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "#", "Descrição", "Cliente", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tblProjeto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProjetoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblProjetoMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tblProjeto);

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnEditarProjeto.setText("Editar");
        btnEditarProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProjetoActionPerformed(evt);
            }
        });

        btnSalvarProjeto.setText("Salvar");
        btnSalvarProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarProjetoActionPerformed(evt);
            }
        });

        btnExcluirProjeto.setText("Excluir");
        btnExcluirProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProjetoActionPerformed(evt);
            }
        });

        btnCalcularFacesProjeto.setText("Calcular");
        btnCalcularFacesProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularFacesProjetoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExcluirProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCalcularFacesProjeto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSalvarProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCalcularFacesProjeto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnEditarProjeto)
                    .addComponent(btnSalvarProjeto)
                    .addComponent(btnExcluirProjeto))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSalvarProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarProjetoActionPerformed
        try {
            Projeto pro = new Projeto();
            int qnt = 0;
            
            if (tfdDescricao.getText().length() > 0 && tfdNomeCliente.getText().length() > 0) {
                Municipios cid = new Municipios();
                cid.setCodigoIbge(Integer.parseInt(tfdCodCidade.getText()));
                pro.setDescricao(tfdDescricao.getText());
                pro.setNomecliente(tfdNomeCliente.getText());
                pro.setDatainicio(new Date());
                pro.setEstado("Andamento");
                pro.setIdMunicipios(cid);
                pro.setQntComodo(Integer.parseInt(tfdQtdComodo.getText()));
                qnt = pro.getQntComodo();
                
                if (codigoTabela == 0) {
                    DaoGenerico.saveOrUpdate(pro, codigoTabela);
                    DaoProjeto.criarAmbiente(tfdDescricao.getText(),Integer.parseInt(tfdQtdComodo.getText()), pro.getId(), codigoTabela, 0);
                    JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
                    DaoAuditoria.saveAuditoria("Projeto", pro.subString(), Dados_OLD, codigoTabela, "INCLUIR");
                } else {
                    pro.setId(idUpdate);
                    DaoGenerico.saveOrUpdate(pro, idUpdate);
                    DaoProjeto.criarAmbiente(tfdDescricao.getText(),Integer.parseInt(tfdQtdComodo.getText()), pro.getId(), idUpdate, qnt);
                    JOptionPane.showMessageDialog(null, "Registro editado com sucesso!");
                    DaoAuditoria.saveAuditoria("Projeto", pro.subString(), Dados_OLD, codigoTabela, "EDITAR");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Erro ao inserir Registro!");
            }
        } catch (Exception ex) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + ex), 0);
        }
        limparCampos();
    }//GEN-LAST:event_btnSalvarProjetoActionPerformed

    private void btnEditarProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProjetoActionPerformed
        List resultado = null;
        String idString = String.valueOf(tblProjeto.getValueAt(tblProjeto.getSelectedRow(), 0));
        codigoTabela = Integer.parseInt(idString);

        resultado = DaoProjeto.buscaIdProjeto(codigoTabela);

        for (Object o : resultado) {
            Projeto pro = (Projeto) o;
            idUpdate = pro.getId();
            tfdSatus.setText(pro.getEstado());
            tfdDescricao.setText(pro.getDescricao());
            tfdCodCidade.setText(String.valueOf(pro.getIdMunicipios().getCodigoIbge()));
            tfdDescricaoCidade.setText(pro.getIdMunicipios().getNome());
            tfdNomeCliente.setText(pro.getNomecliente());
            tfdQtdComodo.setText(String.valueOf(pro.getQntComodo()));
            Dados_OLD = "%" + pro.getDescricao() + "%" + pro.getNomecliente() + "%" + pro.getEstado() + "%" + pro.getDatafinal() + "%" + pro.getDatainicio() + "%" + pro.getQntComodo() + "%";
        }
        tfdNomeCliente.requestFocus();
    }//GEN-LAST:event_btnEditarProjetoActionPerformed

    private void btnBuscarProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProjetoActionPerformed
        DlgBuscaCidade busca = new DlgBuscaCidade(null, true, this);
        busca.setLocationRelativeTo(this);
        busca.setVisible(true);
    }//GEN-LAST:event_btnBuscarProjetoActionPerformed

    private void btnExcluirProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProjetoActionPerformed
        Projeto pro = new Projeto();

        List resultado = null;
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?") == JOptionPane.YES_OPTION) {

            String idString = String.valueOf(tblProjeto.getValueAt(tblProjeto.getSelectedRow(), 0));
            resultado = DaoProjeto.buscaIdProjeto(Integer.parseInt(idString));
            for (Object o : resultado) {
                pro = (Projeto) o;
                pro.setEstado("Excluído");
            }

            DaoGenerico.saveOrUpdate(pro, pro.getId());
            DaoAuditoria.saveAuditoria("Projeto", pro.subString(), Dados_OLD, Integer.valueOf(idString), "DELETAR");
            JOptionPane.showMessageDialog(null, "Registro deletado com sucesso!");

        }
        DaoProjeto.listarProjeto(tblProjeto);
    }//GEN-LAST:event_btnExcluirProjetoActionPerformed

    private void tblProjetoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProjetoMouseClicked
        if (evt.getClickCount() == 2) {
            definirValorProjeto();
            DlgCalculo cal = new DlgCalculo(null, true, this,latitude);
            cal.setVisible(true);
        }
    }//GEN-LAST:event_tblProjetoMouseClicked

    private void btnCalcularFacesProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularFacesProjetoActionPerformed
            definirValorProjeto();
            DlgCalculo cal = new DlgCalculo(null, true, this, latitude);
            cal.setVisible(true);
    }//GEN-LAST:event_btnCalcularFacesProjetoActionPerformed

    private void tblProjetoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProjetoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblProjetoMouseEntered

    public void limparCampos() {
        tfdDescricao.setText("");
        tfdNomeCliente.setText("");
        tfdQtdComodo.setText("");
        tfdSatus.setText("");
        tfdCodCidade.setText("");
        tfdDescricaoCidade.setText("");
        DaoProjeto.listarProjeto(tblProjeto);  //metodo atualiza tabela
    }

    public void definirValorCidade(String id, String descricao) {
        tfdCodCidade.setText(id);
        tfdDescricaoCidade.setText(descricao);
    }
    
    public void definirValorProjeto() {
        List resultado = null;
        Projeto projeto = new Projeto();
        String idString = String.valueOf(tblProjeto.getValueAt(tblProjeto.getSelectedRow(), 0));
        int codigoTabela = Integer.parseInt(idString);

        resultado = DaoGenerico.buscaId(codigoTabela, "Projeto");

        for (Object o : resultado) {
            Projeto pro = (Projeto) o;
            projeto.setId(pro.getId());
            projeto.setDescricao(pro.getDescricao());
            latitude = pro.getIdMunicipios().getLatitude();
        }
        
        PROJETO.setId(projeto.getId());
        PROJETO.setDescricao(projeto.getDescricao());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarProjeto;
    private javax.swing.JButton btnCalcularFacesProjeto;
    private javax.swing.JButton btnEditarProjeto;
    private javax.swing.JButton btnExcluirProjeto;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvarProjeto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProjeto;
    private javax.swing.JTextField tfdCodCidade;
    private javax.swing.JTextField tfdDescricao;
    private javax.swing.JTextField tfdDescricaoCidade;
    private javax.swing.JTextField tfdNomeCliente;
    private javax.swing.JTextField tfdQtdComodo;
    private javax.swing.JTextField tfdSatus;
    // End of variables declaration//GEN-END:variables
}
