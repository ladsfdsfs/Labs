//Name______________________________ Date_____________
import edu.fcps.Turtle;
import java.awt.Color;
import javax.swing.*;
public class Driver07
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Polygon Turtles");
      frame.setSize(400, 400);
      frame.setLocation(200, 100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new TurtlePanel());
      frame.setVisible(true);
   
      PolygonTurtle smidge = new PolygonTurtle(100.0, 3);
      PolygonTurtle yeet = new PolygonTurtle(100, 5);
      PolygonTurtle cool = new PolygonTurtle(550,290,90,10,8);
      PolygonTurtle awesome = new PolygonTurtle(490,500,90,15,3);
      PolygonTurtle thicc = new PolygonTurtle(100,510,120,35,4);
      smidge.setColor(Color.BLUE);
      yeet.setColor(new Color(244, 66, 241));
      cool.setColor(Color.RED);
      awesome.setColor(Color.BLACK);
      thicc.setColor(Color.BLUE.darker());
      yeet.setThickness(5);
      smidge.setThickness(5);
      cool.setThickness(5);
      awesome.setThickness(2);
      thicc.setThickness(10);
      
      int a;
      
      smidge.drawShape();
      yeet.drawShape();
      
      for(a=60;a>=15;a-=15){
         cool.setSize(a);
         cool.drawShape();
      } 
      for(a=3;a<=8;a++){
      awesome.setSize(a*7);
      awesome.setSides(a);
      awesome.drawShape();
       
       } 
       thicc.drawShape();     
   }
}