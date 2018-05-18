	//Name______________________________ Date_____________
  
import java.io.*;             //the File class
import java.util.*;   		   //the Scanner class
import javax.swing.*;         //the JOptionPane class
import java.util.Arrays;
public class Driver09
{
   public static void main(String[] args) throws Exception
   {
      String[] array = input("data.txt");
                 
         
      for(int k = 0; k < array.length; k++){
         array[k] = convert(array[k]);
         System.out.println(array[k]);
      }
      Arrays.sort(array);              //why don't you have to implement sort()?
      output(array, "output.txt");
   }
   	
   public static String[] input(String filename)
   {
      Scanner infile = null;
      try{
         infile = new Scanner(new File(filename));
      }
      catch(FileNotFoundException e)
      {
         JOptionPane.showMessageDialog(null,"The file could not be found.");
         System.exit(0);
      }
      int numitems = infile.nextInt();
      String[] array = new String[numitems];
      for(int k = 0; k < numitems; k++)
      {
         array[k] = infile.next();
      }
      infile.close();
      return array;
   }
   public static String[] mySplit(String text,String delemeter){
      java.util.List<String> parts = new java.util.ArrayList<String>();
      text+=delemeter;        
   
      for (int i = text.indexOf(delemeter), j=0; i != -1;) {
         parts.add(text.substring(j,i));
         j=i+delemeter.length();
         i = text.indexOf(delemeter,j);
      }
   
   
      return parts.toArray(new String[0]);
   }
   	
   public static String convert(String website)
   {
      String packageName="";
      
      String domain[]= mySplit(website,".");
      
      for(int a=domain.length-1; a>1;a--){
      packageName+=domain[a]+".";
      }
      packageName+=domain[1];
      
      return packageName;
   }
   	
   public static void output(Object[] array, String filename)
   {
      PrintStream outfile = null;
      try{
         outfile = new PrintStream(new FileOutputStream(filename));
      }
      catch(FileNotFoundException e)
      {
         JOptionPane.showMessageDialog(null,"The file could not be created.");
      } 
      System.setOut(outfile);
      for(int k = 0; k < array.length; k++)
         System.out.println(array[k]);
   }
   
}