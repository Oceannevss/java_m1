package cour_2_poo;

public class TaxeCalculator2023 implements TaxeCalculator{

    private double taxableIncome;

    public TaxeCalculator2023(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double CalculateTaxe() {
        return taxableIncome * 0.2;
    }
}
