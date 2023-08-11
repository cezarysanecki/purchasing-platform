package pl.cezarysanecki.purchasingplatform.shared.events.infrastructure;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import pl.cezarysanecki.purchasingplatform.shared.events.DomainEventPublisher;

@Configuration
class DomainPublisherConfig {

  @Bean
  @Profile("dev")
  DomainEventPublisher domainEvents(final ApplicationEventPublisher publisher) {
    return new JustForwardDomainEventPublisher(publisher);
  }

}
