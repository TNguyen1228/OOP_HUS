package command.exercise;

public class RestartCommand implements Command {
	private Computer computer;

	public RestartCommand(Computer computer) {
		this.computer = computer;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		computer.restart();

	}

}
