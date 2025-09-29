public class WordCount {
    public static void main(String[] args) {
        String text = "Hello GitHub! Hello Java!";
        
        // Split string into words
        String[] words = text.split(" ");
        
        // Count occurrences of each word
        for (int i = 0; i < words.length; i++) {
            int count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = ""; // Avoid counting again
                }
            }
            if (!words[i].equals("")) {
                System.out.println(words[i] + ": " + count);
            }
        }
    }
}
