package visitor.exercises1;

public class JavaCoreBook implements ProgramingBook{

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}

	@Override
	public String getResource() {
		// TODO Auto-generated method stub
		return "JAVA TUTORIAL";
	}
	public String getFavouriteBook() {
        return "Dive into Design Pattern";
    }

}
