package QueuePro;

import java.util.*;

public class NonRepeatingCharacter {
    private Queue<Character> queue;
    private Map<Character, Integer> charCountMap;

    public NonRepeatingCharacter() {
        queue = new LinkedList<>();
        charCountMap = new HashMap<>();
    }

    public void processChar(char ch) {
        charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        queue.add(ch);
        while (!queue.isEmpty() && charCountMap.get(queue.peek()) > 1) {
            queue.poll();
        }
    }

    public Character getFirstNonRepeating() {
        return queue.isEmpty() ? null : queue.peek();
    }

    public static void main(String[] args) {
        NonRepeatingCharacter fnrc = new NonRepeatingCharacter();
        String stream = "aabc";

        for (char ch : stream.toCharArray()) {
            fnrc.processChar(ch);
            Character firstNonRepeating = fnrc.getFirstNonRepeating();
            System.out.println("First non-repeating character: " + (firstNonRepeating != null ? firstNonRepeating : "None"));
        }
    }
}