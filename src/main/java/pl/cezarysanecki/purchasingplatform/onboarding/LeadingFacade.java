package pl.cezarysanecki.purchasingplatform.onboarding;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import pl.cezarysanecki.purchasingplatform.onboarding.dto.RegistrationFormId;
import pl.cezarysanecki.purchasingplatform.onboarding.dto.SellerRegistrationForm;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class LeadingFacade {

  private final LeadingRepository leadingRepository;

  public RegistrationFormId register(final SellerRegistrationForm sellerRegistrationForm) {
    return leadingRepository.save(sellerRegistrationForm);
  }

}
