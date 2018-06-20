        import java.io.*;
		
           class Abc
		   {
	     public static void main(String[] args)throws IOException
		 {
        File f=new File("c:\\users\\HP\\Desktop\\Training\\class-9\\Abc.txt");
		
	                 FileInputStream fis=new FileInputStream (f);
                    
	
	 
       int i;
	   
      while((i=fis.read())!= -1)
	  {
          System.out.print((char)i);
           }
	          }
	         }   