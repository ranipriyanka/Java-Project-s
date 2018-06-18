class Orload{
void print()
{
System.out.println("null");
}
void print(int a){
System.out.println(a);
}
void print(float a){
System.out.println(a);
}
}
public class Overloading{
public static void main(String[] args){
Orload c= new Orload();
c.print(7);
c.print(7.8f);
c.print();
}
}