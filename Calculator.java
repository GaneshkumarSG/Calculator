import java.util.*;

public class Calculator {

    public static void main(String[] args)
    {
        System.out.println("Welcome to the Calculator!");
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("Hi " + name);
        System.out.println("Enter the first value: ");
        double first_value = scanner.nextDouble();
        System.out.println("Enter the second value: ");
        double second_value = scanner.nextDouble();
        System.out.println("Enter the operation to be done: ");
        while (true)
        { 
            System.out.println("Press 1 for addition");
            System.out.println("Press 2 for subtraction"); 
            System.out.println("Press 3 for multiplication"); 
            System.out.println("Press 4 for divsision(quotient)"); 
            System.out.println("Press 5 for division(remainder)"); 
            System.out.println("Press 6 for EXIT"); 
            
            int opt = scanner.nextInt();
            switch(opt)
            {
                case 1:
                    System.out.println("The addition of two number is: " + (first_value + second_value));
                    break;
                case 2:
                    System.out.println("The subtraction of two number is: " + (first_value - second_value));
                    break;
                case 3:
                    System.out.println("The multiplication of two number is: " + (first_value * second_value));
                    break;
                case 4:
                    System.out.println("The quotient(division) of two number is: " + (first_value / second_value));
                    break;
                case 5:
                    System.out.println("The remainder(division) of two number is: " + (first_value % second_value));
                    break;
                default:
                    System.out.println("Please enter value between 1 to 5");
                    break;
            }
        if(opt == 6)
        {
            System.out.println("Thank you!");
            break;
        }

            
        }

    }
}
