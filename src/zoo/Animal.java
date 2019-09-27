package zoo;

/**
 *
 * @author estudiante
 */
public class Animal {

    protected Integer cod;
    protected String nom_co;
    protected String nom_comun;

    public Animal() {
    }

    public Animal(Integer cod, String nom_co, String nom_comun) {
        this.cod = cod;
        this.nom_co = nom_co;
        this.nom_comun = nom_comun;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public String getNom_co() {
        return nom_co;
    }

    public void setNom_co(String nom_co) {
        this.nom_co = nom_co;
    }

    public String getNom_comun() {
        return nom_comun;
    }

    public void setNom_comun(String nom_comun) {
        this.nom_comun = nom_comun;
    }

    void comer() {
    }

    ;
    void desplazarse() {
    }

    ;
    void aparearse() {
    }
;

}
