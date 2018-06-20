public class Count
{
public static void main(String[] args){
String str="java is a simple and secure language";
int count=1;
for(int i=0;i<str.length()-1;i++){
if((str.charAt(i) == ' ') && (str.charAt(i+1)!=' ')){
count++;
}
}
System.out.println("number of words : = " + count);
}
}