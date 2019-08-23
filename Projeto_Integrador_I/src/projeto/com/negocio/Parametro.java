package projeto.com.negocio;
// Generated 23/08/2019 10:48:38 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Parametro generated by hbm2java
 */
@Entity
@Table(name="parametro"
    ,schema="public"
)
public class Parametro  implements java.io.Serializable {


     private int id;
     private String descricao;
     private Boolean estado;

    public Parametro() {
    }

	
    public Parametro(int id) {
        this.id = id;
    }
    public Parametro(int id, String descricao, Boolean estado) {
       this.id = id;
       this.descricao = descricao;
       this.estado = estado;

    }
   
     @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="descricao", length=45)
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    @Column(name="estado")
    public Boolean getEstado() {
        return this.estado;
    }
    
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

}


