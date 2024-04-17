import java.util.HashMap;
import java.util.Map;

public class Task_2 {
    public static void main(String[] args) {
        String word = "Hello";
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : word.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Повторяющийся символ в слове "+entry.getKey() + " встречается " + entry.getValue());
            }
        }
    }
}