package command.exercise;

import java.util.*;

public class Switch {
	private List<Command> history = new ArrayList<>();

	public void storeAndExecute(Command command) {
		history.add(command);
		command.execute();
	}

}
