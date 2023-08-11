package pl.cezarysanecki.purchasingplatform.shared.form;

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
  public String toJson(final ObjectMapper objectMapper) {
    return objectMapper.writeValueAsString(data);
  }

}
