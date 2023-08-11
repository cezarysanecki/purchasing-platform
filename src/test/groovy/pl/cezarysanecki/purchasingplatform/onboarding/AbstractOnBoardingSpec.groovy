package pl.cezarysanecki.purchasingplatform.onboarding

import pl.cezarysanecki.purchasingplatform.shared.events.DomainEventPublisher
import spock.lang.Specification

abstract class AbstractOnBoardingSpec extends Specification {
  
  DomainEventPublisher publisher = Mock(DomainEventPublisher)
  
  LeadingConfig leadingConfig = LeadingConfig.forTests(publisher)
  LeadingFacade leadingFacade = leadingConfig.leadingFacade()
  
}
