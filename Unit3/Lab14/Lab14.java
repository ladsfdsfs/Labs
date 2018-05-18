import javax.swing.JOptionPane;
import javax.swing.*;


public class Lab14 {
   public static int frame=1;
   public static int ball=1;
   public static int score;
   public static int m;
   
   public static void update() {
      ball++;
      
      if(ball==3) { 
         ball=1;
         frame++;
      }
   }

   public static void main(String[] args) {
      JOptionPane.showMessageDialog(null, "welcome to CS Bowling","Java Bowling", JOptionPane.PLAIN_MESSAGE);
      while(frame <= 10) {
         int n = m;
         m = Integer.parseInt(JOptionPane.showInputDialog("Score: "+score+"\nFrame "+frame+" , Ball "+ball));
         if(m>10 || ((m+n)>10 && ball==2)){
            JOptionPane.showMessageDialog(null, "Error: Knocked down more than 10 pins", "Alert", JOptionPane.ERROR_MESSAGE);
            continue;}
         if(m==10) 
            ball=2;
         score+=m;
         
         update();
         
      }
      JOptionPane.showMessageDialog(null, "You ended with a score of "+score, "CS Bowling", JOptionPane.PLAIN_MESSAGE);
   }
}