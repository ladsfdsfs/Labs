//Name______________________________ Date_____________

public class Song implements Comparable<Song>
{
   	//data fields
   private String myTitle;



   private int myMinutes, mySeconds;
   
   	//constructors
   public Song(String toBeParsed)
   {
      int colon = toBeParsed.indexOf(":");
      int space = toBeParsed.indexOf(" ");
      
      myTitle=toBeParsed.substring((space+1));
      
      myMinutes=Integer.parseInt(toBeParsed.substring(0,colon));
      mySeconds=Integer.parseInt(toBeParsed.substring(colon+1,space));
          
          
          
   }
     
   	//accessors and modifiers
   public String getMyTitle() {
      return myTitle;
   }

   public void setMyTitle(String myTitle) {
      this.myTitle = myTitle;
   }

   public int getMyMinutes() {
      return myMinutes;
   }

   public void setMyMinutes(int myMinutes) {
      this.myMinutes = myMinutes;
   }

   public int getMySeconds() {
      return mySeconds;
   }

   public void setMySeconds(int mySeconds) {
      this.mySeconds = mySeconds;
   }
      
   	
       
      //other methods:  compareTo(), equals(), toString()
      
   public int compareTo(Song e) {
      
      if(getMyMinutes() == e.getMyMinutes())
         return getMySeconds()-e.getMySeconds();
      else
         return getMyMinutes()-e.getMyMinutes();
      
      
   }
      
      
   public String toString() {
      return myTitle+" ("+getMyMinutes()+"' "+getMySeconds()+"\")";
      
   }
      
   public boolean equals(Song e) {
   return (e.getMyMinutes()==myMinutes && e.getMySeconds()==mySeconds);
   }
      
   	
}