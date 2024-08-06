package dev.jorge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class TestPersona {
    private Persona persona; 

    @Test
    public void testCalcularIMC() {
        double imc = persona.calcularIMC(); 
        assertEquals(22.86, imc, 0.01);
    }

    @Test
    void testName() {
        
    }

    @BeforeAll
    static void beforeClass() {
        System.out.println("Before all tests");
    }

    @BeforeEach
    void setUp() {
        persona = new Persona(70, 1.75); 
    }

    @AfterEach
    void tearDown() {
        persona = null; 
    }

    @AfterAll
    static void afterClass() {
        System.out.println("After all tests");
    }
}
