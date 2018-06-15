import java.util.Scanner;
class Even{
public static void main(String[] args){
Scanner n;
n=new Scanner(System.in);
int i,num;
num=n.nextInt();
for(i=0;i<=num;i++){
if(i%2==0){

System.out.println(i);}
else
{continue;}
}
}
}