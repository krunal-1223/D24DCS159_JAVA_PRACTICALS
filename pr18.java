
class Member {

    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;


    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {

    String specialization;

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        printSalary();  // Calling method from Member class
        System.out.println("Specialization: " + specialization);
    }
}

class Manager extends Member {
    String department;

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        printSalary();  // Calling method from Member class
        System.out.println("Department: " + department);
    }
}

public class pr18 {
    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.name = "John Doe";
        emp.age = 30;
        emp.phoneNumber = "123-456-7890";
        emp.address = "123 Elm Street";
        emp.salary = 50000;
        emp.specialization = "Software Development";
        System.out.println("Employee Details:");
        emp.printDetails();

        System.out.println();
        Manager mgr = new Manager();
        mgr.name = "Jane Smith";
        mgr.age = 45;
        mgr.phoneNumber = "987-654-3210";
        mgr.address = "456 Oak Avenue";
        mgr.salary = 75000;
        mgr.department = "Human Resources";
        System.out.println("Manager Details:");
        mgr.printDetails();
    }
}
