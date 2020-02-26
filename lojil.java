public class lojil{
    public static void main(String[] args){
        int  i = 10;
        Balloon red = new Balloon();
        Balloon blue = new Balloon();
        swap(red,blue);
        System.out.println(red.getcolor());
        System.out.println(blue.getcolor()); 
        foo(blue);
        System.out.println(blue.getcolor());
    }
}