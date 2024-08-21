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


    }
}