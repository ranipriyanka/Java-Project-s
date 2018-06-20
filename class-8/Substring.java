import java.util.Scanner;
public class Substring{
	
Scanner sc=new Scanner(System.in);
String str=sc.next();

void substring(){
	for(int i=0;i<=str.length()-1;i++){
		System.out.println(str.charAt(i));
	}
	for(int p=0;p<str.length();p++)
		for(int q=0;q<str.length();q++){
			
			System.out.print(str.charAt(p));
			System.out.println(str.charAt(q));
	
}
	System.out.println(str);
}
	public static void main(String[] args){
		Substring s=new Substring();
		s.substring();
	}
}

