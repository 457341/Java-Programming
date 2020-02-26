import javax.swing.JButton;
import javax.swing.JFrame;
public class FrameDemo2{
    public FrameDemo2(){
        JFrame pencre = new JFrame("FrameDemo Test2 ");
        pencre.setSize(640,480);
        pencre.setLayout(null);
        JButton buton1 = new JButton("Buton 1");
        pencre.add(buton1);
        buton1.setBounds(10,20,100,40);
        pencre.setVisible(true);
        pencre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //pencre.pack(); boyle olursa bunu(pencre.setSize(640,480);) dikkate almaz/
    }
    public static void main(String [] args){
        new FrameDemo2();
       
        //pencre.setVisible(true);
    }
}