package quanLiStudent;

class Student {
    private String id;
    private String name;
    private int age;
    private String address;
    private double point;
    private String classroom;

    public Student() {
    }

    public Student(String id, String name, int age, String address, double point, String classroom) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.point = point;
        this.classroom = classroom;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public double getPoint() {
        return point;
    }
    public void setPoint(double point) {
        this.point = point;
    }

    public String getClassroom() {
        return classroom;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Point: " + point);
        System.out.println("Classroom: " + classroom);
        System.out.println();
    }
}
