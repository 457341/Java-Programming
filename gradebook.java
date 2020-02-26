public class gradebook{
    public static void main(String[] Args){
        int[] a = {19,85,96,95,56,89,53,12,45,84,56,12,13,12,23,45,96,45,56,23};
        mygrade_clas grade = new mygrade_clas(a);
        grade.ogrenci_yaz();
        grade.islemler();
    }
}