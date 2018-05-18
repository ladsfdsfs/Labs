	// A Project by Allen Nguyen and Nathan Suh

   import javax.swing.JFrame;
    public class DriverPong
   {
       public static void main(String[] args)
      { 
         JFrame frame = new JFrame("all pong, no ping");
         frame.setSize(808, 638);    //makes the mouse location correct
         frame.setLocation(0, 0);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         PongPanel p = new PongPanel();
         frame.setContentPane(p);
         p.requestFocus();
         frame.setVisible(true);
         
      }
   }
