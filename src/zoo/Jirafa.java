package zoo;

public class Jirafa extends Animal {

    private float altura;
    private float long_cuello;

    public Jirafa() {
        super();
    }

    public Jirafa(float altura, float long_cuello, Integer cod, String nom_co, String nom_comun) {
        super(cod, nom_co, nom_comun);
        this.altura = altura;
        this.long_cuello = long_cuello;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLong_cuello() {
        return long_cuello;
    }

    public void setLong_cuello(float long_cuello) {
        this.long_cuello = long_cuello;
    }

}
