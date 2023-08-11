package pl.cezarysanecki.purchasingplatform.onboarding;

import pl.cezarysanecki.purchasingplatform.onboarding.dto.RegistrationFormId;
import pl.cezarysanecki.purchasingplatform.onboarding.dto.SellerRegistrationForm;

interface LeadingRepository {

  RegistrationFormId save(final SellerRegistrationForm sellerRegistrationForm);

  SellerRegistrationForm findOne(final RegistrationFormId registrationFormId);

}
