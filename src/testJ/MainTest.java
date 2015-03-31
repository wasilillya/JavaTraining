package testJ;

abstract class TwoDShape{
	 private double hight,width;
	 private String name;
	 
	 public TwoDShape() {
		hight=width=0.0;
		name=null;
	}
	 
	 public TwoDShape(double h,double w, String n) {
		hight=h;
		width=w;
		name=n;
	}
	 
	 TwoDShape(double x,String n){
		 width=hight=x;
		 name=n;
	 }
	 
	 TwoDShape(TwoDShape ob){
		 width=ob.width;
		 hight=ob.hight;
		 name=ob.name;
	 }
	
	  double getHight() {
		return hight;
	} 
	
	void setHight(double hight) {
		this.hight = hight;
	}

	double getWidth() {
		return width;
	}

	void setWidth(double width) {
		this.width = width;
	}
	
	String getName(){
		return name;
	}

	void show(){
		System.out.println(hight+"and"+ width);
	}
	
	abstract double area();
}

class Triangle extends TwoDShape{
	private String style;
	Triangle(String s,double w,double h) {
		super(w,h,"triangle");
		style=s;
	}
	
	public Triangle() {
		super();
		style=null;
		
	}
	
	public Triangle(double x){
		super(x,"triangle");
		style="isoscelet";
	}
	
	Triangle(Triangle ob){
		super(ob);
		style=ob.style;
	}
	public double area(){
		
		return getWidth()*getHight()/2;
	}
	
	void showStyle(){
		
		System.out.println(style);
	}
	
	
}

class ColorTriangle extends Triangle{
	private String color;
	public ColorTriangle(String c,double w,double h ) {
		super(c,w,h);
		color=c;
	}
	String getColor() {
		return color;
	}
	void showColor(){
		System.out.println("color is "+color);
	}
	
	
}

class Rectangle extends TwoDShape{
	public Rectangle() {
		super();
	}
	Rectangle(double w,double h){
		super(h, w, "rectangle");
	}
	Rectangle(double x){
		super(x, "rectangle");
	}
	Rectangle(Rectangle ob){
		super(ob);
	}
	boolean isSquare(){
		if(getHight()==getWidth())return true;
		return false;
	}
	double area(){
		return getHight()*getWidth();
	}
}

class MainTest {
	
	public static void main(String[] args) {
		TwoDShape shapes[]= new TwoDShape[4];
		shapes[0]=new Triangle("right", 8.0, 12.0);
		shapes[1]=new Rectangle(10);
		shapes[2]=new Rectangle(10, 4);
		shapes[3]=new Triangle(7.0);
	//	shapes[4]=new TwoDShape(10, 20, "generic");
		for(TwoDShape s:shapes){
			System.out.println("object is "+s.getName());
			System.out.println("area is "+s.area());
		}
	}
}
	
	

