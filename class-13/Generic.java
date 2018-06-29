import java.io.*;
import java.util.Arrays;
 class Generic
{
public static <T> void printArray(T[] Array)
{
    for(T n:Array)
		
         System.out.printf("%s", n);
          System.out.println();
}
public static void main(String[] args)
{
        String[]names={"Priyanka", "Meenakshi", "Niharika"};
Arrays.sort(names);
System.out.println(Arrays.toString(names));
double[] lengths={123.0, 234.5, 333.5, 663.1};
Arrays.sort(lengths);
System.out.println(Arrays.toString(lengths));
Integer[] numbers={123, 234, 345, 456};
Arrays.sort(numbers);
System.out.println(Arrays.toString(numbers));
}
}