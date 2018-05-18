//allen nguyen oct 27 2017
//yeet

import javax.swing.*;
import java.awt.*;

public class Panel02 extends JPanel {
   public void paintComponent(Graphics g){
   
      g.setColor(new Color(195, 8, 8));
      g.fillRect(0,0,600,600);
      
      ImageIcon stalin = new ImageIcon("stalin.jpg");
      g.drawImage(stalin.getImage(), 180, 110, 230,300,null);
      
      ImageIcon lenin = new ImageIcon("FOR THE MOTHERLAND.png");
      ImageIcon proleteriat = new ImageIcon("FOR THE MOTHERLAND.png");
      g.drawImage(lenin.getImage(), 489,240,95,100,null);
      g.drawImage(proleteriat.getImage(),10,240,95,100,null);
      
      g.setColor(Color.YELLOW.darker());
      g.setFont(new Font("Arial", Font.PLAIN,20));
      g.drawString("sieze the day?",240,500);
      g.drawString("more like sieze the means of production",110,550);
      g.setColor(new Color(249, 223, 49));
      int a;
      for (a=130; a<=400; a+=60)
         g.fillOval(a,55,75,50);
      for (a=60; a<=450; a+=50)
         g.fillOval(115,a,40,65);
      for (a=130; a<=400; a+=60)
         g.fillOval(a,420,75,50);
      for (a=60; a<=450; a+=50)
         g.fillOval(435,a,40,65);
      
      g.setColor(new Color(104, 63, 2));
      
      g.fillRect(140,80,310,40);
      g.fillRect(140,100,40,340);
      g.fillRect(410,100,40,340);
      g.fillRect(140,400,310,40);
      
   
   }
}
