     import java.util.Scanner;
      public class ReverseS   
	   {
         Scanner sc=new Scanner(System.in);
		 
            String str=sc.next();
			String str1="";
	        String Rev()
	{
               for(int i=str.length()-1;i>=0;i--)
        {
	             str1=str1+str.charAt(i);
          }
              return str1;
	               }
	         public static void main(String[] args)
	            {
		ReverseS r=new ReverseS();

             String str2=r.Rev();
            System.out.println(str2);		
		
		}
		 }
		 
