package enums;

import java.util.HashMap;
import java.util.Map;

public enum CountryCode {
    US("USD"),
    IN("INR"),
    UK("GBP"),
    JP("JPY");

    private final String currency;

    CountryCode(String  currency) {
        this.currency = currency;
    }

    private String getCurrency() {
        return this.currency;
    }

    public final static Map<String, String> countryCodeToCurrencyMap = new HashMap<>();



    public static Map<String, String> getCountryCodeToCurrencyMap() {
        for(CountryCode code : CountryCode.values()) {
            countryCodeToCurrencyMap.put(code.name(), code.getCurrency());
        }
        return countryCodeToCurrencyMap;
    }



}
