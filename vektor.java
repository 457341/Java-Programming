import java.util.*;
public class vektor{
    public static void main(String[] Args){
        Vector<String> is = new Vector<String>();
        String[] dizi = {"zais","dcs","dscs","dsc","dfsjs","dsddsf","zsc"};
        for(String yen : dizi){
            is.add(yen);
        }
        System.out.println(is.firstElement());
        System.out.println(is.capacity());
        System.out.println(is.size());
        is.add("asdd");
        is.add("asdd");
        is.add("asdd");
        is.add("asdd");
        System.out.println(is.capacity());
    }
}