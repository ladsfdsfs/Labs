//Name:              Date:
import java.awt.*;
public class Ball extends Polkadot
{
   private double dx;       // pixels to move each time step() is called.
   private double dy;
   private int myFlash=1;
    // constructors
   public Ball()         //default constructor
   {
      super(200, 200, 50, Color.BLACK);
      dx = 20;//Math.random() * 15 - 6;          // to move vertically
      dy = 20;//Math.random() * 15 - 6;          // to move sideways
   }
   public Ball(double x, double y, double dia, Color c)
   {
      super(x, y, dia, c);
      dx = Math.random()* 12 - 6;
      dy = Math.random() * 12 - 6;
   }
   public void setFlash(int f){myFlash=f;}
   public int getFlash() {
      return myFlash;}
      
     //modifier methods 
   public void setdx(double x)        
   {
      dx = x;
   }
   public void setdy(double y)
   {
      dy = y;
   }
      
      //accessor methods
   public double getdx()             
   {
      return dx;
   }
   public double getdy()
   {
      return dy;
   }
      
     //instance methods
   public void move(double rightEdge, double bottomEdge)
   {
      setX(getX()+ dx);  
      setY(getY()+dy);                // move horizontally
        
           
      if(getY() >= bottomEdge - getRadius())  {
         setY(bottomEdge - getRadius());
         dy = dy * -1; 
         setFlash(myFlash++);
      }
      if(getY() <= 0+getRadius()) {
         setY(0+getRadius()); //got rid of checking for X so that we can detect if it goes off the edge
         dy=dy*-1;
         setFlash(myFlash++);
      }
                          
   }
   public void disco() {
      if(myFlash>7)
         setFlash(1);
      switch (myFlash) { //the switch statement is essentially a compact if-elseif-else, but can only check integers
         case 1: //case 1 basically means, if myFlash(in the switch statement parentheses) is 1, execute this code
            setColor(Color.BLUE);
            break; //because java is gay, we gotta break out of the switch/bitch statement when its done 
         case 2:
            setColor(Color.GREEN);
            break;
         case 3:
            setColor(Color.RED);
            break;
         case 4:                        //all this just changes the ball's color whenever it bounces
            setColor(Color.CYAN);
            break;
         case 5:
            setColor(Color.ORANGE);
            break;
         case 6:
            setColor(Color.PINK);
            break;
         case 7:
            setColor(Color.WHITE);
            break;
      }
   }
}