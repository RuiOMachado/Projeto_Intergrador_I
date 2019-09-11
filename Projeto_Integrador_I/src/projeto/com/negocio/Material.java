
package projeto.com.negocio;

import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Douglas
 */
@Entity
@Table(name="material"
    ,schema="public")

public class Material implements java.io.Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMaterial")
    private List<ItemCalculo> itemCalculoList;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "condutividade")
    private BigDecimal condutividade;
    @Column(name = "espessura")
    private BigDecimal espessura;
    @Column(name = "dencidade")
    private BigDecimal dencidade;
    @Column(name = "calor")
    private BigDecimal calor;
    @Column(name = "resistencia")
    private BigDecimal resistencia;
    @Column(name = "cor")
    private String cor;

    public Material() {
    }

    public Material(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getCondutividade() {
        return condutividade;
    }

    public void setCondutividade(BigDecimal condutividade) {
        this.condutividade = condutividade;
    }

    public BigDecimal getEspessura() {
        return espessura;
    }

    public void setEspessura(BigDecimal espessura) {
        this.espessura = espessura;
    }

    public BigDecimal getDencidade() {
        return dencidade;
    }

    public void setDencidade(BigDecimal dencidade) {
        this.dencidade = dencidade;
    }

    public BigDecimal getCalor() {
        return calor;
    }

    public void setCalor(BigDecimal calor) {
        this.calor = calor;
    }

    public BigDecimal getResistencia() {
        return resistencia;
    }

    public void setResistencia(BigDecimal resistencia) {
        this.resistencia = resistencia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String subString() {
        return "%"+descricao+"%"+cor+"%"+condutividade+"%"+espessura+"%"+dencidade+"%"+calor+"%"+resistencia+"%";
    }

    
}
