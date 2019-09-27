package zoo;

public class Elefante extends Animal {

    private Integer peso;

    public Elefante() {
        super();
    }

    public Elefante(Integer peso, Integer cod, String nom_co, String nom_comun) {
        super(cod, nom_co, nom_comun);
        this.peso = peso;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    void verificarPeso() {
    }

}
