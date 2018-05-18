import javax.swing.*;
import java.awt.*;
public class Display11 extends JPanel
{  
   private ImageIcon one, two, three, four, five, six, seven, eight, nine;
   private JLabel label;
   private int stones;
   public Display11() {
   
      setLayout(new FlowLayout());
   
      stones = 9;
      label = new JLabel();
      label.setIcon(new ImageIcon("stones"+stones+".jpg"));
      add(label);
   }
   private void update() {
      label.setIcon(new ImageIcon("stones"+stones+".jpg"));
   }

   
   public void pickUp(int s) {
      stones-=s;
      update();
   }
   public int getStones() {
      return stones;     
   }
   public void setStones(int s) {
      stones = s;
      update();
   }
}
