package projeto.com.negocio;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Douglas
 */
@Entity
@Table(name="resultado"
    ,schema="public"
)
public class Resultado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "carga")
    private BigDecimal carga;
    @Column(name = "btu")
    private BigDecimal btu;
    @Basic(optional = false)
    @Column(name = "id_ambiente")
    private int idAmbiente;

    public Resultado() {
    }

    public Resultado(Integer id) {
        this.id = id;
    }

    public Resultado(Integer id, int idAmbiente) {
        this.id = id;
        this.idAmbiente = idAmbiente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getCarga() {
        return carga;
    }

    public void setCarga(BigDecimal carga) {
        this.carga = carga;
    }

    public BigDecimal getBtu() {
        return btu;
    }

    public void setBtu(BigDecimal btu) {
        this.btu = btu;
    }

    public int getIdAmbiente() {
        return idAmbiente;
    }

    public void setIdAmbiente(int idAmbiente) {
        this.idAmbiente = idAmbiente;
    }
    
    public String subString() {
        return "%"+id+"%"+carga+"%"+btu+"%"+idAmbiente+"%";
    }

    
    
}
