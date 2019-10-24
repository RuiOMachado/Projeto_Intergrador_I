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
@Table(name="calculo"
    ,schema="public"
)
public class Calculo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "qfo")
    private BigDecimal qfo;
    @Column(name = "qft")
    private BigDecimal qft;
    @Column(name = "fluxo_calor_total")
    private BigDecimal fluxoCalorTotal;
    @Column(name = "carga_termica")
    private BigDecimal cargaTermica;
    @Column(name = "id_face")
    private Integer idFace;

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
    
    
    public Integer getIdFace() {
        return idFace;
    }

    public void setIdFace(Integer idFace) {
        this.idFace = idFace;
    }
    
    public String subString() {
        return "%"+qfo+"%"+qft+"%"+fluxoCalorTotal+"%"+cargaTermica+"%"+idAmbiente+"%"+idProjeto+"%"+idFace+"%";
    }
    
}
