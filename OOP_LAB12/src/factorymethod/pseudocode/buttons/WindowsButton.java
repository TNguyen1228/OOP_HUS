package factorymethod.pseudocode.buttons;


public class WindowsButton implements Button {

	public void render() {
		System.out.println("Rendering");
	}

	public void onClick() {
		System.out.println("Clicking");
	}
}