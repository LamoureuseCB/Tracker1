package tracker;

import java.util.Scanner;

public class MainMenu {

    static void printMenu() {
        System.out.println("1.Ввести количество шагов за определённый день");
        System.out.println("2.Изменить цель по количеству шагов в день");
        System.out.println("3.Напечатать статистику за определённый месяц;");
        System.out.println("0.Выйти из приложения");

    }

    static void selectTask() {
        System.out.println("Выберите задачу для выполнения (от 1 до 12): ");
        System.out.println("для выхода из меню выберите  \"0");
        printMenu();
        Scanner input = new Scanner(System.in);
        int taskNumber;
        taskNumber = input.nextInt();
        StepTracker stepTracker = new StepTracker();


        while (taskNumber != 0) {
            if (taskNumber == 1) {
                System.out.println("Выполняется команда 1");
              stepTracker.addNewNumberStepsPerDay();

            } else if (taskNumber == 2) {
                System.out.println("Выполняется команда 2");
                stepTracker.changeStepGoal();

            } else if (taskNumber == 3) {
                System.out.println("Выполняется команда 3");
                stepTracker.printStatistic(6);
            } else if (taskNumber == 0) {
                System.exit(0);

            } else {
                System.out.println("Неккоректный ввод");
            }
        }
//        или второй вариант реализации через do while и switch case
//        do {
//            printMenu();
//            System.out.println("Выберите задачу для выполнения (от 1 до 3): ");
//            taskNumber = input.nextInt();
//            StepTracker stepTracker = new StepTracker(input);
//
//            switch (taskNumber) {
//                case 1:
//                    stepTracker.addNewNumberStepsPerDay();
//                    break;
//                case 2:
//                    stepTracker.changeStepGoal();
//                    break;
//                case 3:
//                    stepTracker.printStatistic();
//                    break;
//                case 0:
//                    System.exit(0);
//                default:
//                    System.out.println("Некорректный ввод");
//            }
//        } while (taskNumber != 0);
//
    }
}

