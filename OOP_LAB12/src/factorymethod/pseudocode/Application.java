package factorymethod.pseudocode;

import factorymethod.pseudocode.factory.Dialog;
import factorymethod.pseudocode.factory.HtmlDialog;
import factorymethod.pseudocode.factory.WindowsDialog;

public class Application {
	private static Dialog dialog;

	public static void main(String[] args) {
		configure();
		dialog.renderWindow();
	}

	static void configure() {
		if (System.getProperty("os.name").equals("Windows 10")) {
			dialog = new WindowsDialog();
		} else {
			dialog = new HtmlDialog();
		}
	}

}
