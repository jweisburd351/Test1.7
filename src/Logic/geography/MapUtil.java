package Logic.geography;

import common.EnumRegion;

/**
 * Contains static utility methods associated with maps, regions, etc... involved with gameplay
 */
public class MapUtil implements MapConstants
{

  /**
   * Converts a string ID representation of a US region (defined in MapConstants) to it's EnumRegion equivilent
   * @param id String ID representation of the region
   * @return the EnumRegion representation of the region
   */
  public static EnumRegion regionIdToEnumRegion(String id)
  {
    if (id.equals(CALIFORNIA)) return EnumRegion.CALIFORNIA;
    else if (id.equals(SOUTHEAST)) return EnumRegion.SOUTHEAST;
    else if (id.equals(SOUTHERN_PLAINS)) return EnumRegion.SOUTHERN_PLAINS;
    else if (id.equals(NORTHERN_PLAINS)) return EnumRegion.NORTHERN_PLAINS;
    else if (id.equals(NORTHERN_CRESCENT)) return EnumRegion.NORTHERN_CRESCENT;
    else if (id.equals(MOUNTAIN)) return EnumRegion.MOUNTAIN;
    else if (id.equals(HEARTLAND)) return EnumRegion.HEARTLAND;
    else return null;
  }
}
