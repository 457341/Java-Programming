public class mygrade_clas{
    private int[] grades;
    public mygrade_clas(int[] yenigrade){
        grades = yenigrade;
    }
    public void ogrenci_yaz(){
        for(int i = 0;i < 20;i++){
            System.out.printf("ogrenci %d : %d\n",i+1,grades[i]);
        }
    }
    public void islemler(){
        System.out.printf("sinifin ortalamasi = %.2f\nsinifin en dusuk notu = %d\nsinifin en yuksek notu = %d\n",ortalama(),endusuk(),enyuksek());
        out();
    }
    public double ortalama(){
        double toplam = 0;
        for(int j = 0;j < 20 ; j++){
            toplam += grades[j];
        }
        return (double)toplam/20;
    }
    public int endusuk(){
        int lg = grades[0];
        for(int h : grades){
            if (h < lg)
              lg = h;
        }
        return lg;
    }
    public int enyuksek(){
        int ey = grades[0];
        for(int e : grades){
            if(e > ey)
                ey = e;
        }        
        return ey;
    }
    public void out(){
        int[] fre = new int[11];
        for(int a : grades){
            ++fre[a / 10];
        }
        for(int v = 0; v < 20;v++){
            if(v == 10)
            System.out.printf("%5d: ",100);
            else
            System.out.printf("%02d - %02d: ",v*10,v*10+9);
            for(int c = 0; c < fre[v];c++)
            System.out.print("*");
            System.out.println();
        }
    }
}
