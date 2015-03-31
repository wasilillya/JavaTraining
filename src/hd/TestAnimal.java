package hd;

 abstract class Animal{
	public void eat(){
		System.out.println("Animal eat");
	}
	
	public void roam(){
		System.out.println("Animals in roam");
	}
	
	public void makeNoise(){
		System.out.println("animal make noise");
	}
	
}

class Cat extends Animal{
	public void eat(){
		System.out.println("Cat eat");
	}
	
	public void roam(){
		System.out.println("cat in roam");
	}
	
	public void makeNoise(){
		System.out.println("cat make noise");
	}
}

class Wolf extends Canine{
	public void eat(){
		System.out.println("wolf eat");
	}
	public void roam(){
		System.out.println("wolf in roam");
	}
	public void makeNoise(){
		System.out.println("wolf make noise");
	}
}

class Dog extends Canine{
	private void eat(int i){
		System.out.println("dog eat");
	}
	
	public void roam(){
		System.out.println("dog in roam");
	}
	
	public void makeNoise(){
		System.out.println("dog make noise");
	}
}

class Vet{
	public void giveShot(Animal a){
		a.makeNoise();
	}
}

 abstract class Canine extends Animal{
	public void roam(){
		
	}
}

class makeCanine {
	public void go(){
		Canine canine;
		canine=new Dog();
		//canine=new Canine();
		canine.roam();
	}
}


public class TestAnimal {

	public static void main(String[] args) {
		
		Vet vet=new Vet();
		Dog dog=new Dog();
		Cat cat=new Cat();
		Wolf wolf=new Wolf();
		vet.giveShot(cat);
		vet.giveShot(wolf);
		vet.giveShot(dog);
		Animal[] animals=new Animal[3];
		animals[0]=new Cat();
		animals[1]=new Dog();
		animals[2]=new Wolf();
		for(int i=0;i<animals.length;i++){
			animals[i].eat();
			animals[i].roam();
		}
		animals[1].eat();

	}

}
