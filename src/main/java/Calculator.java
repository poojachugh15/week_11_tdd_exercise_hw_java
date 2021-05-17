public class Calculator {
    private int number1;
    private int number2;
    private double number3;
    private double number4;

    public Calculator(int number1, int number2, double number3, double number4){
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
        this.number4 = number4;

    }


    public int Add() {
        return number1 + number2;
    }

    public int Subtract() {
        return number1 - number2;
    }

    public int Multiply() {
        return number1 * number2;
    }

    public double Divide() {
        return number3 / number4;
    }
}

//Calculator
//Create a Calculator class.
// This should have functions for Add, Subtract, Multiply and Divide.
// Your methods should take in two ints to perform the calculations on (except the Divide method.
// This should take two doubles as arguments).

