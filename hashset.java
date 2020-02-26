import java.util.*;
public class hashset{
    public static void main(String[] Args){
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        System.out.println(hs);
        TreeSet<Integer> ts = new TreeSet<Integer>(hs);
        System.out.println(ts);
        Iterator<Integer> it = hs.iterator();
        while(it.hasNext()){
            System.out.println("kumedeki elemanlar "+ it.next());
            it.remove();
        }
        System.out.println(hs);
    }
}