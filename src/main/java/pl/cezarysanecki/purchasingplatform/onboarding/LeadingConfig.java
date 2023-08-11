package pl.cezarysanecki.purchasingplatform.onboarding;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@RequiredArgsConstructor
class LeadingConfig {

  @Bean
  @Profile("dev")
  LeadingRepository leadingRepository() {
    return new LeadingRepositoryInMemory();
  }

}