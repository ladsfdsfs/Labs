import java.util.*;
import javax.swing.*;
import java.io.*;

public class Driver08 {

   public static void main(String[] args) throws FileNotFoundException {
      int index=0;
      boolean found=false;
      Scanner file = new Scanner(new File("words.txt"));
               
      int length = file.nextInt();
      String dictionary[] = new String[length+2];
      for(int x = 0; x<=length-1;x++){
         dictionary[x]=file.next();
      }
      while(true) {
         String word = JOptionPane.showInputDialog("word? (type -1 to quit)");
         if(word.equals("-1"))
            break;
         for(int sf = 0;sf<=length-1;sf++){
            if(word.equalsIgnoreCase(dictionary[sf])){
               found=true;
               index=sf;
               break;
            }else{
               found=false;}
         }
        if(found){
        System.out.println(word+" is a word. #"+index);
        } else {
        System.out.println(word+" ain't a word. whoops");
        }
        
      }
   }
}