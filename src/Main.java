import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.interfaces.Messenger;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
       
        Person[] people = new Person[5];
        final int b = 10;
        try {
            people[0] = new Person("Jan Doeński", 30);
            people[1] = new Person("Jan Kowalski", 25);
            people[2] = new Person("Włodzimierz Biały", 40);
            people[3] = new Person("Michał Wiśniewski", 35);
            people[4] = new Person("Mike Tyson", 28);

            for (Person person : people) {
                int value = MathUtils.add(person.getAge(), b );
                String message = "Value for " + person.getName() + ": " + value;
                
                Messenger messenger = new EmailMessenger();
                messenger.sendMessage(message);
            }
        }
        
        
        
        catch (InvalidAgeException e) {
            System.out.println("Invalid age exception: " + e.getMessage());
        }
        

        
    }
}

