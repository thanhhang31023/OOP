package employee;

import java.util.Vector;

class Person {
    private String name;
    private int age;
    private String add;
    private String tel;
    private String sex;

    public Person() {}

    public Person(String name, int age, String add, String tel, String sex) {
        this.name = name;
        this.age = age;
        this.add = add;
        this.tel = tel;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAdd() {
        return add;
    }

    public String getTel() {
        return tel;
    }

    public String getSex() {
        return sex;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + add);
        System.out.println("Telephone: " + tel);
        System.out.println("Sex: " + sex);
    }

    public static Vector<Person> findPeople(Vector<Person> p) {
        Vector<Person> youngPeople = new Vector<>();
        for (Person person : p) {
            if (person.getAge() < 30) {
                youngPeople.add(person);
            }
        }
        return youngPeople;
    }

    public long salary() {
        return 0;
    }
}
