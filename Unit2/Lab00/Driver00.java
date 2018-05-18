//allen nguyen wed 10/25
//yeet

import javax.swing.JFrame;

public class Driver00 {
   public static void main(String[]args) {
   
      JFrame frame = new JFrame("Lab00");
      frame.setSize(700,700);
      frame.setLocation(400,400);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new Panel00());
      frame.setVisible(true);
   }}