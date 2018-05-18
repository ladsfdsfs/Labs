 //name:    date:  

import java.io.*;      //the File class
import java.util.*;    //the Scanner class
import javax.swing.JOptionPane;
public class Driver04
{
   public static void main(String[] args) 
   {
      Scanner hehe = null;
      Scanner console = new Scanner(System.in);
      for(int x = 1; x<=4; x++) {
         try {
            System.out.println("Enter a file to parse");
            String file = console.nextLine();
            hehe = new Scanner(new File(file));
         
         } catch(FileNotFoundException e) {
            if(x==4) {
               System.out.println("File not found. Exiting the program.");
               System.exit(0); }
            else {System.out.println("File not found, please enter a valid filename. \nAttempt "+x+" out of 3.");
               continue;}
         }
         break;
      }
      final int arLength = hehe.nextInt();
      double min=1000;
      double max=0;
      double total=0;
      double nums[] = new double[arLength+1];
      
      for(int x = 1; x<=(arLength); x++) 
      nums[x]=hehe.nextDouble();
      
      for(int x = 1; x<=(arLength); x++) {
         min=Math.min(min, nums[x]);
         max=Math.max(max, nums[x]);
         total+=nums[x];
      }
      
      System.out.println("Sum: "+total+"\nAvg: "+total/arLength+"\nMin: "+min+"\nMax: "+max);
      
      
   }
}
/************************************
Sum: 3291074.1965423366
Avg: 504.3791872095535
Min: 0.027375512843708094
Max: 999.9780398236477

*************************************/