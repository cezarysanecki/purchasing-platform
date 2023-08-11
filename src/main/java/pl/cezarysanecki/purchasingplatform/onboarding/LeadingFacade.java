package pl.cezarysanecki.purchasingplatform.onboarding;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import pl.cezarysanecki.purchasingplatform.onboarding.api.RegistrationFormId;
import pl.cezarysanecki.purchasingplatform.onboarding.api.SellerRegistrationForm;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class LeadingFacade {

  private final LeadingRepository leadingRepository;

  @Transactional
  public RegistrationFormId register(final SellerRegistrationForm sellerRegistrationForm) {
    return leadingRepository.save(sellerRegistrationForm);
  }

  @Transactional(readOnly = true)
  public SellerRegistrationForm show(final RegistrationFormId registrationFormId) {
    return leadingRepository.findOne(registrationFormId);
  }

}
