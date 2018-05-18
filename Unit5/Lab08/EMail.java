	//Name______________________________ Date_____________
   public class EMail
   {
      private String myUserName;
      private String myHostName;
      private String myExtension;
      public EMail(String address)
      {
         	int pos=address.indexOf('@');
            myUserName=address.substring(0,pos);
            int pos1=address.indexOf('.');
            myHostName=address.substring(pos+1,pos1);
            myExtension=address.substring(pos1+1);
      }
      public String getUserName()
      {
         return myUserName;
      }
      public String getHostName()
      {
         return myHostName;
      }
      public String getExtension()
      {
         return myExtension;
      }
      public String toString()
      {
         	return myUserName+"@"+myHostName+"."+myExtension;
      }
   }