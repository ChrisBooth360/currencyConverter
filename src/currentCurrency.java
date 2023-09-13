public class currentCurrency {

    String currency;
    String currencyCode;

    currentCurrency(String currency, String currencyCode){
        this.currency = currency;
        this.currencyCode = currencyCode;
        
    }

    public double setConversionToUSD(String currencyCode){
        
        double conversionRate = 0;

        switch(currency){
            case "USD":
                conversionRate = 0;
                break;
            case "GBP":
                conversionRate = 1.25;
                break;
            case "ZAR":
                conversionRate = 0.053;
                break;
            case "EUR":
                conversionRate = 1.07;
                break;
            case "AUD":
                conversionRate = 0.64;
                break;
            case "JPY":
                conversionRate = 0.0068;
                break;
            case "CNY":
                conversionRate = 0.14;
                break;
            case "CAD":
                conversionRate = 0.74;
                break;
            case "INR":
                conversionRate = 0.012;
                break;
            default:
                System.out.println("There was an error getting the conversion rate.");

        }

        return conversionRate;


        
    }

    public double setConversionToGBP(String currencyCode){
        
        double conversionRate = 0;

        switch(currency){
            case "USD":
                conversionRate = 0.8;
                break;
            case "GBP":
                conversionRate = 0;
                break;
            case "ZAR":
                conversionRate = 0.043;
                break;
            case "EUR":
                conversionRate = 0.86;
                break;
            case "AUD":
                conversionRate = 0.51;
                break;
            case "JPY":
                conversionRate = 0.0054;
                break;
            case "CNY":
                conversionRate = 0.11;
                break;
            case "CAD":
                conversionRate = 0.59;
                break;
            case "INR":
                conversionRate = 0.0097;
                break;
            default:
                System.out.println("There was an error getting the conversion rate.");
        }
        return conversionRate;
    }
    public double setConversionToZAR(String currencyCode){
        
        double conversionRate = 0;

        switch(currency){
            case "USD":
                conversionRate = 18.79;
                break;
            case "GBP":
                conversionRate = 23.47;
                break;
            case "ZAR":
                conversionRate = 0;
                break;
            case "EUR":
                conversionRate = 20.17;
                break;
            case "AUD":
                conversionRate = 12.06;
                break;
            case "JPY":
                conversionRate = 0.13;
                break;
            case "CNY":
                conversionRate = 2.58;
                break;
            case "CAD":
                conversionRate = 13.89;
                break;
            case "INR":
                conversionRate = 0.23;
                break;
            default:
                System.out.println("There was an error getting the conversion rate.");

        }

        return conversionRate;


        
    }
    public double setConversionToEUR(String currencyCode){
        
        double conversionRate = 0;

        switch(currency){
            case "USD":
                conversionRate = 0.93;
                break;
            case "GBP":
                conversionRate = 1.16;
                break;
            case "ZAR":
                conversionRate = 0.05;
                break;
            case "EUR":
                conversionRate = 0;
                break;
            case "AUD":
                conversionRate = 0.6;
                break;
            case "JPY":
                conversionRate = 0.0063;
                break;
            case "CNY":
                conversionRate = 0.13;
                break;
            case "CAD":
                conversionRate = 0.69;
                break;
            case "INR":
                conversionRate = 0.011;
                break;
            default:
                System.out.println("There was an error getting the conversion rate.");

        }

        return conversionRate;


        
    }
    public double setConversionToAUD(String currencyCode){
        
        double conversionRate = 0;

        switch(currency){
            case "USD":
                conversionRate = 1.56;
                break;
            case "GBP":
                conversionRate = 1.94;
                break;
            case "ZAR":
                conversionRate = 0.083;
                break;
            case "EUR":
                conversionRate = 1.67;
                break;
            case "AUD":
                conversionRate = 0;
                break;
            case "JPY":
                conversionRate = 0.011;
                break;
            case "CNY":
                conversionRate = 0.14;
                break;
            case "CAD":
                conversionRate = 0.21;
                break;
            case "INR":
                conversionRate = 0.019;
                break;
            default:
                System.out.println("There was an error getting the conversion rate.");

        }

        return conversionRate;


        
    }
    public double setConversionToJPY(String currencyCode){
        
        double conversionRate = 0;

        switch(currency){
            case "USD":
                conversionRate = 147.45;
                break;
            case "GBP":
                conversionRate = 184.26;
                break;
            case "ZAR":
                conversionRate = 7.85;
                break;
            case "EUR":
                conversionRate = 158.39;
                break;
            case "AUD":
                conversionRate = 94.79;
                break;
            case "JPY":
                conversionRate = 0;
                break;
            case "CNY":
                conversionRate = 20.27;
                break;
            case "CAD":
                conversionRate = 108.98;
                break;
            case "INR":
                conversionRate = 1.78;
                break;
            default:
                System.out.println("There was an error getting the conversion rate.");

        }

        return conversionRate;


        
    }
    public double setConversionToCNY(String currencyCode){
        
        double conversionRate = 0;

        switch(currency){
            case "USD":
                conversionRate = 0;
                break;
            case "GBP":
                conversionRate = 1.25;
                break;
            case "ZAR":
                conversionRate = 0.053;
                break;
            case "EUR":
                conversionRate = 1.07;
                break;
            case "AUD":
                conversionRate = 0.64;
                break;
            case "JPY":
                conversionRate = 0.0068;
                break;
            case "CNY":
                conversionRate = 0.14;
                break;
            case "CAD":
                conversionRate = 0.74;
                break;
            case "INR":
                conversionRate = 0.012;
                break;
            default:
                System.out.println("There was an error getting the conversion rate.");

        }

        return conversionRate;


        
    }
    public double setConversionToCAD(String currencyCode){
        
        double conversionRate = 0;

        switch(currency){
            case "USD":
                conversionRate = 0;
                break;
            case "GBP":
                conversionRate = 1.25;
                break;
            case "ZAR":
                conversionRate = 0.053;
                break;
            case "EUR":
                conversionRate = 1.07;
                break;
            case "AUD":
                conversionRate = 0.64;
                break;
            case "JPY":
                conversionRate = 0.0068;
                break;
            case "CNY":
                conversionRate = 0.14;
                break;
            case "CAD":
                conversionRate = 0.74;
                break;
            case "INR":
                conversionRate = 0.012;
                break;
            default:
                System.out.println("There was an error getting the conversion rate.");

        }

        return conversionRate;


        
    }
    public double setConversionToINR(String currencyCode){
        
        double conversionRate = 0;

        switch(currency){
            case "USD":
                conversionRate = 0;
                break;
            case "GBP":
                conversionRate = 1.25;
                break;
            case "ZAR":
                conversionRate = 0.053;
                break;
            case "EUR":
                conversionRate = 1.07;
                break;
            case "AUD":
                conversionRate = 0.64;
                break;
            case "JPY":
                conversionRate = 0.0068;
                break;
            case "CNY":
                conversionRate = 0.14;
                break;
            case "CAD":
                conversionRate = 0.74;
                break;
            case "INR":
                conversionRate = 0.012;
                break;
            default:
                System.out.println("There was an error getting the conversion rate.");

        }

        return conversionRate;


        
    }

    public String getCurrency() {
        return currency;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
    
}
