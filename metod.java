public class metod{
    public static void main(String[] Args){
        int[][] gradearr = {{87,96,70},
                            {68,87,90},
                            {94,100,90},
                            {100,81,82},
                            {83,65,85},
                            {78,87,65},
                            {85,75,83},
                            {91,94,100},
                            {76,72,84},
                            {87,93,73}};
        System.out.printf("%d",ek(gradearr));
    }
    public static int ek(int arr[][]){
        int enk = arr[0][0];
        for(int u = 0; u < arr.length; u++){
            for(int z = 0;z < arr[u].length; z++){
                if(arr[u][z] < enk)
                enk = arr[u][z];
            }
        }
        return enk;
    }
}