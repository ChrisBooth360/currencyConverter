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
        Scanner input = new Scanner(System.in);
        int userChoice = 0;

        System.out.println("Convert " + currency.getCurrency() + " to:");
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

        switch(userChoice){
            case 1:
                String exchangeRate = checkExchangeRate(currency, "USD");
                System.out.println("The current exchange rate is " + exchangeRate);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            default:
        }

    }
    public static String checkExchangeRate(currentCurrency currency, String currencyCode){

        

    }
}
