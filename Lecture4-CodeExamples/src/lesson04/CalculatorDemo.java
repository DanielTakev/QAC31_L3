package lesson04;

public class CalculatorDemo {

    public static void main(String[] args) {

        Calculator myCalculator = new Calculator();

        int a = 5;
        int b = 6;

        int blabla = Calculator.sum(a, b);
        int maxNum = Math.max(4, 11);
        int otherResult = Calculator.sum(10, 10);

        String result = myCalculator.toString();

        System.out.println(result);
        System.out.println("Sum result: " + blabla);
        System.out.println("Sum other result: " + otherResult);
        System.out.println("Max num: " + maxNum);

        int resultFromAddTwoNums = myCalculator.addTwoNumbersToParam(5, 2, -11);
        System.out.println(resultFromAddTwoNums);
    }
}
