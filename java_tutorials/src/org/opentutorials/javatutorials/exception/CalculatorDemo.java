package org.opentutorials.javatutorials.exception;

class DivideException extends Exception {
    public int left;
    public int right;
    DivideException() {
        super();
    }

    DivideException(String message) {
        super(message);
    }

    DivideException(String message, int left, int right) {
        super(message);
        this.left = left;
        this.right = right;;
    }
}

class Calculator {
    int left, right;
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void divide() {
        try {
            if (right == 0) {
                throw new DivideException("0으로 나눌 수 없습니다.");
            }
            System.out.println(this.left / this.right);
        } catch (DivideException e) {
            e.printStackTrace();
        }
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        try {
            c1.divide();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
