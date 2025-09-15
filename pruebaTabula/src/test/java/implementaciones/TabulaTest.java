package implementaciones;

import implementaciones.Tabula.Punto;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.DoubleUnaryOperator;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba para la clase {@link Tabula}.
 * Se utilizan funciones matematicas simples para verificar que el metodo
 * {@link Tabula#tabula(DoubleUnaryOperator, double, double, double)}
 * genera los puntos correctos, incluyendo los valores maximo y minimo.
 *
 */
class TabulaTest {

    /**
     * Prueba el metodo tabula con una funcion cuadratica f(x) = x^2.
     * Se espera que los puntos generados correspondan a la parabola,
     * y que el maximo y minimo se identifiquen correctamente.
     */
    @Test
    void testCuadratica() {
        // Definicion de la funcion cuadratica
        DoubleUnaryOperator f = (x) -> x * x;

        // Tabula la funcion entre 0 y 2 con incremento 1
        List<Punto> resultados = Tabula.tabula(f, 0, 2, 1);

        // La lista debe contener 5 puntos (3 de la tabulacion + max + min)
        assertEquals(5, resultados.size());

        // Verificacion de los valores esperados
        assertEquals(0.0, resultados.get(0).y, 1e-9);
        assertEquals(1.0, resultados.get(1).y, 1e-9);
        assertEquals(4.0, resultados.get(2).y, 1e-9);

        // Verificacion del punto maximo
        Punto max = resultados.get(resultados.size() - 2);
        assertEquals(2.0, max.x, 1e-9);
        assertEquals(4.0, max.y, 1e-9);

        // Verificacion del punto minimo
        Punto min = resultados.get(resultados.size() - 1);
        assertEquals(0.0, min.x, 1e-9);
        assertEquals(0.0, min.y, 1e-9);
    }

    /**
     * Prueba el metodo tabula con una funcion lineal f(x) = 2x + 1.
     * Se espera que los puntos generados correspondan a una recta,
     * y que los extremos determinen el maximo y el minimo.
     */
    @Test
    void testFuncionLineal() {
        // Definicion de la funcion lineal
        DoubleUnaryOperator f = (x) -> 2 * x + 1;

        // Tabula la funcion entre -1 y 1 con incremento 1
        List<Punto> resultados = Tabula.tabula(f, -1, 1, 1);

        // La lista debe contener 5 puntos (3 de la tabulacion + max + min)
        assertEquals(5, resultados.size());

        // Verificacion de puntos intermedios
        assertEquals(-1.0, resultados.get(0).x, 1e-9);
        assertEquals(-1.0, resultados.get(0).y, 1e-9);

        assertEquals(0.0, resultados.get(1).x, 1e-9);
        assertEquals(1.0, resultados.get(1).y, 1e-9);

        assertEquals(1.0, resultados.get(2).x, 1e-9);
        assertEquals(3.0, resultados.get(2).y, 1e-9);

        // Verificacion del punto maximo
        Punto max = resultados.get(resultados.size() - 2);
        assertEquals(1.0, max.x, 1e-9);
        assertEquals(3.0, max.y, 1e-9);

        // Verificacion del punto minimo
        Punto min = resultados.get(resultados.size() - 1);
        assertEquals(-1.0, min.x, 1e-9);
        assertEquals(-1.0, min.y, 1e-9);
    }

    /**
     * Prueba el metodo tabula con la funcion coseno f(x) = cos(x).
     * Se espera que se generen valores correctos en los puntos
     * multiples de pi/2, y que el maximo y minimo se identifiquen bien.
     */
    @Test
    void testFuncionCoseno() {
        // Definicion de la funcion coseno
        DoubleUnaryOperator f = Math::cos;

        // Tabula la funcion entre 0 y PI con incremento PI/2
        List<Punto> resultados = Tabula.tabula(f, 0, Math.PI, Math.PI / 2);

        // La lista debe contener 5 puntos (3 de la tabulacion + max + min)
        assertEquals(5, resultados.size());

        // Verificacion de valores intermedios
        assertEquals(1.0, resultados.get(0).y, 1e-9);
        assertEquals(0.0, resultados.get(1).y, 1e-9);
        assertEquals(-1.0, resultados.get(2).y, 1e-9);

        // Verificacion del punto maximo
        Punto max = resultados.get(resultados.size() - 2);
        assertEquals(0.0, max.x, 1e-9);
        assertEquals(1.0, max.y, 1e-9);

        // Verificacion del punto minimo
        Punto min = resultados.get(resultados.size() - 1);
        assertEquals(Math.PI, min.x, 1e-9);
        assertEquals(-1.0, min.y, 1e-9);
    }
}
