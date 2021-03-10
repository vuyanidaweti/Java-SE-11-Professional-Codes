import java.util.ArrayList;
class make extends ArrayList{
	make(ArrayList al){
		super(al);
	}

}
public class TestClass {
	public static void main(String[] args) {
		ArrayList<String> arryList = new ArrayList<String>(20);
		//arryList.ensureCapacity(4);
		arryList.add("Name");
		arryList.add("Surname");
		arryList.add("Age");
		arryList.add("Address");
		arryList.add("IDNumber");
		//System.out.println(arryList.remove(1));
		//arryList.trimToSize();
		//System.out.println(arryList.size());
		//System.out.println(arryList.toString());
		ArrayList<String> ls = new ArrayList<String>();
		ls.add("Vuyani");
		ls.add("Daweti");
		ls.add("234");
		ls.add("Vuyani");
		make mk =new make(ls);
		System.out.println(mk.isEmpty());
	}
	
}