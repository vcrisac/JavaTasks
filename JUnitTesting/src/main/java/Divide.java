public class Divide {
    public static double divide(double numberToBeDivided, double divisor) {
//        if (numberToBeDivided > 0 && divisor > 0) {
//            if (numberToBeDivided == 0 && divisor == 0) {
//                if (numberToBeDivided >= divisor) {
//                    try {
//                        return (int) (numberToBeDivided / divisor);
//                    } catch (ArithmeticException ae) {
//                        System.out.println("Dividing by 0 is illegal!");
//                    }
//                } else {
//                    System.out.println("numberToBeDivided should be bigger than divisor!");
//                }
//            } else {
//                System.out.println("numberToBeDivided and divisor should not be 0!");
//            }
//        } else {
//            System.out.println("numberToBeDivided and divisor should be bigger than 0!");
//        }
//        return 0;
//    }

        if (numberToBeDivided == 0 || divisor == 0) {
            throw new ArithmeticException("Division by 0 is illegal!");
        }
        if (numberToBeDivided >= divisor && numberToBeDivided > 0 && divisor > 0) {
            return (int) (numberToBeDivided / divisor);
        } else {
            System.out.println("requirements are not respected!");
        }
        return 0;
    }
}