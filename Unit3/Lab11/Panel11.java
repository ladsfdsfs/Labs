

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Panel11 extends JPanel
{
   private Display11 display;
   private Scoreboard11 scoreboard;
   private JButton one, two, three;
   private int stones;
   public Panel11()
   {
      setLayout(new BorderLayout());
      
      display = new Display11();
      scoreboard = new Scoreboard11();
      
      add(display, BorderLayout.CENTER);
      add(scoreboard, BorderLayout.NORTH);
      
      JPanel subpanel = new JPanel();
      subpanel.setLayout(new FlowLayout());
      addButton(subpanel, 1);
      addButton(subpanel, 2);
      addButton(subpanel, 3);
      stones = display.getStones();
      this.add(subpanel, BorderLayout.SOUTH);
   }
   private void addButton(JPanel panel, int x)
   {
      JButton factory = new JButton();
      Listener test = new Listener(x);
      factory.addActionListener(test);
      switch(x) {
         case 1: factory.setText("One");
            break;
         case 2: factory.setText("Two");
            break;
         case 3: factory.setText("Three");
            break;
      }
      panel.add(factory);
   }
   private class Listener implements ActionListener
   {
      private int myX;
      public Listener(int x)
      {
         myX = x; 
      }
      public void actionPerformed(ActionEvent e)
      {
         stones = display.getStones();
      
         display.pickUp(myX);
         
         int round = scoreboard.turn();
         if(display.getStones() <= 0) {
            scoreboard.score(round);
            display.setStones(9); }
         
         
      }
   }

}
