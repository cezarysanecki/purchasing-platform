package pl.cezarysanecki.purchasingplatform.shared.model;

import lombok.NonNull;
import lombok.Value;

@Value(staticConstructor = "of")
public class Email {

  @NonNull
  String email;

  public Email(final String email) {
    if (!email.contains("@")) {
      throw new IllegalArgumentException("Email must contain @");
    }
    this.email = email;
  }

  @Override
  public String toString() {
    return email;
  }

}
