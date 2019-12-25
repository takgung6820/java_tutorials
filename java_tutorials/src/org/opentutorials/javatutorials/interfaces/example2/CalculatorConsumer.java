package org.opentutorials.javatutorials.interfaces.example2;

public class CalculatorConsumer {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.setOprands(10, 20, 30);
        System.out.println(c.sum()+c.avg());
    }
}
