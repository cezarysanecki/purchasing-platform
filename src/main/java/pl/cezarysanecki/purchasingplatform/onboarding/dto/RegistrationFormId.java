package pl.cezarysanecki.purchasingplatform.onboarding.dto;

import lombok.NonNull;
import lombok.Value;

import java.util.UUID;

@Value
public class RegistrationFormId {

  @NonNull
  UUID id;

  private RegistrationFormId() {
    id = UUID.randomUUID();
  }

  public static RegistrationFormId generate() {
    return new RegistrationFormId();
  }

}
