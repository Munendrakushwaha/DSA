package Array;
public class IsArraySorted {
    public static boolean isSorted(int arr[]) {
        int i = 1;
        while (i < arr.length) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 645, 434, 54, 643, 1234, 47, 8, 869 };
        System.out.println("true or false: " + isSorted(arr));
        int sortedArr[] = { 1, 2, 3, 3, 4, 56 };
        System.out.println("true or false: " + isSorted(sortedArr));

    }

}
