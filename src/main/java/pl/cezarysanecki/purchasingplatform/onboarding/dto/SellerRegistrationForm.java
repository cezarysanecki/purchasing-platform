package pl.cezarysanecki.purchasingplatform.onboarding.dto;

import lombok.NonNull;
import lombok.Value;
import pl.cezarysanecki.purchasingplatform.shared.model.Address;
import pl.cezarysanecki.purchasingplatform.shared.model.CompanyName;
import pl.cezarysanecki.purchasingplatform.shared.model.Email;
import pl.cezarysanecki.purchasingplatform.shared.model.PhoneNumber;
import pl.cezarysanecki.purchasingplatform.shared.model.Regon;

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
