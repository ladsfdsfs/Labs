import java.awt.Robot;
import java.io.*;
import javax.swing.Timer;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.awt.event.*;
import javax.swing.*;

public class MouseBot{
   public static void main(String[] args)
   {
      
      int xCoord[] = new int[100];
      int yCoord[] = new int[100];
      int a = 1;
      boolean filefound = false;
      while(!filefound) {
         try{
            Scanner xfile = new Scanner(new File("coord.txt"));
            Scanner yfile = new Scanner(new File("coord2.txt"));
            xCoord[0] = xfile.nextInt();
            yCoord[0] = yfile.nextInt();
         
            while(xfile.hasNextInt()){
               xCoord[a] = xfile.nextInt();
               yCoord[a] = yfile.nextInt();
               a++;
            } 
            a-=1;         
         
         } catch(FileNotFoundException e) {
            System.out.println("Failed to find file");
            continue;
         }
         filefound=true;
      }
      System.out.println("Coordinates: please look these over!");
      for(int x = 0; x<=a; x++) {
         System.out.println(xCoord[x]+"\t|\t"+yCoord[x]);
         
      }
         
      Scanner two = new Scanner(System.in);
      if(two.nextInt() == 1)
         System.exit(0);
                       
      try{
         Robot mouse = new Robot();
         int mask = InputEvent.BUTTON1_DOWN_MASK;
         
         
         mouse.mouseMove(xCoord[0], yCoord[0]);
                  
         mouse.mousePress(mask);
         mouse.mouseRelease(mask);
         TimeUnit.MILLISECONDS.sleep(2000);
      
      
      
         for(int x=1; x<=(1); x++) {
            TimeUnit.MILLISECONDS.sleep(200);
            mouse.mouseMove(xCoord[x], yCoord[x]);
            mouse.mousePress(mask);
            mouse.mouseRelease(mask);
            if(x==3) {
               mouse.mouseMove(xCoord[x], yCoord[x]);
               mouse.mousePress(mask);
            } else if(x==4) {
               mouse.mouseMove(xCoord[x], yCoord[x]);
               mouse.mouseRelease(mask);
            }        
         }
         /*
         for(int x=1; x<=25; x++) {
         TimeUnit.MILLISECONDS.sleep(200);
            mouse.mouseMove(xCoord[6], yCoord[6]);
            mouse.mousePress(mask);
            mouse.mouseRelease(mask);
      */
         
         
         
        
         for(int g=1; g<=25; g++) {
            for(int x=2; x<=a; x++) {
               TimeUnit.MILLISECONDS.sleep(500);
               mouse.mouseMove(xCoord[x], yCoord[x]);
               mouse.mousePress(mask);
               mouse.mouseRelease(mask);
               if(x==3) {
                  mouse.mouseMove(xCoord[x], yCoord[x]);
                  mouse.mousePress(mask);
               } else if(x==4) {
                  mouse.mouseMove(xCoord[x], yCoord[x]);
                  mouse.mouseRelease(mask);
               }
            }
         }
         
      } catch(Exception e){
         System.out.println("oh no");
      }
   
   
   }
}