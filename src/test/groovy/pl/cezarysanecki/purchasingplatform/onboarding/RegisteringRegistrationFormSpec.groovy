package pl.cezarysanecki.purchasingplatform.onboarding

import pl.cezarysanecki.purchasingplatform.onboarding.api.RegistrationFormId
import pl.cezarysanecki.purchasingplatform.onboarding.api.SellerRegistrationForm
import pl.cezarysanecki.purchasingplatform.shared.model.*
import spock.lang.Subject

class RegisteringRegistrationFormSpec extends AbstractOnBoardingSpec {
  
  @Subject
  LeadingFacade sut = leadingFacade
  
  def "should register seller form"() {
    given:
      SellerRegistrationForm registrationForm = SellerRegistrationForm.builder()
          .companyName(CompanyName.of("Test"))
          .regon(Regon.of("123456789"))
          .address(
              Address.builder()
                  .street("Test Street")
                  .houseNumber(12)
                  .city("Test City")
                  .zipCode("01-555")
                  .build())
          .email(Email.of("test@test.pl"))
          .phoneNumber(PhoneNumber.of("123456789"))
          .build()
    
    when:
      RegistrationFormId registrationFormId = sut.register(registrationForm)
    and:
      SellerRegistrationForm result = sut.show(registrationForm)
    
    then:
      result == registrationForm
  }
  
}
