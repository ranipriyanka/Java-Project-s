class Substrings
{
public static void main(String[] args)
{
String str="xyz";
SubString(str,str.length());
}
public static void SubString(String str,int s){
for(int i=0;i<s;i++){
for(int j=i+1;j<=s;j++){
System.out.println(str.substring(i,j));
}
}
}
}