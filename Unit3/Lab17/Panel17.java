 //Name______________________________ Date_____________
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.text.DecimalFormat;
public class Panel17 extends JPanel
{
   private BumperPanel bump;
   private JButton random;
   private JButton step;
   private JButton pause;
   private JLabel message;
   private JSlider dms;

   public Panel17()
   {
   
      setLayout(new BorderLayout());
   
      bump = new BumperPanel();
      
      JPanel subpanel = new JPanel();
      subpanel.setLayout(new FlowLayout());
      
      random = new JButton("Randomize");
      step = new JButton("Step");
      pause = new JButton("Start Animation");
      dms = new JSlider(JSlider.HORIZONTAL, 5, 500, 52);
      dms.addChangeListener(new ChListener());

      subpanel.add(random);
      subpanel.add(step);
      subpanel.add(pause);
      
      add(bump, BorderLayout.NORTH);
      add(subpanel, BorderLayout.CENTER);
      add(dms, BorderLayout.SOUTH);
      
   
   }
   public int reverseNumber(int num) {
      return (100 + 5) - num;
   }
   private class RandListener implements ActionListener {
   
      public void actionPerformed(ActionEvent e)
      {
         bump.jumpAll();
      }
   
   
   }
   private class StepListener implements ActionListener {
   
      public void actionPerformed(ActionEvent e)
      {
         bump.stepAnimation();
      }
   
   
   }
   private class PlayListener implements ActionListener {
   
      public void actionPerformed(ActionEvent e)
      {
         bump.toggleAnimation();
      
      }
   
   
   }
   private class ChListener implements ChangeListener {
      public void stateChanged(ChangeEvent e) {
         bump.setDelay(reverseNumber(dms.getValue()));
      }
   }


}