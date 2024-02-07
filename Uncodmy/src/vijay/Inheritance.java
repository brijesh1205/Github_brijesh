package vijay;

public class Inheritance {
	String brand= "marruti";
	public void method_name () {
		System.out.println("hi this is Brand maruti");
			
	}
}	
	
class child extends Inheritance {
	String car_name = "Alto";

	
	
	
public static void main(String[] args) {
	
child object_name = new child();
object_name.method_name();
System.out.println(object_name.brand +" "+object_name.car_name);

	}

}
