   //Name______________________________ Date_____________
import java.io.*;      //the File class
import java.util.*;    //the Scanner class
import java.text.*;
   
public class Driver03
{
   public static final int NUMITEMS = 20;
   public static void main(String[] args) throws Exception
   {
      DecimalFormat d = new DecimalFormat("0.0");
      double fahr[] = new double[NUMITEMS];
      double cels[] = new double[NUMITEMS];
      
      System.out.println("what file would you liek to read from?");
      Scanner lel = new Scanner(System.in);
      String file = lel.nextLine();
           Scanner yeet = new Scanner(new File(file));
      int a=0;
      
      
      while(yeet.hasNext()) {
         fahr[a]=yeet.nextDouble();
         a++;
      }
      
     
      a-=1;
                 
         //process the data
      for(int x = 0; x<=a; x++) {
         cels[x] = (5./9)*(fahr[x]-32);
      }
      
   
         
         
         //display the results
      System.out.println("fahrenheit \t\t| celsius\n---------------------------------");
         
      for(int x = 0; x<=a; x++) {
         System.out.println(d.format(fahr[x])+"\t\t|"+d.format(cels[x]));
      }
         
         
         yeet.close();
      	
   }
}
	/************************************
	Fahrenheit      | Celsius
	----------------|-------------------
	5.0             | -15.0
	10.0            | -12.222222222222221
	15.0            | -9.444444444444445
	20.0            | -6.666666666666667
	25.0            | -3.888888888888889
	26.0            | -3.3333333333333335
	28.0            | -2.2222222222222223
	31.0            | -0.5555555555555556
	37.0            | 2.7777777777777777
	45.0            | 7.222222222222222
	48.0            | 8.88888888888889
	51.0            | 10.555555555555555
	75.0            | 23.88888888888889
	98.6            | 37.0
	212.0           | 100.0
	451.0           | 232.77777777777777
	32.0            | 0.0
	0.0             | -17.77777777777778
	9.29            | -12.616666666666667
	19.77           | -6.794444444444445

	END OF EXECUTION, press any key:
	*************************************/