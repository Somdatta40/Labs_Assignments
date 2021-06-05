package com.cg.eis.bean;

public class Employee {

	public int eId;
	public String eName;
	public int eSalary;
	public String eDesignation;
	public String insuranceScheme;
	public Employee(int eId, String eName, int eSalary, String eDesignation, String insuranceScheme) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
		this.eDesignation = eDesignation;
		this.insuranceScheme = insuranceScheme;
	}
	public Employee() {
		super();
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int geteSalary() {
		return eSalary;
	}
	public void seteSalary(int eSalary) {
		this.eSalary = eSalary;
	}
	public String geteDesignation() {
		return eDesignation;
	}
	public void seteDesignation(String eDesignation) {
		this.eDesignation = eDesignation;
	}
	public String getInsuranceScheme() {
		insuranceScheme="No Scheme";
		if((eSalary>=5000 && eSalary<20000) && eDesignation.equalsIgnoreCase("System Associate"))
			insuranceScheme="Scheme C";
		else if((eSalary>=20000 && eSalary<40000) && eDesignation.equalsIgnoreCase("Programmer"))
			insuranceScheme="Scheme B";
		else if(eSalary>=40000 && eDesignation.equalsIgnoreCase("Manager"))
			insuranceScheme="Scheme A";
		else if(eSalary<5000 && eDesignation.equalsIgnoreCase("Clerk"))
			insuranceScheme="No Scheme";
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eSalary=" + eSalary + ", eDesignation=" + eDesignation
				+ ", insuranceScheme=" + insuranceScheme + "]";
	}
	
	
	
	
}
