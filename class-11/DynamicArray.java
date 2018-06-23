     public class DynamicArray 
	 {
private static final int old_size=10;
private Object data[];
private int count;
private int size;
public DynamicArray() 
{
this.data=new Object[old_size];
this.size=old_size;
}
public void add(Object pqr)
{
System.out.println("count :"+this.count+"||"+"size:"+this.size+" data size:"+this.data.length);
if(this.count==this.size-1)
{
increase();
}
data[this.count]=pqr;
this.count++;
}
private void increase()
{
this.size=(int)(old_size*1.5f);
Object newData[]=new Object[this.size];
for(int i=0;i<data.length;i++)
{
newData[i]=data[i];
}
this.data=newData;
System.out.println("***count:"+this.count+" size :"+this.size+"data size:"+this.data.length);
}
void show()
{
int j=0;
for(Object element :data)
{
System.out.println(j+"th element of Array:"+element);
j++;
}
}
public static void main(String[] args)throws Exception
{
DynamicArray n=new DynamicArray();
n.add("0");
n.add("1");
n.add("2");
n.add("3");
n.add("4");
n.add("5");
n.add("6");
n.add("7");
n.add("8");
n.add("9");
n.add("10");
n.add("A");
n.add("B");
n.add("C");
n.add("D");

n.show();
}
}