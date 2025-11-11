package Week09;

public class C implements A, B {
	public void displayA() {
		System.out.println("Display A");
	}
	
	public void displayB() {
		System.out.println("Display B");
	}
	
	public static void main(String[] args) {
		
		C C = new C();
		C.displayA();
		C.displayB();
	}

}
