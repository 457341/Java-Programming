public class coklu_diziler{
    public static void main(String[] Args){
        int[][] arr1 = {{1,2,3},{4,5,6}};
        int[][] arr2 = {{1,2},{3},{4,5,6}};
        System.out.println("merhaba");
        arrgoster(arr1);
        System.out.println("haydi canim");
        arrgoster(arr2);
    }
    public static void arrgoster(int[][] arrr){
        for(int i = 0; i < arrr.length ; i++){
            for(int j = 0 ; j < arrr[i].length ; j++){
                System.out.printf("%d ",arrr[i][j]);
            }
            System.out.println();
        }
    }
}
