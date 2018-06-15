import java.util.Scanner;
 class Rectangle
{
         int length,breath;
	   public int CalculateArea(int length,int breath)
	   {
		   return length*breath;
	   }
	         public static void main(String[] args)
			 {
	             Scanner in=new Scanner(System.in);
	               System.out.print("enter length and breath");
	        int len=in.nextInt();
	         int br=in.nextInt();
	                Rectangle r1=new Rectangle();
	          int a=r1.CalculateArea(len,br);
	             System.out.println(a);
   }
		}