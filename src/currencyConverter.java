import java.text.DecimalFormat;
import java.util.*;

public class currencyConverter {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        String userChoice = "0";
        currentCurrency currency;
        while (userChoice != "10") {

            System.out.println("Welcome to Chris's Currency Converter!\n" +
                    "Choose a currency you want to convert");
            System.out.println("1 - US Dollar");
            System.out.println("2 - British Pound");
            System.out.println("3 - South African Rand");
            System.out.println("4 - Euro");
            System.out.println("5 - Australian Dollar");
            System.out.println("6 - Japanese Yen");
            System.out.println("7 - Chinese Yuan");
            System.out.println("8 - Canadian Dollar");
            System.out.println("9 - Indian Rupee");
            System.out.println("10 - exit");

            userChoice = input.next();

            switch (userChoice) {
                case "1":
                    currency = new currentCurrency("US Dollars", "USD");
                    convertToMenu(currency);
                    break;
                case "2":
                    currency = new currentCurrency("Pounds", "GBP");
                    convertToMenu(currency);
                    break;
                case "3":
                    currency = new currentCurrency("Rands", "ZAR");
                    convertToMenu(currency);
                    break;
                case "4":
                    currency = new currentCurrency("Euros", "EUR");
                    convertToMenu(currency);
                    break;
                case "5":
                    currency = new currentCurrency("Australian Dollar", "AUD");
                    convertToMenu(currency);
                    break;
                case "6":
                    currency = new currentCurrency("Japanese Yen", "JPY");
                    convertToMenu(currency);
                    break;
                case "7":
                    currency = new currentCurrency("Chinese Yuan", "CNY");
                    convertToMenu(currency);
                    break;
                case "8":
                    currency = new currentCurrency("Canadian Dollars", "CAD");
                    convertToMenu(currency);
                    break;
                case "9":
                    currency = new currentCurrency("Indian Rupees", "INR");
                    convertToMenu(currency);
                    break;
                case "10":
                    System.out.println("Goodbye!");
                    userChoice = "10";
                    break;
                default:
                    System.out.println("Not a valid option, try again.");

            }
        }
    }

    public static void convertToMenu(currentCurrency currency) {

        Scanner input2 = new Scanner(System.in);
        String userChoice2 = "0";
        double exchangeRate;

        Map<String, Double> exchangeRates = currency.getConversions();

        while (userChoice2 != "10") {

            System.out.println("Choose a currency you want to convert to:");
            System.out.println("1 - US Dollar");
            System.out.println("2 - British Pound");
            System.out.println("3 - South African Rand");
            System.out.println("4 - Euro");
            System.out.println("5 - Australian Dollar");
            System.out.println("6 - Japanese Yen");
            System.out.println("7 - Chinese Yuan");
            System.out.println("8 - Canadian Dollar");
            System.out.println("9 - Indian Rupee");
            System.out.println("10 - Go back");

            userChoice2 = input2.next();

            switch (userChoice2) {
                case "1":
                    exchangeRate = exchangeRates.get("USD");
                    System.out.println("The current exchange rate is " + exchangeRate + " " + currency.getCurrency()
                            + " to 1.00 USD.");
                    convertAmountMenu(currency, exchangeRate, "USD");
                    break;
                case "2":
                    exchangeRate = exchangeRates.get("GBP");
                    System.out.println("The current exchange rate is " + exchangeRate + " " + currency.getCurrency()
                            + " to 1.00 GBP.");
                    convertAmountMenu(currency, exchangeRate, "GBP");
                    break;
                case "3":
                    exchangeRate = exchangeRates.get("ZAR");
                    System.out.println("The current exchange rate is " + exchangeRate + " " + currency.getCurrency()
                            + " to 1.00 ZAR.");
                    convertAmountMenu(currency, exchangeRate, "ZAR");
                    break;
                case "4":
                    exchangeRate = exchangeRates.get("EUR");
                    System.out.println("The current exchange rate is " + exchangeRate + " " + currency.getCurrency()
                            + " to 1.00 EUR.");
                    convertAmountMenu(currency, exchangeRate, "EUR");
                    break;
                case "5":
                    exchangeRate = exchangeRates.get("AUD");
                    System.out.println("The current exchange rate is " + exchangeRate + " " + currency.getCurrency()
                            + " to 1.00 AUD.");
                    convertAmountMenu(currency, exchangeRate, "AUD");
                    break;
                case "6":
                    exchangeRate = exchangeRates.get("JPY");
                    System.out.println("The current exchange rate is " + exchangeRate + " " + currency.getCurrency()
                            + " to 1.00 JPY.");
                    convertAmountMenu(currency, exchangeRate, "JPY");
                    break;
                case "7":
                    exchangeRate = exchangeRates.get("CNY");
                    System.out.println("The current exchange rate is " + exchangeRate + " " + currency.getCurrency()
                            + " to 1.00 CNY.");
                    convertAmountMenu(currency, exchangeRate, "CNY");
                    break;
                case "8":
                    exchangeRate = exchangeRates.get("CAD");
                    System.out.println("The current exchange rate is " + exchangeRate + " " + currency.getCurrency()
                            + " to 1.00 CAD.");
                    convertAmountMenu(currency, exchangeRate, "CAD");
                    break;
                case "9":
                    exchangeRate = exchangeRates.get("INR");
                    System.out.println("The current exchange rate is " + exchangeRate + " " + currency.getCurrency()
                            + " to 1.00 INR.");
                    convertAmountMenu(currency, exchangeRate, "INR");
                    break;
                case "10":
                    System.out.println("Goodbye!");
                    userChoice2 = "10";
                    break;
                default:
                    System.out.println("Not a valid option, try again.");

            }
        }

    }

    public static String decimalFormat(double exchangeRate) {

        DecimalFormat decimalString = new DecimalFormat("0.00");

        String formattedValue = decimalString.format(exchangeRate);

        return formattedValue;
    }

    public static void convertAmountMenu(currentCurrency currency, double exchangeRate, String convertToCode) {
        Scanner input3 = new Scanner(System.in);

        double userChoice3 = 0;

        String newMoneyString;
        String userChoice3String;

        while (userChoice3 != -1) {
            try {
                System.out.println("How much do you want to convert? (Enter -1 to go back)");

                while (!input3.hasNextDouble()) {
                    String invalidInput = input3.next(); // Read and discard the invalid input
                    System.out.print("Not a valid amount, try again.\n");
                }
                
                userChoice3 = input3.nextDouble();
                if (userChoice3 != -1) {
                    double newMoney = userChoice3 * exchangeRate;
                    newMoneyString = decimalFormat(newMoney);
                    userChoice3String = decimalFormat(userChoice3);
                    System.out.println(userChoice3String + " " + currency.getCurrencyCode() + " is " + newMoneyString
                            + " " + convertToCode);
                }
            } catch (InputMismatchException e) {
                System.out.print("Not a valid amount, try again.\n");
                input3.nextDouble();
            }

        }

    }

}
