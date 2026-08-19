import java.util.Scanner;

public class ControlAssignment{

    public static void main(String[] args) {
        System.out.println("\nThis is a demo for the Control Assignment.\n");
        Scanner scanner = new Scanner(System.in);   // this takes the input from user, pass to each method.
        demoDivisibleByThreeFive(scanner);
        demoBudgetRide(scanner);
        demoZodiacSign(scanner);
        scanner.close();                            // close the scanner to conserve resources.
    }   

    private static void demoDivisibleByThreeFive(Scanner scanner)
    {
        int numberToCheck = 0;                                  // this variable holds the number to check for divisibility.
       
        System.out.println("\nEnter a number to check if it is divisible by 3 and/or 5: ");
        numberToCheck = scanner.nextInt();
        if( (numberToCheck % 3 == 0) && (numberToCheck % 5 == 0) )          // this checks for divisibility by 3 and 5.
        {
            System.out.println(numberToCheck + " is divisible by 3 and 5.");
        }
        else if ( numberToCheck % 3 == 0)                       // this checks for divisibility by 3.
        {
            System.out.println(numberToCheck + " is divisible by 3.");  
        }
        else if (numberToCheck % 5 == 0)                        // this checks for divisibility by 5.
        {
            System.out.println(numberToCheck + " is divisible by 5.");  
        }
        else                                        // this handles when input is not divisible by 3 or 5.
        {
            System.out.println(numberToCheck + " is not divisible by 3 or 5.");
        }
        
    }

    private static void demoBudgetRide(Scanner scanner)
    {
        int budget = 0;                               // this is the input for budget.        
        System.out.println("\nEnter a budget amount: ");
        budget = scanner.nextInt();

        if( budget > 100 )                               // this budget allows a taxi ride.
        {
            System.out.println(budget + " allows a taxi ride.");
        }
        else if ( budget >= 50 && budget <=100)               // this budget allows a train ride.
        {
            System.out.println(budget + " allows a train ride.");  
        }
        else if ( budget >= 20 && budget <= 49)               // this budget allows a bus ride.
        {
            System.out.println(budget + " allows a bus ride.");
        }
         else if ( budget >= 0 && budget <= 19)               // this budget allows a walk.
        {
            System.out.println(budget + " allows a walk.");
        }
        else                                        // this handles when input is not sufficient for any ride.
        {
            System.out.println(budget + " is not sufficient for any ride.");
        }
    }

    private static void demoZodiacSign(Scanner scanner)
    {
        int year = 0;                               // this is the input for birth year.
        System.out.println("\nEnter your birth year: ");
        year = scanner.nextInt();

        String zodiacSign = "";                    // this is the variable to hold the zodiac sign.
        if (year <= 0)                              // this handles when input is not a valid year.
        {
            zodiacSign = "not determined due to invalid input. Please enter a positive birth year.";
        }
        else
        {
            int cycle = ((year - 4) % 12 + 12) % 12 + 1; // this maps the year onto the 12-year Chinese zodiac cycle (1-12).
            switch(cycle)
            {
                case 1 -> zodiacSign = "Rat";
                case 2 -> zodiacSign = "Ox";
                case 3 -> zodiacSign = "Tiger";
                case 4 -> zodiacSign = "Rabbit";
                case 5 -> zodiacSign = "Dragon";
                case 6 -> zodiacSign = "Snake";
                case 7 -> zodiacSign = "Horse";
                case 8 -> zodiacSign = "Goat";
                case 9 -> zodiacSign = "Monkey";
                case 10 -> zodiacSign = "Rooster";
                case 11 -> zodiacSign = "Dog";
                case 12 -> zodiacSign = "Pig";
            }
        }
        System.out.println("Your Chinese zodiac sign is " + zodiacSign + ".");
    }
    
}