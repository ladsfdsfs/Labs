//allen nguyen sept 6, 2017
//yeet

import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class Lab02
{
   public static void main(String[] args)
   {
      Display.openWorld("maps/maze.map");
      Display.setSize(8, 8);
      Display.setSpeed(1);
      
      Athlete usainBolt = new Athlete();
      
      usainBolt.move();
      usainBolt.putBeeper();
      usainBolt.turnRight();
      usainBolt.move();
      usainBolt.putBeeper();
      usainBolt.turnRight();
      usainBolt.move();
      usainBolt.putBeeper();
      usainBolt.turnLeft();
      usainBolt.move();
      usainBolt.putBeeper();
      usainBolt.turnLeft();
      usainBolt.move();
      usainBolt.putBeeper();
      usainBolt.turnRight();
      usainBolt.move();
      usainBolt.putBeeper();
      usainBolt.move();
      usainBolt.putBeeper();
      usainBolt.turnRight();
      usainBolt.move();
      usainBolt.putBeeper();
      usainBolt.turnLeft();
      usainBolt.move();
      usainBolt.putBeeper();
      usainBolt.move();
      usainBolt.putBeeper();
      usainBolt.turnLeft();
      usainBolt.move();
      usainBolt.putBeeper();
      usainBolt.move();
      usainBolt.putBeeper();
      usainBolt.move();
      usainBolt.putBeeper();
      usainBolt.move();
      usainBolt.putBeeper();
      usainBolt.turnRight();
      usainBolt.move();
      usainBolt.putBeeper();
      
   }
}