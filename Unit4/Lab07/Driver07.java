import java.io.*;
import java.util.*;


public class Driver07 {
   public static int random(int min, int max){
      return (int)(Math.random()*(max-min)+min);
   }
   public static double random(double min, double max){
      return (Math.random()*(max-min)+min);
   }

   public static void main(String[] args ){
      try{
         System.setOut(new PrintStream(new FileOutputStream("output.txt")));
      }catch(FileNotFoundException e){System.exit(0);}
      Shape[] array = new Shape[random(10,50)];
      int a=0;
      double b=0;
      for(int x=1;x<=array.length-1;x++){
         a=random(0,5);
         b=random(5.0,150.0);
         switch(a) {
            case 0: array[x-1]=new Circle(b);
               break;
            case 1: array[x-1]=new Cube(b);
               break;
            case 2: array[x-1]=new Rectangle(b,random(5.0,150.0));
               break;
            case 3: array[x-1]=new Square(b);
               break;
            case 4: array[x-1]=new Trapezoid(random(5.0,150.0),random(5.0,150.0),b);
               break;
            case 5: array[x-1]=new Triangle(b);
               break;
         }
      }
      System.out.println("Shapes\n---------");
      for(int x=0;x<=array.length-2;x++){
         System.out.println("area = "+array[x].findArea()+"\t"+array[x]);
      }
   
   
   
   }
}