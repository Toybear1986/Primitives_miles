public class Main {
    public static void main(String[] args) {
        int amount = 10_000;
        int for_one_mile = 20;

        int bonus = amount / for_one_mile;

        System.out.println("Вы получите " + bonus + " миль за этот заказ");
    }
}