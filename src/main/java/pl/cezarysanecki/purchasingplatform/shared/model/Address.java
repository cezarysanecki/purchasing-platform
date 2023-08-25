package pl.cezarysanecki.purchasingplatform.shared.model;

import jakarta.annotation.Nullable;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

import java.util.Optional;

@Value
@Builder
public class Address {

  @NonNull
  Street street;
  @NonNull
  HouseNumber houseNumber;
  @Nullable
  FlatNumber flatNumber;
  @NonNull
  PostalCode postalCode;
  @NonNull
  City city;

  Optional<FlatNumber> getFlatNumber() {
    return Optional.ofNullable(flatNumber);
  }

  public record Street(@NonNull String value) {

    public Street(final String value) {
      if (value.length() < 3 || value.length() > 50) {
        throw new IllegalArgumentException("Street must be between 3 and 50 characters");
      }
      this.value = value;
    }

    @Override
    public String toString() {
      return value;
    }
  }

  public record HouseNumber(@NonNull String value) {

    public HouseNumber(final String value) {
      if (!value.matches("\\d{1,3}[A-Z]?")) {
        throw new IllegalArgumentException("House number must fulfill specified format");
      }
      this.value = value;
    }

    @Override
    public String toString() {
      return value;
    }
  }

  public record FlatNumber(@NonNull String value) {

    public FlatNumber(final String value) {
      if (!value.matches("\\d{1,3}[A-Z]?")) {
        throw new IllegalArgumentException("Flat number must fulfill specified format");
      }
      this.value = value;
    }

    @Override
    public String toString() {
      return value;
    }
  }

  public record PostalCode(@NonNull String value) {

    public PostalCode(final String value) {
      if (!value.matches("\\d{2}-\\d{3}")) {
        throw new IllegalArgumentException("Postal code must fulfill specified format");
      }
      this.value = value;
    }

    @Override
    public String toString() {
      return value;
    }
  }

  public record City(@NonNull String value) {

    public City(final String value) {
      if (value.length() < 3 || value.length() > 50) {
        throw new IllegalArgumentException("City must be between 3 and 50 characters");
      }
      this.value = value;
    }


    @Override
    public String toString() {
      return value;
    }

  }

}
