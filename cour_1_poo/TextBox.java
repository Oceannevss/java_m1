package cour_1_poo;
import cour_2_poo.UIControl;
public class TextBox extends UIControl{
    public String text;

    public TextBox() {
        System.out.println("Text box");
    }

    public void setText(String text){
        this.text = text;
    }
    public void clear(){
        text = "";
    }

    @Override
    public String toString() {
        return text;
    }
    @Override
    public void render() {
        System.out.println("Textbox");
    }
}