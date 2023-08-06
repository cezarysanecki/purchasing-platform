package pl.cezarysanecki.ecommerce.samplepackage

import pl.cezarysanecki.ecommerce.AbstractSpec

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
