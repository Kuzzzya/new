public class Main {
    public static void main(String[] args) {
        // входные данные
        int balance = 100;
        int replenishment = 15000;


        // логика

        int bonus = replenishment >= 1000 ? replenishment / 100 : 0;
        int total = balance + replenishment + bonus;
        System.out.print("Вам начислены бонусные баллы в размере " + bonus + " рублей");
        System.out.print(" Ваш баланс составляет " + total + " рублей");
    }

}

//        int bonus = replenishment * 1 / 100;
//        int total = balance + replenishment + bonus;
//        int total2 = balance + replenishment;
//        if (replenishment >= 1000) {
//            System.out.print("Вам начислены бонусные баллы в размере " + bonus +
//                    " рублей, ваш баланс состовляет " + total + " рубля");
//
//        } else {
//            bonus = 0;
//            System.out.print("Ваш баланс состовляет " + total2 + " рубля");