//Name:              Date:
import java.awt.*;
import javax.swing.*;
public class Stalin extends Ball
{
  
   public void draw(Graphics myBuffer){
    ImageIcon stalin = new ImageIcon("stalin copy.jpg");
    myBuffer.drawImage(stalin.getImage(), ((int)(getX() - getRadius())), (int)(getY()-getRadius()), 50,50,null);

   }
    
 /*  public void move(double rightEdge, double bottomEdge)
   {
      setX(getX()+ dx);  
      setY(getY()+dy);                // move horizontally
        
      if(getX() >= rightEdge - getRadius()){  //hit right edge
         setX(rightEdge - getRadius());
         dx = dx * -1; 
      }
      if(getY() >= bottomEdge - getRadius())  {
         setY(bottomEdge - getRadius());
         dy = dy * -1; 
      }
      if(getY() <= 0+getRadius()) {
         setY(0+getRadius());
         dy=dy*-1;
      }
      if(getX() <= 0+getRadius()){
         setX(0+getRadius());
         dx=dx*-1;}
                     
 
   } */
}