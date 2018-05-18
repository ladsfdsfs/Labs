import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Panel02 extends JPanel {
   private JLabel label;
   private double n;
   
   public Panel02() {
      setLayout(new FlowLayout());
      label = new JLabel("0.00000000000");
      label.setFont(new Font("Serif", Font.BOLD, 20));
      label.setForeground(Color.blue);
      add(label);
     
      JButton rd = new JButton("Random");
      rd.addActionListener(new Listener2());
      add(rd);
      JButton button = new JButton("SQRT");
      button.addActionListener(new Listener());
      add(button);
      JButton abs = new JButton("Abs Value");
      abs.addActionListener(new Listener1());
      add(abs);
      JButton cb = new JButton("Cube Root");
      cb.addActionListener(new Listener3());
      add(cb);
      JButton neg = new JButton("Negate");
      neg.addActionListener(new Listener5());
      add(neg);
      JButton rndd = new JButton("Round Down");
      rndd.addActionListener(new Listener6());
      add(rndd);
      JButton rndu = new JButton("Round Up");
      rndu.addActionListener(new Listener7());
      add(rndu);
      JButton rnd = new JButton("Round nearest");
      rnd.addActionListener(new Listener8());
      add(rnd);
      JButton sine = new JButton("Sine");
      sine.addActionListener(new Listener9());
      add(sine);
      JButton log = new JButton("Log 2");
      log.addActionListener(new Listener10());
      add(log);
      
      JButton quit = new JButton("Quit");
      quit.addActionListener(new Listener4());
      add(quit);
   
   
      
   }
   private class Listener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         
         if(n >=0) {
            n=Math.sqrt(n);
            label.setText(""+n);
         
         } else {
         
            n*=-1; 
            n=Math.sqrt(n);
            label.setText(""+n+"i");
         }
      
      }
   }
   private class Listener1 implements ActionListener {
      public void actionPerformed(ActionEvent f) {
         if(n<0)
            n*=-1;
         label.setText(""+n);
      }
   }
      
   private class Listener2 implements ActionListener {
      public void actionPerformed(ActionEvent g) {
         n=Math.random()*100;
         label.setText(""+n);
      }}
   private class Listener3 implements ActionListener {
      public void actionPerformed(ActionEvent h) {
         n=Math.cbrt(n);
         label.setText(""+n);
      }}
     
   private class Listener4 implements ActionListener {
      public void actionPerformed(ActionEvent i) {
         System.exit(0);
      }}
 
   private class Listener5 implements ActionListener {
      public void actionPerformed(ActionEvent i) {
         n*=-1;
         label.setText(""+n);
      }
   }
   private class Listener6 implements ActionListener {
      public void actionPerformed(ActionEvent i) {
         n = Math.floor(n);
         label.setText(""+n);
      }}
   private class Listener7 implements ActionListener {
      public void actionPerformed(ActionEvent i) {
         n=Math.ceil(n);
         label.setText(""+n);
      }}
   private class Listener8 implements ActionListener {
      public void actionPerformed(ActionEvent i) {
         n=Math.round(n);
         label.setText(""+n);
      }}
   private class Listener9 implements ActionListener {
      public void actionPerformed(ActionEvent i) {
         n=Math.sin(n*Math.PI/180.0);
         label.setText(""+n);
      }}
   private class Listener10 implements ActionListener {
      public void actionPerformed(ActionEvent i) {
         n=Math.log10(n) / Math.log10(2.0);
         label.setText(""+n);
      }}




}

