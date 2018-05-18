// Name: 				Date:

   import java.awt.*;
   
    public class Bumper
   {
    //private fields, all ints, for a Bumper
    //hint: the "location" of the bumper begins at its top left corner.      
	 
      private int myX;
      private int myY;
      private int myHeight;
      private int myWidth;
      private int myYCenter;
      private Color myColor;
      
   
     //constructors
       public Bumper()         //default constructor
      {
      myX=150;
      myY=150;
      myHeight=50;
      myWidth=50;
      myColor=Color.BLUE;
      myYCenter=myY-myHeight;
      
      }
       public Bumper(int x, int y, int w, int h, Color c)
      {
      myX=x;
      myY=y;
      myHeight=h;
      myWidth=w;
      myColor=c;
       myYCenter=myY-myHeight;
      
      }
      
     // accessor methods  (one for each field)
     public int getX(){return myX;} public int getY(){return myY;}  public int getHeight(){return myHeight;} public int getWidth(){return myWidth;} public Color getColor(){return myColor;} public int getYCenter() {return myYCenter;}
     // modifier methods  (one for each field)
     public void setX(int x){myX=x;}public void setY(int x){myY=x;}public void setHeight(int x){myHeight=x;}public void setWidth(int x){myWidth=x;} public void setColor(Color x){myColor=x;}
     // instance methods
     // chooses a random (x,y) location.  Bumper stays entirely in the window.
        public void jump(int rightEdge, int bottomEdge)
      {
         // moves location to random (x, y) within the edges
      myX = (int)(Math.random()* (rightEdge-myWidth) + myWidth);
      myY = (int)(Math.random()* (bottomEdge-myHeight) + myHeight);
      }
      
       // draws a rectangular bumper on the buffer
       public void draw(Graphics myBuffer) 
      {
         myBuffer.setColor(getColor());
         myBuffer.fillRect(getX(), getY(), getWidth(), getHeight());
      }   
   	// returns true if any part of the polkadot is inside the bumper
       public boolean inBumper(Polkadot dot)
      {
         for(int x = getX(); x <= getX() + getWidth(); x++)   //starts at upper left corner(x,y)
            for(int y = getY(); y <= getY() + getHeight(); y++)
               if(distance(x, y, dot.getX(), dot.getY()) <= dot.getRadius() ) //checks every point on the bumper
                  return true;            
         return false;
      }  
      // returns distance between (x1, y1) and (x2, y2)
       private double distance(double x1, double y1, double x2, double y2)
      {
         return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
      }	
   }
