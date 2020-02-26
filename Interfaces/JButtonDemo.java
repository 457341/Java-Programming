import javax.swing.*;
import java.awt.FlowLayout;
public class JButtonDemo{
    public static void main(String[] args){
        JFrame cerceve = new JFrame("Example");
        cerceve.setLayout(new FlowLayout());
        JButton b1 = new JButton("Java ");
        JButton b2 = new JButton("Ruby");
        JButton b3 = new JButton("C");
        cerceve.add(b1);
        cerceve.add(b2);
        cerceve.add(b3);

        cerceve.setVisible(true);
        cerceve.pack();
        

    }
}