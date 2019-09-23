/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.com.negocio;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Douglas
 */
@Entity
@Table(name = "calculo")
@NamedQueries({
    @NamedQuery(name = "Calculo.findAll", query = "SELECT c FROM Calculo c")})
public class Calculo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "qfo")
    private BigDecimal qfo;
    @Column(name = "qft")
    private BigDecimal qft;
    @Column(name = "fluxo_calor_total")
    private BigDecimal fluxoCalorTotal;
    @Column(name = "carga_termica")
    private BigDecimal cargaTermica;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCalculo")
    private List<ItemFace> itemFaceList;
    @JoinColumn(name = "id_ambiente", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Ambiente idAmbiente;
    @JoinColumn(name = "id_projeto", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Projeto idProjeto;

    public Calculo() {
    }

    public Calculo(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getQfo() {
        return qfo;
    }

    public void setQfo(BigDecimal qfo) {
        this.qfo = qfo;
    }

    public BigDecimal getQft() {
        return qft;
    }

    public void setQft(BigDecimal qft) {
        this.qft = qft;
    }

    public BigDecimal getFluxoCalorTotal() {
        return fluxoCalorTotal;
    }

    public void setFluxoCalorTotal(BigDecimal fluxoCalorTotal) {
        this.fluxoCalorTotal = fluxoCalorTotal;
    }

    public BigDecimal getCargaTermica() {
        return cargaTermica;
    }

    public void setCargaTermica(BigDecimal cargaTermica) {
        this.cargaTermica = cargaTermica;
    }

    public List<ItemFace> getItemFaceList() {
        return itemFaceList;
    }

    public void setItemFaceList(List<ItemFace> itemFaceList) {
        this.itemFaceList = itemFaceList;
    }

    public Ambiente getIdAmbiente() {
        return idAmbiente;
    }

    public void setIdAmbiente(Ambiente idAmbiente) {
        this.idAmbiente = idAmbiente;
    }

    public Projeto getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(Projeto idProjeto) {
        this.idProjeto = idProjeto;
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
        if (!(object instanceof Calculo)) {
            return false;
        }
        Calculo other = (Calculo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projeto.com.negocio.Calculo[ id=" + id + " ]";
    }
    
}
