public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1:");
        int a = 5;
        byte b = 15;
        short c = 25;
        long d = 30;
        float e = 45;
        double f = 55;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
        System.out.println();
        System.out.println("Задача 2:");
        float A = (float) 27.12;
        long B = 987678965549L;
        double C = 2.786;
        boolean D = A > 30;
        int E = 569;
        short F = - 159;
        int G = 27897;
        byte J = 67;
        System.out.println(A + ", " + B + ", " + C + ", " + D + ", " + E + ", " + F + ", " + G + ", " + J + ".");
        System.out.println();
        System.out.println("Задача 3:");
        int LydmilaPavlovnaStudent = 23;
        int AnnaSergeevaStudent = 27;
        int EkaterinaAndreevnaStudent = 30;
        int paper = 480;
        System.out.println("На каждого ученика рассчитано " + paper/(LydmilaPavlovnaStudent+AnnaSergeevaStudent+EkaterinaAndreevnaStudent) + " листов бумаги");
        System.out.println();
        System.out.println("Задача 4:");
        int bottles = 16;
        int twoMinutes = 2;
        int bottlesPerMinute = bottles/twoMinutes;
        int twentyMinutes = 20 * bottlesPerMinute;
        int day = 1440 * bottlesPerMinute;
        int threeDays = day * 3;
        int month = day * 30;
        System.out.println("За 20 минут машина произвела бутылок " + twentyMinutes + " штук");
        System.out.println("За сутки машина произвела бутылок " + day + " штук");
        System.out.println("За 3 дня машина произвела бутылок " + threeDays + " штук");
        System.out.println("За месяц машина произвела бутылок " + month + " штук ");
        System.out.println();
        System.out.println("Задача 5:");
        int totalCans = 120;
        int oneClassWhite = 2;
        int oneClassBrown = 4;
        int classesAtSchool = totalCans / (oneClassBrown + oneClassWhite);
        int totalCansOfWhitePaint = oneClassWhite * classesAtSchool;
        int totalCansOfBrownPaint = oneClassBrown * classesAtSchool;
        System.out.println("В школе, где " + classesAtSchool +" классов, нужно " + totalCansOfWhitePaint + " банок белой краски и " + totalCansOfBrownPaint + " банок коричневой краски");
        System.out.println();
        System.out.println("Задача 6:");
        int bananas = 5;
        int weightOfOneBananaIsGrams = 80;
        int milk = 200;
        double oneHundredMillilitersOfMilkInGrams = 100/105;
        int iceCream = 2;
        int iceCreamWeightOfOne = 100;
        int eggs = 4;
        int eggWeightInGramsOfOne = 70;
        double weightOfTheSportsBreakfastInGrams = (bananas * weightOfOneBananaIsGrams) + (milk * oneHundredMillilitersOfMilkInGrams) + (iceCream * iceCreamWeightOfOne) + (eggs * eggWeightInGramsOfOne);
        System.out.println("Вес спорт-завтрака в граммах: " + weightOfTheSportsBreakfastInGrams);
        System.out.println("Вес спорт-завтрака в килограммах: " + weightOfTheSportsBreakfastInGrams / 1000);
        System.out.println();
        System.out.println("Задача 7:");
        int loseWeightKg = 7;
        int loseWeightG = 7 * 1000;
        int loseWeight1 = 250;
        int loseWeight2 = 500;
        int daysToLoseWeight1 = loseWeightG / loseWeight1;
        int daysToLoseWeight2 = loseWeightG / loseWeight2;
        double onAverageDays = loseWeightG / (loseWeight1 + loseWeight2);
        System.out.println(daysToLoseWeight1 + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм");
        System.out.println(daysToLoseWeight2 + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 500 грамм");
        System.out.println(onAverageDays + " может потребоваться дней в среднем, чтобы добиться результата похудения.");
        System.out.println();
        System.out.println("Задача 8:");
        int MashaPerMonthRuble = 67760;
        int DenisPerMonthRuble = 83690;
        int KristinaPerMonthRuble = 76230;
        double MashaIncrease = MashaPerMonthRuble * 1.1;
        double DenisIncrease = DenisPerMonthRuble * 1.1;
        double KristinaIncrease = KristinaPerMonthRuble * 1.1;
        double MashaDifference12Mounth = 12 * (MashaIncrease - MashaPerMonthRuble);
        double DenisDifference12Mounth = 12 * (DenisIncrease - DenisPerMonthRuble);
        double KristinaDifference12Mounth = 12 * (KristinaIncrease - KristinaPerMonthRuble);
        System.out.println("Маша теперь получает " + MashaIncrease + " рублей. Годовой доход вырос на " + MashaDifference12Mounth + " рублей.");
        System.out.println("Денис теперь получает " + DenisIncrease + " рублей. Годовой доход вырос на " + DenisDifference12Mounth + " рублей.");
        System.out.println("Кристина теперь получает " + KristinaIncrease + " рублей. Годовой доход вырос на " + KristinaDifference12Mounth + " рублей.");
    }
}
