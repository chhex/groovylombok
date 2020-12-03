package ch.chesnb.beans.lombok;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class JavaLombokTests {

    @Test
    @DisplayName("Value Object TestA with builder")
    public void testTestA() {
        final TestA result = TestA.builder()
                .firstNotNull("FirstTest")
                .second("Another").build();
        assertEquals("FirstTest", result.getFirstNotNull());
        assertEquals("Another", result.getSecond());
    }

    @Test
    @DisplayName("Data Object TestB setter and getter")
    public void testTestB() {
        final TestB result = new TestB();
        result.setFirstNotNull("FirstTest");
        result.setSecond("Another");
        assertEquals("FirstTest", result.getFirstNotNull());
        assertEquals("Another", result.getSecond());
    }

    @Test
    @DisplayName("Value Object TestC with toBuilder(true)")
    public void testTestC() {
        final TestC prototype = new TestC("FirstTest","Another");
        final TestC result = prototype.toBuilder()
                .firstNotNull("FirstTest")
                .second("Another").build();
        assertEquals("FirstTest", result.getFirstNotNull());
        assertEquals("Another", result.getSecond());
    }
}
