    public class Overload
    {
          static void print()
           {
          System.out.println("Hello");
           }
        static void print(int a)
            {
         System.out.println("Hello"+a);
              }
          static void print(float a)
               {
             System.out.println("Hello"+a);
                   }
             public static void main(String [] args)
            {
         int a=10;
          float b=5F;
               Overload.print();
               Overload.print(b);
            Overload.print(a);
}
}