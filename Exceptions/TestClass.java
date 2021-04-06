/*
This programme is for implementing the Exxception handling in Java code 
*/
import java.util.*;
class HandleMyCode{
	public void myArithmeticException(int a , int b ){//ArithmenticException 
		try {
			 int sum = a/b;
			 System.out.println("a+b ="+a+"+"+b+"="+sum);
		}catch (ArithmeticException f ){
			System.out.println("The was an ArithmeticException on the programme");
			f.printStackTrace();
		}catch (Exception e ){
			System.out.println("The error wa caught by the Exception super class");
		}finally {
			System.out.println("The system was correctly executed.......");
		}
	}

	public void myNullPointerException(String s){//This method checks the string value provided by the user, if its null throw an exception
		try {
			System.out.println(s.length());
		}catch(NullPointerException npe){
			System.out.println("Cant take null as a argument");
			npe.printStackTrace();
		}finally{
			System.out.println("The string code was execited");
		}
	}

	public void myArrayIndexOutOfBoundsException( ArrayList<String> al){
		try {
				System.out.println(al);
			
		}catch(ArrayIndexOutOfBoundsException aioobe){
			System.out.println("The index is not within the size of the array.....");
			aioobe.printStackTrace();
		}
	}
	
}
public class TestClass {
	public static void main(String[] args) {
		try {
			int y = 1/2;
			System.out.println(y);
		}catch(ArithmeticException ae){
			ae.printStackTrace();
		}
		//Even though the above code may experience an exception the below code with continue to execute
		System.out.println("continue using the code after the exception has been handled");
		HandleMyCode mhc = new HandleMyCode();
		ArrayList<String> mylist= new ArrayList<String>(List.of("Vuyani","Daweti","Lawu","Loboa"));
		mhc.myArrayIndexOutOfBoundsException(mylist);
	}
}