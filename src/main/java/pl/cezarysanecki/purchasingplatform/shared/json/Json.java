package pl.cezarysanecki.purchasingplatform.shared.json;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class Json<T> {

  private final String jsonValue;

  static <T> Json<T> create(final String jsonValue) {
    return new Json<>(jsonValue);
  }

  @Override
  public String toString() {
    return jsonValue;
  }

}
