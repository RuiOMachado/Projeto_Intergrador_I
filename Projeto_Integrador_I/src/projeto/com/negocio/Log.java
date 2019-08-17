/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.com.negocio;

import java.util.Date;
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
@Table(name="log"
    ,schema="public"
)
public class Log implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "data_entrada")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataEntrada;
    @Column(name = "descricao")
    private String descricao;

    public Log() {
    }
    
    public Log(String usuario, String descricao) {
        this.dataEntrada = new Date();
        this.usuario     = usuario;
        this.descricao   = descricao;
    }
    public Log(int id, String usuario, Date dataEntrada, String descricao) {
       this.id          = id;
       this.usuario     = usuario;
       this.dataEntrada = dataEntrada;
       this.descricao   = descricao;
    }

    public Log(Integer id) {
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
