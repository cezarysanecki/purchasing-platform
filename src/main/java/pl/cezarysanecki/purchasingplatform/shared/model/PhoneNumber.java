package pl.cezarysanecki.purchasingplatform.shared.model;

import lombok.NonNull;

public record PhoneNumber(@NonNull String value) {

  public PhoneNumber(final String value) {
    if (value.length() != 9) {
      throw new IllegalArgumentException("Phone number must be 9 digits long");
    }
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }

}
