package tracker;

public class MonthData {
    public Converter convertStepsToKilocalories;
    int[] days = new int[30];

    void printDaysAndStepsFromMonth() {
        for (int i = 0; i < days.length; i++) {
            System.out.println(" День" + (i + 1) + "шагов: " + days[i]);
        }
    }

    int sumStepsFromMonth() {
        int totalMonthSteps = 0;
        for (int day : days) {
            totalMonthSteps += day;
        }
        return totalMonthSteps;
    }
int averageSteps(){
    int summary = sumStepsFromMonth();
    int average = summary / days.length;
    return average;

}
    int maxSteps() {
        int maxStep = days[0];
        for (int day : days) {
            if (day > maxStep) {
                maxStep = day;
            }
        }
        return maxStep;
    }


    int bestSeries(int goalByStepsPerDay) {
        int maxDays = 0;
        int maxSeriesDays = 0;
        for (int day : days) {
            if (day >= goalByStepsPerDay) {
                maxDays++;
            } else {
                if (maxDays > maxSeriesDays) {
                    maxSeriesDays = maxDays;
                }
                maxDays = 0;
            }
        }

        if (maxDays > maxSeriesDays) {
            maxSeriesDays = maxDays;
        }

        return maxSeriesDays;
    }

}
