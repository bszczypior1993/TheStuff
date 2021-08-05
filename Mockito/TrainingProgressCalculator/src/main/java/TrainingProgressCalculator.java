public class TrainingProgressCalculator {

    public static void main(String[] args) {
        TrainingProgressCalculator trainingProgressCalculator = new TrainingProgressCalculator();
        System.out.println(trainingProgressCalculator.calculateTrainingQuality(12, 12, 500));
    }


    public static int calculateLengthRating(int trainingLengthMinutes) {
        int lengthRating = 0;
        if (trainingLengthMinutes < 30) {
            lengthRating = 1;
            return lengthRating;
        } else if (30 <= trainingLengthMinutes && trainingLengthMinutes <= 60) {
            lengthRating = 2;
            return lengthRating;
        } else if (trainingLengthMinutes > 60) {
            lengthRating = 3;
            return lengthRating;
        }
        return lengthRating;
    }

    public static int calculateCalorieRating(int caloriesBurnt) {
        int calorieRating = 0;
        if (caloriesBurnt <= 300) {
            calorieRating = 1;
            return calorieRating;
        } else if (300 < caloriesBurnt && caloriesBurnt < 400) {
            calorieRating = 2;
            return calorieRating;
        } else if (caloriesBurnt >= 400) {
            calorieRating = 3;
            return calorieRating;
        }
        return calorieRating;
    }

    public static int calculatePulseRating(int pulse) {
        int pulseRating = 0;
        if (pulse < 160) {
            pulseRating = 3;
            return pulseRating;
        } else if (pulse >= 160 && pulse <= 175) {
            pulseRating = 2;
            return pulseRating;
        } else if (pulse > 175) {
            pulseRating = 1;
            return pulseRating;
        }
        return pulseRating;
    }


    public static String calculateTrainingQuality(int trainingLengthMinutes, int caloriesBurnt, int pulse) {
        double trainingQualityMean;
        String trainingAssessment = "";
        calculateLengthRating(trainingLengthMinutes);
        calculateCalorieRating(caloriesBurnt);
        calculatePulseRating(pulse);

        trainingQualityMean = (((calculateLengthRating(trainingLengthMinutes) * 1) + (calculateCalorieRating(caloriesBurnt) * 2) + (calculatePulseRating(pulse) * 3)) / 6);

        if (trainingQualityMean < 1.2) {
            trainingAssessment = "Low";
            return trainingAssessment;
        } else if ((1.2 <= trainingQualityMean) && (trainingQualityMean < 2)) {
            trainingAssessment = "Good";
            return trainingAssessment;
        } else if ((2 <= trainingQualityMean) && (trainingQualityMean < 3)) {
            trainingAssessment = "Very good";
            return trainingAssessment;
        } else if (trainingQualityMean == 3) {
            trainingAssessment = "Excellent";
            return trainingAssessment;
        }
        return trainingAssessment;
    }
}