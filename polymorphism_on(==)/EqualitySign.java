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

class X {
	int val ;
	public boolean equals(Object x ){
		if (!(x instanceof X)) return false; 
		return this.val== ((X) x ).val ;
	}
	public static void main(String[] args) {
		X x1 = new X();
		x1.val =1;
		X x2 = new X();
		x2.val=2; 
		System.out.println("Soulti on:" +x1.equals(x2));
	}
}