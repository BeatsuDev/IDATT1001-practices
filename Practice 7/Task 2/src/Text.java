public class Text {
    // This could be public, but to keep it immutable (like default strings are), we'll make it private
    // Making it public would allow us to change the value of the string without creating a new object
    // but can also make it harder to keep track of the string's value
    private String text;

    // Constructor
    public Text(String value) {
        this.text = value;
    }

    public int totalWords() {
        return this.text.split(" ").length;
    }

    public double averageWordLength() {
        String[] words = this.text.split(" ");
        int totalLength = 0;

        // Loop through all words and add their length to the total
        for (String word : words) {
            totalLength += word.length();
        }
        // Cast to double to avoid integer division
        return (double) totalLength / words.length;
    }

    public double averageWordsPerPeriod() {
        String[] periods = this.text.split("[.!:?]");
        int totalWords = 0;

        // Loop through all periods and add the amount of words in each period to the total words count
        for (String period : periods) {
            totalWords += period.split(" ").length;
        }
        // Cast to double to avoid integer division
        return (double) totalWords / periods.length;
    }

    public String replaceWord(String word, String targetWord) {
        // Pad the word with spaces to avoid replacing substrings, e.g. "word" in "wording"
        return this.text.replaceAll(" " + word.strip() + " ", " " + targetWord.strip() + " ");
    }

    public String getText() {
        return this.text;
    }

    public String uppercase() {
        return this.text.toUpperCase();
    }
}
