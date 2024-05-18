package xeTransport;

public class Transport {
    private String manufacturer;
    private String name;
    private int year;
    private int speed;

    public Transport() {}

    public Transport(String manufacturer, String name, int year, int speed) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.year = year;
        this.speed = speed;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void display() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Name: " + name);
        System.out.println("Year Of Manufacturer: " + year);
        System.out.println("Speed: " + speed);
    }
}
