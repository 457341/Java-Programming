public class gradebook2{
    private int[][] grades;
    public gradebook2(int[][] array){
        grades = array;
    }
    public void arrgoster(){
        for(int i = 0; i < grades[0].length; i++)
            System.out.printf("\t\ttest%d",i+1);
            System.out.println("\t\tortalama");
        for(int j = 0;j < grades.length;j++){
            System.out.printf("ogrenci %d\t",j+1);
            for(int t : grades[j])
                System.out.printf("%d\t\t",t);
                
            System.out.printf("%d\n",ort(grades[j]));
            }
        
    }
    public static int ort(int arr[]){
        int toplam = 0;
        for(int y : arr){
            toplam += y;
        }
        return toplam/arr.length;
    }
    public void process(){
        ek();
        ey();
    }
    public void ek(){
        int enk = grades[0][0];
        for(int u = 0; u < grades.length; u++){
            for(int z = 0; z < grades[u].length; z++){
                if(grades[u][z] < enk)
                enk = grades[u][z];
            }
        }
        System.out.printf("en dusuk puani = %d\n",enk);
    }
    public void ey(){
        int eny = grades[0][0];
        for(int[] t : grades){
            for(int grade : t){
                if(grade > eny)
                eny = grade;
            }
        } 
        System.out.printf("en yuksek puan = %d",eny);
    }
}