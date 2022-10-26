/**
 * En rett med navn, type (middag, frokost etc.) og pris
 */
public class Dish extends Menu {
    private String navn;
    private String type;
    private double pris;
    public Dish(String navn, String type, double pris) {
        this.navn = navn;
        this.type = type;
        this.pris = pris;
    }

    public String toString() {
        return this.navn + " (" + this.type + ") - " + this.pris + "kr";
    }

    public String getNavn() {
        return this.navn;
    }

    public String getType() {
        return this.type;
    }

    public double getPrice() {
        return this.pris;
    }
}
