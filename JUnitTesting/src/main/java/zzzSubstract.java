import java.io.BufferedReader;
import java.io.InputStreamReader;

public class zzzSubstract {
    public static void resolveSubstract() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1;
        int num2;

        System.out.println("enter your int numbers:");
        while (true) {
            try {
                String number1String = reader.readLine();
                num1 = Integer.parseInt(number1String);
                String number2String = reader.readLine();
                num2 = Integer.parseInt(number2String);
                if (num1 > 0 && num2 > 0) {
                    if (num1 >= num2) {
                        System.out.println("The result of substracting is: " + subtract(num1, num2));
                        break;
                    } else {
                        System.out.println("num1 should be bigger than num2!");
                    }
                } else {
                    System.out.println("num1 and num2 should be bigger than 0!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}
