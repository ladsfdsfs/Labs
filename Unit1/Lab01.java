import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab01
{
   public static void main(String[] args)
   {
      Display.openWorld("maps/school.map");
      Display.setSize(10, 10);
      Display.setSpeed(10);
      
                      
      
     Robot ar[] = new Robot[5];
     ar[1]=  new Robot(4,5,Display.SOUTH,0);
    ar[2]=new Robot(1,1,Display.EAST,0);
      
      ar[2].move();
      ar[1].move();
      ar[].move();
      
   }
}






      
      
