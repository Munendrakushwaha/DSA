package Hashing;

import java.util.Arrays;

public class OAddressing {
    Integer size;
    Integer capacity;
    int arr[];
    OAddressing(Integer capacity){
        this.size=0;
        this.capacity=capacity;
        this.arr=new int[this.capacity];
        Arrays.fill(this.arr,-1);
    }

   public int getHash(int value){
        return value%capacity;

   }



    public  void insert(int value){
        if(size==capacity){
            System.out.println("Overflow");
            return;
        }
        int hash=getHash(value);
        int index=hash;

        while(arr[index]!=-1 && arr[index]!=-2){

            index=(index+1)%capacity;
        }

        arr[index]=value;
        size++;


    }

    public int getIndex(int value){
        if(size==0){
            System.out.println("Underflow");
        }
        int hash=getHash(value);
        int index=hash;
        if(arr[index]==-1){
            return -1;
        }
        index=(index+1)%capacity;

        while(arr[index]!=value && hash!=index){

            index=(index+1)%capacity;
        }
        if(arr[index]==value){
            return  index;
        }
        return -1;
    }
    public  Boolean search(int value){
        if(size==0){
            System.out.println("Underflow");
        }
        int hash=getHash(value);
        int index=hash;
        if(arr[index]==-1){
            return false;
        }
        index=(index+1)%capacity;

        while(arr[index]!=value && hash!=index){

            index=(index+1)%capacity;
        }
        if(arr[index]==value){
            return  true;
        }
       return false;
    }

    public  void delete(int value){
        if(!search(value)){
            System.out.println("Value does not exist");
            return;
        }
        arr[getIndex(value)]=-2;




    }

    public void display(){
        Arrays.stream(arr).forEach(System.out::println);
    }


    public static void main(String[] args) {
        OAddressing hash= new OAddressing(10);
        hash.insert(1);
        hash.insert(2);
        hash.insert(3);
        hash.insert(4);
        hash.insert(5);
        hash.insert(6);
        hash.insert(7);
        hash.insert(8);
        hash.insert(9);
        hash.insert(10);
        System.out.println(hash.search(2));
        System.out.println(hash.search(10));
        hash.delete(10);
        hash.delete(1);

        hash.display();
    }

}
