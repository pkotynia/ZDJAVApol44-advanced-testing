package exercise.task_01;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorTest {

    @ParameterizedTest
    @CsvSource({"1, 1, 2", "5, 5, 10", "10, 10 , 20"})
    void should_calculate_multiple_adding(Integer summand1, Integer summanda2, Integer expected) {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add(summand1, summanda2);

        //then
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName("Should throw exception when divide by zero")
    void should_throw_exception_when_divide_by_zero() {
        //given
        Calculator calculator = new Calculator();

        //when then
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> calculator.divide(1.0, 0.0))
                .withMessage("divisor can't be 0.0");
    }

}
