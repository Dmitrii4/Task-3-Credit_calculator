public class CreditPaymentService {
  public double calculate(double creditAmount, double interestRate , double creditTerm) {
      double MonthlyInterestRate = interestRate / 12 / 100 ;
      double annuityCoefficient = MonthlyInterestRate * Math.pow((1 + MonthlyInterestRate), creditTerm) / (Math.pow((1 + MonthlyInterestRate), creditTerm) - 1);
      double monthlyPayment = annuityCoefficient * creditAmount;
     return monthlyPayment;
 }
}
