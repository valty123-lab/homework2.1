public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Задача 1.
        byte apple = 100;
        short orange = 15000;
        int bananas = 50000;
        long year = 360000000L;
        float c = 3.78f;
        double b = 1.7;
        System.out.println("Значение переменной с типом byte = " + apple);
        System.out.println("Значение переменной с типом short = " + orange);
        System.out.println("Значение переменной с типом int = " + bananas);
        System.out.println("Значение переменной с типом long = " + year);
        System.out.println("Значение переменной с типом float = " + c);
        System.out.print("Значение переменной с типом double = " + b);

        //Задача 2.
        double a = 27.12F;
        long e = 987678965549L;
        float j = 2.786f;
        short k = 569;
        short l = -159;
        long p = 27897;
        byte w = 67;
        System.out.println(a);
        System.out.println(e);
        System.out.print(j);
        System.out.print(k);
        System.out.print(l);
        System.out.print(p);
        System.out.print(w);

        //задача 3.
        int studentOfClass1 = 23;
        int studentOfClass2 = 27;
        int studentOfClass3 = 30;
        int allSheets = 480;
        int allStudents = studentOfClass1 + studentOfClass2 + studentOfClass3;
        int sheetsPerStudent = allSheets / allStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");

        //задача 4.
        int bottlesPerMinute = 8;
        int minutesInDay = 1440;
        int minutesIn3Days = 3 * minutesInDay;
        int minutesInMonth = 30 * minutesInDay;

        int bottlesIn20Minutes = bottlesPerMinute * 20;
        int bottlesInDay = bottlesPerMinute * minutesInDay;
        int bottlesIn3Days = bottlesPerMinute * minutesIn3Days;
        int bottlesInMonth = bottlesPerMinute * minutesInMonth;


        System.out.println("За 20 минут машина произвела " + bottlesIn20Minutes + " штук бутылок");
        System.out.println("За три дня машина произвела " + bottlesIn3Days + "штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesInDay + " штук бутылок");
        System.out.println("За 30 дней машина произвела " + bottlesInMonth + " штук бутылок");

        //Задача 5.
        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;
        int totalClasses = totalCans / (whiteCansPerClass + brownCansPerClass);
        int totalWhiteCans = totalClasses * whiteCansPerClass;
        int totalBrownCans = totalClasses * brownCansPerClass;
        System.out.println("В школе, где " + totalClasses + " классов нужно, нужно " + totalWhiteCans + " банок белой краски "
                + totalBrownCans + " банок коричневой краски");
        //Задача 6.
        int bananasCount = 5;
        int bananasWeightGramm = 80;
        int milkVolume = 105 * 2;
        double iceCreamWeight = 2 * 100;
        int eggsCount = 4;
        int eggsWeightGramm = 70;
        int totalWeight = bananasCount * bananasWeightGramm + milkVolume + (int) iceCreamWeight + eggsCount * eggsWeightGramm;
        double totalWeightInKg = totalWeight / 1000.0;

        System.out.println(" Общий вес завтрака " + totalWeight + " грамм");
        System.out.println("Общий вес завтрака в килограммах " + totalWeightInKg);

        //Задача 7.
        int weightLossGoalKg = 7;
        double dailyWeightLossLowKg = 0.25;
        double dailyWeightHighKg = 0.5;
        int daysLow = (int) Math.ceil(weightLossGoalKg / dailyWeightLossLowKg);
        int daysHigh = (int) Math.ceil(weightLossGoalKg / dailyWeightHighKg);
        int averageDays = (daysLow + daysHigh) / 2;

        System.out.println("Для похудения на " + weightLossGoalKg + "кг при потере веса " + dailyWeightLossLowKg + " кг в день нужно " +
                daysLow + " дней");
        System.out.println("Для похудения на " + weightLossGoalKg + "кг при потере веса " + dailyWeightHighKg + " кг в день нужно " + daysHigh
                + " дней");
        System.out.println("В среднем потребуется " + averageDays + "дней для похудения на " + weightLossGoalKg + "кг");

        //Задача 8.
        double increasedPercent = 1.1;
        int MashaSalary = 67760;
        int DenisSalary = 83690;
        int kristinaSalary = 76230;

        int MashaNewSalary = (int) (MashaSalary * increasedPercent);
        int DenisNewSalary = (int) (DenisSalary * increasedPercent);
        int kristinaNewSalary = (int) (kristinaSalary * increasedPercent);

        int mashaAnnualInComeBefore = MashaSalary * 12;
        int DenisAnnualInComeBefore = DenisSalary * 12;
        int kristinaAnnualInComeBefore = kristinaSalary * 12;

        int mashaAnnualInComeAfter = MashaNewSalary * 12;
        int DenisAnnualInComeAfter = DenisNewSalary * 12;
        int kristinaAnnualInComeAfter = kristinaNewSalary * 12;

        int mashadifferenceAnnualInCome = mashaAnnualInComeAfter - mashaAnnualInComeBefore;
        int DenisDifferenceAnnualInCome = DenisAnnualInComeAfter - DenisAnnualInComeBefore;
        int kristinaDifferenceAnnualInCome = kristinaAnnualInComeAfter - kristinaAnnualInComeBefore;

        System.out.println("Маша теперь получает " + MashaNewSalary + " рублей. Годовой доход вырос на " + mashadifferenceAnnualInCome
                + " рублей");
        System.out.println("Денис теперь получает " + DenisNewSalary + " рублей. Годовой доход вырос на " + DenisDifferenceAnnualInCome
                + " рублей");
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinaDifferenceAnnualInCome
                + " рублей");


    }
}