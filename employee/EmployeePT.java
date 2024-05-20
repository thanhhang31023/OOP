package employee;

import java.util.Vector;

class EmployeePT extends Person {
    private int hour;
    private long money;

    public EmployeePT() {}

    public EmployeePT(String name, int age, String add, String tel, String sex, int hour, long money) {
        super(name, age, add, tel, sex);
        this.hour = hour;
        this.money = money;
    }

    public int getHour() {
        return hour;
    }

    public long getMoney() {
        return money;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Hours worked: " + hour);
        System.out.println("Salary: " + salary());
    }

    @Override
    public long salary() {
        return hour * money;
    }

    public static Vector<EmployeePT> getMaxSalary(Vector<EmployeePT> pt) {
        Vector<EmployeePT> result = new Vector<>();
        if (pt.isEmpty()) return result;
        long maxSalary = Long.MIN_VALUE;
        for (EmployeePT employee : pt) {
            long salary = employee.salary();
            if (salary > maxSalary) {
                maxSalary = salary;
                result.clear();
                result.add(employee);
            } else if (salary == maxSalary) {
                result.add(employee);
            }
        }
        return result;
    }
}
