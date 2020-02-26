public class arraymet{
    public static double ort(double... nu){
        double t = 0.0;
        for(double i : nu){
            t += i;
        }
        return t/ nu.length;
    }
    public static void main(String[] Args){
        double d1 = 10.0;
        double d2 = 20.0;
        double d3 = 30.0;
        double d4 = 40.0;
        System.out.printf("%2.f",ort(d1,d2));
        System.out.printf("%2.f",ort(d1,d2,d3,d4));
    }
}