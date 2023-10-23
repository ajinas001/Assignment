public class PangramCheck {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = checkPangram(sentence);

        if (isPangram) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }

    public static boolean checkPangram(String sentence) {
        boolean[] visited = new boolean[26];
        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if ('A' <= ch && ch <= 'Z') {
                ch = (char)(ch - 'A' + 'a');
            }

            if ('a' <= ch && ch <= 'z') {
                if (!visited[ch - 'a']) {
                    visited[ch - 'a'] = true;
                    count++;
                }
            }
        }

        return count == 26;
    }
}
