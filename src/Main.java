import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //sets up the scan object from class scanner to be able to accept user input

        double tipTotal; //Sets up every variable that need to be calculated from user input.
        double billAndTipTotal;
        double tipPerPerson;
        double totalPerPerson;

        System.out.println("-------------------------------------------------------------------");
        //asks the user for their total bill, percentage tip, and the amount of people paying

        System.out.print("What is your total bill?: $");
        double billTotal = scan.nextDouble();
        scan.nextLine();//clears the system to make sure there aren't any left over doubles or integers

        System.out.print("What is the percentage tip? (Enter as a whole number): ");
        int tipPercentage = scan.nextInt();
        scan.nextLine();

        System.out.print("How many people are paying?: ");
        int numberOfPeople = scan.nextInt();
        scan.nextLine();

        System.out.println("-------------------------------------------------------------------");
        //calculates and prints the total tip, the total bill plus tip, the tip paid per person, and each person's split of the bill plus tip

        tipTotal = billTotal * (tipPercentage/100.0); //calculating total tip by multiplying the bill by the actual tip percentage
        tipTotal = (int)(tipTotal * 100)/100.0; //multiplies the total tip by 100 to move the decimal 2 places to the left, rounds to the nearest whole number via type casting
        // and then divides by 100 to get back to the original number except every digit past the hundredths place is gone.
        System.out.print("The total tip amount is $");
        System.out.printf("%.2f", tipTotal); //formats the print function so that tipTotal is printed up to the hundredths place at all times even if there are trailing zeros
        System.out.println();

        billAndTipTotal = billTotal + tipTotal;
        System.out.print("The total bill plus tip amount is $");
        System.out.printf("%.2f", billAndTipTotal);
        System.out.println();

        tipPerPerson =  tipTotal/numberOfPeople;
        tipPerPerson = (int)(tipPerPerson * 100)/100.0;
        System.out.print("The total tip paid for each person is $");
        System.out.printf("%.2f", tipPerPerson);
        System.out.println();

        totalPerPerson =  billAndTipTotal/numberOfPeople;
        totalPerPerson = (int)(totalPerPerson * 100)/100.0;
        System.out.print("The total price per person is $");
        System.out.printf("%.2f", totalPerPerson);
        System.out.println();

        System.out.println("-------------------------------------------------------------------");
    }
}