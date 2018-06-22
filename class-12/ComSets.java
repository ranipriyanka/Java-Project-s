import java.util.*;
class ComSets{
public static void main(String[] args){
HashSet<String>hs=new HashSet<String>();
hs.add("Priyanka");
hs.add("Raspreet");
hs.add("Shalu");
hs.add("Rajni");
hs.add("Purnima");
System.out.println("first hashset is " +hs);
HashSet<String>hs1=new HashSet<String>();
hs1.add("Priyanka");
hs1.add("Meenakshi");
hs1.add("Raspreet");
hs1.add("Niharika");
System.out.println("second hashset  is"+hs1);
hs1.retainAll(hs);
System.out.println("common elements are "+ hs1);
}
}