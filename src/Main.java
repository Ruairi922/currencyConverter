import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public void converterFromEuro(int amount, String currency) {
        double exchangeRate = 0;

        double ans = 0.0;

        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        switch (currency.toUpperCase()) {
            case "RUB":
                exchangeRate = 101.51;
                ans = amount * exchangeRate;
                System.out.println("₽ " + decimalFormat.format(ans));
                break;
            case "ZAR":
                exchangeRate = 20.58;
                ans = amount * exchangeRate;
                System.out.println("R " + decimalFormat.format(ans));
                break;
            case "BRL":
                exchangeRate = 5.32;
                ans = amount * exchangeRate;
                System.out.println("R$ " + decimalFormat.format(ans));
                break;
            case "INR":
                exchangeRate = 91.73;
                ans = amount * exchangeRate;
                System.out.println("₹ " + decimalFormat.format(ans));
                break;
            default:
                System.out.println("Unsupported currency");
                break;
        }

    }

    public void converterToEuro(int amount, String currency) {
        double exchangeRate = 0;
        double ans = 0.0;
        if (currency.equals("RUB")) {
            exchangeRate = 101.51;
            ans = amount * exchangeRate;
            System.out.println("₽" + ans);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main temp = new Main();

        System.out.println("Please select an option below (1/2):");
        System.out.println("1) Convert from your currency to Euro");
        System.out.println("2) Convert from Euro to your currency");

        int choice = scanner.nextInt();

        if(choice==1){
            System.out.println("Method not ready");
        } else if(choice == 2) {
            System.out.println("Please enter the amount you wish to convert in €:");
            int amount = scanner.nextInt();
            // Consume the newline character left in the buffer
            scanner.nextLine();
            System.out.println("Please enter the currency you wish to convert to (e.g., RUB):");
            String currency = scanner.nextLine();
            System.out.println("---------------------------------------------");

            temp.converterFromEuro(amount, currency);
        } else {
            System.out.println("Invalid choice, please try again");
        }

        scanner.close();
    }
}
