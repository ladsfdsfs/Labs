	//Name______________________________ Date_____________
    public class Salesperson 
   {
   	//data fields
      private String myName;



      private int myCars, myTrucks;
   
   	//constructors
   
         public Salesperson(){
         myCars=0;
         myTrucks=0;
         myName="";
         }   
         public Salesperson(String name,int x, int y){
         myName=name;
         myCars=x;
         myTrucks=y;
         }
   
   	//accessors and modifiers
      
      public String getName(){
      return myName;
      }
      
      public int getCars() {
         return myCars;
      }
      public int getTotal(){
      return myCars+myTrucks;
      }

      public void setCars(int myCars) {
         this.myCars = myCars;
      }

      public int getTrucks() {
         return myTrucks;
      }

      public void setTrucks(int myTrucks) {
         this.myTrucks = myTrucks;
      }
   
   	//other methods: toString
   
      public String toString() {
      return myName+"\t\t"+myCars+"\t\t"+myTrucks+"\t\t"+getTotal();
      }
   }