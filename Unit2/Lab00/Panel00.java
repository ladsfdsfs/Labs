//allen nguyen wed oct 25 2017
//yeet
import javax.swing.*;
import java.awt.*;

public class Panel00 extends JPanel {
public void paintComponent(Graphics g){
g.setColor(Color.BLUE);
g.fillRect(75,50,600,125);
g.setColor(Color.WHITE);
g.fillRect(15,400,400,100);
g.setColor(new Color(69, 69, 69));
g.fillRect(500,210,400,100);
g.setColor(Color.BLACK); 
g.setFont(new Font("Arial", Font.ITALIC, 50));
g.drawString("Cake is love", 30,480);
g.setFont(new Font("Serif", Font.BOLD, 50));
g.setColor(new Color(150, 150, 0));
g.drawString("Hello World, I like cake",100,150);
g.setFont(new Font("Monospaced", Font.PLAIN, 50));
g.setColor(Color.PINK);
g.drawString("Cake is life", 550, 290);
   g.setColor(new Color(255, 153, 20));
   g.fillRect(40,250,400,100);
   g.setColor(new Color(5, 130, 255)); 
   g.setFont(new Font("SansSerif", Font.BOLD, 50));
   g.drawString("Cake is life", 60,310);

}}