package vijay;

public class Inheritance2 {
int roll, marks;
String name;
 
void method()
{
	System.out.println("Enter roll name & marks: ");
}
}	
	
class ankit extends Inheritance2
{
	void disp()
	{
		roll=1; name="Brijesh"; marks=100;
		System.out.println(roll+" "+name+" "+marks);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ankit r=new ankit();
     r.method(); r.disp();
	}

}
