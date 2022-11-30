package abstractfactory.pseudocode;

import abstractfactory.pseudocode.button.Button;
import abstractfactory.pseudocode.checkboxes.CheckBox;
import abstractfactory.pseudocode.factories.GUIFactory;

public class App {
	private Button button;
	private CheckBox checkbox;

	public App(GUIFactory factory) {
		button = factory.createButton();
		checkbox = factory.createCheckbox();
	}

	public void paint() {
		button.paint();
		checkbox.paint();
	}
}
