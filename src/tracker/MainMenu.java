package tracker;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        StepTracker stepTracker = new StepTracker();
        Scanner input = new Scanner(System.in);
        while (true) {
            printMenu();
            int taskNumber = input.nextInt();
            switch (taskNumber) {
                case 1 -> stepTracker.addNewNumberStepsPerDay();
                case 2 -> stepTracker.changeStepGoal();
                case 3 -> stepTracker.printStatistic();
                case 0 -> {
                    return;
                }
                default -> System.out.println("Некорректный ввод");
            }
        }
    }

    static void printMenu() {
        System.out.println("1.Ввести количество шагов за определённый день");
        System.out.println("2.Изменить цель по количеству шагов в день");
        System.out.println("3.Напечатать статистику за определённый месяц;");
        System.out.println("0.Выйти из приложения");
    }
}

