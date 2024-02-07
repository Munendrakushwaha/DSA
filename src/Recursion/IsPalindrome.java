package Recursion;

public class IsPalindrome {

    // using Recursion
    public static boolean IsPalindaromeRecursion(String str, int start, int end) {
        if (start >= end) {
            return true;
        } else if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        IsPalindaromeRecursion(str, start + 1, end - 1);
        return true;

    }

    public static boolean IsPalindaromeIterate(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start++) != str.charAt(end--)) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String str = "ababababa";
        System.out.println("is Palindrome using Recursion: " + IsPalindaromeRecursion(str, 0, str.length() - 1));
        System.out.println("is Palindrome using Iterate: " + IsPalindaromeIterate(str));

    }

}
