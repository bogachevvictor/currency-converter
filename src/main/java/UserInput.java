import java.util.Scanner;
import java.util.regex.Pattern;

public class UserInput {
    public double getAmount() {
        double amount;
        Scanner console = new Scanner(System.in);
        do {
            System.out.println("Please enter a amount.");
            while (!console.hasNextDouble()) {
                System.out.println("Error! Please enter a amount.");
                console.nextDouble();
            }
            amount = console.nextDouble();
        } while (amount <= 0);
        return amount;
    }
    public String getOriginCurrency() {
        String originCurrency = null;
        System.out.println("Please enter a origin currency (EUR, USD or GBP).");
        Scanner console = new Scanner(System.in);
        while (!console.hasNext("EUR") && !console.hasNext("USD") && !console.hasNext("GBP")) {
            System.out.println("Error! Please enter a origin currency (EUR, USD or GBP).");
            console.next();
        }
        originCurrency = console.next();
        return originCurrency;
    }
    public String getTargetCurrency() {
        String targetCurrency = null;
        System.out.println("Please enter a target currency (EUR, USD or GBP).");
        Scanner console1 = new Scanner(System.in);
        while (!console1.hasNext("EUR") && !console1.hasNext("USD") && !console1.hasNext("GBP")) {
            System.out.println("Error! Please enter a target currency (EUR, USD or GBP).");
            console1.next();
        }
        targetCurrency = console1.next();
        return targetCurrency;
    }
}
