	//Name______________________________ Date_____________
import javax.swing.*;
import java.awt.*;
public class Odometer extends JPanel
{
   private JLabel ones;
   private JLabel tens;
   private JLabel hunds;
   private int n;   
   public Odometer()
   {
      
      setLayout(new FlowLayout());
      ones = new JLabel("0");
      tens = new JLabel("0");
      hunds = new JLabel("0");
      
      ones.setForeground(Color.black);
      tens.setForeground(Color.white);
      hunds.setForeground(Color.white);
      ones.setBackground(Color.white);
      tens.setBackground(Color.black);
      hunds.setBackground(Color.black);
      
      ones.setOpaque(true);
      tens.setOpaque(true);
      hunds.setOpaque(true);
      setBackground(Color.black);
      add(hunds);
      add(tens);
      add(ones);
      
     
   }
   public void update()
   {
      n++;
      ones.setText(""+n%10/1);
      tens.setText(""+n%100/10);
      hunds.setText(""+n%1000/100);
   }
}