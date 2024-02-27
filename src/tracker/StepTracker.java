package tracker;

import java.util.Scanner;

public class StepTracker {
    int[] month = new int[12];
    MonthData[] monthToData = new MonthData[12];
    Scanner input = new Scanner(System.in);
    int goalByStepsPerDay = 10_000;
    Converter converter = new Converter();

    public StepTracker() {
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();

        }
    }

    void addNewNumberStepsPerDay() {
        if (input == null)
            System.out.println("Ошибка ввода!");


        System.out.println("Введите номер месяца (от 1 до 12): ");
        int month = input.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Неккоректный ввод. Попробуйте еще раз");
            return;
        }
        int monthIndex = month -1;


        System.out.println("Введите номер дня: ");
        int day = input.nextInt();
        if (day < 1 || day > 30) {
            System.out.println("Неккоректный ввод. Попробуйте еще раз");
            return;
        }
        int dayIndex = day -1;



        System.out.println("Введите количество пройденных шагов:");
        int steps = input.nextInt();
        if (steps < 0) {
            System.out.println("Неккоректный ввод. Попробуйте еще раз");
            return;


        }
//        monthToData[monthIndex].days[dayIndex] = steps;?????
//        monthToData[monthIndexdays[dayIndex]] = steps?????

    }
    void changeStepGoal(){
        System.out.println("Введите цель по количеству шагов в день ");
        goalByStepsPerDay = input.nextInt();
        if (goalByStepsPerDay <= 0) {
                System.out.println("Может стоит поднять планку повыше? Попробуйте еще раз!");
        }
        else{
            System.out.println("Замечательная цель " + goalByStepsPerDay + " шагов!");

        }

    }

    void printStatistic(int month){
//
//        доделать статистику:!!!!!!


//        System.out.println("Количество пройденных шагов по дням: ");
//        printDaysAndStepsFromMonth();
//        System.out.println("Общее количество шагов за месяц: ");
//        sumStepsFromMonth();
//        System.out.println("Cреднее количество шагов: ");
//        totalSteps(sumStepsFromMonth()) / days.length
//        System.out.println("Пройденная дистанция (в км): ");
//        convertToKm(int steps)
//        System.out.println("Количество сожжённых килокалорий: ");
//        convertStepsToKilocalories
//        System.out.println("Лучшая серия: максимальное количество подряд идущих дней");
//        bestSeries(int goalByStepsPerDay)
//
    }
}




