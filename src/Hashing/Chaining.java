package Hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class Chaining {
    Integer size;
    ArrayList<LinkedList<Integer>> table = new ArrayList<>();

    public Chaining(
            Integer size) {
        this.size = size;
        for (int i = 0; i < size; i++) {
            this.table.add(new LinkedList<Integer>());
        }

    }

    // // insert into hashtable
    public void insert(Integer value) {
        Integer hash = value%size;
        table.get(hash).addLast(value);

    }

    public  Boolean search(Integer value){
          Integer hash=value%size;
          if(table.get(hash).contains(value)){
              return true;
          }
          return  false;
    }

    public  void delete(Integer value){
        Integer hash=value%size;
        if(search(value)){
            table.get(hash).remove(value);

        }

    }
    public void display() {
        for (int i = 0; i < table.size(); i++) {
            for (int j = 0; j < table.get(i).size(); j++) {
                System.out.print(table.get(i).get(j) + " => ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Chaining chain = new Chaining(9);
        chain.insert(49);
        chain.insert(9);
        chain.insert(19);
        chain.insert(29);
        chain.insert(91);
        chain.insert(39);
        chain.insert(49);
        chain.insert(59);
        chain.insert(69);
        chain.insert(79);
        chain.insert(89);
        chain.insert(22);
        System.out.println( chain.search(23));
        chain.delete(22);
        chain.delete(49);
        chain.display();

    }

}
