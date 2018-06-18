      import java.util.Scanner;
	  
            public class StringintoInteger
        {
        Scanner s=new Scanner(System.in);
		
       String n1=s.next();
        String n2=s.next();
            void convert()
			{
            if(Integer.parseInt(n1)>Integer.parseInt(n2))
			{
           System.out.println("n1 is Bigger");
   }
   else
   {
      System.out.println("n2 is Bigger");
       }
			}
		
      public static void main(String[] args)
	  {
      StringintoInteger s=new StringintoInteger();
     s.convert();
       }
			
		}
		