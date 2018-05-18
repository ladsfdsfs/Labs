import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Scoreboard11 extends JPanel {
   private JLabel label1, label2, title;
   private int count1, count2, turned;
   public Scoreboard11() {
   
      setLayout(new BorderLayout());
      label1 = new JLabel(" One: "+count1+" ");
      label1.setHorizontalAlignment(0);
      label1.setOpaque(true);
      add(label1, BorderLayout.WEST);
   
      title = new JLabel("Nim");
      title.setHorizontalAlignment(0);
      add(title, BorderLayout.CENTER);
   
      label2 = new JLabel(" Two: "+count2+ " ");
      label2.setOpaque(true);
      add(label2, BorderLayout.EAST);
      
      
      turned=0;
   }
   public void score(int type) {
      
      if(type==1) {
         count1++;
         label1.setText("One: "+count1);
      
      } else {
         count2++;
         label2.setText("Two: "+count2);
      
      } 
   }
   public int turn() {
      turned++;
      if(turned%2==0) {
         label1.setBackground(Color.YELLOW);
         label2.setBackground(Color.GRAY);
         return 1;
      } else {
         label2.setBackground(Color.YELLOW);
         label1.setBackground(Color.GRAY);
         return 2;
      
      }
   }
}