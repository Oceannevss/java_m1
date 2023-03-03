package cour_2_poo;
import cour_1_poo.TextBox;

public class UIControl {
    private boolean isEnable = true;

    public void enable(){
        isEnable = true;
    }
    public void disable(){
        this.isEnable = false;
    }
}
