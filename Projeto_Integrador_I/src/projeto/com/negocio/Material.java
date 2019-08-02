package projeto.com.negocio;


public class Material {
    
    private int id;
    private String descricao;
    private double qntd;
    private double peso;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getQntd() {
        return qntd;
    }

    public void setQntd(double qntd) {
        this.qntd = qntd;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
