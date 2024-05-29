public class Main {
    public static void main(String[] args) {

        System.out.println("Задача1");
        double total = 0;
        int deposite = 15000;
        double persentPerMonth = 1.01;
        int month = 1;
        while (total < 2_459_000) {
            total = (total + deposite) * persentPerMonth;
            System.out.printf("Месяц %s, сумма накоплений равна %2f рублей %n", month, total);
            month++;
        }
        System.out.println();

        System.out.println("Задача2");
        int increase = 1;
        while (increase <= 10) {
            System.out.print(increase + " ");
            increase++;
        }
        System.out.println();
        System.out.println();
        for (int decrease = 10; decrease >= 1; decrease--) {
            System.out.print(decrease + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Задача3");
        int population = 12_000_000;
        int birthRate;
        int deathRate;
        for (int year = 1; year <= 10; year++) {
            birthRate = population / 1000 * 17;
            deathRate = population / 1000 * 8;
            population += birthRate - deathRate;
            System.out.printf(" Год %s , численность населения составляет %s%n", year, population);
        }
        System.out.println();
        System.out.println("Задача4-5");
        double vasyaPersent = 1.07;
        double vasyaDeposite = 15000;
        int vasyaMonth = 1;
        while (vasyaDeposite < 12_000_000) {
            vasyaDeposite *= vasyaPersent;
            if (vasyaMonth % 6 == 0)
                System.out.printf("Month: %s, deposite: %.2f %n", vasyaMonth, vasyaDeposite);
            vasyaMonth++;
        }
        System.out.println("Задача6");
        vasyaPersent = 1.07;
        vasyaDeposite = 15000;
        vasyaMonth = 1;
        int targetMonthAmount = 9 * 12;
        for (int i = 1; i < targetMonthAmount; i++) {
            vasyaDeposite *= vasyaPersent;
            if (i % 6 == 0) {
                System.out.printf("Month: %s, deposite: %.2f %n", i, vasyaDeposite);
            }
        }
        System.out.println("Задача7");
        int firstFriday = 8;
        for (int i = 5; i < 31; i++) {
            if ((i - firstFriday) % 7 == 0) {
                System.out.printf("Сегодня пятница, %s-e число. Необходимо подготовить отчёт. %n", i);
            }
        }
        System.out.println("Задача8");
        int period = 79;
        int currentYear = 2024;
        int lowerBorder = currentYear - 200;
        int upperBorder = currentYear + 100;
        int interAmount = 0;
        for (int i = 0; i < upperBorder; i++, interAmount++) {
            if (i > lowerBorder && i % period == 0) {
                System.out.println(i);
            }
        }
        System.out.println("inter amount: " + interAmount);

        System.out.println("Задача 8 ( 2ой вариант оптимизация");
        int periodTwo = 79;
        int currentYearTwo = 2024;
        int lowerBorderTwo = currentYear - 200;
        int upperBorderTwo = currentYear + 100;
        int interAmountTwo = 0;
        for (int r = 0; r < upperBorderTwo; r += period, interAmountTwo++) {
            if (r > lowerBorderTwo && r % periodTwo == 0) {
                System.out.println(r);
            }
        }
        System.out.println("inter amount: " + interAmountTwo);
    }
}




