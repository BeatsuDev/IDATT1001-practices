public class Main {
    public static void main(String[] args) {
        NyString test = new NyString("Dette er en test!");

        System.out.println(test.shorten());
        System.out.println(test.removeChar('e'));
    }
}
