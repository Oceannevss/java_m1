package cour_2_poo;

public class TaxeCalculator2018 implements TaxeCalculator {

    private double taxableIncome;

    public TaxeCalculator2018(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double CalculateTaxe(){
        return taxableIncome * 0.3;
    }

}
