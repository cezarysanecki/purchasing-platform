package pl.cezarysanecki.purchasingplatform.shared.model;

import lombok.NonNull;

public record Regon(@NonNull String value) {

  public Regon(final String value) {
    if (value.length() != 9) {
      throw new IllegalArgumentException("Regon must be 9 digits long");
    }
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }

}
