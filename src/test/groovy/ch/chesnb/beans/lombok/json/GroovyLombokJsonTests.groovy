package ch.chesnb.beans.lombok.json

import com.fasterxml.jackson.databind.ObjectMapper
import spock.lang.Specification

class GroovyLombokJsonTests extends Specification {


    def "Value Object TestA Json "() {
        given:
        def builder = TestA.builder()
                .firstNotNull("FirstTest")
                .second("Another")
        def obj = builder.build()
        def obm = new ObjectMapper()
        def jsonString = obm.writeValueAsString(obj);
        when:
        def result = obm.readValue(jsonString, TestA.class)
        then:
        result == obj
    }


}
