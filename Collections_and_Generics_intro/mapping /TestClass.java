import java.util.*;
/*
This programme make usage of mapping 
 Adding elements 
 Converting elements to Sets 
 Using iterator to access the elements  
 entrySet- Convert to Set 
 map.Entry iteration 
 containValue() - check for the given value 
 containsKey() - checks if the given key exist 
 compute () - Attempt to store to a specific key , giving it certain value
 computeIfAbsent() - 
 computeIfPresent() - 
*/

public class TestClass {
	public static void main(String[] args) {
		Map <Integer,String>  map = new HashMap<Integer,String>();
		map.put(100,"Sipho");
		map.put(101,"Stevve");
		map.put(102, "John");
		for (Map.Entry m : map.entrySet()){
			System.out.println(m.getKey()+"-"+ m.getValue());
		}
		System.out.println(map.containsValue("Sipho"));//Check if contains the elements 
		System.out.println(map.containsKey(101));
		List<String> mylist = Collections.singletonList("Vuyani");
		Map <String, String> mp= new HashMap<String,String>();
		mp.put("Name","Vuyani");
		mp.put("Surname","Daweti");
		/*System.out.println(map.compute());
		System.out.println(map.remove());
		System.out.println(map.get());
		System.out.println(map.put());
		System.out.println(map.merge());
		System.out.println(map.replace());
		System.out.println(map.putIfAbsent());*/
		System.out.println(mylist);
		System.out.println(mp);
		System.out.println(mp.get("Name"));
		System.out.println(mp);
		System.out.println(mp.containsKey("Name"));
		System.out.println(mp.containsValue("Vuyani"));
		System.out.println(mp.keySet());


	}
	
	
}