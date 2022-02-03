public class exampleclass {
    public static String firstLetter(String word) {
        if(word.length() == 0) {
            return "";
        }

        return word.substring(0, 1);
    }
}
