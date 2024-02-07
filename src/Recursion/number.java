package Recursion;

public class number {

    // print natural numbers from n to 1
    public static void N_to_One(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        N_to_One(n - 1);

    }

    // print natural number from 1 to n
    public static void One_to_N(int n) {
        if (n == 0) {
            return;
        }
        One_to_N(n - 1);
        System.out.println(n);

    }

    // sum of a number

    public static int sumOfDigits(int n) {
        if (n <= 0) {
            return 0;
        }
        return (n % 10) + sumOfDigits(n / 10);

    }

    // sum of n natural numbers
    public static int sumOfNaturalNumber(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sumOfNaturalNumber(n - 1);
    }

    // subsets of a string

    public static void subsets(String s, String current, int index) {
        if (index == s.length()) {
            System.out.println(current);
            return;
        }

        subsets(s, current, index + 1);
        subsets(s, current + s.charAt(index), index + 1);
    }

    public static void main(String[] args) {
        String s = "ABC";
        N_to_One(6);
        One_to_N(6);
        System.out.println("Sum of digits of number is: " + sumOfDigits(456789));
        System.out.println("Sum of n natural numbers: " + sumOfNaturalNumber(5));
        subsets(s, "", 0);

    }

}
