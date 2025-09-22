import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double tipTotal;
        double billAndTipTotal;
        double tipPerPerson;
        double totalPerPerson;

        System.out.println("-------------------------------------------------------------------");

        System.out.print("What is your total bill?: $");
        double billTotal = scan.nextDouble();
        scan.nextLine();

        System.out.print("What is the percentage tip? (Enter as a whole number): ");
        double tipPercentage = scan.nextDouble();
        scan.nextLine();

        System.out.print("How many people are paying?: ");
        int numberOfPeople = scan.nextInt();
        scan.nextLine();

        System.out.println("-------------------------------------------------------------------");

        tipTotal = billTotal * (tipPercentage/100);
        System.out.println("The total tip amount is $" + tipTotal + ".");


        billAndTipTotal = billTotal + tipTotal;
        System.out.println("The total bill plus tip amount is $" + billAndTipTotal + ".");

        tipPerPerson =  tipTotal/numberOfPeople;
        System.out.println("The total tip paid for each person is $" + tipPerPerson + ".");

        totalPerPerson =  billAndTipTotal/numberOfPeople;
        System.out.println("The total price padif  paid for is $" + totalPerPerson + ".");

    }
}