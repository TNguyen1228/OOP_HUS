package visitor.exercises1;

public class DesignPatternBook implements ProgramingBook {

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}

	@Override
	public String getResource() {
		// TODO Auto-generated method stub
		return "Head First Design Patterns";
	}

	public String getBestSeller() {
		// TODO Auto-generated method stub
		return "Hanoi University of Science";
	}

}
