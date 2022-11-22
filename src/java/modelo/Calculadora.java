package modelo;

import java.io.Serializable;

public class Calculadora implements Serializable {

    private double $numero1;
    private double $numero2;

    public Calculadora() {
    }

    public double sumar() {
        return $numero1 + $numero2;
    }

    public double restar() {
        return $numero1 - $numero2;
    }

    public double multiplicar() {
        return $numero1 * $numero2;
    }

    public double dividir() {
        return $numero1 / $numero2;
    }

    public double get$numero1() {
        return $numero1;
    }

    public void set$numero1(double $numero1) {
        this.$numero1 = $numero1;
    }

    public double get$numero2() {
        return $numero2;
    }

    public void set$numero2(double $numero2) {
        this.$numero2 = $numero2;
    }

}
