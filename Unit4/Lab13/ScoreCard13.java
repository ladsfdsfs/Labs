//Name______________________________ Date_____________
import javax.swing.*;
import java.awt.*;
public class ScoreCard13 extends JPanel
{
   private JTextField[][] input;
   public ScoreCard13()
   {
      setLayout(new GridLayout(5, 18));
   
      for(int hole = 1; hole <= 18; hole++)
      {
         add(new JLabel("" + hole, SwingConstants.CENTER));
      }
   
      input = new JTextField[4][18];
      for(int r = 0; r < input.length; r++)
         for(int c = 0; c < input[0].length; c++)
         {
            input[r][c] = new JTextField();
            add(input[r][c]);
         }
   }
   public void randomize()
   {
      int rand=0;
      for(int r = 0; r < input.length; r++)
         for(int c = 0; c < input[0].length; c++) {
            rand=(int)(Math.random()*4+1);
         
            input[r][c].setText(""+rand);
         
         }
         
   }
   public int findTotal(int r)
   {
      int total=0;
      for(int c = 0; c < input[0].length; c++) {
         total+=Integer.parseInt(input[r][c].getText());
      }
      return total;
   }
   public int findAces(int r)
   {
      int count=0;
      String a = "";
      for(int c = 0; c < input[0].length; c++) {
         a=input[r][c].getText();
         if(Integer.parseInt(a)==1)
            count++;
         
      }
      return count;
   }
   public int findHardestHole(int r)
   {
      int max=-1;
      int prev;
      int count=0;
      
      for(int c = 0; c < input[0].length; c++) {
         prev=max;
         max=Math.max(max, Integer.parseInt(input[r][c].getText()));
         if(prev!=max)
            count=c;
      }
      return count+1;
   }
   public int findHardestHole()
   {
      int rowsum=0;
      int curMax=0;
      int column=0;
      for(int c = 0; c < input[0].length; c++) {
         for(int r = 0; r < input.length; r++){
            rowsum+=Integer.parseInt(input[r][c].getText());
         }
         curMax=Math.max(curMax, rowsum);
         if(curMax==rowsum)
            column=c;
         rowsum=0;
      }
      
      return column+1;
   }
  
}