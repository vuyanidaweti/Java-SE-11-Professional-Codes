interface Movable {
	int num= 1;
	static int num2 = 2; 
	void move (int x ) ;
	default move1(int x ) {
		System.out.println("Move method");
	}
	static void sayHello(){
		System.out.println("Hello!");
	}
}
public class TestClass {
	public static void main(String[] args) {
		Movable.sayHello();
		
	}
}