public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int year = 3;
        int amount = 1_000_000;
        double percent = 9.99;
        int payment = service.calculate(amount, percent, year);

        System.out.println(payment);
    }
}