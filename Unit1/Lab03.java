//allen nguyen sept 8 2017
//yeet

import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class Lab03
{
   public static void main(String[] args)
   {
      Display.openWorld("maps/mountain.map");
      Display.setSize(16, 16);
      Display.setSpeed(10);
      
      Climber mallory = new Climber(8);
      Climber irvine = new Climber(8);
      
      mallory.putBeeper();
      mallory.turnRight();
      irvine.turnRight();
      mallory.move();
      irvine.move();
      mallory.climbUpRight();
      irvine.climbUpRight();
      mallory.climbUpRight();
      irvine.climbUpRight();
      mallory.climbUpRight();
      irvine.climbUpRight();
      mallory.climbDownRight();
      irvine.climbDownRight();
      mallory.climbDownRight();
      irvine.climbDownRight();
      mallory.pickBeeper();
      mallory.turnAround();
      irvine.turnAround();
      mallory.climbUpLeft();
      irvine.climbUpLeft();
      mallory.climbUpLeft();
      irvine.climbUpLeft();
       mallory.climbDownLeft();
      irvine.climbDownLeft();
       mallory.climbDownLeft();
     irvine.climbDownLeft();
       mallory.climbDownLeft();
      irvine.climbDownLeft();
      mallory.move();
      irvine.move();
      mallory.putBeeper();
      mallory.move();
      irvine.move();
      mallory.turnRight();
      mallory.move();
      mallory.explode();
      
   }
}