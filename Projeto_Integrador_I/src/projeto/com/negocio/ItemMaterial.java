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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Douglas
 */
@Entity
@Table(name = "item_material",
         schema = "public"
)
public class ItemMaterial implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idItemmaterial")
    private List<ItemFace> itemFaceList;

    private static final long serialVersionUID = 1L;
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
    @Column(name = "indice_radiacao")
    private BigDecimal indiceRadiacao;
    @Column(name = "espessura")
    private BigDecimal espessura;
    @Column(name = "resistencia")
    private BigDecimal resistencia;
    @Column(name = "total_qfo")
    private BigDecimal totalQfo;
    @Column(name = "id_calculo")
    private Integer idCalculo;
    @JoinColumn(name = "id_face", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Face idFace;
    @JoinColumn(name = "id_material", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Material idMaterial;

    public ItemMaterial() {
    }

    public ItemMaterial(Integer id) {
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

    public BigDecimal getIndiceRadiacao() {
        return indiceRadiacao;
    }

    public void setIndiceRadiacao(BigDecimal indiceRadiacao) {
        this.indiceRadiacao = indiceRadiacao;
    }

    public BigDecimal getEspessura() {
        return espessura;
    }

    public void setEspessura(BigDecimal espessura) {
        this.espessura = espessura;
    }

    public BigDecimal getResistencia() {
        return resistencia;
    }

    public void setResistencia(BigDecimal resistencia) {
        this.resistencia = resistencia;
    }

    public BigDecimal getTotalQfo() {
        return totalQfo;
    }

    public void setTotalQfo(BigDecimal totalQfo) {
        this.totalQfo = totalQfo;
    }

    public Face getIdFace() {
        return idFace;
    }

    public void setIdFace(Face idFace) {
        this.idFace = idFace;
    }

    public Material getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(Material idMaterial) {
        this.idMaterial = idMaterial;
    }

    public List<ItemFace> getItemFaceList() {
        return itemFaceList;
    }

    public void setItemFaceList(List<ItemFace> itemFaceList) {
        this.itemFaceList = itemFaceList;
    }

    public Integer getIdCalculo() {
        return idCalculo;
    }

    public void setIdCalculo(Integer idCalculo) {
        this.idCalculo = idCalculo;
    }
    
}
