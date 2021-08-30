public class TrainingProgressCalculator {

    private final int trainingLengthMinutes;
    private final int caloriesBurnt;
    private final int calculatePulseRating;

    public static void main(String[] args) {
        System.out.println(TrainingProgressCalculator.calculateTrainingQuality(180,30,2));
    }


    public TrainingProgressCalculator(int trainingLengthMinutes, int caloriesBurnt, int calculatePulseRating) {
        this.trainingLengthMinutes = trainingLengthMinutes;
        this.caloriesBurnt = caloriesBurnt;
        this.calculatePulseRating = calculatePulseRating;
    }

    public enum LengthRating {
        LOW,
        MEDIUM,
        HIGH
    }
    static LengthRating lengthRating;

    public enum CalorieRating{
        LOW,
        MEDIUM,
        HIGH
    }
    static CalorieRating calorieRating;

    public enum PulseRating {
        LOW,
        MEDIUM,
        HIGH
    }
    static PulseRating pulseRating;

    public enum TrainingQuality{
        LOW,
        GOOD,
        VERY_GOOD,
        EXCELLENT
    }
static TrainingQuality trainingQuality;

    public static LengthRating calculateLengthRating(int trainingLengthMinutes) {
                if (trainingLengthMinutes < 30) {
            return lengthRating.LOW;
        } else if (30 <= trainingLengthMinutes && trainingLengthMinutes <= 60) {
            return lengthRating.MEDIUM;
        } else if (trainingLengthMinutes > 60) {;
            return lengthRating.HIGH;
        }
        return null;
    }

    public static CalorieRating calculateCalorieRating(int caloriesBurnt) {
        if (caloriesBurnt <= 300) {
            return calorieRating.LOW;
        } else if (300 < caloriesBurnt && caloriesBurnt < 400) {
            return calorieRating.MEDIUM;
        } else if (caloriesBurnt >= 400) {
            return calorieRating.HIGH;
        }
        return null;
    }

    public static PulseRating calculatePulseRating(int pulse) {
        if (pulse < 160) {
            return pulseRating.HIGH;
        } else if (pulse >= 160 && pulse <= 175) {
            return pulseRating.MEDIUM;
        } else if (pulse > 175) {
            return pulseRating.LOW;
        }
        return null;
    }

//    public static TrainingQuality calculateTrainingQuality(int trainingLengthMinutes) {
//        return calculateTrainingQuality(trainingLengthMinutes, 1, 1);
//    }

    public static TrainingQuality calculateTrainingQuality(int trainingLengthMinutes, int caloriesBurnt, int pulse) {
        double trainingQualityMean;
        calculateLengthRating(trainingLengthMinutes);
        calculateCalorieRating(caloriesBurnt);
        calculatePulseRating(pulse);
        int lengthRate=0;
        int calorieRate;
        int pulseRate;

        switch (lengthRating){
            case LOW:
                return lengthRate = 1;
            case MEDIUM:
                return lengthRate = 2;
            case HIGH:
                return lengthRate = 3;
        }
        switch (calorieRating){
            case LOW:
                calorieRate = 1;
                break;
            case MEDIUM:
                calorieRate = 2;
                break;
            case HIGH:
                calorieRate = 3;
                break;
        }

        switch (pulseRating){
            case LOW:
                pulseRate = 1;
                break;
            case MEDIUM:
                pulseRate = 2;
                break;
            case HIGH:
                pulseRate = 3;
                break;
        }

        trainingQualityMean = (((lengthRate * 1) + (calorieRate * 2) + (pulseRate * 3)) / 6);

        if (trainingQualityMean < 1.2) {
            return trainingQuality.LOW;
        } else if ((1.2 <= trainingQualityMean) && (trainingQualityMean < 2)) {
            return trainingQuality.GOOD;
        } else if ((2 <= trainingQualityMean) && (trainingQualityMean < 3)) {
            return trainingQuality.VERY_GOOD;
        } else if (trainingQualityMean == 3) {
            return trainingQuality.EXCELLENT;
        }
        return null;
    }
}