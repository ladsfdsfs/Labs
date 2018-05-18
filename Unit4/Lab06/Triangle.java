public class Triangle extends Shape {
   private double myS;
   public Triangle(double w) { 
      myS = w;
   
   }
   public double findArea()
   {
      return ( (Math.sqrt(3)/4)*Math.pow(myS, 2) );
   }
		
   public void setSide(double h) {
      myS = h;
   }
      
   public double getSide() {
      return  myS; }
      
   public double findPerimeter() {
      return ( myS*3);
   }
   public double findHeight() {
   return ((Math.sqrt(3)/2)*myS);
   }

      

}

