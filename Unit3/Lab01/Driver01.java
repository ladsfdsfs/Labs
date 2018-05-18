	
   import javax.swing.JFrame;
    public class Driver01
   {
       public static void main(String[] args)
      { 
         JFrame frame = new JFrame("all pong, no ping");
         frame.setSize(400,400);    //makes the mouse location correct
         frame.setLocation(0, 0);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         Panel01 p = new Panel01();
         frame.setContentPane(p);
         p.requestFocus();
         frame.setVisible(true);
         
      }
   }
