import java.util.*;
public class arraylist2{
    public static void main(String[] args){
        ArrayList<String> ne = new ArrayList<String>();
        ne.add("enes");
        ne.add("efvgd");
        ne.add("asd");
        ne.add(1,"dss");
        ne.set(2,"dsf");
        System.out.println(ne.size());
        System.out.println(ne.get(1));
        System.out.println(ne);
        for(int j = 0;j < ne.size();j++){
            System.out.printf("%d indexi %sdir\n",j,ne.get(j));
        }
        ne.remove(0);
        System.out.println(ne);
    }
}