package testJ;
  class A{
	int i,j;
	A(int a,int b){
		i=a;
		j=b;
	}
	
	void show(){
		System.out.println("i and j "+i+" "+j);
	}
	
	 final void meth(){
		System.out.println("This is a final method");
	}
}

class B extends A{
	int k;
	B(int a, int b,int c) {
		super(a, b);
		k=c;
	}
	
	void show(String msg){
		super.show();
		System.out.println(msg+" "+k);
	}
	
	
		
}

public class UseSuper {

	public static void main(String[] args) {
		B subOb=new B(1, 2, 3);
		subOb.show("this is k");
		subOb.show();
		subOb.meth();
	}

}
