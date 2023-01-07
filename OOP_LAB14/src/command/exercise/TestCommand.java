package command.exercise;

public class TestCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer = new Computer();
		Command startCommand = new StartCommand(computer);
		Command shutDownCommand = new ShutdownCommand(computer);
		Command restartCommand = new RestartCommand(computer);

		Switch mySwitch = new Switch();
		mySwitch.storeAndExecute(startCommand);
		mySwitch.storeAndExecute(restartCommand);
		mySwitch.storeAndExecute(shutDownCommand);

	}

}
