import java.util.*;
public class vektor2{
    public static void main(String[] Args){
        Vector<Integer> sayi = new Vector<Integer>();
        int[] s = {156,2,3,4,5,6,1234};
        for(int i : s){
            sayi.add(i);
        }
        Object[] dizi= sayi.toArray();
        Arrays.sort(dizi);
        System.out.println(dizi[0]);
        /*
        int enk = dizi[0];
        for(int j = 0; j < dizi.length; j++){
            if(enk < dizi[j]){
                System.out.printf("enkucuk = %d",dizi[j]);
            }
        }*/
    }
}