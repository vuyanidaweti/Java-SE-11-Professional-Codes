import java.util.*;
import java.util.function.*;
/*
* Functional interfaces 
* Predicate
* Consumer
* Supplier
*/

public class lambda3{
	public static void main(String[] args) {
		//We use predicate to check for boolean test 
		String mystring = "hello";
		Predicate<String> p1 = str->{
			if( str instanceof String)
			 return true;
			else return false;
		};
		System.out.println(p1.test(mystring));
		//Predicate can be used to run small test on the system.Write the code small code to test and use that code everywhere

		//We use Consumer Functional interface to utilize the object.
		Consumer<String> strConsumer = s->System.out.println(s);
		strConsumer.accept("Hello there.......");
		//Can be used to change values of a class 

		//We use Suppier functional interface to get the object when invoked.
		String s = "Molweni......";
		Supplier<String> spp=()->s.toString();
		System.out.println(spp.get());
		String nesStr=getString(()->s+"Nonke");
		System.out.println(nesStr);


		//To iterate through list using functinal interfaces 
		List<String> list = new ArrayList<String>();//consumer
		list.add("a");
		list.add("b");
		list.add("c");
		int numb=0;
		list.forEach((y)->{
			System.out.println(y);
			System.out.println(numb);
		});
		System.out.println(numb);

		Map<String,String> myMap = new HashMap<String,String >();
		myMap.put("Name","Vuyani");
		myMap.put("Surname","Daweti");
		myMap.put("Age","26");
		myMap.forEach((name,surname)->System.out.println(name+":"+surname));

	}
	public static String getString(Supplier<String> spStr) {
		return spStr.get();
	}
}