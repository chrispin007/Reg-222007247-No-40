
public class bankaccount2 {
    public static void main(String[] args) {
        LoanAccount bobLoanAccount = new LoanAccount(500000.0, 18.0, 3);
        double totalPayment = bobLoanAccount.calculateTotalPayment();
        System.out.println("Total amount paid by Mr. Bob after 3 years with compound interest: " + totalPayment + " Rwandan francs");
    }
}

class LoanAccount {
    private double principal;
    private double annualInterestRate;
    private int timeYears;

    public LoanAccount(double principal, double annualInterestRate, int timeYears) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.timeYears = timeYears;
    }

    public double calculateTotalPayment() {
        int timeMonths = timeYears * 12;
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        double totalPayment = principal * Math.pow(1 + monthlyInterestRate, timeMonths) * monthlyInterestRate / (Math.pow(1 + monthlyInterestRate, timeMonths) - 1);
        return totalPayment;
    }
}







