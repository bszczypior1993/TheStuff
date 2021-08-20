import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.ArgumentMatchers.anyInt;

class TrainingProgressCalculatorTest {

    private TrainingProgressCalculator meanCalculator;

    @Test
    void shouldVerifyIfTrainingQualityCalculatedCorrectly() {
        //given
        int trainingLengthMinutes = 3;
        int caloriesBurnt = 3;
        int calculatePulseRating = 500;

        TrainingProgressCalculator mockedTrainingProgressCalculator = Mockito.mock(TrainingProgressCalculator.class);
        Mockito.when(mockedTrainingProgressCalculator.calculateTrainingQuality(anyInt(),anyInt(),anyInt())).thenReturn("0.3");
//      meanCalculator = new TrainingProgressCalculator(mockedTrainingProgressCalculator);
        //when
        String testTrainingProgressCalculator = mockedTrainingProgressCalculator.calculateTrainingQuality(trainingLengthMinutes, caloriesBurnt,calculatePulseRating);
        //then
        Assertions.assertEquals(testTrainingProgressCalculator, "Low");
    }


//
//    @ParameterizedTest
//    //given
//    @MethodSource("calculateTestLengthRating")
//    @NullAndEmptySource
//        //when
//    void shouldCheckIfCorrectLengthRatingProvided(int input, int expected) {
//        //then
//        int actualResult = TrainingProgressCalculator.calculateLengthRating(input);
//
//        Assertions.assertEquals(expected, actualResult);
//    }
//
//    private static Stream<Arguments> calculateTestLengthRating() {
//        return Stream.of(
//                Arguments.of(12, 1),
//                Arguments.of(45, 2),
//                Arguments.of(70, 3)
//        );
//    }
//
//    @ParameterizedTest
//    @MethodSource("calculateCalorieRating")
//    @NullAndEmptySource
//    void shouldCheckIfCorrectCalorieRatingProvided(int input, int expected) {
//        int actualResult = TrainingProgressCalculator.calculateCalorieRating(input);
//
//        Assertions.assertEquals(expected, actualResult);
//    }
//
//    private static Stream<Arguments> calculateCalorieRating() {
//        return Stream.of(
//                Arguments.of(250, 1),
//                Arguments.of(350, 2),
//                Arguments.of(450, 3)
//        );
//    }
//
//    @ParameterizedTest
//    @MethodSource("calculatePulseRating")
//    @NullAndEmptySource
//    void shouldCheckIfCorrectPulseRatingProvided(int input, int expected) {
//        int actualResult = TrainingProgressCalculator.calculatePulseRating(input);
//
//        Assertions.assertEquals(expected, actualResult);
//    }
//
//    private static Stream<Arguments> calculatePulseRating() {
//        return Stream.of(
//                Arguments.of(180, 1),
//                Arguments.of(170, 2),
//                Arguments.of(120, 3)
//        );
//    }
//
}