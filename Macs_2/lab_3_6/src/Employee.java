package lab_3_6.src;

public class Employee 
{
    String name; // Nazwisko
    int age; // Wiek
    String department; // dział
    double salary; // Pensja
    
    // This is the constructor 1 of the class Employee
    public Employee(String name) {
    // Tu nalezy uzupełnić
        this.name = name;
    }
    // This is the constructor 2 of the class Employee
    public Employee(String name, int age) {
    // Tu nalezy uzupełnić
        this.name = name;
        this.age = age;
    }
    // This is the constructor 3 of the class Employee
    public Employee(String name, int age, String department) {
    // Tu nalezy uzupełnić
        this.name = name;
        this.age = age;
        this.department = department;
    }
    
    // Podaj wiek
    public int getAge() {
    // Tu nalezy uzupełnić
        return age;
    }
    public void setAge(int age) {
        this.age =age;
    }
    // Podaj oddział
    public String getDepartment() {
    // Tu nalezy uzupełnić
        return department;
    }
    // Ustaw oddział
    public void setDepartment(String department) {
    // Tu nalezy uzupełnić
        this.department = department;
    }
    // Ustaw pensje - salary
    public void setSalary(double empSalary) {
    // Tu nalezy uzupełnić
        this.salary = empSalary;
    }
    // Podaj pensje - salary
    public double getSalary(double empSalary) {
    // Tu nalezy uzupełnić
        return salary;
    }
    // Drukuj dane pracownika
    public void printEmployee() {
    // Tu nalezy uzupełnić
        System.out.printf("\nname:\t%s\nage:\t%d\ndepartament:\t%s\nsalsary:\t%f\n", name, age, department, salary);
    }
}