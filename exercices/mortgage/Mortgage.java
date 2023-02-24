package exercices.mortgage;

import java.text.NumberFormat;
import java.util.ArrayList;

public class Mortgage {

    private int principal;
    private float annualInterest;
    private int years;
    final static int MONTHS_IN_YEAR = 12;
    final static int PERCENT = 100;

    public Mortgage(int principal, float annualInterest, int years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    private double calculateMortgage() {

        float monthlyInterest = this.annualInterest / PERCENT / MONTHS_IN_YEAR;
        float numberOfPayments = this.years * MONTHS_IN_YEAR;

        double mortgage = this.principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }

    private double calculateBalance(short numberOfPaymentsMade) {
        float monthlyInterest = this.annualInterest / PERCENT / MONTHS_IN_YEAR;
        float numberOfPayments = this.years * MONTHS_IN_YEAR;

        double balance = this.principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }
    public String getMortgageFormatted(){
        double mortgage = calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        return mortgageFormatted;
    }
    public ArrayList<Double> getBalance(){
        ArrayList<Double> list = new ArrayList<>();
        for (short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
            double balance = calculateBalance(month);
            list.add(balance);
        }
        return list;
    }
    public void printMortgage(String mortgageFormatted) {
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }
    public void printPaymentSchedule(ArrayList<Double> list) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (double balance : list){
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }
}
