package Array;

import java.util.Arrays;

public class MeanMedian {
    public int Mean(int []arr){
        int sum = Arrays.stream(arr).sum();
        return sum/arr.length;
    }

    public int Median(int []arr){
      Arrays.sort(arr);
      return arr[(arr.length-1)/2];
    }

    public static void main(String[] args) {
        MeanMedian obj = new MeanMedian();
        int []arr=new int[]{1,2,19,28,5};
        System.out.println("Mean is: "+obj.Mean(arr));
        System.out.println("Median is: "+obj.Median(arr));
    }
}
