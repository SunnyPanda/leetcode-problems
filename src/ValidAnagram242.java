import java.util.HashMap;
import java.util.Map;

public class ValidAnagram242 {

    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> mappedS = new HashMap<>();
        Map<Character, Integer> mappedT = new HashMap<>();
        for (char ch : s.toCharArray()) {
            int num = mappedS.getOrDefault(ch, 0);
            mappedS.put(ch, num + 1);
        }
        for (char ch : t.toCharArray()) {
            int num = mappedT.getOrDefault(ch, 0);
            mappedT.put(ch, num + 1);
        }
        return mappedT.equals(mappedS);
    }
}
