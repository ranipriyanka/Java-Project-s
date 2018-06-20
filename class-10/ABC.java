import java.util.*;

import java.io.*;

public class ABC{
	public static void main(String[] args)throws Exception
	{
		File f1=new File("ABC.txt");
		File f2=new File("XYZ.txt");
		FileReader fr=new FileReader(f1);
		FileWriter fw=new FileWriter(f2);



		int s;
		String a="";
		while((s=fr.read()) !=-1)
		{
			
			
			a=a+(char)s;
			System.out.print(a);
			fw.write(a);
				a="";
		}
	fw.flush();
	}
}