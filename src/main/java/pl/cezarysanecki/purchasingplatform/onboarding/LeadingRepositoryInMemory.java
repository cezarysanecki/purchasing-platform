package pl.cezarysanecki.purchasingplatform.onboarding;

import pl.cezarysanecki.purchasingplatform.onboarding.dto.RegistrationFormId;
import pl.cezarysanecki.purchasingplatform.onboarding.dto.SellerRegistrationForm;

import java.util.HashMap;
import java.util.Map;

class LeadingRepositoryInMemory implements LeadingRepository {

  private final Map<RegistrationFormId, SellerRegistrationForm> database = new HashMap<>();

  @Override
  public RegistrationFormId save(final SellerRegistrationForm sellerRegistrationForm) {
    RegistrationFormId registrationFormId = RegistrationFormId.generate();
    database.put(registrationFormId, sellerRegistrationForm);
    return registrationFormId;
  }

}
