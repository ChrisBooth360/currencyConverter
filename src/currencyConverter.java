import java.util.Scanner;

public class currencyConverter {

    
    
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        String userChoice = "";

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
    }
}
