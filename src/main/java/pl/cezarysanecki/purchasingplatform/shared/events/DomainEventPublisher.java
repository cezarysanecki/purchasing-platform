package pl.cezarysanecki.purchasingplatform.shared.events;

import java.util.Collection;

public interface DomainEventPublisher {

  void publish(DomainEvent event);

  default void publish(Collection<DomainEvent> events) {
    events.forEach(this::publish);
  }

}
