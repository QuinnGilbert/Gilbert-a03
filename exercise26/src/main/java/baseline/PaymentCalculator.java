/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Quinn Gilbert
 */
package baseline;

public class PaymentCalculator {
    double balance;
    double apr;
    double monthlyPayment;

    PaymentCalculator(double balance, double apr, double monthlyPayment){
        this.balance=balance;
        this.apr = apr;
        this.monthlyPayment=monthlyPayment;
    }

    //n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
    public int  calculateMonthsUntilPaidOff(){
        //use function to calculate months
        //round up fractions of a cent
        double dailyAPR = apr/365;
        double months = -(1d/30) * (Math.log(1+balance/monthlyPayment*(1-Math.pow((1+dailyAPR),30) ))/Math.log(1+dailyAPR));
        //round up to the nearest month
        return (int)Math.ceil(months);
    }
}
