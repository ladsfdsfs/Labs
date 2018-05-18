//allen nguyen wed oct 25 2017
//yeet


import javax.swing.JFrame;

public class Driver02 {
   public static void main(String[]args) {
   
      JFrame frame = new JFrame("Lab02");
      frame.setSize(600,600);
      frame.setLocation(300,300);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new Panel02());
      frame.setVisible(true);
   }}