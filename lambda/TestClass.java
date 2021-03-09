import java.util.*;
class Car {
	String company;
	int year ;
	double price;
	String type;
	Car(String c, int y, double p,String t){
		this.company=c;
		this.year=y;
		this.price=p;
		this.type=t;
	}
	public String toString(){
		return "("+company+" "+year+")";
	}
}

class CarMall {
	List<Car> cars =new  ArrayList<>();
	CarMall(){
		cars.add(new Car("Honda",2012,900.0, "HATCH"));
		cars.add(new Car("Honda",2018,1700.00, "SUDAN"));
		cars.add(new Car("Toyota",2012,1900.0, "SUV"));
		cars.add(new Car("Ford",2012,13000.0, "SPORTS"));
		cars.add(new Car("Nissan",2012,8000.0, "SUV"));
	}

	List<Car> showCars(CarFilter cf){
		//This list if for the cars to be showed
		ArrayList<Car> carsToShow = new ArrayList<>();

		for (Car c:cars){//Search for the cars that are to be showed 
			if(cf.showCar(c)) carsToShow.add(c);//Use the functional interface to filter out the  t care that are to be implemented.

		}
		return carsToShow;
	}
}
interface CarFilter {
	boolean showCar(Car c);
}
class CompanyFilter implements CarFilter{
	private String company ;
	public CompanyFilter(String c){
		this.company = c;
	}
	public boolean showCar(Car c ){
		return company.equals(c.company);
	}
}

public class TestClass{
	public static void main(String[] args) {
		CarMall cm = new CarMall();
		List<Car> carByCompany = cm.showCars(c-> c.company.equals("Honda"));
		/*
		The showCars implementation is comparing the input with the listof the given cars 
		*/
		System.out.println(carByCompany);
		
	}
}