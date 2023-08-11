package pl.cezarysanecki.purchasingplatform.onboarding;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.cezarysanecki.purchasingplatform.shared.events.DomainEventPublisher;

@Configuration
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class LeadingConfig {

  private final LeadingRepository leadingRepository;
  private final DomainEventPublisher publisher;

  public static LeadingConfig forTests(final DomainEventPublisher publisher) {
    return new LeadingConfig(new LeadingRepositoryInMemory(), publisher);
  }

  @Bean
  LeadingFacade leadingFacade() {
    return new LeadingFacade(leadingRepository, publisher);
  }

}