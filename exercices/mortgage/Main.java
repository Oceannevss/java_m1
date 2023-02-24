package exercices.mortgage;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int principal1 = (int) Tools.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest1 = (float) Tools.readNumber("Annual Interest Rate: ", 1, 30);
        byte years1 = (byte) Tools.readNumber("Period (Years): ", 1, 30);

        Mortgage mortgage = new Mortgage(principal1, annualInterest1, years1);
        ArrayList<Double> listBalance = mortgage.getBalance();
        String mortgageFormatted = mortgage.getMortgageFormatted();

        mortgage.printMortgage(mortgageFormatted);
        mortgage.printPaymentSchedule(listBalance);
    }

}
