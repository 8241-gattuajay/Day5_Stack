package MapPro;
import java.util.*;

public class Anagram {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramsMap = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            anagramsMap.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(anagramsMap.values());
    }

    public static void main(String[] args) {
        String[] inputStrings = {"dog", "god", "act", "cat", "listen", "silent"};
        List<List<String>> groupedAnagrams = groupAnagrams(inputStrings);

        for (List<String> anagramGroup : groupedAnagrams) {
            System.out.println(anagramGroup);
        }
    }
}

