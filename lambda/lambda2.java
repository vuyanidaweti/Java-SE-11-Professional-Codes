import java.util.*;
/*
This program is to implement the functional programming using lambda expression 

*/
interface showPrint{ //No return type of lambada with one paramenter 
	public void showit(String n);
}
interface returnString{ //String type return with one parameter 
	public String myString(String s);
}

interface addString { //String return with two parameters 
	public String adding(String s,String d);
}
public class lambda2 {
	public static void main(String[] args) {
		showPrint sp = s->{System.out.println("OUTPUT IS "+s);};
		sp.showit("Hello");
		returnString rS=s->"This is"+s;
		System.out.println(rS.myString("Vuyani"));
		addString aS =(s,p)->s+p;
		System.out.println(aS.adding("Vuyani","Daweti"));
	}
}