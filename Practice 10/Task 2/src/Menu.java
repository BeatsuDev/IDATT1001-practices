import java.util.ArrayList;

/**
 * En meny med retter
 */
public class Menu {
    private ArrayList<Dish> retter;

    public Menu() {
        this.retter = new ArrayList<Dish>();
    }

    /**
     * Legger til en rett til denne menyen
     * @param rett
     */
    public void addDish(Dish rett) {
        this.retter.add(rett);
    }

    /**
     * Returnerer en rett med det gitte navnet
     * @param navn
     * @return
     */
    public Dish finnRettGittNavn(String navn) {
        for (Dish rett : this.retter) {
            if (rett.getNavn().equalsIgnoreCase(navn)) {
                return rett;
            }
        }
        return null;
    }

    /**
     * Returnerer en ArrayList med retter som er av gitt type
     * @param type
     * @return
     */
    public ArrayList<Dish> findDishesGivenType(String type) {
        ArrayList<Dish> returnArray = new ArrayList<Dish>();
        for (Dish rett : this.retter) {
            if (rett.getType().equalsIgnoreCase(type)) {
                returnArray.add(rett);
            }
        }
        return returnArray;
    }

    public ArrayList<Dish> getDishes() {
        return this.retter;
    }

    public String toString() {
        String returnString = "";
        for (Dish rett : this.retter) {
            returnString += rett.toString() + "\n";
        }
        return returnString;
    }

    /**
     * Returnerer en output friendly formattert string en liste med retter
     * @param retter
     * @return
     */
    public static String toStringFromListOfDishes(ArrayList<Dish> retter) {
        String returnString = "";
        for (Dish rett : retter) {
            returnString += rett.toString() + "\n";
        }
        return returnString;
    }
}
