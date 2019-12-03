import org.hamcrest.MatcherAssert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplyTest {



    @ParameterizedTest(name = "multiplying numbers {0} and {1}")
    @CsvSource(value = {"10,2", "5,9", "8,5", "6,3"})
    void multiplyPositive(double a, double b) {
        int expectedResult = (int) (a * b);
        MatcherAssert.assertThat("Asserting results: ", Multiply.multiply(a, b), is(expectedResult));
        System.out.println("Result of multiplying: " + expectedResult);
    }

    @ParameterizedTest(name = "multiplying numbers {0} and {1}")
    @CsvSource(value = {"-10,2", "155,109", "-8,125", "126,-333"})
    void multiplyNegative(double a, double b) {
        int expectedResult = 0;
        MatcherAssert.assertThat("Asserting results: ", Multiply.multiply(a, b), is(expectedResult));
        System.out.println("Result of multiplying: " + expectedResult);
    }


}