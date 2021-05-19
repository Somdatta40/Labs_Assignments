package polymorphismAssignment2;

public class Academic extends PayRoll {
public String name;
public int salary;
public Academic(String name, int salary) {
	this.name = name;
	this.salary = salary;
	super.adjustSalary(salary);
}
public Academic() {}

public void giveLecture() {
	System.out.println("He/She is the lecturer");
}
}
