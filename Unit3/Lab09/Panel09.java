  //Name______________________________ Date_____________
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
public class Panel09 extends JPanel
{
   private JLabel label;
   private double total;
   public Panel09()
   {
      setLayout(new BorderLayout());
      total = 0.00D;
      label = new JLabel("$0.00");
      label.setFont(new Font("Serif", Font.BOLD, 40));
      label.setHorizontalAlignment(0);
      add(label, "North");
      
      JPanel panel = new JPanel();
      panel.setLayout(new GridLayout(2,3,10,0));
      add(panel, BorderLayout.CENTER);
      
      addButton(panel, "+1.00", 1.00D);
      addButton(panel, "+0.10", 0.10D);
      addButton(panel, "+0.01", 0.01D);
      addButton(panel, "-1.00", -1.00D);
      addButton(panel, "-0.10", -0.10D);
      addButton(panel, "-0.01", -0.01D);
          
   }
   private void addButton(JPanel panel, String s, double x)
   {
      JButton factory = new JButton(s);
      Listener test = new Listener(x);
      factory.addActionListener(test);
      panel.add(factory);
   }
   private class Listener implements ActionListener
   {
      private double myX;
      public Listener(double x)
      {
         myX = x; 
      }
      public void actionPerformed(ActionEvent e)
      {
         total+=myX;
         DecimalFormat num = new DecimalFormat("$0.00");
         label.setText(num.format(total));
         add(label, BorderLayout.NORTH);
         
         
      }
   }
}