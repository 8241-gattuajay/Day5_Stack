package MapPro;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {
        String inputString = "abcsdnvs";

        Map<Character, Long> charCountMap = inputString.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        Optional<Character> firstNonRepeat = charCountMap.entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        if (firstNonRepeat.isPresent()) {
            System.out.println("First non-repeating character: " + firstNonRepeat.get());
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}

