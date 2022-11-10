import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {

    protected String text;

    public WordsChecker(String text) {
        this.text = text;

        Set<String> set = new HashSet<>();

        Collections.addAll(set, text.split("\\P{IsAlphabetic}+"));
    }
}
