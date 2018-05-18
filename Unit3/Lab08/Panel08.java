   //Name_____yeet_________________________ Date_______never______
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   public class Panel08 extends JPanel
   {
      private Display08 display;
      private JButton finite,infinite;
      private JPanel subpanel;
      public Panel08()
      {
         setLayout(new BorderLayout());
      
         display = new Display08();
         add(display, BorderLayout.CENTER);
         
         subpanel = new JPanel();
         subpanel.setLayout(new FlowLayout());
         
         finite=new JButton("Finite");
         finite.addActionListener(new Listener1());
         subpanel.add(finite);
         
         infinite=new JButton("Infinite");
         infinite.addActionListener(new Listener2());
         subpanel.add(infinite);
         
         add(subpanel, BorderLayout.SOUTH);
      
            
      }
      private class Listener1 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
         
         	display.sumFinite();
         
         }
      }
      private class Listener2 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
         
         	display.sumInfinite();
         
         }
      }
   }