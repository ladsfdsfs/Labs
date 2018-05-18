	//Name______________________________ Date_____________
import edu.fcps.Turtle;
import java.awt.Color;
public class FlowerTurtle extends Turtle
{
   private double mySize;
   private Color myColor;
   public FlowerTurtle()
   {
      mySize = 50.0;
      myColor = Color.RED;
   }
   public FlowerTurtle(double x, double n, Color c)
   {
      super(x, 300.0, 90.0);
      mySize = n;
      myColor = c;
   }
   public void setSize(double n)
   {
      mySize = n;
   }
   public void setColor(Color c)
   {
      myColor = c;
   }
   private void drawPetals() //starts and ends at center facing north
   {
      setCrawl(false);
      super.setColor(myColor);
      setPenDown(true);
      int n = (int) mySize;
      for(int b=1;b<=30;b++){
         forward(mySize);
         turnLeft(180);
         forward(mySize);
         turnLeft(180);
         turnRight(12);
      }
      turnLeft(180);
   }
   private void drawStem() //starts at top of stem facing south, ends at bottom
   {
      super.setColor(Color.GREEN.darker());
      forward(mySize*2);
      turnRight(225);
      forward(mySize);
      turnLeft(180);
      forward(mySize);
      turnRight(90);
      forward(mySize*.5);
      turnLeft(180);
      forward(mySize*.5);
      turnRight(45);
      forward(mySize*.5);
              
   }
   public void drawShape()
   {
      drawPetals();
      drawStem();
   }
}