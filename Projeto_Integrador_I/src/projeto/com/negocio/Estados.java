package projeto.com.negocio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Douglas
 */
@Entity
@Table(name="estados"
    ,schema="public"
)
public class Estados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo_uf")
    private Integer codigoUf;
    @Basic(optional = false)
    @Column(name = "uf")
    private String uf;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoUf")
    private List<Municipios> municipiosList;

    public Estados() {
    }

    public Estados(Integer codigoUf) {
        this.codigoUf = codigoUf;
    }

    public Estados(Integer codigoUf, String uf, String nome) {
        this.codigoUf = codigoUf;
        this.uf = uf;
        this.nome = nome;
    }

    public Integer getCodigoUf() {
        return codigoUf;
    }

    public void setCodigoUf(Integer codigoUf) {
        this.codigoUf = codigoUf;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Municipios> getMunicipiosList() {
        return municipiosList;
    }

    public void setMunicipiosList(List<Municipios> municipiosList) {
        this.municipiosList = municipiosList;
    }
    
}
