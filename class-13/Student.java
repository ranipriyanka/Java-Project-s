import java.util.*;
import java.io.*;
class Student{
int rollno;
String name;
int age;
Student(int rollno,String name,int age){
//this.rollno=rollno;
this.name=name;
this.age=age;
this.age=age;
}
}
class AgeComparator implements Comparator<Student>{
public int Compare(Student s1,Student s2){
if(s1.age=s2.age)
return 0;
else
if(s1.age>s2.age)
return 1;
else
return-1;
}
}
class NameComparator implements Compararor<Student>{
public int compare(Student s1,Student s2){
return s1.name.compareTo(s2.name);
}
}
class SortList{
public static void main(String[] args){
ArrayList<Student> al=new ArrayList<Student>();
al.add(new Student("Priyanka",19));
al.add(new Student("Shruti",20));
al.add(new Student("simmy",21));
al.add(new Student("madhu",18));
al.add(new Student("nikki",19));
System.out.println("Sorting by name....");
Collections.sort(al,new NameComparator());
for(Student st:al){
System.out.println(st.name+"  "+st.age);
}
System.out.println("Sorting by age.....");
Collections.sort(al,new AgeComparator());
for(Student st:al){
System.out.println(st.name+" "+st.age);
}
}
}