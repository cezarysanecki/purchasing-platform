package pl.cezarysanecki.purchasingplatform.shared;

public class Regon {

  private final String value;

  public Regon(final String value) {
    if (value == null || value.length() != 9) {
      throw new IllegalArgumentException("Regon must be 9 digits long");
    }
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }

}
