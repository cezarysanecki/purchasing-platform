package pl.cezarysanecki.purchasingplatform.verification.infrastructure;

import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import pl.cezarysanecki.purchasingplatform.onboarding.api.LeadingEvent;
import pl.cezarysanecki.purchasingplatform.verification.VerificationFacade;

@Component
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class VerificationEventListener {

  private final VerificationFacade verificationFacade;

  @EventListener
  public void handle(@NonNull LeadingEvent.RegistrationFormRegistered event) {
    verificationFacade.saveNew(event.getRegistrationForm());
  }

}
