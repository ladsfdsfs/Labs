import javax.swing.JFrame;

public class Driver12 {
   public static void main(String[] args) {
      JFrame frame = new JFrame("Unit2, Lab11: pinball stuff");
      frame.setSize(600, 400);
      frame.setLocation(0, 0);         //this is lab 16
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new PrizePanel());
      frame.setVisible(true);
   
   }}