import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.interfaces.Messenger;
import company.implementations.EmailMessenger;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Albert", 30);
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age exception: " + e.getMessage());
        }
        Messenger messenger = new EmailMessenger();
        messenger.sendMessage("Hello! This is a test message.");
    }
}

