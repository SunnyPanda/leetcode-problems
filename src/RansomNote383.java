import java.util.HashMap;
import java.util.Map;

public class RansomNote383 {

    public static void main(String[] args) {
        String ransomNote = "a";
        String magazine = "b";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineLetters = new HashMap<>();
        for (char ch : magazine.toCharArray()) {
            int count = magazineLetters.getOrDefault(ch, 0);
            magazineLetters.put(ch, ++count);
        }
        for (char ch : ransomNote.toCharArray()) {
            int count = magazineLetters.getOrDefault(ch, 0);
            if (count > 0) {
                magazineLetters.put(ch, --count);
            } else {
                return false;
            }
        }
        return true;
    }
}
