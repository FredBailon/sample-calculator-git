// CalculadoraTest.java

import ec.edu.epn.git.calculator.Calculator;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testSumar() {
        Calculator calculadora = new Calculator();
        int resultado = calculadora.sumar(2, 3);
        assertEquals(5, resultado, "La suma de 2 + 3 debería ser 5");
    }

    @Test
    public void testRestar() {
        Calculator calculadora = new Calculator();
        int resultado = calculadora.restar(5, 3);
        assertEquals(2, resultado, "La resta de 5 - 3 debería ser 2");
    }

    @Test
    public void testMultiplicar() {
        Calculator calculadora = new Calculator();
        int resultado = calculadora.multiplicar(2, 3);
        assertEquals(6, resultado, "La multiplicación de 2 * 3 debería ser 6");
    }

    @Test
    public void testDividir() {
        Calculator calculadora = new Calculator();
        int resultado = calculadora.dividir(6, 3);
        assertEquals(2, resultado, "La división de 6 / 3 debería ser 2");
    }

    @Test
    public void testDividirPorCero() {
        Calculator calculadora = new Calculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculadora.dividir(6, 0));
        assertEquals("No se puede dividir por cero", exception.getMessage());
    }
}

