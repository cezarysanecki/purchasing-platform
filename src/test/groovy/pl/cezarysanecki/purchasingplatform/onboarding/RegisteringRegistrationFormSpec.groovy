package pl.cezarysanecki.purchasingplatform.onboarding

import pl.cezarysanecki.purchasingplatform.onboarding.AbstractOnBoardingSpec

class RegisteringRegistartionFormSpec extends AbstractOnBoardingSpec {

    def "simple test"() {
        given:
        int a = 2
        int b = 3

        when:
        int result = a + b

        then:
        result == 5
    }

}
