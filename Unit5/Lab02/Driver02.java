	//Name______________________________ Date_____________
import java.io.*;
import java.util.*;
public class Driver02
{
   public static void main(String[] args) throws Exception
   {
      double[] array = input("/Users/a-nguyen/Desktop/data.txt");
      sort(array);
      output(array, "output.txt");
   }
   public static double[] input(String filename) throws Exception
   {
      
      Scanner infile = new Scanner(new File(filename));
      
      int numitems = infile.nextInt();
      double[] array = new double[numitems];
      for(int k = 0; k<numitems; k++)
         array[k] = infile.nextDouble();
      infile.close();
      return array;
   }
   public static void sort(double[] array)
   {
      int maxPos;
      for(int k = 0; k < array.length; k++)
      {
         maxPos = findMax(array, array.length - k - 1);
         swap(array, maxPos, array.length - k - 1);
      }
   }
   public static int findMax(double[] array, int upper) //what does "upper" do???
   {
      int maxIndex=0;
      for(int b = 0; b<=upper; b++){
         if(array[b]>array[maxIndex])
            maxIndex=b;
      }
      return maxIndex;
   }
   public static void swap(double[] array, int a, int b)//what are "a" and "b" for???
   {
      double temp;
      temp=array[a];
      array[a] = array[b];
      array[b]=temp;
       
   }
   public static void output(double[] array, String filename) throws Exception
   {
      System.setOut(new PrintStream(new FileOutputStream(filename)));
      for(double k:array)
         System.out.println(k);
   }
}