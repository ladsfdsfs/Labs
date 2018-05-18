//allen nguyen sept 13 2017
//yeet

import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;


public class Lab05
{
   public static void runTheRace(Racer arg){
   
   arg.shuttle(2,7);
   arg.shuttle(4,5);
   arg.shuttle(6,3);
   }
   public static void main(String[] args)
   {
      Display.openWorld("maps/shuttle.map");
      Display.setSize(10, 10);
      Display.setSpeed(10);
      
      Racer jeffgordon = new Racer(1);
      Racer usainbolt = new Racer(4);
      Racer sanic = new Racer(7);
      //*darude sandstorm starts playing*
      
      jeffgordon.move();
      usainbolt.move();
      sanic.move();
      runTheRace(jeffgordon);
      runTheRace(usainbolt);
      runTheRace(sanic);
    }
}
      
      
      