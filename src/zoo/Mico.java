package zoo;

public class Mico extends Animal {

    private String alimento;
    private String habitad;
    private String especie;

    public Mico() {
        super();
    }

    public Mico(String alimento, String habitad, String especie, Integer cod, String nom_co, String nom_comun) {
        super(cod, nom_co, nom_comun);
        this.alimento = alimento;
        this.habitad = habitad;
        this.especie = especie;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    void verificarAlimento() {
    }
;
}
