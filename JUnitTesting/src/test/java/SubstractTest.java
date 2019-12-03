import org.hamcrest.MatcherAssert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.Matchers.is;

class SubstractTest {

    @ParameterizedTest
    @MethodSource("numbersToSubstract")
    void subtractPositive(int firstNumber, int secondNumber) {
        int expectedResult = firstNumber - secondNumber;
        MatcherAssert.assertThat(Substract.subtract(firstNumber, secondNumber), is(expectedResult));
        System.out.println("Result of substracting is: " + expectedResult);
    }

    private static Stream<Arguments> numbersToSubstract() {
        return Stream.of(
                Arguments.of(50, 35),
                Arguments.of(13, 6),
                Arguments.of(9, 9)
        );
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/numbers.csv")
    void substractNegative(int firstNumber, int secondNumber){
        int expectedResult = -1;
        MatcherAssert.assertThat(Substract.subtract(firstNumber, secondNumber), is(expectedResult));
        System.out.println("Result of substracting is: " + expectedResult);
    }
}
