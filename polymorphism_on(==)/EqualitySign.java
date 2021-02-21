/*
	We are comparing the == operator with equals function for objects
*/
class EqualitySign{
	public static void main(String[] args) {
		String s = "Hello";
		Integer n = 10;
		int y =20;
		//System.out.println(s==n); //this gives an errror because String and int are not of same Object type 
		System.out.println(s.equals(n));//This compiles because equals compare objects and these share the grandparent object Object()
		//System.out.println(y=s); //Comparing a reference with a primtive it wont compile 
		//System.out.println(y.equals(s));//Error: Cant dereference primitive to object type 
		Object r = "Hello";
		System.out.println(r==n);//This compiles they are both objects of type Object though they do not point to the same object  
	}
}