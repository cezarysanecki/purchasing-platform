package pl.cezarysanecki.purchasingplatform.onboarding;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
class LeadingConfig {

  @Bean
  LeadingRepository leadingRepository() {
    return new LeadingRepositoryInMemory();
  }

}