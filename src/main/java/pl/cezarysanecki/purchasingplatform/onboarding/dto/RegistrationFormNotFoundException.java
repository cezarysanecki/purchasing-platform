package pl.cezarysanecki.purchasingplatform.onboarding.dto;

public class RegistrationFormNotFoundException extends RuntimeException {

  public RegistrationFormNotFoundException(final RegistrationFormId registrationFormId) {
    super("Registration form with id " + registrationFormId + " not found");
  }

}
