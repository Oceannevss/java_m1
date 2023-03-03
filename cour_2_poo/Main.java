package cour_2_poo;

import cour_1_poo.TextBox;

public class Main {

    public static void main(String[] args) {
        //Part 1 heritage
        /*var control = new UIControl();
        control.disable();
        System.out.println(control.isEnable());*/

        var textbox = new TextBox();
        textbox.setText("hello");
        show(textbox);

        var checkbox = new CheckBox();
        show(checkbox);

        //Part 2 @override
        var point1 = new Point(1, 2);
        var point2 = new Point(1, 2);
        System.out.println(point2.equals(point1)); //false
        int age = 1;
        int age2 = 3;
        System.out.println(age == age2);

        //Part 3 encapsulation, abstract
        UIControl[] controls = {/*new UIControl(),*/ new TextBox(), new CheckBox()};
        for(UIControl control1: controls){
            control1.render();
        }

        //Part4 interface
        var calculator = new TaxeCalculator2018(100_000);
        var report = new TaxeReport(calculator);
        report.show();

        var calculator23 = new TaxeCalculator2023(200_000);
        var report23 = new TaxeReport(calculator23);
        report23.show();

    }

    public static void show (UIControl control){
        System.out.println(control);
    }
}
