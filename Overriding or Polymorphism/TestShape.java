class Shape{
	public void draw(){
		System.out.println("Drawing Shape"); 
	}
	public void erase(){
		System.out.println("Erasing Shape"); 
	}
}
class Circle extends Shape{
	public void draw(){
		System.out.println("Drawing Circle"); 
	}
	public void erase(){
		System.out.println("Erasing Circle"); 
	}
}
class Triangle extends Shape{
	public void draw(){
		System.out.println("Drawing Trinagle"); 
	}
	public void erase(){
		System.out.println("Erasing Trinagle"); 
	}
}
class Square extends Shape{
	public void draw(){
		System.out.println("Drawing Square"); 
	}
	public void erase(){
		System.out.println("Erasing Square"); 
	}
}
class TestShape{
	public static void main (String[] args) {
		Shape c=new Circle();
		c.draw();
		c.erase();
		Shape t=new Triangle();
		t.draw();
		t.erase();
		Shape s=new Square();
		s.draw();
		s.erase();
	}
}