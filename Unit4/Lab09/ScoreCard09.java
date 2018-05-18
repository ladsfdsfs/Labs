	//Name______________________________ Date_____________
import javax.swing.*;
import java.awt.*;
public class ScoreCard09 extends JPanel
{
   private JTextField[] input;
   private JLabel[] par;
   private JLabel[] hole;
   private int[] parScore;
   public ScoreCard09()
   {
      setLayout(new GridLayout(3, 18));
      hole=new JLabel[18];
      for(int x = 0; x < 18; x++)
      {
      hole[x]=new JLabel("" + (x+1), SwingConstants.CENTER);
         add(hole[x]);
      }
      
      input = new JTextField[18];
      for(int x = 0; x < input.length; x++)
      {
         input[x] = new JTextField();
         add(input[x]);
      }
      par = new JLabel[18];
      parScore=new int[18];
      for(int x = 0; x < par.length; x++)
      {
         par[x] = new JLabel();
         add(par[x]);
         parScore[x]=(int)(Math.random()*3+2);
         par[x].setText("Par:\n"+parScore[x]);
      }
   
   }
   
   
   public void randomize()
   { 
      int rand=0;
      for(int x=0;x<input.length; x++){
         rand=(int)(Math.random()*4+1);
         input[x].setText(""+rand);  
         if(rand<=parScore[x])
         hole[x].setForeground(Color.green);
         else
         hole[x].setForeground(Color.red);
          
      }
   }
   public int findTotal()
   {
      int total=0;
      for(int x=0;x<input.length;x++)
         total+=Integer.parseInt(input[x].getText());
      return total;
   }
   public int findAces()
   {
      int aces=0;
      for(int x=0;x<input.length;x++)
         if(Integer.parseInt(input[x].getText())==1)
            aces++;
      return aces;
   }
   public int findHardestHole()
   {
      int hardest=0;
      int max=0;
      int number =0;
      for(int x=input.length-1;x>-1;x--){
         number = Integer.parseInt(input[x].getText());
         max=Math.max(max,number);
         
         if(max==number){
            hardest=x;
         }
      }
   
      return hardest+1;
   }
}