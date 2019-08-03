package projeto.com.negocio;
// Generated 02/08/2019 20:08:33 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Login generated by hbm2java
 */
@Entity
@Table(name="login"
    ,schema="public"
)
public class Login  implements java.io.Serializable {


     private int id;
     private String nome;
     private String senha;
     private String estado;

    public Login() {
    }

	
    public Login(int id) {
        this.id = id;
    }
    public Login(int id, String nome, String senha, String estado) {
       this.id = id;
       this.nome = nome;
       this.senha = senha;
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

    
    @Column(name="nome", length=100)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    @Column(name="senha", length=100)
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    @Column(name="estado", length=10)
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }




}


