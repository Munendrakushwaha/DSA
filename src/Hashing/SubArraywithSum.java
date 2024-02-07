package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.lang.Math;

public class SubArraywithSum {
    Integer arr[];
    int bArr[];

    public SubArraywithSum(){
        this.arr= new Integer[]{8,3,1,5,-6,6,2,2};
        this.bArr=new int[]{1,0,1,1,1,0,0,0,1};
    }



    // sum == 0 -- 1st Method - O(n*2)
//    public Boolean SubArraywithSumZero(){
//        for(int i=0;i<arr.length;i++){
//            int sum=arr[i];
//            for(int j=i+1;j<arr.length;j++){
//                sum+=arr[j];
//                if(sum==0){
//                    return true;
//                }
//            }
//
//        }
//        return  false;
//
//    }


    // sum == 0 -- 2nd Method - O(n)
    public Boolean SubArraywithSumZero(){
        Integer prefix_sum=arr[0];
        HashSet<Integer> hash = new HashSet<>();
        hash.add(prefix_sum);
        for(int i=1;i<arr.length;i++){

            prefix_sum+=arr[i];
            if(hash.contains(prefix_sum)){
                return true;
            }
            hash.add(prefix_sum);
            if(prefix_sum==0){
                return  true;
            }
        }
        return  false;
    }

    // sum == given sum
    public Boolean SubArraywithGivenSum(int sum){
        HashSet<Integer> hash = new HashSet<>();
        int prefix_sum=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix_sum+=arr[i];
            if(hash.contains(prefix_sum-sum)){
                return  true;
            }
            hash.add(prefix_sum);
            if(prefix_sum==sum){
                return true;
            }
        }
        return  false;

    }

    public int LongestSubArraywithGivenSum(int sum){
        int prefix_sum=arr[0];
        HashMap<Integer,Integer> hash = new HashMap<>();
        hash.put(prefix_sum,0);
        Integer max=0;
        for(int i=1;i<arr.length;i++){
            prefix_sum+=arr[i];
            if(!hash.containsKey(prefix_sum)){
                hash.put(prefix_sum,i);
            }
            if(hash.containsKey(prefix_sum-sum)){
                int firstIndex=hash.get(prefix_sum-sum);
               max=Math.max(Integer.valueOf(i-firstIndex),max);
            }

            if(prefix_sum==sum){
                max=Math.max(max,i+1);
            }
        }
        System.out.println(hash.toString());
        return max;
    }

    public int LongestSubArrayWithEqual0and1(){
      for(int i=0;i<bArr.length;i++){
          if(bArr[i]==0){
              bArr[i]=-1;
          }
      }
      Integer max=0;
        int prefix_sum=bArr[0];
        HashMap<Integer,Integer> hash = new HashMap<>();
        hash.put(prefix_sum,0);
        for(int i=1;i<bArr.length;i++){
            prefix_sum+=bArr[i];
            if(!hash.containsKey(prefix_sum)){
                hash.put(prefix_sum,i);
            }
            if(hash.containsKey(prefix_sum)){
                int firstIndex=hash.get(prefix_sum);
                max=Math.max(Integer.valueOf(i-firstIndex),max);
            }

            if(prefix_sum==0){
                max=Math.max(max,i+1);
            }
        }
        System.out.println(hash.toString());
        return max;

    }
public int countDistinct(){
        HashSet<Integer> hash= new HashSet<>(Arrays.asList(arr));
        return hash.size();

}
public void frequency(){
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(Integer num:arr){
            hash.put(num, hash.getOrDefault(num,0)+1);
        }
    System.out.println("Frequency: "+hash.toString());
}




    public static void main(String[] args) {
        SubArraywithSum obj=new SubArraywithSum();
        System.out.println(obj.SubArraywithSumZero());
        System.out.println(obj.SubArraywithGivenSum(99));
        System.out.println("max length is: "+obj.LongestSubArraywithGivenSum(4));
        System.out.println(obj.LongestSubArrayWithEqual0and1());
        System.out.println("Distinct elements is: "+obj.countDistinct());
        obj.frequency();


    }
}
