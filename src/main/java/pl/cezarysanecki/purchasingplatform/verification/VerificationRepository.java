package pl.cezarysanecki.purchasingplatform.verification;

import pl.cezarysanecki.purchasingplatform.onboarding.api.SellerRegistrationForm;

interface VerificationRepository {

  void saveNew(final SellerRegistrationForm registrationForm);

}
