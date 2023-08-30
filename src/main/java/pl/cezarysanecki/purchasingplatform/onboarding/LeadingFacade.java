package pl.cezarysanecki.purchasingplatform.onboarding;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import pl.cezarysanecki.purchasingplatform.onboarding.api.LeadingEvent;
import pl.cezarysanecki.purchasingplatform.onboarding.api.RegistrationFormId;
import pl.cezarysanecki.purchasingplatform.onboarding.api.SellerRegistrationForm;
import pl.cezarysanecki.purchasingplatform.shared.events.DomainEventPublisher;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class LeadingFacade {

  private final LeadingRepository leadingRepository;
  private final DomainEventPublisher publisher;

  @Transactional
  public RegistrationFormId register(final SellerRegistrationForm sellerRegistrationForm) {
    RegistrationFormId registrationFormId = leadingRepository.save(sellerRegistrationForm);
    publisher.publish(LeadingEvent.RegistrationFormRegistered.now( // ADR: #001
        registrationFormId, sellerRegistrationForm));
    return registrationFormId;
  }

  @Transactional(readOnly = true)
  public SellerRegistrationForm show(final RegistrationFormId registrationFormId) {
    return leadingRepository.findOne(registrationFormId);
  }

}
