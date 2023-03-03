package cour_2_poo;
import cour_1_poo.TextBox;

public abstract class UIControl {
    private boolean isEnable = true;

    public UIControl() {
        System.out.println("UI Control");
    }

    public abstract void render();
    //Comme c'est une classe abstraite on peut faire une declaration de fonction sans boby

    public void enable(){
        isEnable = true;
    }
    public void disable(){
        this.isEnable = false;
    }

    public boolean isEnable(){
        return isEnable;
    }
}
