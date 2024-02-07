package vijay;

public class Pollyy {
	public void method_name() {
		System.out.println("Hi this is Uncodemy");
	}


		
	class child_1 extends Pollyy {
		public void method_name () {
			System.out.println("Hey this is Uncodemy 2");
			
		}
	}

class child_2 extends Pollyy {
	public void method_name () {
		System.out.println("Hey this is Uncodemy 3");
	}
}	

class Main {
   public static void main(String[] args) {
	   
	   Pollyy object_name1 = new Pollyy();
	   Pollyy object_name2 = new child_1();
	   Pollyy object_name3 = new child_2();
     
     
	object_name1.method_name();
	   object_name2.method_name();
	   object_name3.method_name();
	  
   
   }	
