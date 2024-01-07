import java.util.ArrayList;
import java.util.HashSet;

public class Duplicates {
    public static void main(String[] args) {
        //How can you remove all duplicates from ArrayList?
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(27);
        arr.add(12);
        arr.add(14);
        arr.add(27);
        arr.add(20);
        arr.add(20);
        System.out.println("ArrayList before removing duplicates "+arr);
       HashSet<Integer>hs=new HashSet<>(arr);
       System.out.println("ArrayList after removing duplicates "+hs);


      }


}
