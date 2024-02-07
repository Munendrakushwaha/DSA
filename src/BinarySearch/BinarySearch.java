package BinarySearch;

public class BinarySearch {
    public int BinarySearchIterative(int arr[],int value){
        int start=0;
        int end=arr.length-1;
        int index=-1;
        while(start<=end){
            int mid=start+((end-start)/2);
            if(value==arr[mid]){
                return mid;
            }
            else if(value<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return index;
    }

    public int BinarySearchRecursive(int arr[],int start,int end,int value){
        int mid=start+((end-start)/2);
        if(start>end){
            return -1;
        }
        if(value==arr[mid]){
            return mid;
        }
        else if(value<arr[mid]){
            return BinarySearchRecursive(arr,start,mid-1,value);
        }

            return BinarySearchRecursive(arr,mid+1,end,value);

    }

    public static void main(String[] args) {
        BinarySearch it = new BinarySearch();
        int arr[]=new int[]{1,4,6,8,9,11,23,45,54,56,76,78,89};
        System.out.println("Index is: "+it.BinarySearchIterative(arr,90));
        System.out.println("Index is: "+it.BinarySearchRecursive(arr,0,arr.length-1,23));



    }


    
}
