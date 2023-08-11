package pl.cezarysanecki.purchasingplatform.shared.events;

import java.time.Instant;
import java.util.UUID;

public interface DomainEvent {

  UUID getEventId();

  Instant getWhen();

}
