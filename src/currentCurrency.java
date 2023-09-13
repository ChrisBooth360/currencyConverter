import java.util.HashMap;
import java.util.Map;


public class currentCurrency {

    String currency;
    String currencyCode;
    Map<String, Double> conversions;

    currentCurrency(String currency, String currencyCode){
        this.currency = currency;
        this.currencyCode = currencyCode;
        switch(currencyCode){
            case "USD":
                this.conversions = getConvertToUSD();
            case "GBP":
                this.conversions = getConvertToGBP();
            case "ZAR":
                this.conversions = getConvertToZAR();
            case "EUR":
                this.conversions = getConvertToEUR();
            case "AUD":
                this.conversions = getConvertToAUD();
            case "JPY":
                this.conversions = getConvertToJPY();
            case "CNY":
                this.conversions = getConvertToCNY();
            case "CAD":
                this.conversions = getConvertToCAD();
            case "INR":
                this.conversions = getConvertToINR();
        }
        
    }

    public Map<String, Double> getConvertToUSD(){
        
        Map<String, Double> USDConversions = new HashMap<>();

        USDConversions.put("GBP", 1.25);
        USDConversions.put("ZAR", 0.053);
        USDConversions.put("EUR", 1.07);
        USDConversions.put("AUD", 0.64);
        USDConversions.put("JPY", 0.0068);
        USDConversions.put("CNY", 0.14);
        USDConversions.put("CAD", 0.74);
        USDConversions.put("INR", 0.012);

        return USDConversions;

    } 

    public Map<String, Double> getConvertToGBP(){
        
        Map<String, Double> GBPConversions = new HashMap<>();

        GBPConversions.put("USD", 0.8);
        GBPConversions.put("ZAR", 0.043);
        GBPConversions.put("EUR", 0.86);
        GBPConversions.put("AUD", 0.51);
        GBPConversions.put("JPY", 0.0054);
        GBPConversions.put("CNY", 0.11);
        GBPConversions.put("CAD", 0.59);
        GBPConversions.put("INR", 0.0097);

        return GBPConversions;

    }
    public Map<String, Double> getConvertToZAR(){
        
        Map<String, Double> ZARConversions = new HashMap<>();

        ZARConversions.put("USD", 18.79);
        ZARConversions.put("GBP", 23.47);
        ZARConversions.put("EUR", 20.17);
        ZARConversions.put("AUD", 12.06);
        ZARConversions.put("JPY", 0.13);
        ZARConversions.put("CNY", 2.58);
        ZARConversions.put("CAD", 13.89);
        ZARConversions.put("INR", 0.23);

        return ZARConversions;
    }
    public Map<String, Double> getConvertToEUR(){
        
        Map<String, Double> EURConversions = new HashMap<>();

        EURConversions.put("USD", 0.93);
        EURConversions.put("GBP", 1.16);
        EURConversions.put("ZAR", 0.05);
        EURConversions.put("AUD", 0.6);
        EURConversions.put("JPY", 0.0063);
        EURConversions.put("CNY", 0.13);
        EURConversions.put("CAD", 0.69);
        EURConversions.put("INR", 0.011);

        return EURConversions;

    } 

    public Map<String, Double> getConvertToAUD(){
        
        Map<String, Double> AUDConversions = new HashMap<>();

        AUDConversions.put("USD", 1.56);
        AUDConversions.put("GBP", 1.94);
        AUDConversions.put("ZAR", 0.083);
        AUDConversions.put("EUR", 1.67);
        AUDConversions.put("JPY", 0.011);
        AUDConversions.put("CNY", 0.14);
        AUDConversions.put("CAD", 0.21);
        AUDConversions.put("INR", 0.019);

        return AUDConversions;

    } 
   
    public Map<String, Double> getConvertToJPY(){
        
        Map<String, Double> JPYConversions = new HashMap<>();

        JPYConversions.put("USD", 147.45);
        JPYConversions.put("GBP", 184.26);
        JPYConversions.put("ZAR", 7.85);
        JPYConversions.put("EUR", 158.39);
        JPYConversions.put("AUD", 94.79);
        JPYConversions.put("CNY", 20.27);
        JPYConversions.put("CAD", 108.98);
        JPYConversions.put("INR", 1.78);

        return JPYConversions;

    } 
 
    public Map<String, Double> getConvertToCNY(){
        
        Map<String, Double> CNYConversions = new HashMap<>();

        CNYConversions.put("USD", 7.27);
        CNYConversions.put("GBP", 9.09);
        CNYConversions.put("ZAR", 0.39);
        CNYConversions.put("EUR", 7.82);
        CNYConversions.put("AUD", 4.68);
        CNYConversions.put("JPY", 0.049);
        CNYConversions.put("CAD", 5.38);
        CNYConversions.put("INR", 0.088);

        return CNYConversions;

    } 

    public Map<String, Double> getConvertToCAD(){
        
        Map<String, Double> CADConversions = new HashMap<>();

        CADConversions.put("USD", 1.35);
        CADConversions.put("GBP", 1.69);
        CADConversions.put("ZAR", 0.072);
        CADConversions.put("EUR", 1.45);
        CADConversions.put("AUD", 0.87);
        CADConversions.put("JPY", 0.0092);
        CADConversions.put("CNY", 0.19);
        CADConversions.put("INR", 0.016);

        return CADConversions;

    } 

    public Map<String, Double> getConvertToINR(){
        
        Map<String, Double> INRConversions = new HashMap<>();

        INRConversions.put("USD", 82.91);
        INRConversions.put("GBP", 103.61);
        INRConversions.put("ZAR", 4.42);
        INRConversions.put("EUR", 89.07);
        INRConversions.put("AUD", 53.32);
        INRConversions.put("JPY", 0.56);
        INRConversions.put("CNY", 11.4);
        INRConversions.put("CAD", 61.26);

        return INRConversions;

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
