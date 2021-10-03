package baseline;

public class PaymentCalculator {
    double balance;
    double APR;
    double monthlyPayment;

    PaymentCalculator(double balance, double APR, double monthlyPayment){
        this.balance=balance;
        this.APR = APR;
        this.monthlyPayment=monthlyPayment;
    }

    //n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
    public int  calculateMonthsUntilPaidOff(){
        //use function to calculate months
    }
}
