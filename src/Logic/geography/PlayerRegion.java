package Logic.geography;

import common.EnumRegion;

/**
 * Class containing a region that is assigned to a player.
 */
public class PlayerRegion implements MapConstants
{

  /**
   * Contains the region that is assigned to the player. Region contains region name and list of states
   * that are included in the region.
   */
  public final EnumRegion ENUM_REGION;

  /**
   * Array containing a list of the States contained within the region
   */
  public final State[] REGION_STATES;

  /**
   * Constructor for the PlayerRegion class
   * @param enumRegion Region to assign to the player region, defined in MapConstants
   */
  public PlayerRegion(EnumRegion enumRegion)
  {
    if (enumRegion.isUS())
    {
      ENUM_REGION = enumRegion;
      switch (enumRegion)
      {
        case CALIFORNIA:
          REGION_STATES = new State[]{State.CALIFORNIA};
          break;
        case HEARTLAND:
          REGION_STATES = new State[]{State.IOWA, State.MISSOURI, State.ILLINOIS, State.INDIANA};
          break;
        case SOUTHEAST:
          REGION_STATES = new State[]{State.FLORIDA, State.MISSISSIPPI, State.ALABAMA, State.GEORGIA, State.TENNESSEE,
            State.NORTH_CAROLINA, State.SOUTH_CAROLINA, State.KENTUCKY, State.WEST_VIRGINIA, State.VIRGINIA};
          break;
        case MOUNTAIN:
          REGION_STATES = new State[]{State.WASHINGTON, State.OREGON, State.IDAHO, State.NEVADA, State.MONTANA, State.WYOMING,
            State.UTAH, State.COLORADO, State.ARIZONA, State.NEW_MEXICO};
          break;
        case NORTHERN_PLAINS:
          REGION_STATES = new State[]{State.NORTH_DAKOTA, State.SOUTH_DAKOTA, State.NEBRASKA, State.KANSAS, State.MINISOTA};
          break;
        case SOUTHERN_PLAINS:
          REGION_STATES = new State[]{State.TEXAS, State.LOUISIANA, State.OKLAHOMA, State.ARKANSAS};
          break;
        case NORTHERN_CRESCENT:
          REGION_STATES = new State[]{State.MAINE, State.VERMONT, State.NEW_HAMPSHIRE, State.MAINE, State.RHODE_ISLAND,
            State.CONNECTICUT, State.NEW_JERSEY, State.NEW_YORK, State.PENNSYLVANIA, State.DELAWARE,
            State.MARYLAND, State.OHIO, State.WISCONSIN, State.MICHIGAN, State.MASSACHUSETTS};
          break;
        default:
          REGION_STATES = null;
      }
    }
    else
    {
      ENUM_REGION = null;
      REGION_STATES = null;
    }
  }

}
