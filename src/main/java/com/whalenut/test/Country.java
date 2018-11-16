package com.whalenut.test;

import java.util.Optional;
import java.util.stream.Stream;

public enum Country {
  AUSTRIA("AT", "Austria"),
  AUSTRALIA("AU", "Australia"),
  BELGIUM("BE", "Belgium"),
  BULGARIA("BG", "Bulgaria"),
  CANADA("CA", "Canada"),
  CROATIA("HR", "Croatia"),
  CZECH_REPUBLIC("CZ", "Czech Republic"),
  CYPRUS("CY", "Cyprus"),
  DENMARK("DK", "Denmark"),
  ESTONIA("EE", "Estonia"),
  FINLAND("FI", "Finland"),
  FRANCE("FR", "France"),
  GERMANY("DE", "Germany"),
  GREECE("GR", "Greece"),
  HUNGARY("HU", "Hungary"),
  IRELAND("IE", "Ireland"),
  ISRAEL("IL", "Israel"),
  ITALY("IT", "Italy"),
  LATVIA("LV", "Latvia"),
  LITHUANIA("LT", "Lithuania"),
  LUXEMBOURG("LU", "Luxembourg"),
  MALAYSIA("MY", "Malaysia"),
  MALTA("MT", "Malta"),
  MEXICO("MX", "Mexico"),
  NETHERLANDS("NL", "Netherlands"),
  NORWAY("NO", "Norway"),
  PERU("PE", "Peru"),
  POLAND("PL", "Poland"),
  PORTUGAL("PT", "Portugal"),
  ROMANIA("RO", "Romania"),
  RUSSIA("RU", "Russia"),
  SINGAPORE("SG", "Singapore"),
  SLOVAKIA("SK", "Slovakia"),
  SLOVENIA("SI", "Slovenia"),
  SPAIN("ES", "Spain"),
  SWEDEN("SE", "Sweden"),
  SWITZERLAND("CH", "Switzerland"),
  UNITED_KINGDOM("GB", "United Kingdom");

  private final String alpha2Code;
  private final String shortName;

  Country(final String alpha2Code, final String shortName) {
//    Validate.isTrue(alpha2Code.matches("^[A-Z]{2}$"));
//    Validate.isTrue(shortName.matches("^[A-Z][A-Za-z ]{3,}$"));

    this.alpha2Code = alpha2Code;
    this.shortName = shortName;
  }

  /**
   * Returns the enum constant of this type with the specified country code.
   *
   * @param alpha2Code the two letter ISO 3166-1 alpha-2 country code
   * @return the enum constant with the specified country code
   * @throws IllegalArgumentException if this enum type has no constant with the specified country
   * code
   */
  public static Country fromAlpha2Code(final String alpha2Code) {
    final Optional<Country> countryOptional =
        Stream.of(Country.values())
            .filter(country -> country.alpha2Code.equalsIgnoreCase(alpha2Code))
            .findAny();
    return countryOptional.orElseThrow(
        () ->
            new IllegalArgumentException(
                "No enum constant with alpha-2 country code: " + alpha2Code));
  }

  /**
   * Get the two letter ISO 3166-1 Alpha-2 country code for this enum constant.
   *
   * @return the two letter code
   */
  public String alpha2Code() {
    return alpha2Code;
  }

  /**
   * English short country name officially used by the ISO 3166 Maintenance Agency (ISO 3166/MA)
   *
   * @return the name
   */
  public String shortName() {
    return shortName;
  }

}







