package tracker;

public class Converter {
    int stepSm = 75;
    int oneStepCalory = 50;


   int convertToKm(int steps){
        int kilometres = ((steps * stepSm)/100_000);
        return kilometres;
    }
    int convertStepsToKilocalories(int steps){
       int kiloCalories = (steps * oneStepCalory)/1_000;
       return kiloCalories;
    }
}
