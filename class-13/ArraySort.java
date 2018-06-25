import java.util.*;

class ArraySort
{
public static void main(String[] args)
{
int array[]={4,5,6,7,8,10};
char chr[]={'a','b','c','d'};
double flt[]={1.2,2.1,3.1,3.4};
Arrays.sort(array);
Arrays.sort(chr);
Arrays.sort(flt);
int i;
for(i=0;i<array.length;i++){
	System.out.println(array[i]);
}
for(i=0;i<chr.length;i++){
	System.out.println(chr[i]);
}
for(i=0;i<flt.length;i++){
	System.out.println(flt[i]);
}
}
}
