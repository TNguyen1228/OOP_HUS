package abstractfactory.pseudocode.factories;

import abstractfactory.pseudocode.button.Button;
import abstractfactory.pseudocode.checkboxes.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckbox();
}
