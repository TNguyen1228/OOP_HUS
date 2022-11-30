package abstractfactory.pseudocode.factories;

import abstractfactory.pseudocode.button.Button;
import abstractfactory.pseudocode.button.WindowsButton;
import abstractfactory.pseudocode.checkboxes.CheckBox;
import abstractfactory.pseudocode.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public CheckBox createCheckbox() {
		return new WindowsCheckbox();
	}
}