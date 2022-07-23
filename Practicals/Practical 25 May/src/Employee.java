import java.util.Scanner;

public class Employee {
    int id;
    String firstName;
    String lastName;
    int salary;

    Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary= salary;
    }

    int getID() {
        return id;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    String getName() {
        return firstName+lastName;
    }

    int getSalary() {
        return salary;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }

    int getAnnualSalary(){
        return salary*12;
    }

    int raiseSalary(double percent){
        salary += salary*(percent/100.0);
        return salary;
    }

    String to_string(){
        return ("Employee [id-"+id+", name-"+firstName+" "+lastName+", salary-"+salary+"]");
    }
}



class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println( emp1.to_string() );
        emp1.setSalary(999);
        System.out.println( emp1.to_string() );
        System.out.println( "id is: " + emp1.getID() );
        System.out.println( "firstname is: " + emp1.getFirstName() );
        System.out.println( "lastname is: " + emp1.getLastName() );
        System.out.println( "salary is: " + emp1.getSalary() );
        
        Scanner in = new Scanner(System.in);
        int newSalary = in.nextInt();
        emp1.setSalary(newSalary);
        System.out.println( emp1.to_string() );
        in.close();
    }
}