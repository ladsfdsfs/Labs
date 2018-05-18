    //Torbert, e-mail: smtorbert@fcps.edu	
	 //version 6.17.2003
	 //version 11.4.09  mlbillington@fcps.edu
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
public class BugPanel extends JPanel
{
   private BufferedImage myImage;
   final int N = 400;
   public BugPanel()
   {
      myImage = new BufferedImage(N, N, BufferedImage.TYPE_INT_RGB);
      Graphics buffer = myImage.getGraphics();
      buffer.setColor(Color.BLUE);
      buffer.fillRect(0, 0, N, N);
      buffer.setColor(Color.YELLOW);
      
      Bug memz = new Bug(0,0);
      Bug goggle = new Bug(400,0);
      Bug codered = new Bug(0,400);
      Bug stuxnet = new Bug(400,400);
         
      while(!codered.sameSpot(memz) || !codered.sameSpot(stuxnet) 
      || !codered.sameSpot(goggle) || !memz.sameSpot(stuxnet) 
      || !memz.sameSpot(goggle) || !stuxnet.sameSpot(goggle)) {
      
         memz.walkTowards(goggle,.10);
         
         buffer.drawLine(memz.getX(),memz.getY(),
         goggle.getX(),goggle.getY());
         
         goggle.walkTowards(stuxnet,.1);
         
         buffer.drawLine(goggle.getX(),goggle.getY(),
         stuxnet.getX(),stuxnet.getY());
         
         stuxnet.walkTowards(codered,.10);
         
         buffer.drawLine(stuxnet.getX(),stuxnet.getY(),
         codered.getX(),codered.getY());
         
         codered.walkTowards(memz,.10);
         
         buffer.drawLine(codered.getX(),codered.getY(),
         memz.getX(),memz.getY());
      } 
   }
   public void paintComponent(Graphics g)
   {
      g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
         
   }
}