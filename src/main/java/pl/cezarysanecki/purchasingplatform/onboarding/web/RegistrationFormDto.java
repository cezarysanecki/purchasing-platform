package pl.cezarysanecki.purchasingplatform.onboarding.web;

import jakarta.annotation.Nullable;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;
import pl.cezarysanecki.purchasingplatform.onboarding.api.SellerRegistrationForm;
import pl.cezarysanecki.purchasingplatform.shared.model.Address;
import pl.cezarysanecki.purchasingplatform.shared.model.CompanyName;
import pl.cezarysanecki.purchasingplatform.shared.model.Email;
import pl.cezarysanecki.purchasingplatform.shared.model.PhoneNumber;
import pl.cezarysanecki.purchasingplatform.shared.model.Regon;

import java.util.Optional;

record RegistrationFormDto(@NotNull @Length(min = 3, max = 50) String companyName,
                           @NotNull @Pattern(regexp = "\\d{9}") String regon,
                           @NotNull @Valid AddressDto address,
                           @NotNull @Pattern(regexp = "^.+@.+\\..+$") String email,
                           @NotNull @Pattern(regexp = "\\d{9}") String phoneNumber) {

  SellerRegistrationForm toSellerRegistrationForm() {
    return SellerRegistrationForm.builder()
        .companyName(new CompanyName(companyName))
        .regon(new Regon(regon))
        .address(Address.builder()
            .street(new Address.Street(address.street))
            .houseNumber(new Address.HouseNumber(address.houseNumber))
            .flatNumber(address.getFlatNumber().map(Address.FlatNumber::new).orElse(null))
            .postalCode(new Address.PostalCode(address.postalCode))
            .city(new Address.City(address.city))
            .build())
        .email(new Email(email))
        .phoneNumber(new PhoneNumber(phoneNumber))
        .build();
  }

  public record AddressDto(
      @NotNull @Length(min = 3, max = 50) String street,
      @NotNull @Pattern(regexp = "\\d{1,3}[A-Z]?") String houseNumber,
      @Nullable @Pattern(regexp = "\\d{1,3}[A-Z]?") String flatNumber,
      @NotNull @Pattern(regexp = "\\d{2}-\\d{3}") String postalCode,
      @NotNull @Length(min = 3, max = 50) String city) {

    Optional<String> getFlatNumber() {
      return Optional.ofNullable(flatNumber);
    }

  }

}
