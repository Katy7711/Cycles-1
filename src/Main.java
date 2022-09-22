public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }

        for (int y = 10; y > 0; y--) {
            System.out.println("Итерация цикла " + y);
        }

        for (int x = 2; x < 17; x = x + 2) {
            System.out.println("Итерация цикла " + x);
        }

        for (int d = 10; d >= -10; d--) {
            System.out.println("Итерация цикла " + d);
        }

        for (int e = 1904; e <= 2096; e = e + 4) {
            System.out.println(e + " год является високосным");
        }

        for (int s = 7; s <= 98; s = s + 7) {
            System.out.println(s);
        }

        for (int j = 1; j <= 512; j = j * 2) {
            System.out.println(j);
        }

        int money = 29000;
        int total = 0;
        for (int m = 1; m <= 12; m++) {
            total = total + money;
            System.out.println("Месяц " + m + " сумма накоплений равна " + total + " рублей");

        }

        int money1 = 29000;
        int total1 = 0;
        for (int v = 1; v <= 12; v++) {
            total1 = total1 + total / 100;
            total1 = total1 + money1;
            System.out.println("Месяц " + v + " сумма накоплений равна " + total1 + " рублей");
        }



        }
    }
