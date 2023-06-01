public class Main {
    public static void main(String[] args) {
        System.out.println("Выполнение домашней работы 3.");
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        int firstVariable = 1;
        byte secondVariable = 2;
        short thirdVariable = 3;
        long fourthVariable = 4L;
        float fifthVariable = 5.0F;
        double sixthVariable = 6;

        System.out.println("Значение переменной firstVariable с типом int равно " + firstVariable);
        System.out.println("Значение переменной secondVariable с типом byte равно " + secondVariable);
        System.out.println("Значение переменной thirdVariable с типом short равно " + thirdVariable);
        System.out.println("Значение переменной fourthVariable с типом long равно " + fourthVariable);
        System.out.println("Значение переменной fifthVariable с типом float равно " + fifthVariable);
        System.out.println("Значение переменной sixthVariable с типом double равно " + sixthVariable);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        float a = 27.12F;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
        System.out.println("Переменная a = " + a);
        System.out.println("Переменная b = " + b);
        System.out.println("Переменная c = " + c);
        System.out.println("Переменная d = " + d);
        System.out.println("Переменная e = " + e);
        System.out.println("Переменная f = " + f);
        System.out.println("Переменная g = " + g);
    }

    public static void task3 () {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
        short studentsLP = 23;
        short studentsAS = 27;
        short studentsEA = 30;
        short totalSheets = 480;
        int sheets = totalSheets/(studentsLP + studentsAS + studentsEA);
        System.out.println("На каждого ученика рассчитано " +sheets + " листов бумаги");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        // Пишем код для задачи 4
        int bottlesPerMinute = 8;

        int bottlesIn20Minutes = bottlesPerMinute * 20;
        int bottlesIn24Hours = bottlesPerMinute * 60 * 24;
        int bottlesIn3Days = bottlesPerMinute * 60 * 24 * 3;
        int bottlesIn1Month = bottlesPerMinute * 60 * 24 * 30;

        System.out.println("За 20 минут машина произвела " + bottlesIn20Minutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesIn24Hours + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesIn3Days + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottlesIn1Month + " штук бутылок");
    }

    public static void task5 () {
        System.out.println("Задача 5");
        // Пишем код для задачи 5
    }

    public static void task6 () {
        System.out.println("Задача 6");
        // Пишем код для задачи 6
    }

    public static void task7 () {
        System.out.println("Задача 7");
        // Пишем код для задачи 7
    }

    public static void task8 () {
        System.out.println("Задача 8");
        // Пишем код для задачи 8
    }
}