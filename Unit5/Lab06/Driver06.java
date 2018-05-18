	//Name______________________________ Date_____________
import java.io.*;      //the File class
import java.util.*;    //the Scanner class
public class Driver06
{
   public static void main(String[] args) throws Exception
   {
      
      Comparable[] array = input("data.txt");
      sort(array);
      output(array, "output.txt");
   }
   	
   public static Comparable[] input(String filename) throws Exception
   {	
      Scanner infile = new Scanner( new File(filename) );
      int numitems = infile.nextInt();
      Comparable[] array = new String[numitems];
      for(int k = 0; k < numitems; k++)
      {
         array[k]=new String(infile.nextLine());
      }
      infile.close();
      return array;
   }
      
   public static void output(Object[]array, String filename) throws Exception
   {
      System.setOut(new PrintStream(new FileOutputStream(filename)));
      for(int k = 0; k < array.length; k++)
         System.out.println(array[k]);
   }
      
   public static void sort(Comparable[] array)
   {
      int maxPos;
      for(int k = 0; k < array.length; k++)
      {
         maxPos = findMax(array, array.length -1- k);
         swap(array, maxPos, array.length - k-1);
      }
   }
   
   public static int findMax(Comparable[] array, int upper) //what does "upper" do???
   {
      int maxIndex=0;
      for(int b = 0; b<=upper; b++){
         if(array[b].compareTo(array[maxIndex])>0){
            maxIndex=b;
            
            }
      }
      return maxIndex;
   }
   public static void swap (Comparable[] data, int index1, int index2)
   {
      Comparable temp = data[index1];
      data[index1] = data[index2];
      data[index2] = temp;
   }   
}