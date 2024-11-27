import java.util.Scanner;
public class CurrencyConverter {
    // 1 usd = 84.44 rs, 1rs = 0.012 usd
    // 1 euro = 88rs, 1rs = 0.011 euro
    // 1 pound = 105.82 rs, 1rs = 0.0095 pound

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Currency Converter!");

        while (true) {
            System.out.println("Choose currency to convert");
            System.out.println("1-> USD ");
            System.out.println("2-> EURO ");
            System.out.println("3-> POUND ");
            System.out.println("4-> INR ");

            // Read user input for source currency
            int fromCurrency = sc.nextInt();

            // Display menu for selecting the target currency
            System.out.println("Convert to");
            System.out.println("1-> USD ");
            System.out.println("2-> EURO ");
            System.out.println("3-> POUND ");
            System.out.println("4-> INR ");

            // Read user input for target currency
            int toCurrency = sc.nextInt();

            System.out.println("Enter Amount");
            double amount = sc.nextDouble();

            switch (fromCurrency) {
                case 1:
                    switch (toCurrency) {
                        case 1:
                            System.out.println("Converted Amount: " + amount + " USD = " + amount + " USD ");
                            break;
                        case 2:
                            System.out.println("Converted Amount: " + amount + " USD = " + amount * 0.96 + " EURO ");
                            break;
                        case 3:
                            System.out.println("Converted Amount: " + amount + " USD = " + amount * 0.80 + " POUND ");
                            break;
                        case 4:
                            System.out.println("Converted Amount: " + amount + " USD = " + amount * 84.44 + " INR ");
                            break;
                    }
                    break;
                case 2:
                    switch (toCurrency) {
                        case 1:
                            System.out.println("Converted Amount: " + amount + " EURO = " + 1.04 * amount + " USD ");
                            break;
                        case 2:
                            System.out.println("Converted Amount: " + amount + " EURO = " + amount + " EURO ");
                            break;
                        case 3:
                            System.out.println("Converted Amount: " + amount + " EURO = " + 0.83 * amount + " POUND ");
                            break;
                        case 4:
                            System.out.println("Converted Amount: " + amount + " EURO = " + amount * 88 + " INR ");
                            break;
                    }

                    break;
                case 3:
                    switch (toCurrency) {
                        case 1:
                            System.out.println("Converted Amount: " + amount + " POUND = " + 1.25 * amount + " USD ");
                            break;
                        case 2:
                            System.out.println("Converted Amount: " + amount + " POUND = " + amount * 1.2 + " EURO ");
                            break;
                        case 3:
                            System.out.println("Converted Amount: " + amount + " POUND = " + amount + " POUND ");
                            break;
                        case 4:
                            System.out.println("Converted Amount: " + amount + " POUND = " + amount * 105.82 + " INR ");
                            break;
                    }
                    break;

                case 4:
                    switch (toCurrency) {
                        case 1:
                            System.out.println("Converted Amount: " + amount + " INR = " + 0.012 * amount + " USD ");
                            break;
                        case 2:
                            System.out.println("Converted Amount: " + amount + " INR = " + amount * 0.011 + " EURO ");
                            break;
                        case 3:
                            System.out.println("Converted Amount: " + amount + " INR = " + 0.0095 * amount + " POUND ");
                            break;
                        case 4:
                            System.out.println("Converted Amount: " + amount + " INR = " + amount + " INR ");
                            break;
                    }
                    break;
                default:
                    System.out.println("Invalid currency selection!");
            }

            System.out.println("\nDo you want to perform another conversation?  (yes/no)");
            sc.nextLine();
            String choice = sc.nextLine();

            if (!choice.equalsIgnoreCase("yes")) {
                System.out.println("Thank you for using the Currency Converter!");
                break;
            }
        }

        sc.close(); // Close the scanner to release resources
    }


}


