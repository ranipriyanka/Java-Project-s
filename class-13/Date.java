
import java.util.*;
class Date{
public static void main(String[] args){
	HashMap<Integer,String> hm =new HashMap<Integer,String>();
	hm.put(1,"one");
	hm.put(2,"two");
	hm.put(3,"three");
	hm.put(4,"four");
	hm.put(5,"five");
	hm.put(6,"six");
	hm.put(7,"seven");
	hm.put(8,"eight");
	hm.put(9,"nine");
	hm.put(10,"ten");
	hm.put(11,"eleven");
	hm.put(12,"tweleve");
	hm.put(13,"thirteen");
	hm.put(14,"fourteen");
	hm.put(15,"fifteen");
	hm.put(16,"sixteen");
	hm.put(17,"seventeen");
	hm.put(18,"eighteen");
	hm.put(19,"nineteen");
	hm.put(20,"twenty");
	hm.put(21,"twenty one");
	hm.put(22,"twenty two");
	hm.put(23,"twenty three");
	hm.put(24,"twenty four");
	hm.put(25,"twenty five");
	hm.put(26,"twenty six");
	hm.put(27,"twenty seven");
	hm.put(28,"twenty eight");
	hm.put(29,"twenty nine");
	hm.put(30,"thirty");
	hm.put(31,"thirty one");
	
HashMap<Integer,String> hm1 =new HashMap<Integer,String>();
hm1.put(1,"january");
hm1.put(2,"februaru");
hm1.put(3,"march");
hm1.put(4,"april");
hm1.put(5,"may");
hm1.put(6,"june");
hm1.put(7,"july");
hm1.put(8,"august");
hm1.put(9,"september");
hm1.put(10,"october");
hm1.put(11,"november");
hm1.put(12,"december"); 

HashMap<Integer,String> hm2 =new HashMap<Integer,String>();
hm2.put(2011,"two thousand eleven");
hm2.put(2012,"two thousand tweleve");
hm2.put(2013,"two thousand thirteen");
hm2.put(2014,"two thousand fourteen");
hm2.put(2015,"two thousand fifteen");
hm2.put(2016,"two thousand sixteen");
hm2.put(2017,"two thousand seventeen");
hm2.put(2018,"two thousand eighteen");
hm2.put(2019,"two thousand nineteen");
hm2.put(2020,"two thousand twenty");
String date="23/03/2013";
Scanner sc=new Scanner(System.in);
String n=sc.next();
int str =Integer.parseInt(n.substring(0,2));
int str1 =Integer.parseInt(n.substring(3,5));
int str2 =Integer.parseInt(n.substring(6));
System.out.println(hm.get(str)+" " +hm1.get(str1)+" "+hm2.get(str2) );


//System.out.println(sub);


}
}
