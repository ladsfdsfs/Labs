   //Name:                 Date:
import java.util.Scanner;
import java.text.DecimalFormat;
public class Driver02Ext
{
   public static final int NUMITEMS = 5;
   public static void main(String[] args)
   {
         //prompt the user and read the data
      DecimalFormat d = new DecimalFormat("0.0");
      double cent[] = new double[NUMITEMS];
      double inch[] = new double[NUMITEMS];
      System.out.println("entering random centimeter lengths");
      Scanner yeet = new Scanner(System.in);
      for(int x = 0; x<=4; x++) {
         cent[x]=Math.random()*501;
      }
      
         
         //process the data
      for(int x = 0; x<=4; x++) {
         inch[x] = (0.393701)*(cent[x]);
         
      }
      
   
         
         
         //display the results
      System.out.println("centimeters  | feet n inches\n---------------------------------");
      
      for(int x = 0; x<=4; x++) {
      int a = (int)(Math.floor(inch[x]/12.0));
         System.out.println(d.format(cent[x])+"\t\t|"+a+" feet, "+d.format(inch[x]%12.0)+" inches");
      }
         
         
         
        
   }
}