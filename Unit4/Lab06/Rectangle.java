/*****************************************************************
	* A Rectangle is a Shape that maintains information about its width. A Rectangle
	* knows how to return both its height and with, set its height and width, calculate and return its 
	* height and width, and calculate and return its perimeter.
	 
	* @author Allen Nguyen
	* @version  2.16.2018
	****************************************************************/

public class Rectangle extends Shape {
   private double myHeight, myWidth;
/************************************************************* 
* Constructs a Rectangle with initial width and height specified by w and h.
* @param h    initial height
* @param w    initial width
 **************************************************************/
   public Rectangle(double h, double w) { 
      myHeight = h;
      myWidth = w;
   
   }
  
      /***************************************************************
   	* Calculates and returns the rectangle's area.
   	* @return	 area
   	**************************************************************/

   public double findArea()
   {
      return (myHeight*myWidth);
   }
   /***************************************************************
   	* Sets the height to the input number.
   	* @param h	 assigns h to myHeight
   	**************************************************************/
   public void setHeight(double h) {
      myHeight = h;
   }
   /***************************************************************
   	* Sets the width to the input number.
   	* @param w	 assigns w to myWidth
   	**************************************************************/

   public void setWidth(double w) {
      myWidth = w;
   }
   /*************************************************************** 
   	* Returns the rectangle's width
   	* @return	 myWidth
   	**************************************************************/
     
   public double getWidth() {
      return myWidth; }
 /*************************************************************** 
   	* Returns the rectangle's height
   	* @return	 myHeight
   	**************************************************************/

   public double getHeight() {
      return myHeight; }
   /**************************************************************
   	* Calculates and returns the rectangle's height.
   	* @return	 myHeight
   	**************************************************************/

   public double findPerimeter() {
      return (myHeight*2+myWidth*2);
   }
   /**************************************************************
   	* Calculates and returns the rectangle's diagonal.
   	* @return	 (Math.pow(myHeight, 2) +Math.pow(myWidth, 2))
   	**************************************************************/

   public double findDiagonal() {
   return (Math.pow(myHeight, 2) +Math.pow(myWidth, 2));
   }   
      

}

