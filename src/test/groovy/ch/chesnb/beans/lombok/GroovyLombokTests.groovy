package ch.chesnb.beans.lombok

import spock.lang.Specification

class GroovyLombokTests extends Specification {


    def "Value Object TestA with builder"() {
        given:
        def builder = TestA.builder()
                .firstNotNull("FirstTest")
                .second("Another")
        when:
        def result = builder.build()
        then:
        result.firstNotNull == "FirstTest"
        result.second == "Another"
    }

    def "Data Object TestB setter and getter "() {
        given:
        def obj = new TestB()
        when:
        obj.firstNotNull = "FirstTest"
        obj.second = "Second"
        then:
        obj.firstNotNull == "FirstTest"
        obj.second == "Second"
    }

    def "Data Object TestB constructor and setter and getter "() {
        when:
        def obj = new TestB("InitialFirst", "initialSecond")
        then:
        obj.firstNotNull == "InitialFirst"
        obj.second == "initialSecond"
    }

    def "Value Object TestC with toBuilder(true) "() {
        given:
        def prototype = new TestC("Whatever", "InitalValues")
        def builder = prototype.toBuilder()
                .firstNotNull("FirstTest")
                .second("Another")
        when:
        def result = builder.build()
        then:
        result.firstNotNull == "FirstTest"
        result.second == "Another"
    }

    def "Value Object TestD explicit Constructor and toBuilder(true) "() {
        def builder = TestD.builder()
                .firstNotNull("FirstTest")
                .second("Another")
        when:
        def result = builder.build()
        then:
        result.firstNotNull == "FirstTest"
        result.second == "Another"
    }

    def "Value Groovy Object TestE  "() {
        def builder = TestE.builder()
                .firstNotNull("FirstTest")
                .second("Another")
        when:
        def result = builder.build()
        then:
        result.firstNotNull == "FirstTest"
        result.second == "Another"
    }

}
