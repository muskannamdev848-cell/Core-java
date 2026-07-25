package String;

public class IsPalindromeString {

    static String reverseString(String str) {

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        return reverse;
    }

    static boolean isPalindrome(String str) {

        String original = str;
        String reverse = reverseString(original);

        for (int i = 0; i < original.length(); i++) {

            char ch1 = original.charAt(i);
            char ch2 = reverse.charAt(i);

            if (ch1 != ch2) {
                return false;
            }
        }

        return true;
    }

    static void main() {

        String str = "MOM";
        System.out.println(isPalindrome(str));
    }
}