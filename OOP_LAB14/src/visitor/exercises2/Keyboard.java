package visitor.exercises2;

public class Keyboard implements ComputerPart {

	
	@Override
	public void accept(ComputerPartVisitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}

}
