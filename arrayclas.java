import java.util.*;
public class arrayclas{
    public static void main(String[] Args){
        int[] is = new int[10];
        Arrays.fill(is,7);
        for(int i : is){
            System.out.printf("%d",i);
        }
        int[] in = {1,2,3,4,5,6};
        int[] copy = new int[in.length];
        System.arraycopy(in,0,copy,0,in.length);
        for(int j : copy){
            System.out.printf("%d",j);
        }
        boolean b = Arrays.equals(in,copy);
        System.out.printf("in %s copy",(b ? "==" : "!="));
        b = Arrays.equals(in,is);
        System.out.printf("in %s is",(b ? "==": "!="));

        int l = Arrays.binarySearch(in,5);
        if (l >= 0){
            System.out.printf("jsdlfkd %d",l);
        }
    }
}