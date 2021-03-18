public class TestClass {
	public static void main(String[] args) {
		try {
			System.out.println("Try is working ");
			int i = "3".parseTo();
		}catch (Exception e ){
			System.out.println(e.getStackTrace());
		}
	}
}