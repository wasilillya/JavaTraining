package bookpack;

public class Test{
	public static void main(String[] args){
		Test1 ob1=new Test1(1, 1);
		Test1 ob2;
		ob2=ob1.incBy10();
		Test1 ob3=new Test1(1, 2);
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.equals(ob3));
		System.out.println(ob2.a+" "+ob2.b);
		System.out.println(ob3.incBy10().a+" "+ob3.incBy10().b);
		System.out.println(ob2.incBy10().a+" "+ob2.incBy10().b);


	}

}

class Test1 {

	int a,b;
	Test1 (int a,int b){
		this.a=a;
		this.b=b; 
	}
	boolean equals(Test1 o){
		if(a==o.a&&o.b==b)return true;
		else return false;
	}
	
	Test1 incBy10(){
		Test1 tmp=new Test1(a+10,b-4);
		return tmp;
		
	}
}
