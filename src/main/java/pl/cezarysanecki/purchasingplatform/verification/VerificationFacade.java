package pl.cezarysanecki.purchasingplatform.verification;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import pl.cezarysanecki.purchasingplatform.onboarding.api.RegistrationFormId;
import pl.cezarysanecki.purchasingplatform.onboarding.api.SellerRegistrationForm;
import pl.cezarysanecki.purchasingplatform.shared.json.JsonWrapper;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class VerificationFacade {

  private final JsonWrapper jsonWrapper;
  private final VerificationRepository verificationRepository;

  public void saveNew(final RegistrationFormId registrationFormId, final SellerRegistrationForm registrationForm) {
    verificationRepository.saveNew(registrationFormId, jsonWrapper.wrap(registrationForm));
  }

}
