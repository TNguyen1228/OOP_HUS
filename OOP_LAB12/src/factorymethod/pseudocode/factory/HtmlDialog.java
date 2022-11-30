package factorymethod.pseudocode.factory;

import factorymethod.pseudocode.buttons.Button;
import factorymethod.pseudocode.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

	@Override
	public Button createButton() {
		return new HtmlButton();
	}
}