package pl.cezarysanecki.purchasingplatform.verification;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.cezarysanecki.purchasingplatform.shared.json.JsonWrapper;

@Configuration
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class VerificationConfig {

  private final JsonWrapper jsonWrapper;
  private final VerificationRepository verificationRepository;

  public static VerificationConfig forTests(final JsonWrapper jsonWrapper) {
    return new VerificationConfig(jsonWrapper, new VerificationRepositoryInMemory());
  }

  @Bean
  VerificationFacade verificationFacade() {
    return new VerificationFacade(
        jsonWrapper,
        verificationRepository);
  }

}
