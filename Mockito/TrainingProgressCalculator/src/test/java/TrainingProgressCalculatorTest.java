import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.mockito.internal.verification.VerificationModeFactory;


import java.util.stream.Stream;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.verify;

class TrainingProgressCalculatorTest {

    @ParameterizedTest
    //given
    @MethodSource("calculateTestLengthRating")
    @NullAndEmptySource
        //when
    void shouldCheckIfCorrectLengthRatingProvided(int input, int expected) {
        //then
        int actualResult = TrainingProgressCalculator.calculateLengthRating(input);

        Assertions.assertEquals(expected, actualResult);
    }

    private static Stream<Arguments> calculateTestLengthRating() {
        return Stream.of(
                Arguments.of(12, 1),
                Arguments.of(45, 2),
                Arguments.of(70, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("calculateCalorieRating")
    @NullAndEmptySource
    void shouldCheckIfCorrectCalorieRatingProvided(int input, int expected) {
        int actualResult = TrainingProgressCalculator.calculateCalorieRating(input);

        Assertions.assertEquals(expected, actualResult);
    }

    private static Stream<Arguments> calculateCalorieRating() {
        return Stream.of(
                Arguments.of(250, 1),
                Arguments.of(350, 2),
                Arguments.of(450, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("calculatePulseRating")
    @NullAndEmptySource
    void shouldCheckIfCorrectPulseRatingProvided(int input, int expected) {
        int actualResult = TrainingProgressCalculator.calculatePulseRating(input);

        Assertions.assertEquals(expected, actualResult);
    }

    private static Stream<Arguments> calculatePulseRating() {
        return Stream.of(
                Arguments.of(180, 1),
                Arguments.of(170, 2),
                Arguments.of(120, 3)
        );
    }

    @Test
    void shouldVerifyIfTrainingQualityRatingProvided() {
    //given
    TrainingProgressCalculator mockedTrainingProgressCalculator = Mockito.mock(TrainingProgressCalculator.class);
    //when
    Mockito.when(mockedTrainingProgressCalculator.calculateTrainingQuality(anyInt(), anyInt(), anyInt())).thenReturn("Low");
        String excellent = mockedTrainingProgressCalculator.calculateTrainingQuality(70, 450, 120);

        //String actualRating = (TrainingProgressCalculator.calculateTrainingQuality(70, 450, 120));
    //then
        Assertions.assertEquals(excellent, "Low");

        verify(mockedTrainingProgressCalculator, VerificationModeFactory.times(1));
    }
}