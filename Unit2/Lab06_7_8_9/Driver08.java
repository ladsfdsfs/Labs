	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
   public class Driver08
   {
      public static void main(String[] args)
      {
      
      JFrame frame = new JFrame("Flower Turtles");
      frame.setSize(400, 400);
      frame.setLocation(200, 100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new TurtlePanel());
      frame.setVisible(true);  
      
      
      /*
      FlowerTurtle cool =new FlowerTurtle(100,50,Color.PINK);
      FlowerTurtle nice =new FlowerTurtle(200,60,Color.RED);
      FlowerTurtle great =new FlowerTurtle(300,40,Color.BLUE);
      FlowerTurtle awesome =new FlowerTurtle(400,65,Color.YELLOW);
      cool.drawShape();
      nice.drawShape();
      great.drawShape();
      awesome.drawShape();
      */
      
      
      
      int a = (int) (Math.random()*70-30)+30;
      int b;
      for(b=1;b<=a;b++) {
      int ab = (int) (Math.random()*500-300)+300;
      int ac = (int) (Math.random()*90-30)+30;
      int randomColor = (int)(Math.random()*4-1)+1;
      switch(randomColor){
      case 1:
      new FlowerTurtle(ab,ac,Color.BLUE).drawShape(); 
      break;
      case 2:
      new FlowerTurtle(ab,ac,Color.RED).drawShape(); 
      break;
      case 3:
      new FlowerTurtle(ab,ac,Color.WHITE).drawShape(); 
      break;
      case 4:
      new FlowerTurtle(ab,ac,Color.RED.darker()).drawShape();
      break; }
      }
      
      }
      
   
   }