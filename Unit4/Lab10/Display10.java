//Name______________________________ Date_____________
import javax.swing.*;
import java.awt.*;
public class Display10 extends JPanel
{
   private JLabel[] bits;
   private JLabel num;
   private String word;
   public Display10()
   {
      word = JOptionPane.showInputDialog("Enter a word");
      setLayout(new GridLayout(1, word.length()));
      bits = new JLabel[word.length()];
      for(int x = 0; x < bits.length; x++)
      {
         bits[x] = new JLabel("", SwingConstants.CENTER);
         bits[x].setFont(new Font("Serif", Font.BOLD, 50));
         add(bits[x]);
      }
      num=new JLabel("0.0");
      add(num);
      randomize();
   }
   public void randomize()
   {
      for(int x=0;x<bits.length; x++) {
         bits[x].setText(""+word.charAt(x));
      }
      number();
   }
   public void reverse()
   {
      String first="";
      for(int x=0;x<bits.length/2;x++){
         first=bits[x].getText();
         bits[x].setText(bits[bits.length-1-x].getText());
         bits[bits.length-1-x].setText(first) ;
      }
      number();
   }
   public void rotate()
   {
      String first = bits[0].getText();
      for(int x=0;x<bits.length;x++){
         if(x!=bits.length-1)
            bits[x].setText(bits[x+1].getText());
         else
            bits[x].setText(first);
      }
      number();
   }
   public void shift()
   {
      
      for(int x=0;x<bits.length;x++){
         if(x!=bits.length-1)
            bits[x].setText(bits[x+1].getText());
      }
      bits[bits.length-1].setText("0");
      number();
   }
   public void number() {
            int yes= 5;}
}