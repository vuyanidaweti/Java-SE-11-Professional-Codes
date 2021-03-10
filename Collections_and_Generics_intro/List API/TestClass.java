import java.util.*;
public class TestClass {
	public static void main(String[] args) {
		/*List <Integer>list = new ArrayList<Integer>(); //This bind the methods of ArrayList to List type variable(pointer)
		list.add(0,1);
		list.add(0,2);
		list.add(0,3);
		System.out.println(list);
		System.out.println(list.subList(1,3));
		System.out.println(list.indexOf((double)1));
		for (Object c :list.toArray()){
			System.out.println(c);
		}
		*/
		String[] strList = new String[]{"a","b","c","d","e"};
		List<String> al = new ArrayList<String>();
		al.addAll(Arrays.asList(strList));
		List<String> al2 = al.subList(2,4);
		System.out.println(al);
		System.out.println(al2);
		al2.add("x");
		System.out.println(al);
		al2.add("v");
		System.out.println(al);
		al2.add("v");
		System.out.println(al2);
		al.add("v");
		System.out.println(al);
		List<int> myint = new List();
		System.out.println(myint);
	}
}