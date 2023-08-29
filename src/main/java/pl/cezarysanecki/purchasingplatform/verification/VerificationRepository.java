package pl.cezarysanecki.purchasingplatform.verification;

import pl.cezarysanecki.purchasingplatform.onboarding.api.RegistrationFormId;
import pl.cezarysanecki.purchasingplatform.shared.json.Json;

interface VerificationRepository {

  void saveNew(final RegistrationFormId registrationFormId, final Json registrationForm);

}
