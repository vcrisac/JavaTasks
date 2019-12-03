import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.lang.reflect.Executable;
import java.util.stream.Stream;

import static org.hamcrest.Matchers.is;

class DivideTest {

    @ParameterizedTest(name = "dividing numbers {0} and {1}")
    @MethodSource("dividingNumbers")
    void dividePositive(double numberToBeDivided, double divisor) {
        int expectedResult = (int) (numberToBeDivided / divisor);
        MatcherAssert.assertThat((int) Divide.divide(numberToBeDivided, divisor), is(expectedResult));
        System.out.println("Result of dividing: " + expectedResult);
    }

    private static Stream<Arguments> dividingNumbers() {
        return Stream.of(
                Arguments.of(35, 7),
                Arguments.of(88, 8),
                Arguments.of(36, 4)
        );
    }

    @ParameterizedTest(name = "dividing numbers {0} and {1} from csv source file")
    @CsvSource(value = {"5, 0", "0, 7"})
    void divideByZero(double numberToBeDivided, double divisor) {
        int expectedResult = 0;
        Assertions.assertThrows(ArithmeticException.class, () -> {Divide.divide(numberToBeDivided, divisor);});
        System.out.println("Result of dividing: " + expectedResult);
    }



    @ParameterizedTest(name = "dividing numbers {0} and {1} from csv source file")
    @CsvFileSource(resources = "/numbers.csv")
    void divideCSV(double numberToBeDivided, double divisor) {
        int expectedResult = 0;
        MatcherAssert.assertThat((int) Divide.divide(numberToBeDivided, divisor), is(expectedResult));
        System.out.println("Result of dividing: " + expectedResult);
    }
}