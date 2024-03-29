package projeto.com.negocio;

import java.io.Serializable;
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
@Table(name="face"
    ,schema="public"
)
public class Face implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "id_ambiente")
    private Integer id_ambiente;
    @Column(name = "regiaoSolar")
    private String regiaoSolar;
    @Column(name = "estacao")
    private String estacao;

    public Face() {
    }

    public Face(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public Integer getId_ambiente() {
        return id_ambiente;
    }

    public void setId_ambiente(Integer id_ambiente) {
        this.id_ambiente = id_ambiente;
    }
    
    public String getRegiaoSolar() {
        return regiaoSolar;
    }

    public void setRegiaoSolar(String regiaoSolar) {
        this.regiaoSolar = regiaoSolar;
    }
    
    public String getEstacao() {
        return estacao;
    }

    public void setEstacao(String estacao) {
        this.estacao = estacao;
    }
    
    public String subString() {
        return "%"+nome+"%"+tipo+"%"+id_ambiente+"%"+regiaoSolar+"%"+estacao+"%";
    }
    
}
