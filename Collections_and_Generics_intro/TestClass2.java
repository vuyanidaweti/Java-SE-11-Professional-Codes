
public class TestClass2 {
	public static void main(String[] args) {
		String [] al= new String[10];
		al[0]= "Alice";
		al[1] = "bob";
		al[2] = "charlie";
		al[3] = "david";


		for (String s : al){
			System.out.println(s  + " "+s.length());
		}

	}
}