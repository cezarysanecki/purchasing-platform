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
        .companyName(new CompanyName("Test"))
        .regon(new Regon("123456789"))
        .address(
            Address.builder()
                .street(new Address.Street("Test Street"))
                .houseNumber(new Address.HouseNumber("12"))
                .postalCode(new Address.PostalCode("01-555"))
                .city(new Address.City("Test City"))
                .build())
        .email(new Email("test@test.pl"))
        .phoneNumber(new PhoneNumber("123456789"))
        .build()
  }
  
}
