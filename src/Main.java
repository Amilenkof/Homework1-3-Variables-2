import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();}



    public static void task1 () {
        System.out.println("Задача  1");
       /*Задача 1
       Объявите переменные типа int, byte, short, long, float, double.
       Название переменных может быть любым, но если состоит из двух слов и более, должно соответствовать правилу camelCase.
       Выведите в консоль значение каждой переменной в формате «Значение переменной … с типом … равно …».// */
        int a= 129;
        System.out.println("Значение переменной а с типом int равно " +a);
        byte b=12;
        System.out.println("Значение переменной b с типом byte равно " +b);
        short c= 353;
        System.out.println("Значение переменной c с типом short равно " +c);
        long d =12312312412L;
        System.out.println("Значение переменной d с типом long равно " +d);
        float e= 1213.4124f;
        System.out.println("Значение переменной e с типом float равно " +e);
        double f=1231.4121313121412;
        System.out.println("Значение переменной f с типом double равно " +f);


    }


    public static void task2 () {
        System.out.println("Задача 2");
       /*Задача 2
Ниже дан список различных значений. Инициализируйте переменные, используйте изученные ранее типы переменных.
Значения:
27.12
987 678 965 549
2,786
569
-159
27897
67*/
        float a =27.12f;
        long b =987678965549L;
        double c =2.786;
        short d= 569;
        int e=-159;
        short f=27897;
        byte i= 67;


    }
    public static void task3 () {
        System.out.println("Задача 3");
       /*Задача 3
Три школьных учителя, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников.
Три учительницы закупили все вместе 480 листов бумаги на все три класса. Посчитайте, сколько достанется листов каждому ученику.
Результат задачи выведите в консоль в формате: «На каждого ученика рассчитано … листов бумаги».
Для объявления переменных не используйте тип var.*/
        byte lpStudent= 23;
        byte asStupent=27;
        byte eaStudent=30;
        short paper=480;
        int paperForEach=paper/(lpStudent+asStupent+eaStudent);
        System.out.println("На каждого ученика рассчитано " + paperForEach +" листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
       /*Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты. Какая производительность машины будет:
за 20 минут,
в сутки,
за 3 дня,
за 1 месяц?
Рассчитывайте производительность работы машины в том случае, если она работает без перерыва заданный промежуток времени.
Результаты подсчетов выведите в консоль в формате: «За … машина произвела … штук бутылок».
Для объявления переменных не используйте тип var.*/
        byte productTo2Min=16;
        int productTo20Min=productTo2Min*10;
        System.out.println("За 20 минут машина произвела "+productTo20Min +" штук бутылок");
        int productTo24Hours=productTo2Min*30*24;
        System.out.println("За сутки машина произвела "+productTo24Hours +" штук бутылок");
        int productTo3Days=productTo2Min*30*24*3;
        System.out.println("За 3 дня машина произвела "+productTo3Days +" штук бутылок");
        int productTo1Month=productTo2Min*30*24*30;
        System.out.println("За 1 месяц машина произвела "+productTo1Month +" штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");
       /*Задача 5
На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой. На один класс уходит 2 банки белой и 4 банки коричневой краски. Сколько банок каждой краски было куплено?
Выведите результат задачи в консоль в формате: «В школе, где … классов, нужно … банок белой краски и … банок коричневой краски».
Для объявления переменных не используйте тип var.*/
        byte paintAll=120;
        byte paintWhitePerClass=2;
        byte paintBrownPerClass=4;
        int paintWhiteSum=paintAll*paintWhitePerClass/6;
        int paintBrownSum=paintAll*paintBrownPerClass/6;
        System.out.println("В школе, где 6 классов, нужно " + paintWhiteSum+" банок белой краски и " +paintBrownSum +" банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");
       /*Задача 6
Спортсмены следят за своим весом и тщательно относятся к тому, что и сколько они съедают.
Вот один из рецептов, по которому спортсмен готовит себе завтрак:
Бананы — 5 штук (1 банан — 80 грамм).
Молоко — 200 мл (100 мл = 105 грамм).
Мороженое-пломбир — 2 брикета по 100 грамм.
Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
Смешать всё в блендере — и готово.
Подсчитайте вес (количество граммов) такого спортзавтрака, а затем переведите его в килограммы.
Результат в граммах и килограммах напечатайте в консоль.
Важное условие: если в рецепт нужно добавить несколько единиц какого-то продукта (с определенным весом), то нужно умножать количество единиц на вес в граммах. Например, если в рецепте указано, что нужно добавить 5 бананов по 80 грамм, то нужно количество бананов (5) умножить на вес одного (80 грамм), а не считать самим общую сумму граммов..*/
        byte bananas =5;
        byte weight1Banana=80;
        short milk=200;
        float weight1Milk=105/100f;
        byte iceCream=2;
        byte weight1Icecream=100;
        byte eggs=4;
        byte weight1Eggs=70;
        float weightBreakfast =weight1Banana*bananas+weight1Milk*milk+weight1Icecream*iceCream+weight1Eggs*eggs;
        System.out.println("Вес завтрака "+weightBreakfast + " грамм");
        double weightBreakfastKg= weightBreakfast/1000d;
        System.out.println("Вес завтрака "+ weightBreakfastKg + " киллограмм");


    }
    public static void task7 () {
        System.out.println("Задача 7");
       /* Задача 7
Правила соревнований обновились, и спортсмену, чтобы оставаться в своей весовой категории, нужно сбросить 7 кг. Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
Посчитайте, сколько дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм, а сколько — если каждый день будет худеть на 500 грамм.
Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
Результаты всех подсчетов выведите в консоль. */
        byte weighPlayerTarget=7;
        short slowWeightLow= 250;
        short fastWeghtLow=500;
        int durSlow=weighPlayerTarget*1000/slowWeightLow;
        System.out.println(durSlow + " дней до цели если терять 250 грамм в день");
        int durFast=weighPlayerTarget*1000/fastWeghtLow;
        System.out.println(durFast + " дней до цели если терять 500 грамм в день");
        double medCalosriesLost=(slowWeightLow+fastWeghtLow)/2;
        double medTime=(weighPlayerTarget*1000)/medCalosriesLost;

        System.out.printf("В среднем понадобится %.2f%n" , medTime,"Дней для похуйдения %n");

    }public static void task8 () {
        System.out.println(" Задача 8");
       /* Задача 8
Представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников. В компании есть правило: чем дольше сотрудник работает в компании,
тем ценнее он для бизнеса. Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год. Каждый год повышение составляет 10% от текущей зарплаты.
К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:
Маша получает 67 760 рублей в месяц.
Денис получает 83 690 рублей в месяц.
Кристина получает 76 230 рублей в месяц.
Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.
Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
Выведите в консоль информацию по каждому сотруднику. Например: «Маша теперь получает ... рублей. Годовой доход вырос на ... рублей». */
        int mashaWage=67_760;
        int denisWage=83_690;
        int kristinaWage=76_230;
        double newMashaWage=mashaWage*1.1;
        double newDenisWage=denisWage*1.1;
        double newKristinaWage=kristinaWage*1.1;
        double difMashaWage=newMashaWage*12-mashaWage*12;
        double difDenisWage=newDenisWage*12-denisWage*12;
        double difKristinaWage=newKristinaWage*12-kristinaWage*12;
        System.out.printf(Locale.US,"Маша теперь получает %.2f  рублей. Годовой доход вырос на %.2f  рублей %n", newMashaWage,difMashaWage);
        System.out.printf(Locale.US,"Денис теперь получает %.2f  рублей. Годовой доход вырос на %.2f  рублей %n", newDenisWage,difDenisWage);
        System.out.printf(Locale.US,"Кристина теперь получает %.2f  рублей. Годовой доход вырос на %.2f  рублей %n", newKristinaWage,difKristinaWage);

    }

}

