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
        //round up fractions of a cent
        double dailyAPR = Math.ceil(APR/365*100)/100.0;
        double months = -(1/30.0) * (Math.log(1+balance/monthlyPayment*(1-Math.pow((1+dailyAPR),30)))/Math.log(1+dailyAPR));
        //round up to nearest month
        return (int)Math.ceil(months);
    }
}
