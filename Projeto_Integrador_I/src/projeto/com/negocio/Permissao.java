/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.com.negocio;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Douglas
 */
@Entity
@Table(name = "permissao",
         schema = "public"
)
public class Permissao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @JoinColumn(name = "id_componente", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Componente idComponente;
    @Basic(optional = false)
    @JoinColumn(name = "id_login", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Login idLogin;
    @Column(name = "estado")
    private boolean estado;
    

    public Permissao() {
    }
    

    public Permissao(Integer id) {
        this.id = id;
    }

    public Permissao(Integer id, boolean estado) {
        this.id = id;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Componente getIdComponente() {
        return idComponente;
    }

    public void setIdComponente(Componente idComponente) {
        this.idComponente = idComponente;
    }
    
    public Login getIdLogin() {
        return idLogin;
    }

    /**
     * @param idLogin the idLogin to set
     */
    public void setIdLogin(Login idLogin) {
        this.idLogin = idLogin;
    }
    
    public String subString() {
        return "%"+id+"%"+idLogin+"%"+idComponente+"%";
    }

}
