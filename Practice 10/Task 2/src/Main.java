public class Main {
    public static void main(String[] args) {
        Dish dish1 = new Dish("Gud shiet", "middag", 122.99);
        Dish dish2 = new Dish("Guacamole", "dip", 9.99);
        Dish dish3 = new Dish("Steak", "middag", 139.99);
        Dish dish4 = new Dish("Eggerøre", "frokost", 39.99);
        Dish dish5 = new Dish("Musli", "frokost", 34.99);

        Menu meny1 = new Menu();
        meny1.addDish(dish1);
        meny1.addDish(dish2);
        meny1.addDish(dish3);

        Menu meny2 = new Menu();
        meny2.addDish(dish4);
        meny2.addDish(dish5);

        MenuRegister register = new MenuRegister();
        register.addMenu(meny1);
        register.addMenu(meny2);

        System.out.println(register.toString());

        System.out.println("Printer ut gudshiet og alle middager:");
        System.out.println(register.findDishByName("Gud shiet"));
        System.out.println(Menu.toStringFromListOfDishes(register.findDishesByType("middag")));

        System.out.println("Her er menyene som er mellom 0kr og 100kr");
        System.out.println(MenuRegister.toStringFraMenyListe(register.findMenusBetweenPrice(0, 100)));
    }
}
