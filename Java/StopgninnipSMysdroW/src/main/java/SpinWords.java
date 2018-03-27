import java.util.Arrays;

import static java.util.stream.Collectors.joining;

public class SpinWords {
    public String spinWords(String sentence) {
        return Arrays.stream(sentence.split(" ")).map(s -> s.length() >= 5 ? new StringBuilder(s).reverse()
                .toString() : s).collect(joining(" "));
    }
}