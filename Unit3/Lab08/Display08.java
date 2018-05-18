   //Name______________________________ Date_____________
import javax.swing.*;
import java.awt.*;
public class Display08 extends JPanel
{
   private JLabel label;
   private JTextField box1, box2, box3;
   private double ratio, sum;
   private int term,first;
   public Display08()
   {
      setLayout(new GridLayout(4, 2));
      
      add(new JLabel("Terms:", SwingConstants.RIGHT));
      box1 = new JTextField("", 5);
      box1.setHorizontalAlignment(SwingConstants.LEFT);
      add(box1);
      
      add(new JLabel("First:", SwingConstants.RIGHT));
      box2 = new JTextField("", 5);
      box2.setHorizontalAlignment(SwingConstants.LEFT);
      add(box2);
      
      add(new JLabel("Ratio:", SwingConstants.RIGHT));
      box3 = new JTextField("", 5);
      box3.setHorizontalAlignment(SwingConstants.LEFT);
      add(box3);
      
      add(new JLabel("Sum:", SwingConstants.RIGHT));
      label = new JLabel("");
      label.setFont(new Font("Serif", Font.BOLD, 20));
      label.setForeground(Color.blue);
      add(label);
   }
   public void sumFinite()
   {
      term=Integer.parseInt(box1.getText());
      first=Integer.parseInt(box2.getText());
      ratio=Double.parseDouble(box3.getText());
      double hold=0;
      double add=first;
      for(int yeet=1;yeet<term;yeet++){
         add*=ratio;
         hold+=add;
            
      }
      hold+=first;
      label.setText(""+hold);
   }
   public void sumInfinite()
   {
      first=Integer.parseInt(box2.getText());
      ratio=Double.parseDouble(box3.getText());
         if(ratio<1) {
            label.setText(""+(first/(1-ratio)));
         } else {
            label.setText("no");
         }
        	      
   }
}