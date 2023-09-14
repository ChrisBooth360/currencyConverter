import java.util.HashMap;
import java.util.Map;


public class currentCurrency {

    String currency;
    String currencyCode;
    String[] listOfCountryCodes = { "USD", "GBP", "ZAR", "EUR", "AUD", "JPY", "CNY", "CAD", "INR" };
    double[][] listOfRates = {{1.0, 0.8, 18.79, 0.93, 1.56, 147.45, 7.27, 1.35, 82.91},
                            {1.25, 1.0, 23.47, 1.16, 1.94, 184.26, 9.09, 1.69, 103.61},
                            {0.053, 0.043, 1.0, 0.05, 0.083, 7.85, 0.39, 0.072, 4.42},
                            {1.07, 0.86, 20.17, 1.0, 1.67, 158.39, 7.82, 1.45, 89.07},
                            {0.64, 0.51, 12.06, 0.6, 1.0, 94.79, 4.68, 0.87, 53.32},
                            {0.0068, 0.0054, 0.13, 0.0063, 0.011, 1.0, 0.049, 0.0092, 0.56},
                            {0.14, 0.11, 2.58, 0.13, 0.14, 20.27, 1.0, 0.19, 11.4},
                            {0.74, 0.59, 13.89, 0.69, 0.21, 108.98, 5.38, 1.0, 61.26},
                            {0.012, 0.0097, 0.23, 0.011, 0.019, 1.78, 0.088, 0.016, 1.0}};
    Map<String, Double> conversions = new HashMap<>();

    currentCurrency(String currency, String currencyCode) {
        this.currency = currency;
        this.currencyCode = currencyCode;
        switch (currencyCode) {
            case "USD":
                this.conversions = createHashMapOfExchanges(listOfRates[0], listOfCountryCodes);
                break;
            case "GBP":
                this.conversions = createHashMapOfExchanges(listOfRates[1], listOfCountryCodes);
                break;
            case "ZAR":
                this.conversions = createHashMapOfExchanges(listOfRates[2], listOfCountryCodes);
                break;
            case "EUR":
                this.conversions = createHashMapOfExchanges(listOfRates[3], listOfCountryCodes);
                break;
            case "AUD":
                this.conversions = createHashMapOfExchanges(listOfRates[4], listOfCountryCodes);
                break;
            case "JPY":
                this.conversions = createHashMapOfExchanges(listOfRates[5], listOfCountryCodes);
                break;
            case "CNY":
                this.conversions = createHashMapOfExchanges(listOfRates[6], listOfCountryCodes);
                break;
            case "CAD":
                this.conversions = createHashMapOfExchanges(listOfRates[7], listOfCountryCodes);
                break;
            case "INR":
                this.conversions = createHashMapOfExchanges(listOfRates[8], listOfCountryCodes);
                break;
        }

    }

    private Map<String, Double> createHashMapOfExchanges(double[] rates, String[] currencyCodes) {

        Map<String, Double> conversions = new HashMap<>();

        for(int i = 0; i < currencyCodes.length; i++){

            conversions.put(currencyCodes[i], rates[i]);

        }

        return conversions;

    }

    public Map<String, Double> getConversions(){
        return conversions;
    }

    public String getCurrency() {
        return currency;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setConversions(Map<String, Double> conversions){
        this.conversions = conversions;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    

}
