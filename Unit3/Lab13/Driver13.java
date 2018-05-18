//name:    date:

import javax.swing.JOptionPane;
public class Driver13
{
   public static int first;
   public static int second;
   public static void main(String[] args)
   {
      while(true)
      {
         first = Integer.parseInt(JOptionPane.showInputDialog("First number?"));         
         if(first==-1) {
            System.exit(0);
         }
                  
         second = Integer.parseInt(JOptionPane.showInputDialog("Second number?"));
         if(second==-1) {
            System.exit(0);
         }
      
                 
         necklace(first, second);
      }
   }
   public static void necklace(int a, int b)
   {
      int iterations=0;
      int c;
      
      System.out.print(first+" ");
      System.out.print(second+" ");
      
      iterations++;
      c=a+b;
      c=c%10;
      System.out.print(c+" ");
      a=b;
      b=c;
            
      while(a!=first || b!=second) {
         iterations++;
         c=a+b;
         c=c%10;
         System.out.print(c+" ");
         a=b;
         b=c;
         
      }
      System.out.println();
      System.out.println(" "+"Iterations: "+iterations);
   }
}