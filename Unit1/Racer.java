//allen nguyen sept 13 2017
//yeet

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Racer extends Athlete
{
   int a;
   public Racer(int y)
   {
      super(1, y, Display.EAST, Display.INFINITY);
   }
   public void jumpRight()
   {
      turnLeft();
      move();
      turnRight();
      move();
      turnRight();
      move();
      turnLeft();
   }
   public void jumpLeft()
   {
      turnRight();
      move();
      turnLeft();
      move();
      turnLeft();
      move();
      turnRight();
   }
   public void sprint(int n)
   {
      for(a=1; a<=n; a++)
      move();
   }
   public void put(int n)
   {
      for(a=1; a<=n; a++)
      putBeeper();
   }
   public void pick(int n)
   {
      for(a=1; a<=n; a++)
      pickBeeper();
   }
   public void shuttle(int spaces, int beepers)
   {
      
      jumpRight();
      sprint(spaces);
      pick(beepers);
      turnAround();
      sprint(spaces);
      jumpLeft();
      move();
      put(beepers);
      turnAround();
      move();
      
}   
}