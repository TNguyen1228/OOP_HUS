

public class PhDStudent extends Student {
	private int no_publications;

	public PhDStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PhDStudent(String id, String name, String email, int age, double GPA, int no_publications) {
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


	//Sửa giá trị trả về để được kết quả như yêu cầu đề bài.
	@Override
	public String toString() {
		return super.toString() + " PhDStudent [no_pub=" + no_publications + ", Bonus()="+ String.format("%.0f", getBonus()) + "]";
	}

	// Sinh viên hoàn thiện phương thức getBonus() dưới đây
	@Override
	public double getBonus() {
		/*
		 * Tiền thưởng của nghiên cứu sinh được tính như sau: - Nếu sinh viên ở khoa
		 * Khoa học tự nhiên, tiền thưởng = no_publications * 2.000.000 - Nếu sinh viên
		 * ở khoa Khoa học xã hội tiền thưởng = no_publications *3.000.000
		 * 
		 */
		if (getFaculty().equals("Khoa học tự nhiên")) {
			return getNo_publications()*2000000;
		}
		return getNo_publications()*3000000;

		
	}

}
