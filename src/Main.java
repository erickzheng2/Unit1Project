import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double tipTotal; //Sets up every variable that need to be calculated from user input.
        double billAndTipTotal;
        double tipPerPerson;
        double totalPerPerson;

        System.out.println("-------------------------------------------------------------------");

        System.out.print("What is your total bill?: $");
        double billTotal = scan.nextDouble();
        scan.nextLine();

        System.out.print("What is the percentage tip? (Enter as a whole number): ");
        int tipPercentage = scan.nextInt();
        scan.nextLine();

        System.out.print("How many people are paying?: ");
        int numberOfPeople = scan.nextInt();
        scan.nextLine();

        System.out.println("-------------------------------------------------------------------");

        tipTotal = billTotal * (tipPercentage/100.0);
        tipTotal = (int)(tipTotal * 100)/100.0;
        System.out.print("The total tip amount is $");
        System.out.printf("%.2f", tipTotal);
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