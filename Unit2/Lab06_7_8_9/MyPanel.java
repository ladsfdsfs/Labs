import javax.swing.*;
import java.awt.*;  
import java.awt.image.BufferedImage;
public class MyPanel extends JPanel {

   private final int N = 400;
   private BufferedImage myImage;
   public MyPanel() {
      myImage = new BufferedImage(N, N, BufferedImage.TYPE_INT_RGB);
      Graphics buffer = myImage.getGraphics();
      buffer.setColor(Color.WHITE);
      buffer.fillRect(0,0,N,N);
}
 public void paintComponent(Graphics g)
      {
         g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
      }

}