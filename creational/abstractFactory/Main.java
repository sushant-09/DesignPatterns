package creational.abstractFactory;

public class Main {

    public static void main(String[] args){

        GUIFactory factory = new MacGUIFactory();
        Button button = factory.createButton();
        CheckBox checkBox = factory.createCheckBox();
        button.render();
        checkBox.render();

        GUIFactory factory1 = new WindowsGUIFactory();
        Button button1 = factory1.createButton();
        CheckBox checkBox1 = factory1.createCheckBox();
        button1.render();
        checkBox1.render();

    }
}
