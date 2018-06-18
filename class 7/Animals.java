         public   interface Animals
		 {
             void speak();
             void eat();
          public static void main(String[] args)
		  {
			  
             Dog d=new Dog();
           d.speak();
           d.eat();
		   
              Cat c=new Cat();
                 c.speak();
                 c.eat();
               }
		 }
		  
            class Dog implements Animals
			{
               public void speak()
			   {
              System.out.println("I am a dog,I speak bark.");
             }
              public void eat()
			  {
                   System.out.println("I am a dog ,I eat bones.");
            }
             }
              class Cat implements Animals
			  {
            public void speak()
			{
              System.out.println("I am a cat,I speak meow.");
                 }
              public void eat()
			  {
                   System.out.println("I am a cat,I eat veggies.");
             }
			  }  
			 
