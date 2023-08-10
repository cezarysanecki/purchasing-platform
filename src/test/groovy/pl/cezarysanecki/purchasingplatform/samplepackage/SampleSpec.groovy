package pl.cezarysanecki.purchasingplatform.samplepackage

import pl.cezarysanecki.purchasingplatform.AbstractSpec

class SampleSpec extends AbstractSpec {

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
