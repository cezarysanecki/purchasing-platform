package pl.cezarysanecki.purchasingplatform.verification;

import pl.cezarysanecki.purchasingplatform.onboarding.api.RegistrationFormId;
import pl.cezarysanecki.purchasingplatform.onboarding.api.SellerRegistrationForm;

interface VerificationRepository {

  void saveNew(final RegistrationFormId registrationFormId, final SellerRegistrationForm registrationForm);

}
