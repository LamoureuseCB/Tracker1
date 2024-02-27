package tracker;

public class MonthData {
    int[] days = new int[30];

    void printDaysAndStepsFromMonth(int month) {
//     !!  для оформления  использовать format как в Python???
//        как?
        for (int i = 0; i < days.length; i++) {
            System.out.println("Месяц " + month + " День" + (i + 1) + "шагов: " + days[i]);
        }
  }


     int sumStepsFromMonth() {
        int totalMonthSteps = 0;
        for (int i = 0; i < days.length; i++) {
            totalMonthSteps += days[i];
        }
         return totalMonthSteps ;
    }
     int maxSteps() {
         if(days.length == 0){
             return 0;
         }
        int maxStep = days[0];
        for (int i = 0; i < days.length; i++) {
            if (days[i] > days[i - 1]) {
                maxStep = days[i];
            }
        }
        return maxStep;
    }

    int bestSeries(int goalByStepsPerDay){
        int countMax = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] >=goalByStepsPerDay){
                countMax++;
            }
        }
        return countMax;
    }
}






