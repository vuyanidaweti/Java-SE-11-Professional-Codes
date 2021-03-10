
public class testClass {
	public static void main(String[] args) {
		computeSimpleInterest(2.93,4.55,-1.2);
		//
	}
	/*public static double computeSimpleInterest(double p,double r,double t){
		if(t<0){
			IllegalArgumentException iae=new IllegalArgumentException("time is less than 0");
			throw iae;
		}
		return p+r;
	}
	*/
	public static double computeSimpleInterest(double p,double r,double t){
		if(t<0)throw new IllegalArgumentException("time is less than 0");
		return p+r;
	}
	

}