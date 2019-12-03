import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class zzzMultiply {
    public static void resolveMultiply() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double num1;
        double num2;

        System.out.println("enter your double numbers:");
        while (true) {
            try {
                String num1String = reader.readLine();
                num1 = Integer.parseInt(num1String);
                String num2String = reader.readLine();
                num2 = Integer.parseInt(num2String);
                if (num1 > 0 && num2 > 0) {
                    if (num1 < 100 && num2 < 100) {
                        System.out.println("The result of multiplying is: " + multiply(num1, num2));
                        break;
                    } else {
                        System.out.println("numbers should be lower than 100");
                    }
                } else {
                    System.out.println("numbers should be greather than 0!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }
}
