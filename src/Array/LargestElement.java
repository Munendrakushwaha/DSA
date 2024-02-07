package Array;
public class LargestElement {
    public static int firstLargest(int arr[]) {
        int max = Integer.MIN_VALUE;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > max)
                max = arr[i];
            i++;
        }
        return max;
    }

    public static int secondLargest(int arr[]) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] < max && arr[i] > secondMax) {
                secondMax = arr[i];
            }
            i++;
        }
        // return new int[] { max, secondMax };
        return secondMax;
    }

    public static void main(String[] args) {
        int arr[] = { 645, 434, 54, 643, 1234, 47, 8, 869 };
        System.out.println("Largest element is: " + firstLargest(arr));
        System.out.println("Second Largest element is: " + secondLargest(arr));

    }

}
