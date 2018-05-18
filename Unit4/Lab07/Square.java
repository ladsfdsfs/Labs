public class Square extends Rectangle {
   private double myHeight, myWidth;
   public Square(double h) { 
      super(h,h);
      myHeight=h;
      myWidth=h;
   }
   public double findArea()
   {
      return (myHeight*myHeight);
   }
		
   public void setSide(double h) {
      myHeight = h;
      myWidth = h;
   }
         
      
   public double getSide() {
      return myWidth; }
      
            
   public double findPerimeter() {
      return (myHeight*4);
   }

      

}

