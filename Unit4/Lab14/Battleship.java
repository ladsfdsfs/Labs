	//Name______________________________ Date_____________
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Battleship extends JPanel
{
   private JButton[][] board;
   private int[][] matrix;
   private int hits, torpedoes;
   private JLabel label;
   private JButton reset;
   public Battleship()
   {
      setLayout(new BorderLayout());
      hits = 0;
      torpedoes = 20;
      
      JPanel north = new JPanel();
      north.setLayout(new FlowLayout());
      add(north, BorderLayout.NORTH);
      label = new JLabel("Welcome to Battleship -- You have 20 torpedoes.");
      north.add(label);
      
      JPanel center = new JPanel();
      center.setLayout(new GridLayout(10,10));
      add(center, BorderLayout.CENTER);
      
      board = new JButton[10][10];
      matrix = new int[10][10];
      for(int r = 0; r < 10; r++)
         for(int c = 0; c < 10; c++)
         {
            board[r][c] = new JButton();
            board[r][c].setBackground(Color.blue);
            board[r][c].addActionListener( new Handler1(r, c) );
            center.add(board[r][c]);
            board[r][c].setOpaque(true);
         }
      
      reset = new JButton("Reset");
      reset.addActionListener( new Handler2() );
      reset.setEnabled(false);
      add(reset, BorderLayout.SOUTH);
      
      placeShip();
   }
   private void placeShip()
   {
      int coin = (int)(Math.random()*2);
      int x = (int)(Math.random()*7);
      int y = (int)(Math.random()*7);
      if(coin==0){ //vert
         final int startx = (int)(Math.random()*10);
         final int starty = y;
         matrix[starty][startx] = 1;
         matrix[starty+1][startx]=1;
         matrix[starty+2][startx]=1;
         matrix[starty+3][startx]=1;        
      } else if (coin==1) { //horiz
         final int startx=x;
         final int starty=(int)(Math.random()*10);
         matrix[starty][startx] = 1;
         matrix[starty][startx+1]=1;
         matrix[starty][startx+2]=1;
         matrix[starty][startx+3]=1;
         
      }
         
         
         
         
   }
   private class Handler1 implements ActionListener
   {
      private int myRow, myCol;
      public Handler1(int r, int c)
      {
         myRow = r;
         myCol = c;
      }
      public void actionPerformed(ActionEvent e)
      {
         if(matrix[myRow][myCol] ==1){
            board[myRow][myCol].setBackground(Color.RED);
            torpedoes--;
            hits++;
            label.setText("Hit! You have "+torpedoes+"left.");
         }else if(matrix[myRow][myCol]==0){
            board[myRow][myCol].setBackground(Color.BLACK);
            torpedoes--;
            label.setText("Miss! You have "+torpedoes+"left.");
         }
         board[myRow][myCol].setEnabled(false);
         if(hits==4){
            label.setText("You sunk my battleship!");
            for(int r=0;r<10;r++){
               for(int c=0;c<10;c++){
                  board[r][c].setEnabled(false);
               
               }
            }
            reset.setEnabled(true);
         } else if (torpedoes==0){
            for(int r=0;r<10;r++){
               for(int c=0;c<10;c++){
                  board[r][c].setEnabled(false);
                  if(matrix[r][c]==1)
                  board[r][c].setBackground(Color.GREEN);
               }
            }
            label.setText("You lost!");
            reset.setEnabled(true);
         }
      } 
   }
   private class Handler2 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         for(int r=0;r<10;r++){
            for(int c=0;c<10;c++){
               board[r][c].setEnabled(true);
               matrix[r][c]=0;
               board[r][c].setBackground(Color.BLUE);
            }
         }
         torpedoes=20;
         hits=0;
         reset.setEnabled(false);
         placeShip();
      
      }
   }
}