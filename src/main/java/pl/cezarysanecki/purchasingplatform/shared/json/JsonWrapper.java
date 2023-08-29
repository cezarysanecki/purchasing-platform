package pl.cezarysanecki.purchasingplatform.shared.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class JsonWrapper<T> {

  private final T data;

  public static <T> JsonWrapper<T> wrap(final T data) {
    return new JsonWrapper<>(data);
  }

  @SneakyThrows
  public Json<T> convert(final ObjectMapper objectMapper) {
    return Json.create(objectMapper.writeValueAsString(data));
  }

}
