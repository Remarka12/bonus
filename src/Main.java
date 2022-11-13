public class Main {
    public static void main(String[] args) {
        int balance = 100;  // начальная сумма на телефоне
        int add = 100;   // сумма, которую пользователь добавил
        int total = balance + add; // итоговая сумма на счету пользователя

        int withBonus = balance + add / 100 + add; // сумма на счету при наличии бонусов

        if (add > 1000) {
            System.out.println("Бонусы начислены");
        } else {
            withBonus = total;
            System.out.println("Бонусы не начислены");
        }
        System.out.println("Итоговая сумма: " + withBonus);
    }
}
