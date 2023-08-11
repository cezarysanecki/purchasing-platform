package pl.cezarysanecki.purchasingplatform.shared.model;

import lombok.NonNull;
import lombok.Value;

@Value(staticConstructor = "of")
public class CompanyName {

  @NonNull
  String companyName;

  public CompanyName(final String companyName) {
    if (companyName.length() < 3) {
      throw new IllegalArgumentException("Company name must be at least 3 characters long");
    }
    this.companyName = companyName;
  }

  @Override
  public String toString() {
    return companyName;
  }

}
