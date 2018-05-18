public class Cube extends Square {
   private double myHeight, myWidth;
   public Cube(double h) { 
      super(h);
      myHeight = h;
      myWidth = h;                                      
   
   }
   public double findArea()
   {
      return (myHeight*myWidth*6);
   }
		
   public void setSide(double h) {
      myHeight = h;
      myWidth = h;
   }
         
      
   public double getSide() {
      return myWidth; }
      
            
   public double findVolume() {
      return Math.pow(myWidth,3); }
      

}

