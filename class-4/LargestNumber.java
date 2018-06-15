  import java.util.Scanner;
class LargestNumber 
{
public static void main(String[] args)
{
int a[]={2,6,7,8,1,3,4,5};

int largest=a[0];
int slargest=a[0];
for(int i=0;i<a.length;i++){
	if(a[i]>largest){
		slargest=largest;
		largest=a[i];
	}
	else if(a[i]>slargest){
		slargest=a[i];
}
}
System.out.println("second largest number is : "+slargest);
}
}