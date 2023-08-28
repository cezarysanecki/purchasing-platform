package pl.cezarysanecki.purchasingplatform.verification


import spock.lang.Specification

abstract class AbstractVerificationSpec extends Specification {
  
  VerificationConfig verificationConfig = VerificationConfig.forTests()
  VerificationFacade verificationFacade = verificationConfig.verificationFacade()
  
}
