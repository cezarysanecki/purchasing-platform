package pl.cezarysanecki.purchasingplatform.shared.model;

import lombok.NonNull;
import lombok.Value;

@Value
public class PhoneNumber {

  @NonNull
  String phoneNumber;

  public PhoneNumber(final String phoneNumber) {
    if (phoneNumber.length() != 9) {
      throw new IllegalArgumentException("Phone number must be 9 digits long");
    }
    this.phoneNumber = phoneNumber;
  }

  @Override
  public String toString() {
    return phoneNumber;
  }

}
