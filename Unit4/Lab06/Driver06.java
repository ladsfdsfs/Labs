   //Name______________________________ Date_____________
   import java.io.*;
    public class Driver06
   {
       public static void main(String[] args) throws Exception
      {
         System.setOut(new PrintStream(new FileOutputStream("output.txt")));
      
      //create the objects
         Circle c = new Circle(75);
         Rectangle r = new Rectangle(30.0, 40.);    
         Square s = new Square(50.0);			 	// remove the comment slashes 	
      	Triangle t = new Triangle(37); 
         Cube u = new Cube(25);         // when your classes are finished
         Trapezoid z = new Trapezoid(10,5,4);
      
      //test the instance methods
         System.out.println("Circle");
         System.out.println("------");
         System.out.println("Radius: " + c.getRadius());
         System.out.println("Area: " + c.findArea());
         System.out.println("Circumference: " + c.findCircumference());
         System.out.println();
      
         System.out.println("Rectangle");
         System.out.println("---------");
         System.out.println("Length: " + r.getWidth());
         System.out.println("Height: " + r.getHeight());
         System.out.println("Area: " + r.findArea());
         System.out.println("Perimeter: " + r.findPerimeter());
         System.out.println("Diagonal: " + r.findDiagonal());
         System.out.println();
         
         System.out.println("Square");
         System.out.println("------");
         	/*****************************/
         	/*                           */
         	/* Test the Square class.    */
         	/*                           */
         	/*****************************/
         System.out.println("side: " + s.getSide());
         System.out.println("area: " + s.findArea());	
         System.out.println("Perimeter: " + s.findPerimeter());
         System.out.println("Diagonal: " + s.findDiagonal());	
         s.setSide(10.0);
         System.out.println("New side: " + s.getSide());
         System.out.println("New area: " + s.findArea());	
         System.out.println(); 
      
         System.out.println("Triangle");
         System.out.println("--------");
            /*****************************/ 
         	/*                           */
         	/* Test the Triangle class.  */
         	/*                           */
         	/*****************************/
         System.out.println("New side: " + t.getSide());
         System.out.println("New area: " + t.findArea());
         System.out.println("Perimeter: "+ t.findPerimeter());
         
         
         System.out.println("\nCube");
         System.out.println("--------");
         System.out.println("Area: "+u.findArea());
         System.out.println("Side: "+u.getSide());
         System.out.println("Volume: "+u.findVolume());
         
         System.out.println();
         
         System.out.println("Trapezoid");
         System.out.println("--------");
         System.out.println("Area: "+z.findArea());
         System.out.println("Side1: "+z.getA());
          System.out.println("Side2: "+z.getB());
         System.out.println("Height: "+z.getH());

         
         
         
      }
   }