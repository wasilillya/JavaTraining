package hf.Java;

public abstract class Animal {
	
	private String name;
	
	

	public String getName() {
		return name;
	}



	public Animal(String name) {
		this.name = name;
	}



	public Animal(){
		System.out.println("Create Animal");
	}
}
