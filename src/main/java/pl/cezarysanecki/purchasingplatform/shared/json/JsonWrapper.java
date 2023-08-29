package pl.cezarysanecki.purchasingplatform.shared.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class JsonWrapper {

  private final ObjectMapper objectMapper;

  @SneakyThrows
  public Json wrap(final Object object) {
    return Json.wrap(objectMapper.writeValueAsString(object));
  }

}
