   //Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 5.31.2005
   //updated to Java 1.5 on 1.30.2007 by S. Rose

   import java.util.Comparator;
    public class ByTotal implements Comparator<Salesperson>
   {
       public int compare(Salesperson arg1, Salesperson arg2)
      {
         return arg1.getTotal() - arg2.getTotal();
      }
   }