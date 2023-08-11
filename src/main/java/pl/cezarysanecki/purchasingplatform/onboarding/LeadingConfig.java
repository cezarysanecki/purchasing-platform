package pl.cezarysanecki.purchasingplatform.onboarding;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class LeadingConfig {

  private final LeadingRepository leadingRepository;

  public static LeadingConfig forTests() {
    return new LeadingConfig(new LeadingRepositoryInMemory());
  }

  @Bean
  LeadingFacade leadingFacade() {
    return new LeadingFacade(leadingRepository);
  }

}