import java.util.ArrayList;
class Person {
	String name,surname;
	int age;
	Person(String name, String surname , int age){
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	//Getter 
	public String getName(){
		return this.name;
	}
	public String getSurname(){
		return this.surname;
	}
	public int getAge(){
		return this.age;
	}
	//Setters 
	public void setName(String name){
		this.name = name ;
	}
	public void setSurname (String surname ){
		this.surname = surname ;
	}
	public void setAge(int age){
		this.age = age;
	}
}
class Employee extends Person{
	String employeeID ; 
	Employee (String employeeID, String name , String surname , int age){
		super(name , surname,age);
		this.employeeID =employeeID;
	}
	//Getter 
	public String getEmployeeID(){
		return this.employeeID;
	}
	//Setter
	public void setEmployeeID(String employeeID){
		this.employeeID= employeeID;
	}
}
///This class works as an Employee manager,
class EmployeeManager {
	//We are going to use an array to store Employee data 
	ArrayList<Employee> employeeList = new ArrayList<Employee>();
	public void addEmployee(Employee e){
		employeeList.add(e);
	}
	public void removeEmployee(int index){
		if (employeeList.size()<= 0 ){
			return ;
		}
		else 
			employeeList.remove(index);
	}
	public Employee getEmployee(int index){
		return employeeList.get(index);
	}
	public int employeeListSize(){
		return employeeList.size();
	}
	public ArrayList<Employee> getList(){
		return employeeList;
	}
}
public class TestClass {
	public static void main(String[] args) {
		EmployeeManager myEmployees = new EmployeeManager();
		myEmployees.addEmployee(new Employee("12345663422","Vuyani","Daweti",25));
		myEmployees.addEmployee(new Employee("45434344941","Steve","Owen",29));
		myEmployees.addEmployee(new Employee("45678987654", "Lerato", "Tuso",26));
		ShowMyEmployees(myEmployees);
	}
	static void ShowMyEmployees(EmployeeManager myEmployees) {
	System.out.print("Number of Employees:");
	System.out.println(myEmployees.employeeListSize());
	System.out.println("-----------The list of all employees -------------");
	System.out.println("Employee ID\t\t|Surname\t|Name\t\t|age");
	ArrayList<Employee> myList = myEmployees.getList();
	for ( Employee employee:myList){
		System.out.print(employee.getEmployeeID()+"\t\t"
		System.out.print(employee.getSurname() +"\t\t");
		System.out.print(employee.getName() +"\t\t");
		System.out.println(employee.getAge() +"\t\t");
		}
	}
}