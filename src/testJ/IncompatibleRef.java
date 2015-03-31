package testJ;

class D{
	int a;
	D(int k){
		a=k;
	}
	
}

class Bb extends D{
	int c;
	Bb(int i,int j){
		super(i);
		c=j;
	}
}
public class IncompatibleRef {

	public static void main(String[] args) {
		D d=new D(5);
		Bb bb=new Bb(14, 15);
		D d2;
		d2=d;
		System.out.println(d.a);
		d2=bb;
		System.out.println(d2.a);

	}

}
