package command.exercise;

public class StartCommand implements Command {
	private Computer computer;

	public StartCommand(Computer computer1) {
		this.computer = computer1;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		computer.start();
	}

}
