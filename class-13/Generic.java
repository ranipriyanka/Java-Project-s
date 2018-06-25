
import java.util.Arrays;
public class Generic
{
public static <T> void printArray(T[] Array)
{
    for(T n:Array)
		
         System.out.printf("%s",n);
          System.out.println();
}
public static void main(String[] args)
{
         Integer[] intArray={1,2,3,4,5,6,7,8};
         Double[] dblArray={1.1,1.2,2.1,3.1,4.1,7.1,6.5};
         Character[] chaArray={'P','R','I','Y','A'};
		 
          System.out.println("IntegerArray contains:");
          printArray(intArray);
		  
          System.out.println("\nDoubleArray contains:");
           printArray(dblArray);
		   
         System.out.println ("\nCharacterArray contains:");
         printArray(chaArray);
}
}