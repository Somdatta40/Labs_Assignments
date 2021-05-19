package polymorphismAssignment2;

public class Admin extends PayRoll {
	public String name;
	public int salary;
	public Admin(String name, int salary) {
		this.name = name;
		this.salary = salary;
		super.adjustSalary(salary);
	}
	public Admin() {}
	
	public void doAdminStuff() {
		System.out.println("Admin people");
	}
	
}
