package visitor.exercises1;

public class BusinessBook implements Book {

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}

	public String getPublisher() {
		return "Entee";
	}
}
