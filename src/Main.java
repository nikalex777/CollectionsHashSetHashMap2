import java.util.HashSet;
import java.util.Set;

public class Main {

    static String howManyLetters = "Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
            "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
            "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi" +
            " ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in " +
            "voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat " +
            "cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";


    public static void main(String[] args) {

//        System.out.println(howManyLetters.contains("Lorem ipsum"));
//        System.out.println(howManyLetters.contains("Hello World"));

        WordsChecker text = new WordsChecker(howManyLetters);

        String word = "Lorem ipsum";
        System.out.println("в тексте есть фраза - " + word + " - " + text.hasWord(word));
        String word1 = "Hello World";
        System.out.println("в тексте есть фраза - " + word1 + " - " + text.hasWord(word1));


    }
}