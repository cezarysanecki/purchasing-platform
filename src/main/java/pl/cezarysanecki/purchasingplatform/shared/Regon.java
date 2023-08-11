package pl.cezarysanecki.purchasingplatform.shared;

import lombok.NonNull;

public class Regon {

  @NonNull
  private final String regon;

  public Regon(final String regon) {
    if (regon.length() != 9) {
      throw new IllegalArgumentException("Regon must be 9 digits long");
    }
    this.regon = regon;
  }

  @Override
  public String toString() {
    return regon;
  }

}
