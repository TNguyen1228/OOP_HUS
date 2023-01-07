package command.exercise;

public class ShutdownCommand implements Command {
	private Computer computer;

	public ShutdownCommand(Computer computer) {
		this.computer = computer;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		computer.shutDown();
	}

}
