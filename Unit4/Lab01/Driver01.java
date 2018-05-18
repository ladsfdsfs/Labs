import java.util.Scanner;

public class Driver01 {
   public static final int NUMITEMS = 10;
   public static void main(String[] args) {
   
      double sum = 0;
      double maxx =0;
      double mini=0;
      double[] array = new double[NUMITEMS];
      Scanner keyboard = new Scanner(System.in);
      
      for(int x = 0; x < NUMITEMS; x++) {
         System.out.print("#"+(x+1)+": ");
         array[x] = keyboard.nextDouble(); }
         
      for(int x = 0; x<NUMITEMS; x++) {
         sum += array[x];
         
         if(array[x]>=maxx)
         maxx=array[x];
         
        
         
         
        mini = Math.min(array[x], mini);
         //maxx = Math.max(array[x], maxx);
      }
      double avg = sum/NUMITEMS;
      System.out.println("\nSum: "+sum+"\nAvg: "+avg+"\nMin: "+mini+"\nMax: "+maxx);
   }
   
   
}
