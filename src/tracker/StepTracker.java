package tracker;

import java.util.Scanner;

public class StepTracker {
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

        System.out.println("Введите номер месяца (от 1 до 12): ");
        int month = input.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Неккоректный ввод. Попробуйте еще раз");
            return;
        }

        System.out.println("Введите номер дня: ");
        int day = input.nextInt();
        if (day < 1 || day > 30) {
            System.out.println("Неккоректный ввод. Попробуйте еще раз");
            return;
        }

        System.out.println("Введите количество пройденных шагов:");
        int steps = input.nextInt();
        if (steps < 0) {
            System.out.println("Неккоректный ввод. Попробуйте еще раз");
            return;
        }

        monthToData[month - 1].days[day - 1] = steps;
    }

    void changeStepGoal() {
        System.out.println("Введите цель по количеству шагов в день ");
        goalByStepsPerDay = input.nextInt();
        if (goalByStepsPerDay <= 0) {
            System.out.println("Может стоит поднять планку повыше? Попробуйте еще раз!");
        } else {
            System.out.println("Замечательная цель " + goalByStepsPerDay + " шагов!");
        }

    }

    void printStatistic() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите номер месяца (от 1 до 12): ");
        int month = input.nextInt();
        MonthData monthData = monthToData[month - 1];
        monthData.maxSteps();
        System.out.println("Количество пройденных шагов по дням: ");
        monthData.printDaysAndStepsFromMonth();
        System.out.println("Общее количество шагов за месяц: ");
        monthData.sumStepsFromMonth();
        System.out.println("Cреднее количество шагов: ");
        monthData.averageSteps();
        System.out.println("Пройденная дистанция (в км): ");
        int steps = monthData.sumStepsFromMonth();
        double distanceInKm = converter.convertToKm(steps);
        System.out.println(distanceInKm);
        System.out.println("Количество сожжённых килокалорий: ");
        int kilocalories = converter.convertStepsToKilocalories(steps);
        System.out.println(kilocalories);
        System.out.println("Лучшая серия: максимальное количество подряд идущих дней");
        int goalByStepsPerDay = this.goalByStepsPerDay;
        monthData.bestSeries(goalByStepsPerDay);
    }

}



