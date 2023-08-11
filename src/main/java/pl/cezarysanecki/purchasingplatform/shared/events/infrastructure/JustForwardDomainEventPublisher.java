package pl.cezarysanecki.purchasingplatform.shared.events.infrastructure;

import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import pl.cezarysanecki.purchasingplatform.shared.events.DomainEvent;
import pl.cezarysanecki.purchasingplatform.shared.events.DomainEventPublisher;

@AllArgsConstructor
class JustForwardDomainEventPublisher implements DomainEventPublisher {

  private final ApplicationEventPublisher applicationEventPublisher;

  @Override
  public void publish(final DomainEvent event) {
    applicationEventPublisher.publishEvent(event);
  }

}
