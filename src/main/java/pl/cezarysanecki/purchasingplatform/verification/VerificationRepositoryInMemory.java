package pl.cezarysanecki.purchasingplatform.verification;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import pl.cezarysanecki.purchasingplatform.onboarding.api.RegistrationFormId;
import pl.cezarysanecki.purchasingplatform.onboarding.api.SellerRegistrationForm;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Profile("dev")
class VerificationRepositoryInMemory implements VerificationRepository {

  private final Map<RegistrationFormId, SellerRegistrationForm> database = new ConcurrentHashMap<>();

  @Override
  public void saveNew(final RegistrationFormId registrationFormId, final SellerRegistrationForm registrationForm) {
    database.put(registrationFormId, registrationForm);
  }
}
