import java.util.Random;
abstract class Compartment{
	public abstract String notice();
}
class FirstClass extends Compartment{
	public String notice(){
		return "First-Class Coach";
	}
}
class Ladies extends Compartment{
	public String notice(){
		return "Ladies Coach";
	}
}
class General extends Compartment{
	public String notice(){
		return "General Coach";
	}
}
class Luggage extends Compartment{
	public String notice(){
		return "Luggage Coach";
	}
}
public class TestCompartment{
	public static void main(String[] args) {
		Random r=new Random();
		Compartment[] comp=new Compartment[10];
		for(int i=0;i<10;i++){
			int c=r.nextInt(5);
			if(c==1){
				comp[i]=new FirstClass();
				System.out.println(comp[i].notice());
			}
			else if(c==2){
				comp[i]=new Ladies();
				System.out.println(comp[i].notice());
			}
			else if(c==3){
				comp[i]=new General();
				System.out.println(comp[i].notice());
			}
			else if(c==4){
				comp[i]=new Luggage();
				System.out.println(comp[i].notice());
			}
			else{
				i--;
			}
		}
	}
}
