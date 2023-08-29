package pl.cezarysanecki.purchasingplatform.verification;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class VerificationConfig {

  private final VerificationRepository verificationRepository;

  public static VerificationConfig forTests() {
    return new VerificationConfig(new VerificationRepositoryInMemory());
  }

  @Bean
  VerificationFacade verificationFacade() {
    return new VerificationFacade(verificationRepository);
  }

}
