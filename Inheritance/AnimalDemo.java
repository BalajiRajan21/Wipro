class Animal{
	public void eat(){
		System.out.println("Animal-Eating");
	}
	public void sleep(){
		System.out.println("Animal-Sleeping");
	}
}
class Bird extends Animal{
	public void eat(){
		System.out.println("Bird-Eating");
	}
	public void sleep(){
		System.out.println("Bird-Sleeping");
	}
	public void fly(){
		System.out.println("Bird-Flying");
	}
}
class AnimalDemo{
	public static void main(String[] args) {
		Animal a=new Animal();
		a.eat();
		a.sleep();
		Bird b=new Bird();
		b.eat();
		b.sleep();
		b.fly();
	}
}
