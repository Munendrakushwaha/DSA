package Array;

import java.util.*;

public class RotateArray {
    public static void reverseArray(int arr[], int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int p = 3;
        int list[] = { 3, 32, 3, 5, 65, 778, 978, 55, 23, 78 };
        sc.close();
        System.out.println("Before");
        Arrays.stream(list).forEach(System.out::println);
        System.out.println("After");
        reverseArray(list, 0, p);
        reverseArray(list, p + 1, list.length - 1);
        reverseArray(list, 0, list.length - 1);
        Arrays.stream(list).forEach(System.out::println);

    }
}
