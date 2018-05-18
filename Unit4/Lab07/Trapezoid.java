public class Trapezoid extends Shape {
   private double myA, myB, myH;
   public Trapezoid(double a, double b, double h) {
   
      myA = a;
      myB = b;
      myH = h;
   }
   public double findArea()
   {
      return (myA+myB)*myH/2;
   }
		
   public void setB(double b) {
      myB = b;
   }
   public void setA(double a){
      myA=a;
   
   }
   public void setH(double h){
      myH=h;}
         
      
   public double getA() {
      return myA; }
   public double getB() {
      return myB; }
   public double getH() {
      return myH; }

}