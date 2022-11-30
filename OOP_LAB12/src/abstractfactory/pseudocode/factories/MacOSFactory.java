package abstractfactory.pseudocode.factories;

import abstractfactory.pseudocode.button.Button;
import abstractfactory.pseudocode.button.MacOSButton;
import abstractfactory.pseudocode.checkboxes.CheckBox;
import abstractfactory.pseudocode.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new MacOSButton();
	}

	@Override
	public CheckBox createCheckbox() {
		return new MacOSCheckbox();
	}

}
