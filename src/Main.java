import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
     public void converterFromEuro(int amount, String currency) {
        double exchangeRate = 0;

        double ans = 0.0;

        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        switch (currency.toUpperCase()) {
            case "RUB":
                exchangeRate = 101.74;
                ans = amount * exchangeRate;
                System.out.println("₽ " + decimalFormat.format(ans));
                break;
            case "ZAR":
                exchangeRate = 20.40;
                ans = amount * exchangeRate;
                System.out.println("R " + decimalFormat.format(ans));
                break;
            case "BRL":
                exchangeRate = 5.36;
                ans = amount * exchangeRate;
                System.out.println("R$ " + decimalFormat.format(ans));
                break;
            case "INR":
                exchangeRate = 92.45;
                ans = amount * exchangeRate;
                System.out.println("₹ " + decimalFormat.format(ans));
                break;
            case "TRY":
                exchangeRate = 32.65;
                ans = amount * exchangeRate;
                System.out.println("₺ " + decimalFormat.format(ans));
                break;
            case "KRW":
                exchangeRate = 1436.16;
                ans = amount * exchangeRate;
                System.out.println("₩ " + decimalFormat.format(ans));
                break;
            case "NOK":
                exchangeRate = 11.21;
                ans = amount * exchangeRate;
                System.out.println("kr " + decimalFormat.format(ans));
                break;
            case "HKD":
                exchangeRate = 8.67;
                ans = amount * exchangeRate;
                System.out.println("HK$ " + decimalFormat.format(ans));
                break;
            case "SGD":
                exchangeRate = 1.47;
                ans = amount * exchangeRate;
                System.out.println("S$ " + decimalFormat.format(ans));
                break;
            case "MXN":
                exchangeRate = 18.80;
                ans = amount * exchangeRate;
                System.out.println("$ " + decimalFormat.format(ans));
                break;
            case "NZD":
                exchangeRate = 1.75;
                ans = amount * exchangeRate;
                System.out.println("NZ$ " + decimalFormat.format(ans));
                break;
            case "SEK":
                exchangeRate = 11.04;
                ans = amount * exchangeRate;
                System.out.println("kr " + decimalFormat.format(ans));
            case "CNY":
                exchangeRate = 7.88;
                ans = amount * exchangeRate;
                System.out.println("¥ " + decimalFormat.format(ans));
                break;
            case "CHF":
                exchangeRate = 0.94;
                ans = amount * exchangeRate;
                System.out.println("₣ " + decimalFormat.format(ans));
                break;
            case "CAD":
                exchangeRate = 1.47;
                ans = amount * exchangeRate;
                System.out.println("CA$ " + decimalFormat.format(ans));
                break;
            case "AUD":
                exchangeRate = 1.62;
                ans = amount * exchangeRate;
                System.out.println("A$ " + decimalFormat.format(ans));
                break;
            case "GBP":
                exchangeRate = 0.87;
                ans = amount * exchangeRate;
                System.out.println("£ " + decimalFormat.format(ans));
                break;
            case "JPY":
                exchangeRate = 157.76;
                ans = amount * exchangeRate;
                System.out.println("¥ " + decimalFormat.format(ans));
                break;
            case "EUR":
                exchangeRate = 1.00;
                ans = amount * exchangeRate;
                System.out.println("¥ " + decimalFormat.format(ans));
                break;
            case "EUR":
                exchangeRate = 1.00;
                ans = amount * exchangeRate;
                System.out.println("€ " + decimalFormat.format(ans));
                break;
            case "USD":
                exchangeRate = 1.11;
                ans = amount * exchangeRate;
                System.out.println("$ " + decimalFormat.format(ans));
                break;
            default:
                System.out.println("Unsupported currency");
                break;
        }

    }

     public void converterToEuro(int amount, String currency) {
        double exchangeRate = 0;
        double ans = 0.0;

        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        switch (currency.toUpperCase()) {
            case "USD":
                exchangeRate = 0;
                ans = amount * exchangeRate;
                System.out.println("€ " + decimalFormat.format(ans));
                break;
            case "JPY":
                exchangeRate = 0;
                ans = amount * exchangeRate;
                System.out.println("€ " + decimalFormat.format(ans));
                break;
            case "GBP":
                exchangeRate = 0;
                ans = amount * exchangeRate;
                System.out.println("€ " + decimalFormat.format(ans));
                break;
            case "AUD":
                exchangeRate = 0;
                ans = amount * exchangeRate;
                System.out.println("€ " + decimalFormat.format(ans));
                break;
            case "CAD":
                exchangeRate = 0;
                ans = amount * exchangeRate;
                System.out.println("€ " + decimalFormat.format(ans));
                break;
            case "CHF":
                exchangeRate = 0;
                ans = amount * exchangeRate;
                System.out.println("€ " + decimalFormat.format(ans));
                break;
            case "CNY":
                exchangeRate = 0;
                ans = amount * exchangeRate;
                System.out.println("€ " + decimalFormat.format(ans));
                break;
            case "SEK":
                exchangeRate = 0;
                ans = amount * exchangeRate;
                System.out.println("€ " + decimalFormat.format(ans));
                break;
            case "NZD":
                exchangeRate = 0;
                ans = amount * exchangeRate;
                System.out.println("€ " + decimalFormat.format(ans));
                break;
            case "MXN":
                exchangeRate = 0;
                ans = amount * exchangeRate;
                System.out.println("€ " + decimalFormat.format(ans));
                break;
            case "SGD":
                exchangeRate = 0;
                ans = amount * exchangeRate;
                System.out.println("€ " + decimalFormat.format(ans));
                break;
            case "HKD":
                exchangeRate = 0;
                ans = amount * exchangeRate;
                System.out.println("€ " + decimalFormat.format(ans));
                break;
            case "NOK":
                exchangeRate = 0;
                ans = amount * exchangeRate;
                System.out.println("€ " + decimalFormat.format(ans));
                break;
            case "KRW":
                exchangeRate = 0;
                ans = amount * exchangeRate;
                System.out.println("€ " + decimalFormat.format(ans));
                break;
            case "TRY":
                exchangeRate = 0;
                ans = amount * exchangeRate;
                System.out.println("€ " + decimalFormat.format(ans));
                break;
            case "INR":
                exchangeRate = 0;
                ans = amount * exchangeRate;
                System.out.println("€ " + decimalFormat.format(ans));
                break;
            case "BRL":
                exchangeRate = 0;
                ans = amount * exchangeRate;
                System.out.println("€ " + decimalFormat.format(ans));
                break;
            case "ZAR":
                exchangeRate = 0;
                ans = amount * exchangeRate;
                System.out.println("€ " + decimalFormat.format(ans));
                break;
            case "RUB":
                exchangeRate = 0;
                ans = amount * exchangeRate;
                System.out.println("€ " + decimalFormat.format(ans));
                break;
            default:
                System.out.println("Unsupported currency");
                break;
        }
    }

    public static String getCurrenciesList() {
        String currencies = "";
        currencies += "USD - United States Dollar\n";
        currencies += "EUR - Euro\n";
        currencies += "JPY - Japanese Yen\n";
        currencies += "GBP - British Pound Sterling\n";
        currencies += "AUD - Australian Dollar\n";
        currencies += "CAD - Canadian Dollar\n";
        currencies += "CHF - Swiss Franc\n";
        currencies += "CNY - Chinese Yuan\n";
        currencies += "SEK - Swedish Krona\n";
        currencies += "NZD - New Zealand Dollar\n";
        currencies += "MXN - Mexican Peso\n";
        currencies += "SGD - Singapore Dollar\n";
        currencies += "HKD - Hong Kong Dollar\n";
        currencies += "NOK - Norwegian Krone\n";
        currencies += "KRW - South Korean Won\n";
        currencies += "TRY - Turkish Lira\n";
        currencies += "INR - Indian Rupee\n";
        currencies += "BRL - Brazilian Real\n";
        currencies += "ZAR - South African Rand\n";
        currencies += "RUB - Russian Ruble\n";

        return currencies.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main temp = new Main();

        String currencyList = getCurrenciesList();
        System.out.println("List of Currencies:");
        System.out.println(currencyList);

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
