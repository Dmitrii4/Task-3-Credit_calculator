public class Main {
        public static void main(String[] args) {
            CreditPaymentService service = new CreditPaymentService();
            int monthly_payment12 = (int) service.calculate(1_000_000, 12, 9.99);
            int monthly_payment24 = (int) service.calculate(1_000_000, 24, 9.99);
            int monthly_payment36 = (int) service.calculate(1_000_000, 36, 9.99);
            System.out.println(monthly_payment12);
            System.out.println(monthly_payment24);
            System.out.println(monthly_payment36);
        }
    }
