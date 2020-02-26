public class den{
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
    int eny = ort(gradearr[0]);
    int orr = new Integer;
    for(int j = 0;j < gradearr.length;j++){
        for(int t : gradearr[j])
            orr = ort(gradearr[j]);
            System.out.printf("%d\n",orr);
            if (orr > eny){
                eny = orr;
            }
    }
        System.out.printf("en yuksek ort = %d",eny);
    }
    public static int ort(int arr[]){
        int toplam = 0;
        for(int y : arr){
            toplam += y;
        }
        return toplam/arr.length;
    }
}
        