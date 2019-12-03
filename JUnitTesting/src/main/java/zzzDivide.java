import java.io.BufferedReader;
import java.io.InputStreamReader;

public class zzzDivide {
    public static void resolveDivide(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double num1;
        double num2;

        System.out.println("enter your double numbers:");
        while (true) {
            try {
                String number1String = reader.readLine();
                num1 = Integer.parseInt(number1String);
                String number2String = reader.readLine();
                num2 = Integer.parseInt(number2String);
                if (num1 > 0 && num2 > 0) {
                    if (num1 >= num2) {
                        System.out.println("The result of dividing is: " + divide(num1, num2));
                        break;
                    } else {
                        System.out.println("numberToBeDivided should be bigger than divisor!");
                    }
                } else {
                    System.out.println("num1 and num2 should be bigger than 0!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static double divide(double numberToBeDivided, double divisor)  {
        return numberToBeDivided / divisor;
    }
}
