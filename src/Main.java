import company.beans.Person;
import company.exceptions.InvalidAgeException;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("John", 30);
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age exception: " + e.getMessage());
        }
    }
}

