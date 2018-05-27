import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
public class Panel extends JPanel
{
   private Yard[] yad;
   
   
   public Panel() {
      Scanner infile = null;
      try{
         infile = new Scanner(new File("greenGrow.txt"));
      }
      catch(FileNotFoundException e)
      {
         System.out.println("The file could not be found.");
         System.exit(0);
      }
      int numitems = Integer.parseInt(infile.nextLine());
      yad=new Yard[numitems];
      for(int k = 0; k < numitems; k++)
      {
         String f=infile.nextLine();
         String l=infile.nextLine();
         int a=Integer.parseInt(infile.nextLine());
         if(a<=10000)
         yad[k]=new CustomerSmallYard(a,f,l);
         else if(a<=20000)
         yad[k]= new CustomerMediumYard(a,f,l);
         else
         yad[k] = new CustomerLargeYard(a,f,l);
      }
      infile.close();
      
      
      
      setLayout(new BorderLayout());
      Display dank = new Display();
      add(dank, BorderLayout.CENTER);
      JLabel title = new JLabel();
      title.setText("Green and Grow Mowing Company");
      title.setHorizontalAlignment(0);
      
      add(title, BorderLayout.NORTH);
      JButton next = new JButton("Next");
      JButton quit = new JButton("Quit");
      next.addActionListener(
            new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                  yad=dank.xd(yad);
               }});
      quit.addActionListener(
            new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                  dank.lmao();
               
               }});
      JPanel sub = new JPanel();
      sub.setLayout(new FlowLayout());
      
      sub.add(next);
      sub.add(quit);
      add(sub,BorderLayout.SOUTH);
      
      
   }
}
