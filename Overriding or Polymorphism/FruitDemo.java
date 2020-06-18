class Fruit{
	String name;
	String taste;
	String size;
	Fruit(String name,String taste,String size){
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	public void eat(){
		System.out.println("Name: "+name+"Taste: "+taste+"Size: "+size);
	}
}
class Apple extends Fruit{
	Apple(String name,String taste,String size){
		super(name,taste,size);
	}
	public void eat(){
		System.out.println("Name: "+name+"\nTaste: "+taste);
	}
}
class Orange extends Fruit{
	Orange(String name,String taste,String size){
		super(name,taste,size);
	}
	public void eat(){
		System.out.println("Name: "+name+"\nTaste: "+taste);
	}
}
class FruitDemo{
	public static void main(String[] args) {
		Apple a=new Apple("Apple","Sweet","Oval");
		Orange o=new Orange("Orange","Sweet-tart","Round");
		a.eat();
		o.eat();
	}
}
