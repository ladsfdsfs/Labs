//allen nguyen wed oct 25 2017
//yeet

import javax.swing.*;
import java.awt.*;

public class Panel01 extends JPanel {
   public void paintComponent(Graphics g){
   
      g.setColor(new Color(99, 218, 255));
      g.fillRect(0,0,400,400);
      g.setColor(Color.GREEN.darker());
      g.fillRect(0,350,400,350);
      g.setColor(Color.WHITE);
      g.fillRect(100,200,150,150);
      g.setColor(Color.BLACK);
      g.fillRect(150,275,50,75);
      
      g.setColor(new Color(255, 197, 98));
      g.fillOval(340,240,30,30);
      g.setColor(Color.BLACK);
      g.fillRect(340,274,30,80);
      
      g.setColor(Color.BLACK);
      int xxPoints[] = {0,100,100};
      int yyPoints[] = {250,250,200};
      g.fillPolygon(xxPoints, yyPoints, 3);
   
      int xPoints[] = {175,275,75};
      int yPoints[] = {150,200,200};
      
      g.setColor(Color.BLACK);
      g.fillPolygon(xPoints, yPoints, 3);
      
      g.setColor(Color.WHITE);
      int xaPoints[] = {365,347,360};
      int yaPoints[] = {275,275,300};
      g.fillPolygon(xaPoints, yaPoints, 3);
      
      g.setColor(Color.YELLOW);
      int xxxPoints[] = {340,370,370};
      int yyyPoints[] = {250,250,230};
      g.fillPolygon(xxxPoints, yyyPoints, 3);
   
      
      g.setColor(Color.RED);
      g.fillRect(357,272,3,25);
   
      g.setColor(Color.YELLOW);
      g.fillOval(300,75,50,50);
   
      g.setColor(Color.RED);
      g.drawString("donald drumpf and his new house, the white house", 50,40);
      g.setColor(Color.WHITE);
      g.fillRect(0,250,100,100);
      
   
      g.setColor(Color.WHITE);
      int a;
      for (a=0; a<=700; a+=80){
         g.fillOval(a,50,100,25);
      }
      g.setColor(Color.BLACK);
      for (a=0;a<1000; a+=10)
         g.drawRect(a,300,20,100);
         
      g.setColor(Color.BLUE);
      g.fillRect(110,220,40,40);
      g.fillRect(200,220,40,40);
      
      
   }}