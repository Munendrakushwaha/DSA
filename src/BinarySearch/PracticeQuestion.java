package BinarySearch;

public class PracticeQuestion {

    //  Count number of one's in binary array - O(log n)
    public int CountOne(int []arr){
        if(arr[0]==0)return 0;
        if(arr[arr.length-1]==1) return arr.length;
        int start =0;
        int count=0;
        int end=arr.length-1;
        while (start<=end){
            int mid =start+(end-start)/2;
            if(arr[mid]==1 && arr[mid+1]==0){
                return mid+1;
            }
            else if(arr[mid]==1){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return count;
    }
// find square root of number if not perfect square then return floor value of square root
//    public int SquareRootofNumber(int number){
//        int start = 1;
//        while(start*start<number){
//            start++;
//        }
//        if(start*start==number){
//            return start;
//        }
//        return start-1;
//    }

    public int SquareRootofNumber(int number){
        int start = 0;
        int end=number;
        int ans=0;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if(mid*mid<=number){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
  // Moore's Voting algorithm - https://www.geeksforgeeks.org/majority-element/
    public int majorityElement(int []arr){
        int maj_index=0;int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[maj_index]){
                count--;
                maj_index=i;
            }
            else{
                count++;
            }
        }
        count=0;
        int maj_element=arr[maj_index];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==maj_element){
                count++;
            }
        }

        return count>arr.length/2?maj_element:-1;

    }


    public static void main(String[] args) {
        PracticeQuestion obj =new PracticeQuestion();
        int []binaryArr=new int[]{1,1,1,1,1,1,1,1,0,0,0,0};
        int []arr = new int[]{3, 4, 3, 2, 4, 4, 4, 4};
        System.out.println("count is: "+obj.CountOne(binaryArr));
        System.out.println("Square root is: "+obj.SquareRootofNumber(122));
        System.out.println("Majority element is: "+obj.majorityElement(arr));



    }
}
