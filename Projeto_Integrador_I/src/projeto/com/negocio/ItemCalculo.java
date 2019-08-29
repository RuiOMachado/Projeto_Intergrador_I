/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.com.negocio;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name="item_calculo"
    ,schema="public"
)
public class ItemCalculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "resistencia_int")
    private BigDecimal resistenciaInt;
    @Column(name = "resistencia_ext")
    private BigDecimal resistenciaExt;
    @Column(name = "resistencia_total")
    private BigDecimal resistenciaTotal;
    @Column(name = "transmissividade_ter")
    private BigDecimal transmissividadeTer;
    @JoinColumn(name = "id_calculo", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Calculo idCalculo;
    @JoinColumn(name = "id_material", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Material idMaterial;
    @JoinColumn(name = "id_produto", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Produto idProduto;

    public ItemCalculo() {
    }

    public ItemCalculo(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getResistenciaInt() {
        return resistenciaInt;
    }

    public void setResistenciaInt(BigDecimal resistenciaInt) {
        this.resistenciaInt = resistenciaInt;
    }

    public BigDecimal getResistenciaExt() {
        return resistenciaExt;
    }

    public void setResistenciaExt(BigDecimal resistenciaExt) {
        this.resistenciaExt = resistenciaExt;
    }

    public BigDecimal getResistenciaTotal() {
        return resistenciaTotal;
    }

    public void setResistenciaTotal(BigDecimal resistenciaTotal) {
        this.resistenciaTotal = resistenciaTotal;
    }

    public BigDecimal getTransmissividadeTer() {
        return transmissividadeTer;
    }

    public void setTransmissividadeTer(BigDecimal transmissividadeTer) {
        this.transmissividadeTer = transmissividadeTer;
    }

    public Calculo getIdCalculo() {
        return idCalculo;
    }

    public void setIdCalculo(Calculo idCalculo) {
        this.idCalculo = idCalculo;
    }

    public Material getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(Material idMaterial) {
        this.idMaterial = idMaterial;
    }

    public Produto getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Produto idProduto) {
        this.idProduto = idProduto;
    }
    
}
