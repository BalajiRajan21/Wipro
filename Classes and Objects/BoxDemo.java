class Box{
	int width;
	int height;
	int depth;
	public Box(int width,int height,int depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	public int display(){
		return width*height*depth;
	}
}
public class BoxDemo{
	public static void main(String[] args) {
		Box b=new Box(3,3,3);
		System.out.println(b.display());
	}
}
