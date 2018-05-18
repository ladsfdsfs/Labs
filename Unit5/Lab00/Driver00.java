import java.io.*;
import java.util.*;

public class Driver00 {
   public static void main(String[] args) throws Exception {
      Scanner infile = new Scanner(new File("data.txt"));
      int numitems = infile.nextInt();
      double[] array = new double[numitems];
      for(int k = 0; k<numitems; k++)
         array[k] = infile.nextDouble();
      infile.close();
      int minPos, maxPos;
      minPos = findMin(array);
      maxPos = findMax(array);
      System.out.println("minimum: "+array[minPos]+" \nmaximum: "+array[maxPos]);
      
   }
   
   private static int findMin(double[] apple) {
      int index=0;
      for(int a = 0; a<apple.length; a++)
         if(apple[a]<apple[index])
            index=a;
      return index;
   }
   private static int findMax(double[] apple){
      int index=0;
      for(int a = 0; a<apple.length; a++)
         if(apple[a]>apple[index])
            index=a;
      return index;
   
   }
}
