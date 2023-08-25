package pl.cezarysanecki.purchasingplatform.shared.model;

import lombok.NonNull;

public record CompanyName(@NonNull String value) {

  public CompanyName(final String value) {
    if (value.length() < 3 || value.length() > 50) {
      throw new IllegalArgumentException("Company name must be between 3 and 50 characters");
    }
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }

}
