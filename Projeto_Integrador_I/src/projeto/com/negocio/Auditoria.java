/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.com.negocio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Douglas
 */
@Entity
@Table(name = "auditoria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Auditoria.findAll", query = "SELECT a FROM Auditoria a")
    , @NamedQuery(name = "Auditoria.findById", query = "SELECT a FROM Auditoria a WHERE a.id = :id")
    , @NamedQuery(name = "Auditoria.findByUsuario", query = "SELECT a FROM Auditoria a WHERE a.usuario = :usuario")
    , @NamedQuery(name = "Auditoria.findByDataEntrada", query = "SELECT a FROM Auditoria a WHERE a.dataEntrada = :dataEntrada")
    , @NamedQuery(name = "Auditoria.findByTipo", query = "SELECT a FROM Auditoria a WHERE a.tipo = :tipo")
    , @NamedQuery(name = "Auditoria.findByContentOld", query = "SELECT a FROM Auditoria a WHERE a.contentOld = :contentOld")
    , @NamedQuery(name = "Auditoria.findByContent", query = "SELECT a FROM Auditoria a WHERE a.content = :content")
    , @NamedQuery(name = "Auditoria.findByEstado", query = "SELECT a FROM Auditoria a WHERE a.estado = :estado")})

public class Auditoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "usuario")
    private String usuario;
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
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Auditoria)) {
            return false;
        }
        Auditoria other = (Auditoria) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projeto.com.negocio.Auditoria[ id=" + id + " ]";
    }
    
}
