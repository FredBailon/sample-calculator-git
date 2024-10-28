package ec.edu.epn.git.calculator;

public class CalculatorExcute {
    public static void main(String[] args){
        System.out.println("-- Calculator Excute --");

        Calculator c = new Calculator();
        int addition = c.sumar(4,7);
        System.out.println("c.sumar(4,7) = " + addition);
    }
}
