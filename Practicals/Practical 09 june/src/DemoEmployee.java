class Person
{
	private String name;

	public Person()
	{
		name = "No name yet.";
	}
	public Person(String n)
	{
		name = n;
	}
	public void setName(String newName)
	{
		name = newName;
	}
	public String getName()
	{
		return name;
	}
	public void print()
	{
		System.out.println("Name: " + name);
	}
	public boolean equals(Person p)
	{
		return name.equals(p.name);
	}
}

class Employee extends Person
{
    private double annual_salary;
    private int year_of_joining;
    private String national_insurance_no;
    
	public Employee()
	{
		annual_salary = 0.0;
		year_of_joining = 0000;
		national_insurance_no = "-";
	}

	public Employee(String name, double annual_salary, int year_of_joining, String national_insurance_no)
	{
		super(name);
		this.annual_salary = annual_salary;
		this.year_of_joining = year_of_joining;
		this.national_insurance_no = national_insurance_no;
	}

	public Employee( Employee emp)
	{
		super(emp.getName());
		annual_salary = emp.annual_salary;
		year_of_joining = emp.year_of_joining;
		national_insurance_no = emp.national_insurance_no;
	}

	public Employee(String name, int year_of_joining, String national_insurance_no)
	{
		super(name);
		this.year_of_joining = year_of_joining;
		this.national_insurance_no = national_insurance_no;
		this.annual_salary = 0.0;
	}

	public void setAnnualSal(double newSal){
		annual_salary = newSal;
	}

	public void setYearOfJoining(int newYear){
		year_of_joining = newYear;
	}

	public void setNationalInsNo(String newNo){
		national_insurance_no = newNo;
	}

	public double getAnnualSal(){
		return annual_salary;
	}

	public int getYearOfJoining(){
		return year_of_joining;
	}

	public String getNationalInsNo(){
		return national_insurance_no;
	}

	public boolean equals(Employee emp){
		return ( (super.equals(emp)) && (annual_salary == emp.annual_salary) && (year_of_joining == emp.year_of_joining) && (national_insurance_no.equals(emp.national_insurance_no)) );
	}

}


public class DemoEmployee{
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		System.out.print("EMPLOYEE 1");
		System.out.println("\nName: "+emp1.getName()+"\nAnnual Salary: "+emp1.getAnnualSal()+"\nYear of Joining: "+emp1.getYearOfJoining()+"\nNational Insurance Number: "+emp1.getNationalInsNo());
		emp1.setName("John");
		emp1.setAnnualSal(200000.0);
		emp1.setYearOfJoining(2020);
		emp1.setNationalInsNo("SS2020");

		System.out.print("\nEMPLOYEE 1 (After Changes)");
		System.out.println("\nName: "+emp1.getName()+"\nAnnual Salary: "+emp1.getAnnualSal()+"\nYear of Joining: "+emp1.getYearOfJoining()+"\nNational Insurance Number: "+emp1.getNationalInsNo());
		
		Employee emp2 = new Employee("John", 200000.0, 2020, "SS2020");
		System.out.print("\nEMPLOYEE 2");
		System.out.println("\nName: "+emp2.getName()+"\nAnnual Salary: "+emp2.getAnnualSal()+"\nYear of Joining: "+emp2.getYearOfJoining()+"\nNational Insurance Number: "+emp2.getNationalInsNo());

		if (emp1.equals(emp2)) System.out.println("\nEmployee 1 is same as employee 2.");

	}
}
