import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.interfaces.Messenger;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Albert", 30);
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
        
            int num1 = 5;
            int num2 = 7;
            
            int sum = MathUtils.add(num1, num2);
            System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
            
            Messenger messenger = new EmailMessenger();
            messenger.sendMessage("The sum of " + num1 + " and " + num2 + " is: " + sum);
        
        } 
        
        
        
        catch (InvalidAgeException e) {
            System.out.println("Invalid age exception: " + e.getMessage());
        }
        

        
    }
}

