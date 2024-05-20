package employee;

import java.util.Vector;

class EmployeeFT extends Person {
    private int day;
    private long money;

    public EmployeeFT() {}

    public EmployeeFT(String name, int age, String add, String tel, String sex, int day, long money) {
        super(name, age, add, tel, sex);
        this.day = day;
        this.money = money;
    }

    public int getDay() {
        return day;
    }

    public long getMoney() {
        return money;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Days worked: " + day);
        System.out.println("Salary: " + salary());
    }

    @Override
    public long salary() {
        return day * money;
    }

    public static Vector<EmployeeFT> getMaxSalary(Vector<EmployeeFT> ft) {
        Vector<EmployeeFT> result = new Vector<>();
        if (ft.isEmpty()) return result;
        long maxSalary = Long.MIN_VALUE;
        for (EmployeeFT employee : ft) {
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