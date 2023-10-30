import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    private static void task1() {
        System.out.println("Введите возраст:");

        int age =  getInputInt();
        boolean chk = age>=18;

        if (chk) {
            System.out.println("Вам 18 или больше лет");
        }
        else{
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать");
        }
    }

    private static void task2() {
        System.out.println("Введите температуру:");

        int temp = getInputInt();
        boolean chk = temp>=5;

        if (chk) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        else{
            System.out.println("На улице холодно, нужно надеть шапку");
        }
    }

    private static void task3() {

        System.out.println("Введите скорость:");

        int speed = getInputInt();
        boolean chk = speed>60;

        if (chk) {
            System.out.println("Если скорость "+speed+" придется заплатить штраф");
        }
        else{
            System.out.println("Если скорость "+speed+" можно ездить спокойно");
        }
    }

    private static void task4() {
        System.out.println("Введите возраст человека:");

        int age = getInputInt();
        String strOut = "Если возраст человека равен "+age+" то ему нужно ходить ";

        if (age >= 2 && age <= 6)
            System.out.println(strOut + "в детский сад");
        else if (age >= 7 && age <= 17)
            System.out.println(strOut + "в школу");
        else if (age >= 18 && age <= 24)
            System.out.println(strOut + "в университет");
        else
            System.out.println(strOut + "на работу");

    }

    private static void task5() {
        System.out.println("Введите возраст ребенка:");

        int age = getInputInt();
        String strOut = "Если возраст ребенка равен "+age+" то ему ";

        if (age < 5)
            System.out.println(strOut + "нельзя кататься на аттракционе");
        else if (age <= 14)
            System.out.println(strOut + "можно кататься на аттракционе только в сопровождении взрослого");
        else
            System.out.println(strOut + "можно кататься на аттракционе без сопровождения взрослого");

    }

    private static void task6() {

        int sitPlaces = 60;
        int places = 102;

        System.out.println("Введите количество человек в вагоне:");

        int ppl = getInputInt();
        String strOut = "Если количество человек в вагоне "+ppl+" то ";

        if (ppl <= sitPlaces)
            System.out.println(strOut + "в вагоне есть сидячие места");
        else if (ppl<=places)
            System.out.println(strOut + "в вагоне остались только стоячие места");
        else
            System.out.println(strOut + "вагон будет переполнен");
    }

    private static void task7() {
        System.out.println("Введите значение one:");
        int one = getInputInt();
        System.out.println("Введите значение two:");
        int two = getInputInt();
        System.out.println("Введите значение three:");
        int three = getInputInt();

        String strOut = "Наибольшее значение у числа ";

        if ((one <= two && two< three)||(one >= two && one< three))
            System.out.println(strOut + " three " + three);
        else if ((three <= two && two< one)||(three >= two && three< one))
            System.out.println(strOut + " one " + one);
        else if ((three <= one && one< two)||(three >= one && three<two))
            System.out.println(strOut + " two " + two);
        else if (one<two)
            System.out.println("two равно three и равно " + two);
        else if (two<one)
            System.out.println("one равно three и равно " + two);
        else if (three<one)
            System.out.println("one равно two и равно " + two);
        else
            System.out.println("Числа равны");
    }

    private static int getInputInt() {
        int buff;
        String input="";
        int num = 0;
        boolean chk = false;
        while (!chk) {
            try {
                buff = System.in.read();
                while (System.in.available() > 0) {
                    input += (char) buff;
                    buff = System.in.read();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            try {
                num = Integer.parseInt(input);
            } catch (NumberFormatException e){
                System.out.println("Введите корректное число:");
            }
            chk = true;
        }

        return num;
    }
}