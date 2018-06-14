import java.util.Scanner;
class Primenumber{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int i,j,count;
for(i=2;i<=num;i++){
count=0;
for(j=1;j<=num;j++){
if(i%j==0){
count++;
}
}
if(count==2){
System.out.println(i);
}
}
}
}