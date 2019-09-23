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
@Table(name="item_face"
    ,schema="public"
)
public class ItemFace implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "area")
    private BigDecimal area;
    @Column(name = "total_qfo")
    private BigDecimal totalQfo;
    @JoinColumn(name = "id_calculo", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Calculo idCalculo;
    @JoinColumn(name = "id_itemmaterial", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private ItemMaterial idItemmaterial;

    public ItemFace() {
    }

    public ItemFace(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    public BigDecimal getTotalQfo() {
        return totalQfo;
    }

    public void setTotalQfo(BigDecimal totalQfo) {
        this.totalQfo = totalQfo;
    }

    public Calculo getIdCalculo() {
        return idCalculo;
    }

    public void setIdCalculo(Calculo idCalculo) {
        this.idCalculo = idCalculo;
    }

    public ItemMaterial getIdItemmaterial() {
        return idItemmaterial;
    }

    public void setIdItemmaterial(ItemMaterial idItemmaterial) {
        this.idItemmaterial = idItemmaterial;
    }

}
