package enums;

import java.util.Map;

/**
 *   Enums are the special type of classes in java whose objects are predefined and created eagerly.
 *   It has private constructor, which means we cannot create object of enums from the outside class.
 *
 *   predefined object created are:
 *   1. public: Other class can directly access
 *   2. static: This means that enum constants are accessible without needing an instance of the enum class.
 *   3. final: We cannot reassign it.

 */

public class Main {
    public static void main(String[] args) {

        Pizza pizza1 = Pizza.LARGE;
        Pizza pizza2 = Pizza.MEDIUM;

//        System.out.println(pizza1.getSlices());
//        System.out.println(pizza2.getSlices());
//        System.out.println(pizza1.name().toLowerCase());

//        System.out.println(Pizza.valueOf(Pizza.class, "MEDIUM"));

        final Map<String, String> countryCodeToCurrencyMap = CountryCode.getCountryCodeToCurrencyMap();
        String countryCode = "us";
        System.out.println(countryCodeToCurrencyMap.get(countryCode.toUpperCase()));
    }
}
