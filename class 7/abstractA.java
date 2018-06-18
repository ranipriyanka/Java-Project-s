         abstract class Animal
		{
            String breed;
            String colour;
            String name;
	              abstract void eat();
             void speak()
			  {
             System.out.println("They speaking.");
                        }
		}
                class dog extends Animal
				{
        dog(String breed,String colour,String name)
		{
              this.breed=breed;
              this.colour=colour;
              this.name=name;
     }
             void me()
			 {
              System.out.println("Breed is :"+breed);
			   System.out.println("Colour is:"+colour); 
               System.out.println("Name is :"+name);
               }
             void eat() 
			 {
         System.out.println("I eat bones.");
        }
            }
       public class abstractA{
        public static void main(String[] args)
		{
                  Animal An =new dog("Retriever","White","Jack");   
                  dog d=new dog("Retriever","White","Jack");
				  d.me();
                 An.eat();
                 An.speak();
      }
		}
		