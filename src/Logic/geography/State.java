package Logic.geography;

/**
 * Created by trill on 11/16/15.
 */
public enum State
{

  ALABAMA("AL"),
  ARIZONA("AZ"),
  ARKANSAS("AR"),
  CALIFORNIA("CA"),
  COLORADO("CO"),
  CONNECTICUT("CT"),
  DELAWARE("DE"),
  FLORIDA("FL"),
  GEORGIA("GA"),
  IDAHO("ID"),
  ILLINOIS("IL"),
  INDIANA("IL"),
  IOWA("IW"),
  KANSAS("KS"),
  KENTUCKY("KY"),
  LOUISIANA("LA"),
  MAINE("ME"),
  MARYLAND("MD"),
  MASSACHUSETTS("MA"),
  MICHIGAN("MI"),
  MINISOTA("MN"),
  MISSISSIPPI("MS"),
  MISSOURI("MO"),
  MONTANA("MT"),
  NEBRASKA("NE"),
  NEVADA("NV"),
  NEW_HAMPSHIRE("NH"),
  NEW_JERSEY("NJ"),
  NEW_MEXICO("NM"),
  NEW_YORK("NY"),
  NORTH_CAROLINA("NC"),
  NORTH_DAKOTA("ND"),
  OHIO("OH"),
  OKLAHOMA("OK"),
  OREGON("OR"),
  PENNSYLVANIA("PA"),
  RHODE_ISLAND("RI"),
  SOUTH_CAROLINA("SC"),
  SOUTH_DAKOTA("SD"),
  TENNESSEE("TN"),
  TEXAS("TX"),
  UTAH("UT"),
  VERMONT("VT"),
  VIRGINIA("VA"),
  WASHINGTON("WA"),
  WEST_VIRGINIA("WV"),
  WISCONSIN("WI"),
  WYOMING("WY");



  public final String ABBREVIATION;

  State(String abbreviation)
  {
    this.ABBREVIATION = abbreviation;
  }
}