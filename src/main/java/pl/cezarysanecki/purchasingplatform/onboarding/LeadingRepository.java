package pl.cezarysanecki.purchasingplatform.onboarding;

import pl.cezarysanecki.purchasingplatform.onboarding.api.RegistrationFormId;
import pl.cezarysanecki.purchasingplatform.onboarding.api.SellerRegistrationForm;

interface LeadingRepository {

  RegistrationFormId save(final SellerRegistrationForm sellerRegistrationForm);

  SellerRegistrationForm findOne(final RegistrationFormId registrationFormId);

}
