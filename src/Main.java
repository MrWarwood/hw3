public class Main {
    public static void main(String[] args) {System.out.println("Домашнее задание 3");
        System.out.println("  Задача 1.");
       byte a = 100;
       System.out.println("Значение переменной a, с типом byte равно " + a);
       short b = 10000;
       System.out.println("Значение переменной b, с типом short равно " + b);
       int c = 1234567890;
       System.out.println("Значение переменной c, с типом int равно " + c);
       long d = 123456789101112L;
       System.out.println("Значение переменной d, с типом long равно " + d);

       System.out.println("  Задача 2.");
       float one = 27.12f;
       System.out.println("1 значение - " + one);
       long two = 987678965549L;
       System.out.println("2 значение - " + two);
       double three = 2.786;
       System.out.println("3 значение - " + three);
       short four = 569;
       System.out.println("4 значение - " + four);
       short five = -159;
       System.out.println("5 начение - " + five);
       short six = 27897;
       System.out.println("6 значение - " + six);
       byte seven = 67;
       System.out.println("7 значение - " + seven);

       System.out.println("  Задача 3.");
       byte teacher1 = 23;
       byte teacher2 = 27;
       byte teacher3 = 30;
       System.out.println("У Людмилы Павловны " + teacher1 + " ученика");
       System.out.println("у Анны Сергеевны " + teacher2 + " ученика");
       System.out.println("у Екатерины Андреевны " + teacher3 + " ученика");
       int studentsInTotal = teacher1 + teacher2 + teacher3;
       System.out.println("Всего в трех класах " + studentsInTotal + " ученика");
       short purchasedPapers = 480;
       System.out.println("Вместе на 3 класа закупили " + purchasedPapers + " листов бумаги");
       int papersForEveryone = purchasedPapers / studentsInTotal;
       System.out.println("На каждого ученика рассчитано " + papersForEveryone + " листов бумаги");

       System.out.println("  Задача 4.");
       byte productivityIn2Minutes = 16;
       System.out.println("Производительность за 2 минуты " + productivityIn2Minutes + " бутылок");
       int productivityIn1Minutes = productivityIn2Minutes / 2;
       System.out.println("Производительность за 1 минуты " + productivityIn1Minutes + " бутылок");
       int prodIn20Min = productivityIn1Minutes * 20;
       int prodIn24Hours = (prodIn20Min * 3) * 24;
       int prodIn3Days = prodIn24Hours * 3;
       int prodIn1Month = prodIn3Days * 10;
       System.out.println("За 20 минут машина произвела " + prodIn20Min + " штук бутылок");
       System.out.println("За 1 час машина произвела " + prodIn24Hours + " штук бутылок");
       System.out.println("За 3 дня машина произвела " + prodIn3Days + " штук бутылок");
       System.out.println("За 1 месяц или 30 суток машина произвела " + prodIn1Month + " штук бутылок");

       System.out.println("  Задача 5.");
       byte weNeedCans = 120;
       byte wCansInClass = 2;
       byte bCansInClass = 4;
       int forOneClass = wCansInClass + bCansInClass;
       System.out.println("На ремон школы надо " + weNeedCans + " банок краски.");
       System.out.println("На один класс надо " + wCansInClass + " банки белой краски и "
               + bCansInClass + " банки коричневый, суммарно надо " + forOneClass + " банок краски на класс.");
       int totalClasses = weNeedCans / forOneClass;
       int wCansForSchool = totalClasses * wCansInClass;
       int bCansForSchool = totalClasses * bCansInClass;
       System.out.println("В школе, где " + totalClasses + " классов, нужно " + wCansForSchool +
               " банок белой краски и " + bCansForSchool + " банок коричневой краски.");

       System.out.println("  Задача 6.");
       byte bananaWeighs = 80;
       byte milk100Ml = 105;
       byte iceCreamBriquette = 100;
       byte egg = 70;
       System.out.println("Вес продуктов питания: 1 банан весит " + bananaWeighs +
               " грамм, 100 мл молока весит " + milk100Ml + " грамм, 1 брекет мороженного-пломбир весит "
               + iceCreamBriquette + " грамм, 1 яйцо весит " + egg + " грамм.");
       int theFirstRecipeWeighs = ( 5 * bananaWeighs ) + ( 2 * milk100Ml ) +
               ( 2 * iceCreamBriquette ) + ( 4 * egg );
       float theFirstRecipeWeighsKg= theFirstRecipeWeighs / 1000F;
       System.out.println("Вес одного из рецептов по которому спордсмены готовят себе завтрак равен "
               + theFirstRecipeWeighs + " грамм или " + theFirstRecipeWeighsKg + " кг.");

       System.out.println("  Задача 7.");
       short diet250 = 250;
       short diet500 = 500;
       byte loseWeightKg = 7;
       int loseWeightGr = loseWeightKg * 1000;
       int dayDiet250 = loseWeightGr / diet250;
       int dayDiet500 = dayDiet250 / 2;
       int loseWeightOnAverage = (dayDiet250 + dayDiet500) / 2;
       System.out.println("Если спордсмен будеь терять по " + diet250 + " грамм каждый день, то ему потребуется "
               + dayDiet250 + " дней, а если будет терять по " + diet500 + " грамм в день, то " + dayDiet500 +
               " дней что бы сбросить " + loseWeightKg + " кг перед соревнованиями. ");
       System.out.println("Но при средней потере в веса ему понадобиться " + loseWeightOnAverage + " день.");

       System.out.println("  Задание 8.");
       int masha = 67760;
       int denis = 83690;
       int kristina = 76230;
       float masha10 = masha * 1.1F;
       float denis10 = denis * 1.1F;
       float kristina10 = kristina * 1.1F;
       float diffSalaryMasha = (masha10 * 12F) - (masha * 12F);
       float diffSalaryDenis = (denis10 * 12F) - (denis * 12F);
       float diffSalaryKristina = (kristina10 * 12F) - (kristina * 12F);
       System.out.println("Маша теперь получает " + masha10 + " рублей. Годовой доход вырос на "
               + diffSalaryMasha + " рублей");
       System.out.println("Денис теперь получает " + denis10 + " рублей. Годовой доход вырос на "
               + diffSalaryDenis + " рублей");
       System.out.println("Кристина теперь получает " + kristina10 + " рублей. Годовой доход вырос на "
               + diffSalaryKristina + " рублей");
    }
}