package algorithms;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CommonCharacters {
    public static void main(String[] args) {
        var result = commonCharacters(new String[]{"abc", "bcd", "cbad"}); // expected [b, c]
        System.out.println(Arrays.deepToString(result));
    }

    public static String[] commonCharacters(String[] strings) {

        return Arrays.stream(strings)
                .map(string -> string.chars()
                        .mapToObj(c -> String.valueOf((char) c))
                        .collect(Collectors.toSet()))
                .reduce((value, combinedValue) -> {
                    value.retainAll(combinedValue);
                    return value;
                })
                .orElseThrow()
                .toArray(new String[0]);
    }
}
