package Array;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static ArrayList<Integer> removeDuplicates(int arr[]) {
        int i = 1;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        while (i < arr.length) {
            if (arr[i] != arr[i - 1]) {
                list.add(arr[i]);
            }
            i++;
        }
        return list;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 4, 5, 6, 6, 7, 7, 7, 8, 9 };
        System.out.println("pure array is: " + removeDuplicates(arr));
    }

}
