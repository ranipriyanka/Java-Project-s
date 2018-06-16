          public class LongestSubArray{
		  
              public static void main(String[] arg)
			  {
                 int array[]={2,4,5,6,8,10,9,7,1,3};
                   int arraycount[]={4,4,4,4,4,4,4,4,4,4};
				   
                         for(int i=0;i<9;i++)
						 {
                          for(int j=i;j<9;j++)
						  {
                           if(array[j]<array[j+1])
							   
                           arraycount[i]=arraycount[i]+1;
         else 
             break;
        }
              }
          int max=arraycount[0];
		  
           for(int i=0;i<10;i++)
		   {
                 if(arraycount[i]>max)
					 
                        max=arraycount[i];
						
                    System.out.println("Longest SubArray length is "+max);
		   }
         }
		  }