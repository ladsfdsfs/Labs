import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.util.*;
import javax.swing.JFrame.*;
import java.awt.GraphicsDevice;
import java.io.*;

public class MouseCoord extends JFrame   {
   String choice;
   public MouseCoord(String display) {
      super(display);
   
      PrintStream stdout = System.out;
      Scanner thing = new Scanner(System.in);
      GraphicsDevice gd =
            GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
      
      while(true) {
         System.out.println("1: print coordinates in console or 2: edit/create new coord set?");
         choice = (thing.nextLine());
         if(!(choice.equals("1") || choice.equals("2"))) {
            System.out.println("Invalid choice. "+choice);
            continue;
         } else { 
            break;}
      }
          
      try{
            
         
                           
         System.out.println("Enter two files to edit/name. \nfirst file for x, second for y");
         String file1 = thing.nextLine();
         System.out.println("second file name?");
         String file2 = thing.nextLine();
         System.out.println("Program running.");
         
         
         PrintWriter writer1 = new PrintWriter(file1, "UTF-8");
         writer1.print("");     //clear both txt files or make new ones ;) ;)
         
         PrintWriter writer2 = new PrintWriter(file2, "UTF-8");
         writer2.print("");
            
                        
         gd.setFullScreenWindow(this);
         addMouseListener(
               new MouseListener() {
               
                  public void mousePressed(MouseEvent e) {
                  }
               
                  public void mouseReleased(MouseEvent e) {
                  }
               
                  public void mouseEntered(MouseEvent e) { //dont worry about these mouse events
                  }
               
                  public void mouseExited(MouseEvent e) {
                  }
               
                  public void mouseClicked(MouseEvent e) { //important stuff here
                  //actual detection of clicks
                  
                     if (SwingUtilities.isRightMouseButton(e) || e.isControlDown()) { 
                        writer1.close();
                        writer2.close();  //right click to exit
                        System.exit(0);
                     } else {
                        if(choice.equals("2")){
                           writer1.println(""+e.getX()); //print in files
                           writer2.println(""+e.getY());
                        } else if (choice.equals("1")) {
                           System.out.println("X: "+e.getX()); //print in console
                           System.out.println("Y: "+e.getY());
                        }
                     }
                  }
               
               });
         addKeyListener(
            new KeyListener() {
            
               public void keyPressed(KeyEvent e) {
                  if(e.getKeyCode() == KeyEvent.VK_ESCAPE)
                     System.out
               }
            
               public void keyReleased(KeyEvent e) { }
               
               public void keyTyped(KeyEvent e) {}
              
            });
      } catch (FileNotFoundException e) {
         System.out.println("Osht file not found");
         System.exit(0);
      } catch (UnsupportedEncodingException e) {
         System.out.println("File contains uncodeable characters."); 
         System.exit(0);
      }
      
   }
   
   public static void main(String[] args) {
      
      MouseCoord frame = new MouseCoord("coordgen");
          //makes the mouse location correct
      frame.setLocation(0, 0);
      frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
      
      frame.setUndecorated(false);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setFocusable(true);
      frame.setVisible(true);
   
   }
}