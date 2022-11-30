package abstractfactory.pseudocode.app;

import abstractfactory.pseudocode.App;
import abstractfactory.pseudocode.factories.GUIFactory;
import abstractfactory.pseudocode.factories.MacOSFactory;
import abstractfactory.pseudocode.factories.WindowsFactory;

public class AppConfiguration {
	private static App configureApplication() {
		App app;
		GUIFactory factory;
		String osName = System.getProperty("os.name").toLowerCase();
		if (osName.contains("mac")) {
			factory = new MacOSFactory();
		} else {
			factory = new WindowsFactory();
		}
		app = new App(factory);
		return app;
	}

	public static void main(String[] args) {
		App app = configureApplication();
		app.paint();
	}
}
