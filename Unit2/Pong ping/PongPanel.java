
//A Project by Allen Nguyen and Nathan Suh

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.JOptionPane;
public class PongPanel extends JPanel 
{
   private static final int FRAME = 600;
   private static final Color BACKGROUND = new Color(0,0,0); //black background but no racism
   private BufferedImage myImage;
   private Graphics myBuffer;
   private Ball ball;
   
   private Circle trail1;
   private Circle trail2;
   private Circle trail3; //these make up the trail of the ball
   private Circle trail4;
   private Circle trail5;
   private Circle trail6;

   private Bumper b1;
   private Bumper b2;
   private Timer t; 
  
   private int hits1;
   private int hits2;
   private int n; //this is what the joptionpane for single/multi is stored in
   private int m; //this is where spectate or play is stored in
   private int hold;//placeholder, carry stuff between classes
   private int hit; //point length
   private boolean pause;
  
   
   
   
    
   public PongPanel()
   {
      Object[] options = {"Multiplayer","Singleplayer"};
      n = JOptionPane.showOptionDialog(null,    //syntax: frame, dialog, paneltitle, buttontype, dialog, icon, array of names, default button name
         "Choose your gamemode.",
         "lots of pong, no ping tho",//lol
         JOptionPane.YES_NO_OPTION,
         JOptionPane.QUESTION_MESSAGE, //joptionpane for multiplayer or singleplayer
         null, options, options[0]); 
      if(n==JOptionPane.NO_OPTION){
         Object[] options2 = {"Play","Spectate"};
         m = JOptionPane.showOptionDialog(null,    //syntax: frame, dialog, paneltitle, buttontype, dialog, icon, array of names, default button name
            "Choose your gamemode.",
            "lots of pong, no ping tho",//lol
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, //joptionpane for spectate 2 bots or no
            null, options2, options2[0]); 
         if(m==JOptionPane.NO_OPTION)
            JOptionPane.showMessageDialog(null, "Click on the panel to change the ball's movement!");
      }
   
   
   
      
      myImage = new BufferedImage(800, FRAME, BufferedImage.TYPE_INT_RGB);
      myBuffer = myImage.getGraphics();
      myBuffer.setColor(BACKGROUND);//buffered image
      myBuffer.fillRect(0, 0, 800,FRAME);
      
      ball = new Ball(200,200,20,Color.WHITE);
      
      trail1=new Circle();
      trail2=new Circle(); //trail of the ball's path.
      trail3=new Circle();
      trail4=new Circle();
      trail5=new Circle();
      trail6=new Circle();
      
      trail1.setDiameter(20);
      trail2.setDiameter(17); //size of trail thins out towards the end
      trail3.setDiameter(14);
      trail4.setDiameter(11);
      trail5.setDiameter(8);
      trail6.setDiameter(5);
      
      ball.setdx((int)(Math.random()*(10+10)-10));
      ball.setdy((int)(Math.random()*(10+10)-10)); //instantiate everything, prepare stuff
      if(m==JOptionPane.NO_OPTION) {
         ball.setdx((int)(Math.random()*(30+30)-30));
         ball.setdy((int)(Math.random()*(30+30)-30)); }
      b1 = new Bumper(760,150,30,100, Color.WHITE);
      b2 = new Bumper(20,150,30,100, Color.WHITE);
      hold =b2.getHeight()/2;
      
      addMouseListener(new Mouse());
      addKeyListener(new Key());
      setFocusable(true); //preparing listener
      
      t = new Timer(20, new Listener());
      t.start();
     
   }
   public void paintComponent(Graphics g)
   {
      g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
   }
   private void reset() 
   {
      if(ball.getX()>=800){
         ball.setX(400);
         ball.setY(300);//if the ball goes past the edge, reset ball in middle
         hits1++;
         ball.setdx((int)(Math.random()*(10+10)-10));
         ball.setdy((int)(Math.random()*(10+10)-10));
         ball.setFlash(ball.getFlash()+1); //changes color whenever the ball bounces
         pause = true;
      }
         
      
      if(ball.getX()<0){
         ball.setX(400);//if the ball goes past the edge, reset ball in middle
         ball.setY(300);
         hits2++;
         ball.setdx((int)(Math.random()*(10+10)-10));
         ball.setdy((int)(Math.random()*(10+10)-10));
         ball.setFlash(ball.getFlash()+1); //changes color whenever the ball bounces
         pause = true;
      }
   
               
   }
   private void ballTrail(Ball b){
      
      trail1.setColor(b.getColor());
      trail2.setColor(b.getColor());
      trail3.setColor(b.getColor());
      trail4.setColor(b.getColor()); //make sure trail is same color as ball
      trail5.setColor(b.getColor());
      trail6.setColor(b.getColor());
      
      trail6.setX(trail5.getX()); //the former coordinates of the ball gets passed down 
      trail6.setY(trail5.getY()); //to each "trail" object
      trail5.setX(trail4.getX());
      trail5.setY(trail4.getY());
      trail4.setX(trail3.getX());
      trail4.setY(trail3.getY()); //set coordinates of each circle in the trail
      trail3.setX(trail2.getX());
      trail3.setY(trail2.getY());
      trail2.setX(trail1.getX());
      trail2.setY(trail1.getY());
      trail1.setX(b.getX());             //jesus christ use arrays you dumbass
      trail1.setY(b.getY());
        
      trail1.draw(myBuffer);
      trail2.draw(myBuffer);
      trail3.draw(myBuffer); //draw ball
      trail4.draw(myBuffer);
      trail5.draw(myBuffer);
      trail6.draw(myBuffer);
   }
   
   private void bot(Bumper b, Ball ball){ //this is the entire algorithm for a bot
      int middle = b.getY()+hold;
      if(b.getX()==760 && ball.getX()>=400) {
         if(middle>=ball.getY() && middle-20>=ball.getY()){ //if a set area on the bumper is below ball
         
            if(b.getY()>=0){ //is bumper inside panel?
            
               b.setY(b.getY()-20); //bumper moves up   
            }                                    
         } else if(middle<=ball.getY() && middle-20<ball.getY()) { //if a set area on the bumper is above ball
         
            if(b.getY()+b.getHeight()<=600){ //is bumper inside panel?
            
               b.setY(b.getY()+20); //bumper moves down
            }                             
         } else { //if the bumper is already at the y of ball, do nothing
         } 
      } else if (b.getX()==20 && ball.getX()<=400) {
         if(middle>=ball.getY() && middle-20>=ball.getY()){ //if a set area on the bumper is below ball
         
            if(b.getY()>=0){ //is bumper inside panel?
            
               b.setY(b.getY()-20); //bumper moves up   
            }                                    
         } else if(middle<=ball.getY() && middle-20<ball.getY()) { //if a set area on the bumper is above ball
         
            if(b.getY()+b.getHeight()<=600){ //is bumper inside panel?
            
               b.setY(b.getY()+20); //bumper moves down
            }                             
         } else { //if the bumper is already at the y of ball, do nothing
         } 
      } else {
         if(middle>=ball.getY() && middle-20>=ball.getY()){ //if a set area on the bumper is below ball
         
            if(b.getY()>=0){ //is bumper inside panel?
            
               b.setY(b.getY()-5); //bumper moves up   
            }                                    
         } else if(middle<=ball.getY() && middle-20<ball.getY()) { //if a set area on the bumper is above ball
         
            if(b.getY()+b.getHeight()<=600){ //is bumper inside panel?
            
               b.setY(b.getY()+5); //bumper moves down
            }                             
         } else { //if the bumper is already at the y of ball, do nothing
         } 
      }
   }
   private class Mouse extends MouseAdapter {
      public void mousePressed(MouseEvent e) {
         if(e.isMetaDown())
         {
            ball.setColor(Color.BLACK.darker());
         
         } else {
         
            ball.setdx(Math.random() * (25 + 25)-25);
            ball.setdy(Math.random() * (25 + 25)-25); //spicy 
         }             
      }
   }
   private class DelayListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         int lmao = 1337;
      }
   }

   private class Key extends KeyAdapter {
      public void keyPressed(KeyEvent e) {
         if((n==JOptionPane.YES_OPTION || n==JOptionPane.NO_OPTION) && m==JOptionPane.YES_OPTION){ //this just checks for the gamemode
            if(e.getKeyCode()==KeyEvent.VK_DOWN)
               if(b1.getY()+b1.getHeight()<=600)
                  b1.setY(b1.getY()+20);     //player controls
            if(e.getKeyCode()==KeyEvent.VK_UP)
               if(b1.getY()>=0)
                  b1.setY(b1.getY()-30);
         }
         if(n==JOptionPane.YES_OPTION){
            if(e.getKeyCode()==KeyEvent.VK_S)
               if(b2.getY()+b2.getHeight()<=600)
                  b2.setY(b2.getY()+20);  //multiplayer control
            if(e.getKeyCode()==KeyEvent.VK_W)
               if(b2.getY()>=0)
                  b2.setY(b2.getY()-30);
         }
         
      } 
   }   


   private class Listener implements ActionListener   {
   
      public void actionPerformed(ActionEvent e) 
      {
      // if(pause==true){
            // pause=false;
            // try{
               // Thread.sleep(4000);
            // }catch(Exception f){            //cant figure out how to pause
               // System.exit(0);
            // }
         // }
      
         myBuffer.setColor(Color.BLACK);
         myBuffer.fillRect(0,0,800,FRAME);
         myBuffer.setColor(Color.white);
         for(int n=0; n<=600; n+= 30){
            myBuffer.fillRect(399,n,2,30); }
                 
         int middle = (b2.getY()+hold); //this is the y of the center of the bumper
         int middle1= (b1.getY()+hold);
         
         
         
         if(n==JOptionPane.NO_OPTION && m==JOptionPane.YES_OPTION){  //singleplayer algorithm
            bot(b2, ball);
         }
         
         if(n==JOptionPane.NO_OPTION && m==JOptionPane.NO_OPTION) {
            bot(b2, ball);//see above code for explanation
            bot(b1, ball);        
         }
                  
         b1.draw(myBuffer);
         b2.draw(myBuffer);
         
         if(ball.getdx()>=-3 && ball.getdx()<=3)
            ball.setdx(Math.random() * (25 + 25)-25);
         
         
         ball.move(800,FRAME);
         
         ball.disco(); //makes ball change colors, look at ball class to see it          
         
         
         BumperCollision.collide(b1, ball,m,hit);
         BumperCollision.collide(b2, ball,m,hit);
         
                 
         ballTrail(ball);
         
         ball.draw(myBuffer);
         reset();
           
         myBuffer.setColor(Color.WHITE);
         myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
         myBuffer.drawString("PLAYER1 SCORE: "+hits1, 20,25);
         myBuffer.drawString("PLAYER2 SCORE: "+hits2, 520,25);
         //myBuffer.drawString("Point Length: "+hit, 280,580); cant figure out how to detect a hit from bumper collision
         repaint();
         
      }
   }   
   private void collide(Ball b, Polkadot pd)
   {
      double d = distance(b.getX(), b.getY(), pd.getX(), pd.getY());  
      if(d<=ball.getRadius()+pd.getRadius()){
         hits1++;
         pd.jump(FRAME,FRAME);
      }
   }
   private void bounce(Ball a, Ball b) {
      double d = distance(b.getX(), b.getY(), a.getX(), a.getY());
      if(d<=b.getRadius()+a.getRadius()){
         b.setdx(b.getdx()*-1);
         b.setdy(b.getdy()*-1); //dont worry about this, this is some stuff i set, just incase if there are 2 balls
         a.setdx(a.getdx()*-1);
         a.setdy(a.getdy()*-1);
      }
   }
      
   
   private double distance(double x1, double y1, double x2, double y2)
   {
      double a =Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
      return a; 	 //l33l
   }
}
 


