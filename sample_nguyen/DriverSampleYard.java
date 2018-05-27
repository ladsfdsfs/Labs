import javax.swing.JFrame;
   public class DriverSampleYard
   {
      public static void main(String[] args)
      { 
         JFrame frame = new JFrame("MY MILKSHAKE BRINGS ALL THE BOYS TO THE YARD");
         frame.setSize(700, 500);
         frame.setLocation(0, 0);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new Panel());
         frame.setVisible(true);
      }
   }