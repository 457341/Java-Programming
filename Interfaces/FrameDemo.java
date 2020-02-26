import javax.swing.JButton;
import javax.swing.JFrame;
public class FrameDemo extends JFrame{
    public FrameDemo(){
        this.setTitle("FrameDemo Test ");
        this.setSize(640,480);
        this.setLayout(null);
        JButton buton1 = new JButton("Buton 1");
        this.add(buton1);
        buton1.setBounds(10,20,100,40);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.pack(); boyle olursa bunu(this.setSize(640,480);) dikkate almaz/
    }
    public static void main(String [] args){
        new FrameDemo();
       
        //this.setVisible(true);
    }
}