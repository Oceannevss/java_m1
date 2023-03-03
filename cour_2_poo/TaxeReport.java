package cour_2_poo;

public class TaxeReport {
    //private TaxeCalculator2018 taxeCalculator2018;
    private TaxeCalculator taxeCalculator;//interface
    public TaxeReport(TaxeCalculator calculator){
        //this.taxeCalculator = new TaxeCalculator2018(100_000);
        this.taxeCalculator = calculator;
    }

    public void show(){
        var tax = taxeCalculator.CalculateTaxe();
        System.out.println(tax);
    }
}
