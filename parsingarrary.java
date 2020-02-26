public class parsingarray{
    public static void main(String[] Args){
        int b[] = {5,1,2,3,4};
        modifyarr(b);
        for(int j : b){
            System.out.println(j);
        }

    }
    public static void modifyarr(int a[]){
        for(int i: a){
            a *= 2;
        }
    }
}