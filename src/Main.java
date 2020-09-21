public class Main {
        public static void main(String[] args) {
            CreditPaymentService service = new CreditPaymentService();
            int creditAmount = 1_000_000;
            double interestRate =  9.99;
            int creditTerm12 = 12;
            int creditTerm24 = 24;
            int creditTerm36 = 36;
            int monthlyPayment12 = (int) service.calculate(creditAmount, interestRate, creditTerm12);
            int monthlyPayment24 = (int) service.calculate(creditAmount, interestRate, creditTerm24);
            int monthlyPayment36 = (int) service.calculate(creditAmount, interestRate, creditTerm36);
            System.out.println(monthlyPayment12);
            System.out.println(monthlyPayment24);
            System.out.println(monthlyPayment36);
        }
    }
