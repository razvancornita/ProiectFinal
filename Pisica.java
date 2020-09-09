

public class Pisica {
    private int x;
    private int varsta;
    private String nume;
    private String rasa;
    private String culoare;

    private Pisica() {

    }

    private Pisica(int varsta, String nume, String rasa, String culoare) {
        this.varsta = varsta;
        this.nume = nume;
        this.rasa = rasa;
        this.culoare = culoare;
    }

    private void spuneVarsta() {
        System.out.println("Am " + this.varsta + " ani :)");
    }

    private void spuneMiau() {
        System.out.println("Miau!");
    }

    private void spuneNume() {
        System.out.println("Numele meu este " + this.nume);
    }

    private void salutaOm(String numeOm) {
        System.out.println("Salut, " + numeOm);
    }

    @Override
    public String toString() {
        return "Pisica{" +
                "varsta=" + varsta +
                ", nume='" + nume + '\'' +
                ", rasa='" + rasa + '\'' +
                ", culoare='" + culoare + '\'' +
                '}';
    }
}
