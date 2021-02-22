interface Movable {
	int num= 1;
	static int num2 = 2; 
	default void move1() {
		System.out.println(num);
	}
	static void sayHello(){
		System.out.println("Hello!");
	}
}

class Vehilce implements Movable{
	public void move1(){
		System.out.println("Vehilce move...");
	}
	public void move (int x ){
		System.out.println(x );
	}
}
public class TestClass {
	public static void main(String[] args) {
		Movable.sayHello();
		System.out.println(Movable.num);//This compioles because all variables are defined static , public and final
		Movable mov = new Movable(){};//This creates a concrete inner class that extends Movable
		mov.move1();
	}
}