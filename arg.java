public class arg{
    public static void main(String[] Args){
        int arrl = Integer.parseInt(Args[0]);
        int arr[] = new int[arrl];
        int ort = Integer.parseInt(Args[1]);
        int son = Integer.parseInt(Args[2]);
        for(int i = 0; i < arr.length; i++){
            arr[i] = ort + son * i;
        }
        System.out.printf("%s\t%s\n","index","value");
        for(int j = 0; j < arr.length; j++){
            System.out.printf("%d\t%d\n",j,arr[j]);
        }
    }
}