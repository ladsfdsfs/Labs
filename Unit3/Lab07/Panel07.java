import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Panel07 extends JPanel
{ 
   private Display07 display;
   public Panel07() {
   
      setLayout(new FlowLayout());
      display = new Display07();
      add(display);
      
      JButton lcm = new JButton("LCM");
      lcm.addActionListener(new LCM());
      add(lcm);
      
      JButton gcf = new JButton("GCD");
      gcf.addActionListener(new GCD());
      add(gcf);
   }
   private class LCM implements ActionListener {
      public void actionPerformed(ActionEvent f) {
         display.showLCM();
      }
   }
   private class GCD implements ActionListener {
      public void actionPerformed(ActionEvent g) {
         display.showGCD();
      }
   }
}