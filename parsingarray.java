public class parsingarray{
    public static void main(String[] Args){
        int b[] = {5,1,2,3,4};
        modifyarr(b);
        for(int j : b){
            System.out.println(j);
        }
        modifyeleman(b[0]);
        System.out.printf("5in son degeri %d\n",b[0]);
    }
    public static void modifyarr(int a[]){
        for(int i = 0; i < 5;i++){
            a[i] *= 2;
        }
    }
    public static void modifyeleman(int b){
        b *= 2;
        System.out.printf("%d",b);
    }
}