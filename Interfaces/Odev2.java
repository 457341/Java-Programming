import java.awt.*;
import javax.swing.*;
public class Odev2{
    public Odev2(){
        JFrame pencere = new JFrame("Butonlar ornegi");
        pencere.setSize(230,200);
        pencere.setLayout(new GridLayout(1,2));
        pencere.setVisible(true);
        JTextField text = new JTextField(10);
        JLabel label,cinsiyet,kayit;
        label = new JLabel("isim-soyisim: ");
        pencere.add(label);
        pencere.add(text);
        
        //pencere.add("\n"); not working 
        //System.out.println("\n"); not working 
        pencere.setLayout(new FlowLayout());
        cinsiyet = new JLabel("Cinsiyet: ");
        JRadioButton b1,b2;
        b1 = new JRadioButton("Erkek");
        b2 = new JRadioButton("Bayan");

        pencere.add(cinsiyet);
        b1 = new JRadioButton("Erkek");
        b2 = new JRadioButton("Bayan");
        pencere.add(b1);
        pencere.add(b2);
        kayit = new JLabel("kayit yaptirmak icin istedigi kurslar:");
        pencere.add(kayit);
        pencere.setLayout(new FlowLayout());

        JCheckBox c1 = new JCheckBox();
        JCheckBox c2 = new JCheckBox();
        JCheckBox c3 = new JCheckBox();

        JButton buton = new JButton("Tamam");
        pencere.add(new JLabel("Dans"));
        pencere.add(c1);
        pencere.add(new JLabel("Gitar"));
        pencere.add(c2);
        pencere.add(new JLabel("Resim"));
        pencere.add(c3);
        pencere.add(buton);
        //pencere.pack();
        //pencere.setDefautlClose(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String [] args){
        new Odev2();
    }
}