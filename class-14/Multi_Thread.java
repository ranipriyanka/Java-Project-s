
class Pn 
{   
 synchronized static  void Kl(int a,int Pn)
 {
   for(int i=Pn;i<=a;i++)
   {  
     System.out.println(i);  
     try
	 {  
       Thread.sleep(4); 
	   
     }
	 catch(Exception e){
		 
	 }  
   }  
 }  
}  
      public class Multi_Thread 
     {  
       public static void main(String[] args)
     {  
      
    Thread tm1=new Thread()
	{  
        public void run()
		{  
            Pn.Kl(500,0);  
        }  
    };      
    Thread tm2=new Thread(){
         public void run()
		{  
            Pn.Kl(1000,500);  
        }  
    };   
    tm1.start();  
    tm2.start();  
    
      
}  
}