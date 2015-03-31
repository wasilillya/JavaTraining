package testJ;

class Sup{
	void who(){
		System.out.println("who() in Sup");
	}
}

class Sub1 extends Sup{
	void  who(){
		System.out.println("who() in Sub1");
		super.who();
		
	}
}

class Sub2 extends Sup{
	void  who(){
		System.out.println("who() in Sub2");
	}
}

public class NewDispDemo {

	public static void main(String[] args) {
		Sup superOb=new Sup();
		Sub1 sub1=new Sub1();
		Sub2 sub2=new Sub2();
		
		
		Sup superRef;
		superRef=superOb;
		superRef.who();
		superRef=sub1;
		System.out.println();
		superRef.who();
		superRef=sub2;
		superRef.who();
	}

}
