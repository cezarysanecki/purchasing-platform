package pl.cezarysanecki.purchasingplatform.shared.model;

import lombok.NonNull;
import lombok.Value;

@Value(staticConstructor = "of")
public class Regon {

  @NonNull
  String regon;

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
