public class NyString {
    // Set value property to private without setters to make it immutable
    // Once the value is set, it won't be able to change without creating a new object
    private String value;

    // Constructor
    public NyString(String value) {
        this.value = value;
    }

    public String shorten() {
        // This string will be constructed as we go through the loop
        String returnString = "";
        String[] words = this.value.split(" ");

        for (String word : words) {
            returnString += word.charAt(0);
        }
        return returnString;
    }


    public String removeChar(char toRemove) {
        // This string will be constructed as we go through the loop
        String returnString = "";
        int loopLength = this.value.length();

        for (int i = 0; i < loopLength; i++) {
            // Ignore the character if it matches the one we want to remove
            if (this.value.charAt(i) == toRemove) continue;
            returnString += this.value.charAt(i);
        }
        return returnString;
    }
}
