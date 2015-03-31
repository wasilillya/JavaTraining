package hf.Java;

public class Boo {
	
	public Boo(int i){}
	public Boo(String s){}
	public Boo(String s,int i){}
	Math m=new Math();

}

class SonOfBoo extends Boo{
	public SonOfBoo(){
		super("boo");
	}
	public SonOfBoo(int i){
		super("Fred");
	}
	
	public SonOfBoo(String s){
		super(42);
	}
	public SonOfBoo(int i,String s){}
	public SonOfBoo(String a,String b,String c){
		super(a,b);
	}
	public SonOfBoo(int i,int j){
		super("ererwe",j);
	}
	public SonOfBoo(int i,int x,int y){
		super(i,"star");
	}
}
