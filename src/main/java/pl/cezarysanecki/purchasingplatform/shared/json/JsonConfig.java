package pl.cezarysanecki.purchasingplatform.shared.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class JsonConfig {

  private final ObjectMapper objectMapper;

  @Bean
  JsonWrapper jsonWrapper() {
    return new JsonWrapper(objectMapper);
  }

}
