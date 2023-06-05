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
        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;

        int numClasses = totalCans / (whiteCansPerClass + brownCansPerClass);
        int whiteCans = numClasses * whiteCansPerClass;
        int brownCans = numClasses * brownCansPerClass;

        System.out.println("В школе, где " + numClasses + " классов, нужно " + whiteCans + " банок белой краски и " + brownCans + " банок коричневой краски");
    }

    public static void task6 () {
        System.out.println("Задача 6");
        // Пишем код для задачи 6
        int bananas = 5;
        int bananaWeight = 80;
        int milk = 200;
        float milkGr100 = 105;
        int icecream = 2;
        int icecreamWeight = 100;
        int eggs = 4;
        int eggWeight = 70;

        float totalWeight = bananas*bananaWeight + milk*milkGr100/100 + icecream*icecreamWeight + eggs*eggWeight;
        float totalWeightInKg = totalWeight/1000;

        System.out.println("Завтрак весит " + totalWeight + " грамм (" + totalWeightInKg + " килограмма)");
    }

    public static void task7 () {
        System.out.println("Задача 7");
        // Пишем код для задачи 7
        float weightToLose = (float) (7*1000);// количество грамм, которое нужно потерять
        float minWeightLossPerDay = 250.0f; // минимальное количество грамм, которое можно потерять за день
        float maxWeightLossPerDay = 500.0f; // максимальное количество грамм, которое можно потерять за день

        // Расчёт количества дней для достижения результата при каждой из возможных скоростей похудения
        float daysToLoseMin = weightToLose / minWeightLossPerDay;
        float daysToLoseMax = weightToLose / maxWeightLossPerDay;

        // Расчёт средней скорости похудения и количества дней для достижения результата
        float averageWeightLossPerDay = (minWeightLossPerDay + maxWeightLossPerDay) / 2;
        float daysToLoseAvg = weightToLose / averageWeightLossPerDay;

        // Вывод результатов в консоль
        System.out.println("Для похудения на " + weightToLose / 1000 + " кг:");
        System.out.println("- при уменьшении веса на " + minWeightLossPerDay + " грамм в день потребуется " + daysToLoseMin + " дней");
        System.out.println("- при уменьшении веса на " + maxWeightLossPerDay + " грамм в день потребуется " + daysToLoseMax + " дней");
        System.out.println("- при уменьшении веса на среднее значение между " + minWeightLossPerDay + " и " + maxWeightLossPerDay + " грамм в день (" + averageWeightLossPerDay + " грамм) потребуется около " + daysToLoseAvg + " дней");
    }

    public static void task8 () {
        System.out.println("Задача 8");
        // Пишем код для задачи 8
        // Зарплаты сотрудников
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;

        // Рассчитываем повышение зарплаты и годовой доход
        float mashaSalaryIncreased = (float) ( mashaSalary * 1.1);
        float denisSalaryIncreased = (float) (denisSalary * 1.1);
        float kristinaSalaryIncreased = (float) (kristinaSalary * 1.1);

        double mashaAnnualIncome = mashaSalary * 12;
        double denisAnnualIncome = denisSalary * 12;
        double kristinaAnnualIncome = kristinaSalary * 12;

        double mashaAnnualIncomeIncreased = mashaSalaryIncreased * 12;
        double denisAnnualIncomeIncreased = denisSalaryIncreased * 12;
        double kristinaAnnualIncomeIncreased = kristinaSalaryIncreased * 12;

        // Выводим результаты в консоль
        System.out.println("Маша(получала "+ mashaSalary +") теперь получает " + mashaSalaryIncreased + " рублей. Годовой доход вырос на " + (mashaAnnualIncomeIncreased - mashaAnnualIncome) + " рублей");
        System.out.println("Денис(получал "+ denisSalary +")  теперь получает " + denisSalaryIncreased + " рублей. Годовой доход вырос на " + (denisAnnualIncomeIncreased - denisAnnualIncome) + " рублей");
        System.out.println("Кристина(получала "+ kristinaSalary +")  теперь получает " + kristinaSalaryIncreased + " рублей. Годовой доход вырос на " + (kristinaAnnualIncomeIncreased - kristinaAnnualIncome) + " рублей");
    }
}