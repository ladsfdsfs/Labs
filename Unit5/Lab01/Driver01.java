	//Name______________________________ Date_____________
  

import java.io.*;
import java.util.*;
public class Driver01
{
   public static void main(String[] args) throws Exception
   {
      	//input
      try{
         System.setOut(new PrintStream(new FileOutputStream("output.txt")));
      }catch(FileNotFoundException e){System.exit(0);}
      Scanner infile = new Scanner(new File("/Users/a-nguyen/Desktop/data.txt"));
      
      int numitems = infile.nextInt();
      double[] myArray = new double[numitems];
      for(int k = 0; k<numitems; k++)
         myArray[k] = infile.nextDouble();
      infile.close();
      				      
      	//sort the array
      int maxIndex=0;
      int length=myArray.length;
      double temp;
      for(int a =0; a<myArray.length; a++){
         for(int b = 0; b<length; b++){
            if(myArray[b]>myArray[maxIndex])
               maxIndex=b; //first find max
         }
         temp=myArray[length-1];
         myArray[length-1] = myArray[maxIndex];
         myArray[maxIndex]=temp;
         length--;
      }      			  
      	//output
         
      for(double a:myArray) 
         System.out.println(a);
         
      	
   }
}