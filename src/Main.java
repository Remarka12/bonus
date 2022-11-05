public class Main {
    public static void main(String[] args) {
        int balance = 200;  // начальная сумма на телефоне
        boolean moreThousand = true;
        int add = 700;   // сумма, которую пользователь добавил
        int c = balance + add;


        if (c > 1000) {
            System.out.println("Бонусы начислены");
        } else {
            System.out.println("Бонусы не начислены");
        }
        int bonus = balance + add / 100 + add;
        if (bonus < 1000) {
            bonus = c;
        }

        System.out.println("Итоговая сумма: " + bonus);

    }
}
