//allen nguyen sept 20 2017
//yeet

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class StepClimber extends Climber {
   public StepClimber(int x) {
      super(x);
   }
   public StepClimber() {
      super();
   }
   public void climbUpRight(){
      turnLeft();
      move();
      turnRight();
      move();
   }
   public void climbUpLeft(){
      turnRight();
      move();
      turnLeft();
      move();
   }
   public void climbDownRight() {
      move();
      turnRight();
      move();
      turnLeft();
   }
   public void climbDownLeft() {
      move();
      turnLeft();
      move();
      turnRight();
   }

}