import java.util.*;  
import java.io.*; 

 class Employ{  
String name;  
int age;  
Employ(String name,int age){    
this.name=name;  
this.age=age;   
}  
}

 


class AgeComparator implements Comparator<Employ>{  
public int compare(Employ e1,Employ e2){  
if(e1.age==e2.age)  
return 0;  
else if(e1.age>e2.age)  
return 1;  
else  
return -1;  
}  
}  


class NameComparator implements Comparator<Employ>{  
public int compare(Employ e1,Employ e2){  
return e1.name.compareTo(e2.name);  
}  
}  

 class SortedList{ 
public static void main(String args[]){  
  
ArrayList<Employ> adl=new ArrayList<Employ>();

adl.add(new Employ("Raspreet",20));  
adl.add(new Employ("Monika",25));  
adl.add(new Employ("Rajni",21));  
adl.add(new Employ("purnima",22));
  
System.out.println("Sorting by Name");  
  
Collections.sort(adl,new NameComparator());  
for(Employ et: adl){  
System.out.println(et.name+" "+et.age);  
}  
  
System.out.println("sorting by age");  
  
Collections.sort(adl,new AgeComparator());  
for(Employ et: adl){  
System.out.println(et.name+" "+et.age);  
}  
  
}  
}  