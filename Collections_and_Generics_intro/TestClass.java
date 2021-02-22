//This is a programme that test the function that implement the ArrayList

import java.util.ArrayList ;
public class TestClass {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("alice");
		al.add("bob");
		al.add("charlie");
		al.add(2,"david");

		for (Object o:al){
			String name = (String)o ;
			System.out.println(name + " "+ name.length());
		}

		System.out.println("All names:" + al);
		al.remove(0);
		System.out.println("All names : " + al);
		
	}
}