import java.awt.GridLayout;
import javax.swing.*;
public class SifreEkani{
    public static void main(String []args){
        JTextField password,username;
        password = new JTextField(10);
        username = new JTextField(10);
        JFrame cerceve = new JFrame("Screen Password Example");
        cerceve.setLayout(new GridLayout(2,2));
        cerceve.add(new JLabel("Kullanici adi: "));
        cerceve.add(username);
        cerceve.add(new JLabel("Sifre: "));
        cerceve.add(password);
        cerceve.setSize(300,200);
        cerceve.setVisible(true);
        cerceve.pack();


    }
}