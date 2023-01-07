package command.pseudocode;

public class CutCommand extends Command {

	public CutCommand(Application app, Editor editor) {
		super(app, editor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean execute() {
		// TODO Auto-generated method stub
		if (editor.getSelection().isEmpty()) {
			return false;
		}

		saveBackup();
		app.clipboard = editor.getSelection();
		editor.deleteSelection();
		return true;

	}

}
