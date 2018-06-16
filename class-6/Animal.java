            public class Animal
        {
          String breed;
          String color;       
            void Speak()
			{
       System.out.println("Growl");
          }
            public static void main(String[] args)
			{
           Animal object1=new Animal();
            Dog object2=new Dog();
          Cat object3=new Cat();
		  
		  
		  
          object1.Speak();
           object2.Speak();
            object3.Speak();
            }
             }
              class Dog extends Animal
			  {
          String breed;
         String color;
                   void Speak(){
           System.out.println("Bark");
         }
                }
             class Cat extends Animal
			 {
      String breed;
      String color;
        void Speak(){
         System.out.println("Meow");
}
}