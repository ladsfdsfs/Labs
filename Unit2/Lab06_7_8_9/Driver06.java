//Name______________________________ Date_____________
import edu.fcps.Turtle;
import java.awt.Color;
import javax.swing.*;
public class Driver06
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Square Turtles");
      frame.setSize(400, 400);
      frame.setLocation(200, 100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new TurtlePanel());
      frame.setVisible(true);
      
      Turtle.setCrawl(true);     //a class method
   
      SquareTurtle smidge = new SquareTurtle();
      SquareTurtle b = new SquareTurtle(100,200,45);
      SquareTurtle c = new SquareTurtle(550,300,115);
   
      smidge.setColor(Color.BLUE);
      smidge.setThickness(6);
      smidge.drawShape();
   
      SquareTurtle a = new SquareTurtle();
      a.setColor(Color.WHITE);
      a.setSize(100);
      a.drawShape();
      b.setThickness(10);
      b.setSize(35);
      b.drawShape();
      c.setColor(Color.RED);
      
      for(int fg=80; fg >=20; fg-=20){
         c.setSize(fg);
         c.drawShape();}
            
   }
}