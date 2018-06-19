        import java.io.*;
		
           class Abc
		   {
	     public static void main(String[] args)throws IOException
		 {
        File f=new File("c:\\users\\HP\\Desktop\\Training\\class-9\\Abc.txt");
		
	                 FileInputStream fis=new FileInputStream (f);
                     FileOutputStream fos=new FileOutputStream(f);
	
          String text="Nothing is imposible when God is on your side.";
		  
        byte[] b=text.getBytes();
		
        for(byte b1:b)
		{
	    fos.write(b1);
         }
           fos.flush();
            fos.close();
	 
       int i;
	   
      while((i=fis.read())!= -1)
	  {
          System.out.print((char)i);
           }
	          }
	         }   