package pl.cezarysanecki.purchasingplatform.onboarding.api;

import lombok.NonNull;
import lombok.Value;
import pl.cezarysanecki.purchasingplatform.shared.events.DomainEvent;

import java.time.Instant;
import java.util.UUID;

public interface LeadingEvent extends DomainEvent {

  RegistrationFormId getRegistrationFormId();

  @Value
  class RegistrationFormRegistered implements LeadingEvent {

    @NonNull
    UUID eventId = UUID.randomUUID();
    @NonNull
    Instant when = Instant.now();
    @NonNull
    RegistrationFormId registrationFormId;
    @NonNull
    SellerRegistrationForm registrationForm;

    public static LeadingEvent now(
        final RegistrationFormId registrationFormId,
        final SellerRegistrationForm registrationForm) {
      return new RegistrationFormRegistered(registrationFormId, registrationForm);
    }

  }

}
