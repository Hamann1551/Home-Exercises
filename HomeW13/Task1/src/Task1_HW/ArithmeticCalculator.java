package Task1_HW;

public class ArithmeticCalculator {
    private int numOne, numTwo;

    public ArithmeticCalculator(int numOne, int numTwo) {
        this.numOne = numOne;
        this.numTwo = numTwo;
    }

    public void calculate(Operation type) {
        if(type == Operation.ADD) {
            System.out.println(numOne + " + " + numTwo + " = " + (numOne + numTwo));
        } else if(type == Operation.MULTIPLY) {
            System.out.println(numOne + " * " + numTwo + " = " + (numOne * numTwo));
        } else if (type == Operation.SUBTRACT) {
            System.out.println(numOne + " - " + numTwo + " = " + (numOne - numTwo));
        } else {
            System.out.println("Ошибка!");
        }
    }
}
