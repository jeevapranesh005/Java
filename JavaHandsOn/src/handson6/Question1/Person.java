package handson6.Question1;

/**
 * Base class representing a person.
 */
public class Person {
    private String name;
    private String address;

    public Person() {
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void displayDetails() {
        System.out.println("Person Name: " + name);
        System.out.println("Address: " + address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', address='" + address + "'}";
    }
}
