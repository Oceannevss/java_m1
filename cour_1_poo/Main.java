package cour_1_poo;


public class Main {

    public static void main(String[] args){

        var t = new TextBox();
        System.out.println(t.text);
        t.setText("hello from ynov");
        System.out.println(t.text);
        t.clear();
        System.out.println(t.text);
        var t2 = t;
        t2.setText("test");
        System.out.println(t.text);
        System.out.println(t2.text);

        var axel = new Employee(1, 2, 3);
        axel.setExtraHours(8);
        int wage = axel.calculateWage();
        System.out.println(wage);
    }
}