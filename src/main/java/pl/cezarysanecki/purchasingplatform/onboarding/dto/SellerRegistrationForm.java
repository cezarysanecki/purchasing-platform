package pl.cezarysanecki.purchasingplatform.onboarding.dto;

import lombok.NonNull;
import lombok.Value;
import pl.cezarysanecki.purchasingplatform.shared.Address;
import pl.cezarysanecki.purchasingplatform.shared.CompanyName;
import pl.cezarysanecki.purchasingplatform.shared.Email;
import pl.cezarysanecki.purchasingplatform.shared.PhoneNumber;
import pl.cezarysanecki.purchasingplatform.shared.Regon;

@Value
public class SellerRegistrationForm {

  @NonNull
  CompanyName companyName;
  @NonNull
  Regon regon;
  @NonNull
  Address address;
  @NonNull
  Email email;
  @NonNull
  PhoneNumber phoneNumber;

}
