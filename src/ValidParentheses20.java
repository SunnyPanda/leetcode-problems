import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses20 {

    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> chars = new Stack<>();
        Map<Character, Character> mapped = new HashMap<>();
        mapped.put('(', ')');
        mapped.put('{', '}');
        mapped.put('[', ']');
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (mapped.containsKey(ch)) {
                chars.add(ch);
            } else if (chars.isEmpty() || mapped.get(chars.pop()) != ch) {
                return false;
            }
        }
        return chars.isEmpty();
    }
}
