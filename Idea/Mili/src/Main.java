public class Main {
    public static void main(String[] args) {
        int amount = 19620; // стоимость билета
        int milicost = 20;  // стоимость 1 мили

        int mili = amount / milicost; // За каждые потраченные 20 рублей дают 1 милю

        System.out.println(" Вам начислено миль: " + mili);
    }
}