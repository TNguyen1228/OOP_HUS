package visitor.exercises2;

public class Mouse implements ComputerPart {

	

	@Override
	public void accept(ComputerPartVisitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}

}
