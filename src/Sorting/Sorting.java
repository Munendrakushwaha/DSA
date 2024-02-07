package Sorting;

import java.util.Arrays;

public class Sorting {
    public void BubbleSort(int arr[]){
        Boolean flag=false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    flag=true;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
            if(flag==false){
                break;
            }

        }
    }

    public void InsertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }


    public int getMaxIndex(int arr[],int end){
        int max=Integer.MIN_VALUE;
        int index=-1;
        for(int i=0;i<end;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        return index;
    }
    public void SelectionSort(int arr[]){
        for(int i=arr.length-1;i>=0;i--){
            int temp=arr[i];
            int maxIndex=getMaxIndex(arr,i+1);
            arr[i]=arr[maxIndex];
            arr[maxIndex]=temp;
        }
    }

    public static void main(String[] args) {
        Sorting sort = new Sorting();
        int arr[]=new int[]{24,21,56,9000000,87,98,43,32,21,1324,57,667,9890};
        sort.BubbleSort(arr);
        sort.SelectionSort(arr);
        sort.InsertionSort(arr);
        Arrays.stream(arr).forEach(System.out::println);



    }
}
