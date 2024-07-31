package MapPro;

import java.util.HashMap;
import java.util.Map;

public class FreCount {


        public static void main(String[] args) {
            String inputString = "GeeksForGeeks";


            Map<Character, Integer> charCountMap = new HashMap<>();


            for (char c : inputString.toCharArray()) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }

            for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
                System.out.println("'" + entry.getKey() + "': " + entry.getValue());
            }
        }
    }

}
