package nestedtypes.example2;

public class Country {

    private String countryName;
    private Currency currency;

    public Currency getCurrency() {
        return Currency.EUR;
    }

    private enum Currency {
        INR, EUR, USD;
    }
}
