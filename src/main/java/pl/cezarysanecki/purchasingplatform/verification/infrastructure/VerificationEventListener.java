package pl.cezarysanecki.purchasingplatform.verification.infrastructure;

import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import pl.cezarysanecki.purchasingplatform.onboarding.api.LeadingEvent;

@Component
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class VerificationEventListener {

  @EventListener
  public void handle(@NonNull LeadingEvent.RegistrationFormRegistered event) {

  }

}
