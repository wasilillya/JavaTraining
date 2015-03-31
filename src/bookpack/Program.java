package bookpack;
class Base { 
    public String name = "Base"; 
    public String getName() { 
        return name; 
    } 
} 
 
class Sub extends Base { 
    public String name = "Sub"; 
    public String getName() { 
        return name; 
    } 
} 

class C{
	public String name;
	double i;
	
	boolean b;
	Double d;
	C(double i,Double d){
		this.i=i;
		this.d=d;
	}
	public void test(double d){
		System.out.println( d*d);
	}
}

class Stack{
	int[]stck=new int[10];
	int tos;
	public Stack() {
		tos=-1;
	}
	void push(int item){
		if(tos==9)System.out.println("stack is full");
		else stck[++tos]=item;
	}
	int pop(){
		if(tos<0)System.out.println("pusto");
		else return stck[tos--];
		return 0;
	}
}
 
public class Program { 
	static Double i=9.0;
    public static void main(String[] args) { 
      
	Stack st1=new Stack();
	Stack st2=new Stack();
	for(int i=0;i<10;i++){
		st1.push(i);
	}
	for(int i=10;i<20;i++){
		st2.push(i);
	}
	for(int i=0;i<10;i++){
		System.out.println(st1.pop());
	}
	for(int i=10;i<20;i++){
		System.out.println(st2.pop());
	}
	byte i=3;
	C c=new C(0.0, 0.0);
	c.test( i);
	System.out.println(Math.abs(400000000-4000000000000000001l));
    } 
} 