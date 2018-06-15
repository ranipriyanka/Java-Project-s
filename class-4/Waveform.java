        class Waveform{
         public static void main(String[] args){
                  int[] array={1,2,3,4,5,6,7,8,9};
            int j,temp;
            for (j=0;j<array.length-1;j=j+2){
               if(array[j]<array[j+1]){
                 temp=array[j];
                     array[j]=array[j+1];
            array[j+1]=temp;
           } 
             }
              for(j=0;j<array.length-1;j++){
              System.out.println(array[j]);
             }
           }
		}