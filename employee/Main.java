package employee;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        // Creating Persons
        Vector<Person> people = new Vector<>();
        people.add(new Person("John", 25, "123 Main St", "123456789", "Male"));
        people.add(new Person("Alice", 35, "456 Oak St", "987654321", "Female"));
        people.add(new Person("Bob", 20, "789 Elm St", "456789123", "Male"));

        // Displaying information of all Persons
        System.out.println("All People:");
        for (Person person : people) {
            person.display();
            System.out.println("--------------------------");
        }

        // Finding and displaying information of people under 30
        System.out.println("Young People:");
        Vector<Person> youngPeople = Person.findPeople(people);
        for (Person youngPerson : youngPeople) {
            youngPerson.display();
            System.out.println("--------------------------");
        }

        // Creating EmployeePT objects
        Vector<EmployeePT> ptEmployees = new Vector<>();
        ptEmployees.add(new EmployeePT("John", 25, "123 Main St", "123456789", "Male", 40, 10));
        ptEmployees.add(new EmployeePT("Alice", 35, "456 Oak St", "987654321", "Female", 50, 12));
        ptEmployees.add(new EmployeePT("Bob", 20, "789 Elm St", "456789123", "Male", 45, 15));

        // Displaying information of all EmployeePT
        System.out.println("EmployeePT Information:");
        for (EmployeePT employee : ptEmployees) {
            employee.display();
            System.out.println("--------------------------");
        }

        // Finding and displaying employee with max salary for EmployeePT
        System.out.println("EmployeePT with Max Salary:");
        Vector<EmployeePT> maxPTSalaryEmployees = EmployeePT.getMaxSalary(ptEmployees);
        for (EmployeePT employee : maxPTSalaryEmployees) {
            employee.display();
            System.out.println("--------------------------");
        }

        // Creating EmployeeFT objects
        Vector<EmployeeFT> ftEmployees = new Vector<>();
        ftEmployees.add(new EmployeeFT("Jane", 28, "321 Pine St", "987654321", "Female", 20, 500));
        ftEmployees.add(new EmployeeFT("Doe", 32, "654 Maple St", "123456789", "Male", 25, 600));
        ftEmployees.add(new EmployeeFT("Eva", 24, "987 Cedar St", "456789123", "Female", 22, 550));

        // Displaying information of all EmployeeFT
        System.out.println("EmployeeFT Information:");
        for (EmployeeFT employee : ftEmployees) {
            employee.display();
            System.out.println("--------------------------");
        }

        // Finding and displaying employee with max salary for EmployeeFT
        System.out.println("EmployeeFT with Max Salary:");
        Vector<EmployeeFT> maxFTSalaryEmployees = EmployeeFT.getMaxSalary(ftEmployees);
        for (EmployeeFT employee : maxFTSalaryEmployees) {
            employee.display();
            System.out.println("--------------------------");
        }
    }
}
