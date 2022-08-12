import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.println("principal");
        int principal = scanner.nextInt();

        System.out.println(" annual interest rate:");
        float AnnualInterest = scanner.nextFloat();
        float MonthlyInterest = AnnualInterest/PERCENT/MONTHS_IN_YEAR;

        System.out.println("period (years): ");
        byte YEARS = scanner.nextByte();
        int number_of_payment = YEARS * MONTHS_IN_YEAR;

        double mortage = principal * (MonthlyInterest * Math.pow(1 + MonthlyInterest, number_of_payment)/(Math.pow( 1 + MonthlyInterest, number_of_payment)-1));
        String mortageFormatted = NumberFormat.getCurrencyInstance().format(mortage);

        System.out.println("mortage: " + mortageFormatted);
    }
}