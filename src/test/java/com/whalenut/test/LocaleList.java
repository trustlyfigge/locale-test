package com.whalenut.test;

import java.util.Arrays;
import java.util.Currency;
import java.util.Locale;
import java.util.Locale.IsoCountryCode;
import java.util.Set;
import org.junit.Test;

public class LocaleList {

  @Test
  public void listCountries() {
    Set<String> isoCountries = Locale.getISOCountries(IsoCountryCode.PART1_ALPHA2);
    Locale.getISOCountries(IsoCountryCode.PART1_ALPHA2).stream()
        .forEach(x -> {
          System.out.println(x);
        });
  }


  @Test
  public void compareLocalesToCountry() {
    Arrays.asList(Country.values()).stream()
        .forEach(c -> {
          if (Locale.getISOCountries(IsoCountryCode.PART1_ALPHA2).contains(c.alpha2Code())) {
            String code = c.alpha2Code();
            Locale locale = new Locale("en", code);

            try {
              TrustlyCurrency trustlyCurrency = TrustlyCurrency.valueOf(c.alpha2Code());
              Currency currency = Currency.getInstance(locale);
              System.out.println(currency.getSymbol() + " --- " + currency.getCurrencyCode() + " ---"
                  + " " + trustlyCurrency.getCurrencyCode() + " --- " + trustlyCurrency.getCurrencyCode().equals(currency.getCurrencyCode()));
            } catch (Exception e) {
              System.out.println("EXCEPTION ");
            }

//            if(!(locale.getCountry().equals(c.alpha2Code()) && c.shortName().equals(locale.getDisplayCountry()))) {
//              System.out.println(c);
//              System.out.println(locale);
//            }
          } else {
            throw new RuntimeException("D'oh!");
          }
        });
  }



}
