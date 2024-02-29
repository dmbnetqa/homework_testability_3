public class CreditPaymentService {
    public int calculate(int amount, double percent, int year) {
        year = year * 12;
        double perMonth = (percent / 12) / 100;
        double monthly = amount * (perMonth / (Math.pow(1 + perMonth, year) - 1) + perMonth);
        int payment = (int) monthly;
        return payment;
    }
}
