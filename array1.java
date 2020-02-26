public class array1{
    public static void main(String []Args){
        int[] arr = {0,1,2,3,4};
        
        for(int k = 0;k < arr.length; k++){
            for(int l = 0;l < arr[k]; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
