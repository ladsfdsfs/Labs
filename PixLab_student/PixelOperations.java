//
// Torbert, 24 July 2013
//
import java.awt.Color;
import java.awt.image.BufferedImage;
//
public class PixelOperations
{
   public Color[][] getArray(BufferedImage img)
   {
      Color[][] arr;
   	//
      int numcols = img.getWidth();
      int numrows = img.getHeight();
   	//
      arr = new Color[numrows][numcols];
   	//
      for(int j = 0; j < arr.length; j++)
      {
         for(int k = 0; k < arr[0].length; k++)
         {
            int rgb = img.getRGB(k,j);
         	//
            arr[j][k] = new Color(rgb);
         }
      }
   	//
      return arr;
   }
   public void setImage(BufferedImage img, Color[][] arr)
   {
      for(int j = 0; j < arr.length; j++)
      {
         for(int k = 0; k < arr[0].length; k++)
         {
            Color tmp = arr[j][k];
            //
            int rgb = tmp.getRGB();
            //
            img.setRGB(k,j,rgb);
         }
      }
   }
   //
	/**********************************************************************/
	//
	// pixel operations
	// 
   public void zeroBlue(Color[][] arr)
   {
      for(int j = 0; j < arr.length; j++)
      {
         for(int k = 0; k < arr[0].length; k++)
         {
            Color tmp = arr[j][k];
            arr[j][k] = new Color( tmp.getRed(), tmp.getGreen(), 0 );
         }
      }
   }
	//--------> your new methods go here   <--------------
   
   public void negate(Color[][] arr) {
      for(int j = 0; j < arr.length; j++)
      {
         for(int k = 0; k < arr[0].length; k++)
         {
            Color tmp = arr[j][k];
            arr[j][k] = new Color( 255-tmp.getRed(), 255-tmp.getGreen(), 255-tmp.getBlue() );
         }
      }
   
   }
   public void gray(Color[][] arr){
      int avg;
      for(int j = 0; j < arr.length; j++)
      {
         for(int k = 0; k < arr[0].length; k++)
         {
            Color tmp = arr[j][k];
            avg = (tmp.getRed()+tmp.getGreen()+tmp.getBlue())/3;
            arr[j][k] = new Color( avg, avg, avg );
         }
      }
   
   }
   
   public void sepia(Color[][] arr){
      int r;
      int g;
      int b;
      for(int j = 0; j < arr.length; j++)
      {
         for(int k = 0; k < arr[0].length; k++)
         {
            
            Color tmp = arr[j][k];
            r=(int)(tmp.getRed()*.393+tmp.getGreen()*.769+tmp.getBlue()*.189);
            g=(int)(tmp.getRed()*.349+tmp.getGreen()*.686+tmp.getBlue()*.168);
            b=(int)(tmp.getRed()*.131+tmp.getGreen()*.272+tmp.getBlue()*.534);
            if(r>255)r=255; 
            if(g>255)g=255;
            if(b>255)b=255;
            arr[j][k] = new Color( r,g,b );
         }
      }
   
   }
   
   public void blur(Color[][] arr){
      int avgR;
      int avgG;
      int avgB;
      int length = arr.length-1;
      int length1 = arr[0].length;
      for(int r = 0; r < arr.length; r++)
      {
         Color tmpT = arr[r][0];
         Color tmpB = arr[r][0];
         Color tmpR = arr[r][1];
         avgR = (tmpT.getRed()+tmpB.getRed()+tmpR.getRed())/4;
         avgG = (tmpT.getGreen()+tmpB.getGreen()+tmpR.getGreen())/4;
         avgB = (tmpT.getBlue()+tmpB.getBlue()+tmpR.getBlue())/4;
         arr[r][0]=new Color( avgR, avgG, avgB );
      }
    
   
   
      
      for(int j = 1; j < arr.length-1; j++)
      {
         for(int k = 1; k < arr[0].length-1; k++)
         {  
            Color tmpL = arr[j][k-1];
            Color tmpT = arr[j-1][k];
            Color tmpR = arr[j][k+1];
            Color tmpB = arr[j+1][k];
            
            avgR = (tmpL.getRed()+tmpR.getRed()+tmpT.getRed()+tmpB.getRed())/4;
            avgG = (tmpL.getGreen()+tmpR.getGreen()+tmpT.getGreen()+tmpB.getGreen())/4;
            avgB = (tmpL.getBlue()+tmpR.getBlue()+tmpT.getBlue()+tmpB.getBlue())/4;
            arr[j][k] = new Color( avgR, avgG, avgB );
         }
      }
   
   }
   
   public void posterize(Color[][] arr){
      
      for(int j = 0; j < arr.length; j++)
      {
         for(int k = 0; k < arr[0].length; k++)
         {
            Color tmp = arr[j][k];
            
            arr[j][k] = new Color( ((tmp.getRed()/64)*64), ((tmp.getGreen()/64)*64), ((tmp.getBlue()/64)*64));
         }
      }
   
   }
   
public void splash(Color[][] arr){
   int avg;
      for(int j = 0; j < arr.length; j++)
      {
         for(int k = 0; k < arr[0].length; k++)
         {
            Color tmp = arr[j][k];
            if(tmp.getRed()>tmp.getBlue()+tmp.getGreen()){
            }
            else{
            avg = (tmp.getRed()+tmp.getGreen()+tmp.getBlue())/3;
            arr[j][k] = new Color( avg, avg, avg );
            }
         }
      }
   
   }
   
public void mirrorUD(Color[][] arr){
   
      for(int j = 0; j < arr.length/2; j++)
      {
         for(int k = 0; k < arr[0].length; k++)
         {
            
            arr[arr.length-j-1][k]=arr[j][k];
            
         }
      }
   
   }
   public void mirrorLR(Color[][] arr){
   
      for(int j = 0; j < arr.length; j++)
      {
         for(int k = 0; k < arr[0].length/2; k++)
         {
            
            arr[j][arr[0].length-1-k]=arr[j][k];
            
         }
      }
   
   }

   /*
public void gray(Color[][] arr){
   int avg;
      for(int j = 0; j < arr.length; j++)
      {
         for(int k = 0; k < arr[0].length; k++)
         {
            Color tmp = arr[j][k];
            avg = (tmp.getRed()+tmp.getGreen()+tmp.getBlue())/3;
            arr[j][k] = new Color( avg, avg, avg );
         }
      }
   
   }
*/
	
	
  
}
//
// end of file
//