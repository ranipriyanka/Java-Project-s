class Palindrome{
public static void main(String[] abc){
int n, sum=0,temp;
int a=454;
temp=a;
while(a>0){
n=a%10;
sum=(sum*10)+n;
a=a/10;
}
if(temp==sum)
System.out.println("palindromr number");
else
System.out.println("not palindrome number");
}
}
