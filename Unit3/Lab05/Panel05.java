//Name______________________________ Date_____________
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Panel05 extends JPanel
{
   private Display05 display;
   private Timer clock;
   private JButton time;
   public Panel05()
   {
      setLayout(new FlowLayout());
   
      display = new Display05();
      add(display);
   
      JButton button = new JButton("Press Your Luck");
      button.addActionListener(new Listener());
      add(button);
      
      time = new JButton("Start                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              Timer");
      time.addActionListener(new Listener1());
      add(time);
      
      clock = new Timer(500, new TimeListener());
   }
   private class Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
      
         display.update();         
      }
   }
   private class TimeListener implements ActionListener {
      public void actionPerformed(ActionEvent g) {
         display.update();
      }
   }
   private class Listener1 implements ActionListener
   {
      public void actionPerformed(ActionEvent f) {
      
         if(clock.isRunning()){
         clock.stop();
         time.setText("Start Run");
         }else {
         clock.start();
         time.setText("Stop Run");
         }
         
      
      }
   }
}