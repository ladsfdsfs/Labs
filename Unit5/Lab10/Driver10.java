  //Name______________________________ Date_____________
  
import java.io.*;       		 //the File class
import java.util.*;     		 //the Scanner class
import javax.swing.JOptionPane;
public class Driver10
{
   public static void main(String[] args) 
   {
      Song[] songList = input();
      int totalTime = calcTime(songList);
      int longestSong = searchLongestSong(songList);
      display(songList, totalTime, longestSong);
      System.exit(0);
   }
   	
   public static Song[] input() 
   {
      Scanner infile = null;
      String filename=JOptionPane.showInputDialog("Filename?");
      try{
         infile = new Scanner(new File(filename));
      }
      catch(FileNotFoundException e)
      {
         JOptionPane.showMessageDialog(null,"The file could not be found.");
         System.exit(0);
      }
      int numitems = Integer.parseInt(infile.nextLine());
      Song[] array = new Song[numitems];
      for(int k = 0; k < numitems; k++)
      {
         array[k] = new Song(infile.nextLine());
      }
      infile.close();
      return array;
   }
   
   public static int calcTime(Song[] songs)
   {
      int totalSec=0;
            
      for(Song s:songs){
            
         totalSec+=s.getMySeconds();
         totalSec+=60*s.getMyMinutes();
            
      }
      return totalSec;
            
   }
      
   public static int searchLongestSong(Comparable[] array)
   {
      int maxIndex=0;
      for(int b = 0; b<array.length; b++){
         if(array[b].compareTo(array[maxIndex])>0){
            maxIndex=b;
            
         }
      }
      return maxIndex;
   
   }
      
   public static void display(Song[] array, int total, int longestSong)
   {
   
      int minutes = total/60;
      int seconds = total%60;
            System.out.println("Total time: "+minutes+"' "+seconds+"\" \nLongest Song: "+array[longestSong].toString());
   }
      
}