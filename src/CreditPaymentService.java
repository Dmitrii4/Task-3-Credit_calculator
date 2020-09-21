public class CreditPaymentService {
  public double calculate(double Credit_amount, double credit_term, double interest_rate) {
      double Monthly_interest_rate = interest_rate / 12 / 100 ;
      double annuity_coefficient = Monthly_interest_rate * Math.pow((1 + Monthly_interest_rate), credit_term) / (Math.pow((1 + Monthly_interest_rate), credit_term) - 1);
      double monthly_payment = annuity_coefficient * Credit_amount;
     return monthly_payment;
 }
}
