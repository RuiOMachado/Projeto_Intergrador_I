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
    
    public static String STATE = null;
    
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
    @Column(name = "data_entrada")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataEntrada;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "content_old")
    private String contentOld;
    @Column(name = "content")
    private String content;
    @Column(name = "estado")
    private String estado;

    public Auditoria(String classe, String idDado, String usuario, String tipo, String content) {
        this.usuario     = usuario;
        this.classe      = classe;
        this.idDado      = idDado;
        this.dataEntrada = new Date();
        this.tipo        = tipo;
        this.content     = content;
        this.contentOld  = content;
        if(!"I".equals(this.estado)){
            this.estado = "A";
        }else{
            this.estado = "I";
        }  
    }
    
    public Auditoria(String classe, String idDado, String usuario, String tipo, String content, String contentOld) {
        this.usuario     = usuario;
        this.classe      = classe;
        this.idDado      = idDado;
        this.dataEntrada = new Date();
        this.tipo        = tipo;
        this.content     = content;
        this.contentOld  = contentOld;
        if(!"I".equals(this.estado)){
            this.estado = "A";
        }else{
            this.estado = "I";
        }  
    }
    
    public Auditoria(String usuario, String tipo) {
        this.usuario     = usuario;
        this.dataEntrada = new Date();
        this.tipo        = tipo;
        this.content     = null;
        this.contentOld  = null;
        if(!"I".equals(this.estado)){
            this.estado = "A";
        }else{
            this.estado = "I";
        } 
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
        STATE = estado;
    }
    
    public static String obterStatus(){
        return STATE;
    }
     
}
