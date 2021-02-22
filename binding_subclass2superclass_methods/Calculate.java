class InterestCalculator {
	public int yrs = 10;
	public static double rate =0.1;
	public static String getClassName(){
		return "InterestCalculator";
	}
}

class CompoundInterestCalculator extends InterestCalculator {
	public int yrs = 20;
	public static double rate = 0.2;
	public static String getClassName (){
		return "CompoundInterestCalculator";
	}
}

public class Calculate {
	public static void main(String[] args) {
		CompoundInterestCalculator cic = new CompoundInterestCalculator();
		System.out.println(cic.yrs);
		System.out.println(((InterestCalculator)cic).yrs); //This casts  cic to its super class and binding the subclass to its superclass methods
	}
}