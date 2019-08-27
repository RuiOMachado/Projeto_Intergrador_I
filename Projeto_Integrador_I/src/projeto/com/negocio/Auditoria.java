/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.com.negocio;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Douglas
 */
@Entity
@Table(name="auditoria"
    ,schema="public"
)

public class Auditoria implements java.io.Serializable {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "classe")
    private String classe;
    @Column(name = "idDado")
    private String idDado;    
    @Column(name = "dataEntrada")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataEntrada;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "content_old")
    private String contentOld;
    @Column(name = "content")
    private String content;

    public Auditoria(String classe, String idDado, String usuario, String tipo, String content){
        this.usuario     = usuario;
        this.classe      = classe;
        this.idDado      = idDado;
        this.dataEntrada = new Date();
        this.tipo        = tipo;
        this.content     = "";
        this.contentOld  = content;
    }
    
    public Auditoria(String classe, String idDado, String usuario, String tipo, String content, String contentOld) {
        this.usuario     = usuario;
        this.classe      = classe;
        this.idDado      = idDado;
        this.dataEntrada = new Date();
        this.tipo        = tipo;
        this.content     = content;
        this.contentOld  = contentOld;
    }
    
    public Auditoria(String usuario, String tipo, String content , String contentOld) {
        this.usuario     = usuario;
        this.dataEntrada = new Date();
        this.tipo        = tipo;
        this.content     = content;
        this.contentOld  = contentOld;
    }

    public Auditoria() {
    }

    public Auditoria(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
     public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
    
     public String getidDado() {
        return idDado;
    }

    public void setidDado(String idDado) {
        this.idDado = idDado;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getContentOld() {
        return contentOld;
    }

    public void setContentOld(String contentOld) {
        this.contentOld = contentOld;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
     
}
