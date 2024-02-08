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

    // Count Digits of a given number
    public static int CountDigits(int number){
        if(number<=0){
            return 0;
        }
        return 1+CountDigits(number/10);

    }


    // nth term of the series
    public static int Sequence(int number){
        if(number==0){
            return 1;
        }
        return number+number*Sequence(number-1);
    }

    // check a number if palindrome or not
    public static Boolean isPalindrome(int number,int reverse,int originalNumber){
        if(number==0){
            return reverse==originalNumber;
        }
        return isPalindrome(number/10,reverse*10+(number%10),originalNumber);
    }

    public static int factorial(int number){
        if(number==0 || number==1){
            return 1;
        }
        return number*factorial(number-1);
    }

    // Combination n/C*r
    public static int combinations(int number,int r){
         return factorial(number)/(factorial(number-r)*factorial(r));
    }

    public static int GCD(int number1,int number2){
       if(number1==0 && number2==0){
           return 1;
       }
       if(number1==0) return number2;
       if(number2==0) return number1;
       return GCD(number2,number1%number2);
    }
    public static void printArray(int []arr,int index){
        if(index>=arr.length) return;
        printArray(arr,index+1);
        System.out.println("Element is: "+arr[index]);

    }

    public static int power(int base,int power){
        if(power==0) return 1;
        return base*power(base,power-1);
    }

    public static void main(String[] args) {
        String s = "ABC";
        N_to_One(6);
        One_to_N(6);
        System.out.println("Sum of digits of number is: " + sumOfDigits(456789));
        System.out.println("Sum of n natural numbers: " + sumOfNaturalNumber(5));
        subsets(s, "", 0);
        System.out.println("Count of Digits is: "+CountDigits(890908909));
        System.out.println("Sequence is: "+Sequence(4));
        System.out.println("Is Palindrome: "+isPalindrome(1213,0,1213));
        System.out.println("Factorial is: "+factorial(5));
        System.out.println("Combination is: "+combinations(4,2));
        int num1=24;
        int num2=18;
        System.out.println("GCD is: "+GCD(num1,num2));
        int []arr=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        printArray(arr,0);
        System.out.println("Power is: "+power(2,1));
    }
}
