package hd;

public class AnimalTestDrive {

	public static void main(String[] args) {
		MyAnimalList list=new MyAnimalList();
		Dog d=new Dog();
		Cat c= new Cat();
		list.add(d);
		list.add(c);
		if(d.equals(c)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		System.out.println(d.hashCode());
		System.out.println(c.hashCode());
		System.out.println(c.toString()+" "+d.toString());
	}

}
