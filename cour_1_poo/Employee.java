package cour_1_poo;

public class Employee {
    private int baseSalary;
    private int extraHours;
    private int hourRate;

    public Employee(int baseSalary, int extraHours, int hourRate) {
        this.baseSalary = baseSalary;
        this.extraHours = extraHours;
        this.hourRate = hourRate;
    }

    public int calculateWage() {
            return baseSalary + (extraHours * hourRate);
    }

    public void setExtraHours(int extraHours) {
        this.extraHours = extraHours;
    }

    public void setBaseSalary(int baseSalary) throws IllegalAccessException {
        if(baseSalary < 0){
            throw new IllegalAccessException();
        }
        this.baseSalary = baseSalary;
    }
}
