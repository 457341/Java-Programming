import java.util.*;
public class araylist{
    public static void main(String[] Args){
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        System.out.println(ll); 
        ll.set(3,5);
        System.out.println(ll);
        System.out.println(ll.getFirst());
        System.out.println(ll.get(3));
        System.out.println(ll.lastIndexOf(3));
        System.out.println(ll.indexOf(3));
    }
}