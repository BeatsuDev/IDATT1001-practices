import java.util.ArrayList;

/**
 * A class to keep track of all menus in a restaurant chain.
 * 
 * @author Eric Bieszczad-Stie
 */
public class MenuRegister {
    private ArrayList<Menu> menuList;

    public MenuRegister() {
        this.menuList = new ArrayList<Menu>();
    }

    /**
     * Add a menu to the menu register.
     * 
     * @param menu  The menu to add to the register.
     */
    public void addMenu(Menu menu) {
        this.menuList.add(menu);
    }

    /**
     * Register a new dish in the menu register.
     * 
     * @param menu  The menu to add the dish to.
     * @param dish  The dish to add to the menu.
     */
    public static void addDishToMenu(Menu menu, Dish dish) {
        menu.addDish(dish);
    }

    /**
     * Find a dish given a name.
     * 
     * @param name  The name of the dish to search for.
     * @return the dish with the given name.
     */
    public Dish findDishByName(String name) {
        Dish dish;
        for (Menu meny : this.menuList) {
            dish = meny.finnRettGittNavn(name);
            if (dish != null) {
                return dish;
            }
        }
        return null;
    }

    /**
     * Find all dishes given a type.
     * 
     * @param type  The type of the dishes to search for.
     * @return the dishes with the given type.
     */
    public ArrayList<Dish> findDishesByType(String type) {
        ArrayList<Dish> dishes = new ArrayList<Dish>();
        for (Menu menu : this.menuList) {
            dishes.addAll(menu.findDishesGivenType(type));
        }
        return dishes;
    }

    /**
     * Return all menus in the register with a price between the given prices. The
     * boundaries are inclusive, so if the price of a menu equals the lower or upper
     * bound, it will be included in the result.
     * 
     * @param lowestPrice  The lowest price of the menus to search for.
     * @param highestPrice  The highest price of the menus to search for.
     * @return the menus with a price between the given prices.
     */
    public ArrayList<Menu> findMenusBetweenPrice(double lowestPrice, double highestPrice) {
        ArrayList<Menu> returnArray = new ArrayList<Menu>();
        int menuPrice;
        for (Menu menu : this.menuList) {

            menuPrice = 0;
            for (Dish dish : menu.getDishes()) {
                menuPrice += dish.getPrice();
            }
            if (menuPrice >= lowestPrice && menuPrice <= highestPrice) {
                returnArray.add(menu);
            }
        }
        return returnArray;
    }

    /**
     * Return a string representation of a list of menus.
     * 
     * @param menus  The list of menus to represent as a string.
     * @return a string representation of the list of menus.
     */
    public static String toStringFraMenyListe(ArrayList<Menu> menus) {
        String returnString = "";
        for (Menu menu : menus) {
            returnString += menu.toString() + "\n";
        }
        return returnString;
    }

    @Override
    public String toString() {
        String returnString = "";
        for (Menu menu : this.menuList) {
            returnString += "-------- Meny --------\n";
            returnString += menu.toString() + "\n";
            returnString += "\n";
        }
        return returnString;
    }
}
