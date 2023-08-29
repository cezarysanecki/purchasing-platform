package pl.cezarysanecki.purchasingplatform.shared.json;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class Json {

  private final String data;

  static Json wrap(final String data) {
    return new Json(data);
  }

  @Override
  public String toString() {
    return data;
  }
}
