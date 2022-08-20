public class ValidPalindrome_125 {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

//    public static boolean isPalindrome(String s) {
//        int i = 0;
//        int j = s.length() - 1;
//        String newS = s.toLowerCase();
//        while (i <= j) {
//            char l = newS.charAt(i);
//            char r = newS.charAt(j);
//            if (!Character.isLetterOrDigit(l)) {
//                i++;
//            } else if (!Character.isLetterOrDigit(r)) {
//                j--;
//            } else if (l != r) {
//                return false;
//            } else {
//                i++;
//                j--;
//            }
//        }
//        return true;
//    }

    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        String str = sb.toString();
//        for (int i = 0, j = str.length() - 1; i <= j; i++, j--) {
//            if (str.charAt(i) != str.charAt(j)) {
//                return false;
//            }
//        }
//        return true;
        String reversed = sb.reverse().toString();
        return str.equals(reversed);
    }
}
