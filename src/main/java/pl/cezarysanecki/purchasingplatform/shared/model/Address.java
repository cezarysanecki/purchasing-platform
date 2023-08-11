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

  @Value(staticConstructor = "of")
  public static class Street {

    @NonNull
    String value;

    @Override
    public String toString() {
      return value;
    }
  }

  @Value(staticConstructor = "of")
  public static class HouseNumber {

    @NonNull
    int houseNumber;

    @Override
    public String toString() {
      return String.valueOf(houseNumber);
    }
  }

  @Value(staticConstructor = "of")
  public static class FlatNumber {

    @NonNull
    int flatNumber;

    @Override
    public String toString() {
      return String.valueOf(flatNumber);
    }
  }

  @Value(staticConstructor = "of")
  public static class PostalCode {

    @NonNull
    String postalCode;

    @Override
    public String toString() {
      return postalCode;
    }
  }

  @Value(staticConstructor = "of")
  public static class City {

    @NonNull
    String value;

    @Override
    public String toString() {
      return value;
    }

  }

}
