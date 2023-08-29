package pl.cezarysanecki.purchasingplatform.verification;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import pl.cezarysanecki.purchasingplatform.onboarding.api.RegistrationFormId;
import pl.cezarysanecki.purchasingplatform.onboarding.api.SellerRegistrationForm;
import pl.cezarysanecki.purchasingplatform.shared.json.Json;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class VerificationFacade {

  private final VerificationRepository verificationRepository;

  public void saveFormView(
      final RegistrationFormId registrationFormId,
      final Json<SellerRegistrationForm> registrationForm) {
    verificationRepository.saveNew(registrationFormId, registrationForm);
  }

}
