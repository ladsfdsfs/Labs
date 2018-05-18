   //Name:                 Date:
import java.util.Scanner;
import java.text.DecimalFormat;
public class Driver02
{
   public static final int NUMITEMS = 15;
   public static void main(String[] args)
   {
         //prompt the user and read the data
      DecimalFormat d = new DecimalFormat("0.0");
      double fahr[] = new double[NUMITEMS];
      double cels[] = new double[NUMITEMS];
      System.out.println("enter sum fahrenheit numbers");
      Scanner yeet = new Scanner(System.in);
      for(int x = 0; x<=9; x++) {
         fahr[x]=yeet.nextDouble();
      }
      for(int x = 0; x<=5; x++) {
         fahr[x+9]=Math.random()*1001;
         }

         
         //process the data
      for(int x = 0; x<=14; x++) {
         cels[x] = (5./9)*(fahr[x]-32);
      }
      
   
         
         
         //display the results
      System.out.println("fahrenheit \t\t| celsius\n---------------------------------");
         
      for(int x = 0; x<=14; x++) {
         System.out.println(d.format(fahr[x])+"\t\t|"+d.format(cels[x]));
      }
         
         
         
        
   }
}