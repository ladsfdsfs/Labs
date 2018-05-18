//Name:    Date:
public class Driver05
{
   public static final int TRIALS = 1000;
   public static void main(String[] args)
   {
      Dice d = new Dice();
      int firstdub=0;
      // Experiment  1
      int count = 0;
      int freq[] = new int[14];
      int box=0;
      boolean first = false;
      boolean boxes = false;
      String dubfirst="";
      do
      {
         d.roll();
         
         if(d.total()==12 && !boxes) {
         box=count;
         boxes=true;
         }
         
         if(d.doubles() && !first) {//experiment 2 here
            firstdub = count; 
            first=true;
            dubfirst = d.toString();
         }
         freq[d.total()]++; //experiment 3 here
         
         if(d.doubles()) //experiment 3 ext here
            freq[13]++;
            
         count = count + 1;
      }while(count != TRIALS);
      System.out.println("It took " + box + " rolls to get boxcars.");
      
   
   
      // Experiment  2
   
      System.out.println("It took " + firstdub + " rolls to get doubles: "+dubfirst);
      
      // Experiment  3
      for(int x = 2; x<=12; x++) 
         System.out.println(x+"'s: "+freq[x]);
      
      // Experiment 3 Extension
      System.out.println("Number of doubles in "+TRIALS+" rolls: "+freq[13]);
      
      
   }
}
/******
 It took 35 rolls to get boxcars.
 It took 4 rolls to get doubles: {1, 1}
 2's:  6
 3's:  6
 4's:  5
 5's:  10
 6's:  12
 7's:  20
 8's:  17
 9's:  6
 10's:  10
 11's:  4
 12's:  4
 Number of doubles in 100 rolls: 18
 ********/