   class Primecheck{
public static void main(String[] args){
int i,a=7,flag=0;
for(i=2;i<a;i++){
if(a%i==0){
System.out.println(a+"is not a prime number");
flag=1;
break;
}
}
if(flag==0){
System.out.println(a+"is a prime number");
}
}
}