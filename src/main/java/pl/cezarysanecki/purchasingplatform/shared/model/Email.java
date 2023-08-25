package pl.cezarysanecki.purchasingplatform.shared.model;

import lombok.NonNull;

public record Email(@NonNull String value) {

  public Email(final String value) {
    if (!value.matches("^.+@.+\\..+$")) {
      throw new IllegalArgumentException("Email must fulfill specified format");
    }
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }

}
