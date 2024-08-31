public class SimpleInhertince { // access modifers // classes
	private int a = 10; // member variables

	class B1{} // local class
	static class B2{} // static classes 
	void m1() {}
	void m1(int value){
		System.out.println(value);
	} // method overriding  
	
	// Before Object Creation
	static {
		// static block
		System.out.println("Static Block");
	}
	
	//After Object Creation 
	{
		// instance block
		System.out.println("Instance Block");
	}

	public static void main(String... args) {
		SimpleInhertince object =  new SimpleInhertince();
		 // Object Creation  + Constructor 
		object.m1(20);
	}
}