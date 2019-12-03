public class Multiply {

    public static int multiply(double firstNumber, double secondNumber) {
        if (firstNumber >= 0 && secondNumber >= 0 && firstNumber <= 100 && secondNumber <= 100) {
                return (int) (firstNumber * secondNumber);
            } else {
                System.out.println("numbers should be bigger than 0 and lower than 100");
            }
        return 0;
    }
}
