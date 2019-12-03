public class Substract {
    public static int subtract(int firstNumber, int secondNumber) {
        if (firstNumber > 0 && secondNumber > 0) {
            if (firstNumber >= secondNumber) {
                return firstNumber - secondNumber;
            } else {
                System.out.println("firstNumber should be bigger than secondNumber!");
            }
        } else {
            System.out.println("firstNumber and secondNumber should be bigger than 0!");
        }
        return -1;
    }
}
