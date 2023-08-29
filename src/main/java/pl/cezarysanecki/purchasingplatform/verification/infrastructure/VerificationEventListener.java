package pl.cezarysanecki.purchasingplatform.verification.infrastructure;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import pl.cezarysanecki.purchasingplatform.onboarding.api.LeadingEvent;
import pl.cezarysanecki.purchasingplatform.onboarding.api.SellerRegistrationForm;
import pl.cezarysanecki.purchasingplatform.shared.json.JsonWrapper;
import pl.cezarysanecki.purchasingplatform.verification.VerificationFacade;

@Component
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class VerificationEventListener {

  private final ObjectMapper objectMapper;
  private final VerificationFacade verificationFacade;

  @EventListener
  public void handle(@NonNull LeadingEvent.RegistrationFormRegistered event) {
    JsonWrapper<SellerRegistrationForm> wrappedForm = JsonWrapper.wrap(event.getRegistrationForm());
    verificationFacade.saveFormView(
        event.getRegistrationFormId(),
        wrappedForm.convert(objectMapper));
  }

}
