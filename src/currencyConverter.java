import java.util.*;

public class currencyConverter {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int userChoice = 0;
        currentCurrency currency;
        while (userChoice != 10) {

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

            userChoice = input.nextInt();

            switch (userChoice) {
                case 1:
                    currency = new currentCurrency("US Dollars", "USD");
                    convertToMenu(currency);
                    break;
                case 2:
                    currency = new currentCurrency("Pounds", "GBP");
                    convertToMenu(currency);
                    break;
                case 3:
                    currency = new currentCurrency("Rands", "ZAR");
                    convertToMenu(currency);
                    break;
                case 4:
                    currency = new currentCurrency("Euros", "EUR");
                    convertToMenu(currency);
                    break;
                case 5:
                    currency = new currentCurrency("Australian Dollar", "AUD");
                    convertToMenu(currency);
                    break;
                case 6:
                    currency = new currentCurrency("Japanese Yen", "JPY");
                    convertToMenu(currency);
                    break;
                case 7:
                    currency = new currentCurrency("Chinese Yuan", "CNY");
                    convertToMenu(currency);
                    break;
                case 8:
                    currency = new currentCurrency("Canadian Dollars", "CAD");
                    convertToMenu(currency);
                    break;
                case 9:
                    currency = new currentCurrency("Indian Rupees", "INR");
                    convertToMenu(currency);
                    break;
                case 10:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Not a valid option, try again.");

            }
        }
    }

    public static void convertToMenu(currentCurrency currency) {
        
        Scanner input2 = new Scanner(System.in);
        int userChoice2 = 0;
        double exchangeRate;
        Map<String, Double> exchangeRates = currency.getConversions();

        while (userChoice2 != 10) {

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
            System.out.println("10 - exit");

            userChoice2 = input2.nextInt();

            switch (userChoice2) {
                case 1:
                    exchangeRate = exchangeRates.get("USD");
                    System.out.println("The current exchange rate is " + exchangeRate + currency.getCurrency() + " to 1 USD");
                    convertAmountMenu(currency, exchangeRate, currency.currencyCode);
                    break;
                case 2:
                    exchangeRate = exchangeRates.get("GBP");
                    System.out.println("The current exchange rate is " + exchangeRate + currency.getCurrency() + " to 1 GBP");
                    convertAmountMenu(currency, exchangeRate, currency.currencyCode);
                    break;
                case 3:
                    exchangeRate = exchangeRates.get("ZAR");
                    System.out.println("The current exchange rate is " + exchangeRate + currency.getCurrency() + " to 1 ZAR");
                    convertAmountMenu(currency, exchangeRate, currency.currencyCode);
                    break;
                case 4:
                    exchangeRate = exchangeRates.get("EUR");
                    System.out.println("The current exchange rate is " + exchangeRate + currency.getCurrency() + " to 1 EUR");
                    convertAmountMenu(currency, exchangeRate, currency.currencyCode);
                    break;
                case 5:
                    exchangeRate = exchangeRates.get("AUD");
                    System.out.println("The current exchange rate is " + exchangeRate + currency.getCurrency() + " to 1 AUD");
                    convertAmountMenu(currency, exchangeRate, currency.currencyCode);
                    break;
                case 6:
                    exchangeRate = exchangeRates.get("JPY");
                    System.out.println("The current exchange rate is " + exchangeRate + currency.getCurrency() + " to 1 JPY");
                    convertAmountMenu(currency, exchangeRate, currency.currencyCode);
                    break;
                case 7:
                    exchangeRate = exchangeRates.get("CNY");
                    System.out.println("The current exchange rate is " + exchangeRate + currency.getCurrency() + " to 1 CNY");
                    convertAmountMenu(currency, exchangeRate, currency.currencyCode);
                    break;
                case 8:
                    exchangeRate = exchangeRates.get("CAD");
                    System.out.println("The current exchange rate is " + exchangeRate + currency.getCurrency() + " to 1 CAD");
                    convertAmountMenu(currency, exchangeRate, currency.currencyCode);
                    break;
                case 9:
                    exchangeRate = exchangeRates.get("INR");
                    System.out.println("The current exchange rate is " + exchangeRate + currency.getCurrency() + " to 1 INR");
                    convertAmountMenu(currency, exchangeRate, currency.currencyCode);
                    break;
                case 10:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Not a valid option, try again.");

            }
        }


        


    }

    public static void convertAmountMenu(currentCurrency currency, double exchangeRate, String convertToCode){
        Scanner input3 = new Scanner(System.in);

        double userChoice3 = 0;

        while(userChoice3 != -1){
            System.out.println("How much do you want to convert? (Enter -1 to go back)");
            userChoice3 = input3.nextDouble();
            if(userChoice3 != -1){
                double newMoney = userChoice3 * exchangeRate;
                System.out.println(userChoice3 + currency.getCurrencyCode() + " is " + newMoney + convertToCode);
            }
        }


    }

}
