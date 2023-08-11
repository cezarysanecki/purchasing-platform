package pl.cezarysanecki.purchasingplatform.onboarding.api;

public class RegistrationFormNotFoundException extends RuntimeException {

  public RegistrationFormNotFoundException(final RegistrationFormId registrationFormId) {
    super("Registration form with id " + registrationFormId + " not found");
  }

}
