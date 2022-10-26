public class Client {
    public static void main(String[] args) {
        Text text1 = new Text("Hei på deg! Dette er en test setning for å sjekke om alt fungerer som det skal. Let's go!");
        Text text2 = new Text("Denne er kortere. Så får vi se. Haha! Yayy");

        runTest(text1);
        runTest(text2);
    }

    private static void runTest(Text textObject) {
        System.out.println("Testing text object ---------------");
        System.out.println(textObject.getText());
        System.out.println("\nIn uppercase, that is:");
        System.out.println(textObject.uppercase());
        System.out.printf("\nTotal words: " + textObject.totalWords());
        System.out.printf("\nAverage word length: %.1f", textObject.averageWordLength());
        System.out.printf("\nAverage period length: %.1f\n", textObject.averageWordsPerPeriod());
        System.out.println("\nReplacing 'er' with 'er ikke':");
        System.out.println(textObject.replaceWord("er", "er ikke"));
        System.out.println("-----------------------------------");
    }
}
