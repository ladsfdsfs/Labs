public class Distance implements Comparable<Distance> {
   private int myFeet, myInches;
   public Distance() {
      myFeet=0;
      myInches=0;
   }
   public Distance(int x, int y) {
      myFeet=x;
      myInches=y;
   }
   public int getFeet() {
      return myFeet;}

   public int getInches() {
      return myInches;}

   public void setFeet(int x) {
      myFeet=x; }

   public void setInches(int x){
      myInches=x;}

   public int compareTo(Distance w){
      int myTotal = myFeet*12+myInches;
      int wtotal= w.getFeet()*12+w.getInches();
      return myTotal-wtotal;
         }
   public String toString() {
      return myFeet+" ft. "+myInches+" in.";
   }
}