import javax.swing.*;
import java.awt.*;
public class LayoutDemo extends JFrame{
    public LayoutDemo(){
        this.setTitle("FrameDemo Test ");
        this.setSize(640,480);
        this.setLayout(null);
        this.BilsenleriEkle(this.getContentPane()); 
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.pack(); boyle olursa bunu(this.setSize(640,480);) dikkate almaz/
    }
    public static void BilsenleriEkle(Container pencre){
        JPanel solpanel = new JPanel();
        JPanel sagpanel = new JPanel();
        JPanel ustpanel = new JPanel();
        JPanel altpanel = new JPanel();
        JPanel ortapanel = new JPanel();

        pencre.add(solpanel);
        solpanel.setBackground(Color.GREEN);
        solpanel.setBounds(20,30,50,100);

        pencre.add(sagpanel);
        sagpanel.setBackground(Color.RED);
        sagpanel.setBounds(210,20,800,150);

        pencre.add(altpanel);
        altpanel.setBackground(Color.BLUE);
        altpanel.setBounds(1020,20,180,820);

        pencre.add(ustpanel);
       ustpanel.setBackground(Color.YELLOW);
        ustpanel.setBounds(210,180,800,400);



        pencre.add(ortapanel);
       ortapanel.setBackground(Color.BLACK);
        ortapanel.setBounds(210,690,800,150);


    JButton buton1 = new JButton("Buton 1");
        ortapanel.add(buton1);
        buton1.setBounds(20,30,150,40); 
        

    }
    public static void main(String [] args){
        new LayoutDemo();
       
        //this.setVisible(true);
    }
}