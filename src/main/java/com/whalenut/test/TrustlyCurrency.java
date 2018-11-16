package com.whalenut.test;

public enum TrustlyCurrency {
  AT("Austria", "EUR"),
  AU("Australia", "AUD"),
  BE("Belgium", "EUR"),
  BG("Bulgaria", "BGN"),
  CA("Canada", "CAD"),
  HR("Croatia", "HRK"),
  CZ("Czech Republic", "CZK"),
  CY("Cyprus", "EUR"),
  DK("Denmark", "DKK"),
  EE("Estonia", "EUR"),
  FI("Finland", "EUR"),
  FR("France", "EUR"),
  DE("Germany", "EUR"),
  GR("Greece", "EUR"),
  HU("Hungary", "HUF"),
  IE("Ireland", "EUR"),
  IL("Israel", "ILS"),
  IT("Italy", "EUR"),
  LV("Latvia", "EUR"),
  LT("Lithuania", "EUR"),
  LU("Luxembourg", "EUR"),
  MT("Malta", "EUR"),
  MX("Mexico", "MXN"),
  NL("Netherlands", "EUR"),
  NO("Norway", "NOK"),
  PE("Peru", "USD"),
  PL("Poland", "PLN"),
  PT("Portugal", "EUR"),
  RO("Romania", "RON"),
  SG("Singapore", "SGD"),
  SK("Slovakia", "EUR"),
  SI("Slovenia", "EUR"),
  ES("Spain", "EUR"),
  SE("Sweden", "SEK"),
  CH("Switzerland", "CHF"),
  GB("United Kingdom", "GBP"),
  EU("Other European Country", "EUR");


  private String country;
  private String currencyCode;

  TrustlyCurrency(String country, String currencyCode) {
    this.country = country;
    this.currencyCode = currencyCode;
  }

  public String getCountry() {
    return country;
  }

  public String getCurrencyCode() {
    return currencyCode;
  }
}
