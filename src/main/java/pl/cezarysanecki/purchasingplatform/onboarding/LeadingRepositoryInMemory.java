package pl.cezarysanecki.purchasingplatform.onboarding;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import pl.cezarysanecki.purchasingplatform.onboarding.api.RegistrationFormId;
import pl.cezarysanecki.purchasingplatform.onboarding.api.RegistrationFormNotFoundException;
import pl.cezarysanecki.purchasingplatform.onboarding.api.SellerRegistrationForm;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Profile("dev")
class LeadingRepositoryInMemory implements LeadingRepository {

  private final Map<RegistrationFormId, SellerRegistrationForm> database = new ConcurrentHashMap<>();

  @Override
  public RegistrationFormId save(final SellerRegistrationForm sellerRegistrationForm) {
    RegistrationFormId registrationFormId = RegistrationFormId.generate();
    database.put(registrationFormId, sellerRegistrationForm);
    return registrationFormId;
  }

  @Override
  public SellerRegistrationForm findOne(final RegistrationFormId registrationFormId) {
    SellerRegistrationForm result = database.get(registrationFormId);
    if (result == null) {
      throw new RegistrationFormNotFoundException(registrationFormId);
    }
    return result;
  }

}
