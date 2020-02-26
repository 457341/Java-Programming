import java.util.*;
public class kuyruk{
    public static void main(String[] Args){
        Queue<String> kuy = new LinkedList<String>();
        kuy.add("zaid");
        kuy.add("ahemt");
        kuy.add("halil");
        System.out.println(kuy);
        while(!kuy.isEmpty()){
            System.out.println(kuy.element());
            kuy.poll();
        }
        System.out.println(kuy);
    }
}