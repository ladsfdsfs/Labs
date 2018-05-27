import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.text.DecimalFormat;
public class Display extends JPanel {
   private JLabel a1;
   private JLabel a2;
   private JLabel a3;
   private JLabel a4;
   private JLabel a5;
   
   private JTextField lastn;
   private JTextField firstn;
   private JTextField size;
   private JTextField cost;
   private JTextField total;
   private PrintStream outfile;
   
   private double runningtotal;
   
   
   public Display() {
      runningtotal=0;
      setLayout(new GridLayout(5,2));
      a1 = new JLabel("Last Name: ");
      a2= new JLabel("First Name:");
      a3= new JLabel("Lawn Size:");
      a4= new JLabel("Total Cost:");
      a5= new JLabel("Running Total:");
      
      lastn=new JTextField();
      firstn=new JTextField();
      size=new JTextField();
      cost=new JTextField();
      total=new JTextField();
   
      add(a1);
      add(lastn);
      add(a2);
      add(firstn);
      add(a3);
      add(size);
      add(a4);
      add(cost);
      add(a5);
      add(total );  
      outfile=null;
   }
   
   public Yard[] xd(Yard[] yad) {
      
      try{
         outfile = new PrintStream(new FileOutputStream("greenGrow.txt"));
      }
      catch(FileNotFoundException e)
      {
         JOptionPane.showMessageDialog(null,"The file could not be created.");
      } 
      Yard[] dank = new Yard[yad.length+1];
      
      for(int x=0;x<yad.length;x++)
         dank[x]=yad[x];
         
      int s =Integer.parseInt(size.getText());
      if(s<=10000)
         dank[dank.length-1]= new CustomerSmallYard(s, firstn.getText(),lastn.getText());
      else if(s<=20000)
         dank[dank.length-1]= new CustomerMediumYard(s, firstn.getText(),lastn.getText());
      else if(s>20000)
         dank[dank.length-1]= new CustomerLargeYard(s, firstn.getText(),lastn.getText());
      
     
      
      
      DecimalFormat num = new DecimalFormat("$0.00");
      double lol = dank[dank.length-1].getCost();
      cost.setText(num.format(lol));    
      runningtotal+=lol;
      total.setText(num.format(runningtotal));
      sort(dank);
      System.setOut(outfile);
      System.out.println(dank.length);
   
      for(Yard b:dank){
         System.out.println(b.getLastName());
         System.out.println(b.getFirstName());
         System.out.println(b.getSize());
               
      }
                      
                
            return dank;    
   }
   public void lmao(){
      System.out.close();
      System.exit(0);
   
   }
   public static void sort(Yard[] array)
   {
      int maxPos;
      for(int k = 0; k < array.length; k++)
      {
         maxPos = findMax(array, array.length -1- k);
         swap(array, maxPos, array.length - k-1);
      }
   }
   
   public static int findMax(Yard[] array, int upper) //what does "upper" do???
   {
      int maxIndex=0;
      for(int b = 0; b<=upper; b++){
         if(array[b].compareTo(array[maxIndex])>0){
            maxIndex=b;
            
         }
      }
      return maxIndex;
   }
   public static void swap (Yard[] data, int index1, int index2)
   {
      Yard temp = data[index1];
      data[index1] = data[index2];
      data[index2] = temp;
   }   

}
