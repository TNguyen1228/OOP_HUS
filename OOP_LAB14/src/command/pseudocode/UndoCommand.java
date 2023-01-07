package command.pseudocode;

public class UndoCommand extends Command {

	public UndoCommand(Application app, Editor editor) {
		super(app, editor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean execute() {
		// TODO Auto-generated method stub
		app.undo();
		return false;
	}

}
