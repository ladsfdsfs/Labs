//allen nguyen sept 11 2017
//yeet


import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab04
{
   public static void takeTheField(Athlete arg)
   {
      arg.move();
      arg.move();
      arg.move();
      arg.move();
      arg.turnRight();
      arg.move();
      arg.move();
      
   }
   public static void main(String[] args)
   {
      Display.openWorld("maps/arena.map");
      Display.setSize(10, 10);
      Display.setSpeed(8);
      int a;
      
      Athlete neuer = new Athlete();
      Athlete pepe = new Athlete();
      Athlete suarez = new Athlete();
      Athlete messi = new Athlete();
      Athlete neymar = new Athlete();
      Athlete pique = new Athlete();
      Robot valverde = new Robot(2, 7, Display.EAST, 0);
      
      takeTheField(neuer);
      takeTheField(pepe);
      takeTheField(suarez);
      takeTheField(messi);
      takeTheField(neymar);
      takeTheField(pique);
      
      
      for(a=1; a<=3; a++)
         neuer.move();
      neuer.turnLeft();
      neuer.move();
      neuer.move();
      neuer.turnAround();
      
      for(a=1; a<=5; a++)
      pepe.move();
      pepe.turnLeft();
      pepe.move();
      pepe.turnAround();
      
      for(a=1; a<=4; a++)
         suarez.move();
      suarez.turnRight();
      
      for(a=1; a<=3; a++)
         messi.move();
      messi.turnRight();
      
      neymar.move();
      neymar.move();
      neymar.turnRight();
      
      pique.move();
      pique.turnLeft();
      pique.move();
      pique.turnAround();
   }
}
      
      
