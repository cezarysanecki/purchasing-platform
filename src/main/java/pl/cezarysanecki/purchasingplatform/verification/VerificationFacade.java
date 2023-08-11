package pl.cezarysanecki.purchasingplatform.verification;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import pl.cezarysanecki.purchasingplatform.onboarding.api.SellerRegistrationForm;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class VerificationFacade {

  private final VerificationRepository verificationRepository;

  public void saveNew(final SellerRegistrationForm registrationForm) {
    verificationRepository.saveNew(registrationForm);
  }

}
