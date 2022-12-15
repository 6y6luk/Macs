package lab_3_6.src;

public class EmployeeTest {
    public static void main(String args[]) 
    {
        /* Create two objects using constructor */
        Employee empOne = new Employee("James Smith");
        Employee empTwo = new Employee("Mary Anne",33);
        Employee empThree = new Employee("Jan Kowalski",44,"Testy");
        // Invoking methods for each object created
        empOne.setAge(26);
        empOne.setDepartment("Development");
        empOne.setSalary(1000);
        empOne.printEmployee();
        empTwo.setDepartment("Software");
        empTwo.setSalary(500);
        empTwo.printEmployee();
        empThree.salary = 1500;
        empThree. printEmployee();
    }
}
