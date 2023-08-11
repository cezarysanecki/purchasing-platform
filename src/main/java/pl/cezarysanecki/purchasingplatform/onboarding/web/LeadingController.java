package pl.cezarysanecki.purchasingplatform.onboarding.web;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.cezarysanecki.purchasingplatform.onboarding.LeadingFacade;
import pl.cezarysanecki.purchasingplatform.onboarding.dto.RegistrationFormId;
import pl.cezarysanecki.purchasingplatform.onboarding.dto.SellerRegistrationForm;

@RestController
@RequestMapping("/onboarding")
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class LeadingController {

  private final LeadingFacade leadingFacade;

  @PostMapping("/register")
  RegistrationFormId register(@RequestBody SellerRegistrationForm form) {
    return leadingFacade.register(form);
  }

  @GetMapping("/show")
  SellerRegistrationForm show(@RequestBody RegistrationFormId registrationFormId) {
    return leadingFacade.show(registrationFormId);
  }

}
