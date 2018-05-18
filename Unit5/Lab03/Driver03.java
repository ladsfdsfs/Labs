public class Driver03 {
   public static void main(String[] args) {
   
      
      int[] array = new int[20];
      
      for(int a=0; a<array.length; a++)     //randomly generate array
         array[a]=(int)(Math.random()*100);
      
      //int[] array = {100,101,102,103,104,105,106,107,108,109}
      
      print(array);
      scramble(array);
      print(array);
      bubbleSort(array);
      print(array);
   
   }
   public static void print(int[] array){
      for(int a:array) 
         System.out.print(a+", ");
      System.out.println();
   }
   
   public static void swap(int[] array, int a, int b)//what are "a" and "b" for???
   {
      int temp;
      temp=array[a];
      array[a] = array[b];
      array[b]=temp;   
   }
   
   public static void scramble(int[] array){
      int x=0;
      int y=0;
      for(int a=0; a<array.length; a++) {
         x=(int)(Math.random()*array.length);
         y=(int)(Math.random()*array.length);
         swap(array,x,y);
      }
   }
   public static int findMax(int[] array, int upper) //what does "upper" do???
   {
      int maxIndex=0;
      for(int b = 0; b<=upper; b++){
         if(array[b]>array[maxIndex])
            maxIndex=b;
      }
      return maxIndex;
   }
   public static int findMin(int[] array, int upper) //what does "upper" do???
   {
      int minIndex=0;
      for(int b = 0; b<=upper; b++){
         if(array[b]<array[minIndex])
            minIndex=b;
      }
      return minIndex;
   }

   public static void sort(int[] array)
   {
      int maxPos;
      for(int k = 0; k < array.length; k++)
      {
         maxPos = findMax(array, array.length - k - 1);
         swap(array, maxPos, array.length - k - 1);
      }
   }
   public static void reverse(int[] array)
   {
      int minPos;
      for(int k = 0; k < array.length; k++)
      {
         minPos = findMin(array, array.length - k - 1);
         swap(array, maxPos, array.length - k - 1);
      }
   }

   public static void bubbleSort(int[] arr) {  
      int n = arr.length;  
      int temp = 0;  
      for(int i=0; i < n; i++){  
         for(int j=1; j < (n-i); j++){  
            if(arr[j-1] > arr[j]){  
                                 //swap elements  
               temp = arr[j-1];  
               arr[j-1] = arr[j];  
               arr[j] = temp;  
            }  
                          
         }  
      }  
   
   }  
   
}