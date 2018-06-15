import java.util.Scanner;
class ArrayCheck
{
	public static void main(String[] args)
	{
		Scanner sc;
		sc=new Scanner(System.in);
		System.out.println("enter any number for search");
		int num=sc.nextInt();
		int[] b={1,4,6,7,8,9,10};
		int search,i;
		boolean count=false;
		for(i=0;i<b.length;i++)
		{
			if(b[i]==num)
			{
				count=true;
			}
		}
		if(count==true)
		{
			System.out.println("Present");
		}
		else
		{
				System.out.println("absent");
		}
	}
}