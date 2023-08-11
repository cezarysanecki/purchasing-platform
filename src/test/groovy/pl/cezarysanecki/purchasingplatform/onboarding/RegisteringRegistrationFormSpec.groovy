package pl.cezarysanecki.purchasingplatform.onboarding

import pl.cezarysanecki.purchasingplatform.onboarding.api.LeadingEvent
import pl.cezarysanecki.purchasingplatform.onboarding.api.RegistrationFormId
import pl.cezarysanecki.purchasingplatform.onboarding.api.SellerRegistrationForm
import pl.cezarysanecki.purchasingplatform.shared.model.*
import spock.lang.Subject

class RegisteringRegistrationFormSpec extends AbstractOnBoardingSpec {
  
  @Subject
  LeadingFacade sut = leadingFacade
  
  def "should register seller form"() {
    given:
      SellerRegistrationForm registrationForm = sellerRegistrationForm()
    
    when:
      RegistrationFormId registrationFormId = sut.register(registrationForm)
    and:
      SellerRegistrationForm result = sut.show(registrationFormId)
    
    then:
      result == registrationForm
  }
  
  def "should inform that registration form is registered"() {
    given:
      SellerRegistrationForm registrationForm = sellerRegistrationForm()
    
    when:
      sut.register(registrationForm)
    
    then:
      1 * publisher.publish(_ as LeadingEvent.RegistrationFormRegistered)
  }
  
  private SellerRegistrationForm sellerRegistrationForm() {
    return SellerRegistrationForm.builder()
        .companyName(CompanyName.of("Test"))
        .regon(Regon.of("123456789"))
        .address(
            Address.builder()
                .street(Address.Street.of("Test Street"))
                .houseNumber(Address.HouseNumber.of(12))
                .postalCode(Address.PostalCode.of("01-555"))
                .city(Address.City.of("Test City"))
                .build())
        .email(Email.of("test@test.pl"))
        .phoneNumber(PhoneNumber.of("123456789"))
        .build()
  }
  
}
