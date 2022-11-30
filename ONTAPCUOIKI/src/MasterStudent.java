
public class MasterStudent extends Student {

	private int no_publications;

	public MasterStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MasterStudent(String id, String name, String email, int age, double GPA,
			int no_publications) {
		super(id, name, email, age, GPA);
		// TODO Auto-generated constructor stub
		
		this.no_publications = no_publications;
	}

	public int getNo_publications() {
		return no_publications;
	}

	public void setNo_publications(int no_publications) {
		this.no_publications = no_publications;
	}
	
	// Sửa đổi giá trị trả về để được kết quả như trong yêu câu của Bài 2 - Đề 2
	
	@Override
	public String toString() {
		return super.toString()+" MasterStudent [no_pub=" + no_publications + ", Bonus="+ String.format("%.0f",getBonus()) + "]" ;
	}

	//Sinh viên hoàn thiện phương thức getBonus() dưới đây
	@Override
	public double getBonus() {
		/*
		 * 	Tiền thưởng của học viên cao học được tính như sau:
		    Nếu điểm GPA < 3.2, tiền thưởng = no_publications * 500.000,
			Nếu điểm 3.2 ≤GPA < 3.6, tiền thưởng = 1.000.000 + no_publications * 500.000,
			Nếu điểm GPA ≥ 3.6,  tiền thưởng = 2.000.000 + no_publications *  500.000,
		 */
		if(getGPA()<3.2) {
			return getNo_publications()*500000;
		}
		else if (getGPA()>=3.2 && this.getGPA()<3.6) {
			return getNo_publications()*500000+1000000;
		}
		else {
			return getNo_publications()*500000+2000000;
		}
	}
	

}
