package dev.jorge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPersona {
    @Test
    public void testCalcularIMC() {
        Persona persona = new Persona(70, 1.75);
        double imc = persona.calcularIMC();
        assertEquals(22.86, imc, 0.01);
    }
}