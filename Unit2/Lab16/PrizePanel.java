   //Name:    Date:
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
public class PrizePanel extends JPanel
{
   private static final int FRAME = 400;
   private static final Color BACKGROUND = new Color(204, 204, 204);
   private BufferedImage myImage;
   private Graphics myBuffer;
   private Ball ball;
   private Polkadot pd;
   private Timer t; 
   private int hits;
   
    
   public PrizePanel()
   {
      myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
      myBuffer = myImage.getGraphics();
      myBuffer.setColor(BACKGROUND);
      myBuffer.fillRect(0, 0, FRAME,FRAME);
      int xPos = (int)(Math.random()*(FRAME-100) + 50);
      int yPos = (int)(Math.random()*(FRAME-100)+ 50);
      ball = new Ball(200,200,50,Color.BLACK);
      ball.setdx((int)(Math.random()*(17+17)-17));
      ball.setdy((int)(Math.random()*(17+17)-17));
      pd = new Polkadot(20,100,30,Color.BLUE);
      addMouseListener(new Mouse());
      t = new Timer(5, new Listener());
      t.start();
   }
   public void paintComponent(Graphics g)
   {
      g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
   }
   private class Mouse extends MouseAdapter {
      public void mousePressed(MouseEvent e) {
         if(e.isMetaDown()) {
            ball.setX(e.getX() );
            ball.setY(e.getY() );
         
         } else if (e.isShiftDown()) {
         
            ball.setdx(Math.random() * (25 - 1)+1);
            ball.setdy(Math.random() * (25 - 1)+1);
         
         } else {
            pd.setX(e.getX());
            pd.setY(e.getY());
         }
      }
   }
   private class Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
          
          
          
         myBuffer.setColor(BACKGROUND);
         myBuffer.fillRect(0,0,FRAME,FRAME);
                  
         ball.move(FRAME,FRAME);
         collide(ball, pd);
           
         ball.draw(myBuffer);
         pd.draw(myBuffer);
           
         myBuffer.setColor(Color.BLACK);
         myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
         myBuffer.drawString("Count: "+hits, FRAME-150,25);
         repaint();
      }
   }   
   private void collide(Ball b, Polkadot pd)
   {
      double d = distance(b.getX(), b.getY(), pd.getX(), pd.getY());  
      if(d<=ball.getRadius()+pd.getRadius()){
         hits++;
         pd.jump(FRAME,FRAME);
      }
   }
   private void bounce(Ball a, Ball b) {
      double d = distance(b.getX(), b.getY(), a.getX(), a.getY());
      if(d<=b.getRadius()+a.getRadius()){
         b.setdx(b.getdx()*-1);
         b.setdy(b.getdy()*-1);
         a.setdx(a.getdx()*-1);
         a.setdy(a.getdy()*-1);
      }
   }
      
   
   private double distance(double x1, double y1, double x2, double y2)
   {
      double a =Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
      return a; 	 // enter the calculation here.
   }
}
 


