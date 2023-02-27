// S.O.L.I.D
// D - DRY - Donot Repeat Yourself

class Employee {
    int id;
    String name;
    double salary;
    String dept;

    public void takeInput(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public void showEmp() {
        // java uses this keyword internally
        // this = refers to current object
        System.out.println("Emp ID : " + this.id);
        System.out.println("Emp Name : " + this.name);
        System.out.println("Emp Dept : " + dept);
        System.out.println("Emp Salary : " + salary);
    }

}

public class ClassDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();
        // emp.id = 101;
        // emp.name = "John";
        // emp.dept = "IT";
        // emp.salary = 45000.00;
        emp.takeInput(101, "John", "IT", 45000.00);
        emp.showEmp();
        // System.out.println("Emp ID : " + emp.id);
        // System.out.println("Emp Name : " + emp.name);
        // System.out.println("Emp Dept : " + emp.dept);
        // System.out.println("Emp Salary : " + emp.salary);
        // Object emp = new Employee();

        Employee emp_2 = new Employee();
        // emp_2.id = 102;
        // emp_2.name = "Mac";
        // emp_2.dept = "IT";
        // emp_2.salary = 50000.00;
        // System.out.println("Emp ID : " + emp_2.id);
        // System.out.println("Emp Name : " + emp_2.name);
        // System.out.println("Emp Dept : " + emp_2.dept);
        // System.out.println("Emp Salary : " + emp_2.salary);
        emp_2.takeInput(102, "Max", "IT", 60000.00);
        emp_2.showEmp();
    }
}