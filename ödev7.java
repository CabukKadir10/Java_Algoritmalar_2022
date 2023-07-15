import java.util.Scanner;

abstract class Employee {
	
	private String name;
	private String department;
	private int age;
	private int salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	abstract void showİnfos();
}

class ui extends Employee {

	public void showİnfos() {
		
		System.out.println("Name employee: " + this.getName());
		System.out.println("Age employe: " + this.getAge());
		System.out.println("Department employe: " + this.getDepartment());
		System.out.println("Salary employe: " + this.getSalary());
		
	}
}

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Employee employee = new ui();
		
		String name, password;
		String enterUserName, enterUserPassword;
		
		System.out.println("Set username");
		name = scan.nextLine();
		
		System.out.println("Set userpassword");
		password = scan.nextLine();
		
		System.out.println("Enter user name");
		enterUserName = scan.nextLine();
		
		System.out.println("Enter user password");
		enterUserPassword = scan.nextLine();
		
		if(name.equals(enterUserName) && password.equals(enterUserPassword)) {
			System.out.println("Enter employee name");
			employee.setName(scan.nextLine());
			
			System.out.println("Enter employee department");
			employee.setDepartment(scan.nextLine());
			
			System.out.println("Enter employee age");
			employee.setAge(scan.nextInt());
			
			System.out.println("Enter employee salary");
			employee.setSalary(scan.nextInt());
			
			employee.showİnfos();

		}else {
			System.out.println("Error entry! Try again");
		}
	}
}
