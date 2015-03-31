package hf.Java;

public class TestHippo {

	private static int size;
	public static void main(String[] args) {
		System.out.println("Begin" + getSize());
		Animal hippo=new Hippo("Buffi");
		System.out.println(hippo.getName());

	}
	String s;
	public static int getSize(){
		return size;
	}

}
