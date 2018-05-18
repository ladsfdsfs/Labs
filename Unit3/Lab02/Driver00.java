	
   import javax.swing.JFrame;
    public class Driver00
   {
       public static void main(String[] args)
      { 
         JFrame frame = new JFrame("a-nguyen");
         frame.setSize(300,100);    //makes the mouse location correct
         frame.setLocation(0, 0);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         Panel02 p = new Panel02();
         frame.setContentPane(p);
         p.requestFocus();
         frame.setVisible(true);
         
      }
   }
