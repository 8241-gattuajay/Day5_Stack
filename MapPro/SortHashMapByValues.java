package MapPro;

import java.util.*;

public class SortHashMapByValues {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Math", 98);
        map.put("Data Structure", 85);
        map.put("Database", 91);
        map.put("Java", 95);
        map.put("Operating System", 79);
        map.put("Networking", 80);

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        Collections.sort(entryList, Comparator.comparing(Map.Entry::getValue));

        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        sortedMap.forEach((key, value) -> System.out.println("Key = " + key + ", Value = " + value));
    }
}

