     import java.util.Scanner;
        class Complex
		{
           int real;
           int imaginary;
            public void display(int real,int imaginary)
			{
		   int r=real;
              int img=imaginary;
               System.out.print(r+"+"+img+"i");
			}
                 public static void main(String[] args)
				 {
                   	Scanner in=new Scanner(System.in);
	             System.out.print("enter.real.and.imaginary part");
	                 int r1=in.nextInt();
	                int img=in.nextInt();
	             Complex c1=new Complex();
	              c1.display(r1,img);
                    }
                      }