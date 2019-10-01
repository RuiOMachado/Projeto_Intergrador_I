package projeto.com.negocio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name="municipios"
    ,schema="public"
)
public class Municipios implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMunicipios")
    private List<Projeto> projetoList;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo_ibge")
    private Integer codigoIbge;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "latitude")
    private float latitude;
    @Basic(optional = false)
    @Column(name = "longitude")
    private float longitude;
    @Basic(optional = false)
    @Column(name = "capital")
    private boolean capital;
    @JoinColumn(name = "codigo_uf", referencedColumnName = "codigo_uf")
    @ManyToOne(optional = false)
    private Estados codigoUf;

    public Municipios() {
    }

    public Municipios(Integer codigoIbge) {
        this.codigoIbge = codigoIbge;
    }

    public Municipios(Integer codigoIbge, String nome, float latitude, float longitude, boolean capital) {
        this.codigoIbge = codigoIbge;
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
        this.capital = capital;
    }

    public Integer getCodigoIbge() {
        return codigoIbge;
    }

    public void setCodigoIbge(Integer codigoIbge) {
        this.codigoIbge = codigoIbge;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public boolean getCapital() {
        return capital;
    }

    public void setCapital(boolean capital) {
        this.capital = capital;
    }

    public Estados getCodigoUf() {
        return codigoUf;
    }

    public void setCodigoUf(Estados codigoUf) {
        this.codigoUf = codigoUf;
    }

    public List<Projeto> getProjetoList() {
        return projetoList;
    }

    public void setProjetoList(List<Projeto> projetoList) {
        this.projetoList = projetoList;
    }
}
