package factorymethod.pseudocode.factory;

import factorymethod.pseudocode.buttons.Button;
import factorymethod.pseudocode.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}
}