

public class Student {

	private String id, name, email;
	private int age;
	private double GPA;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String id, String name, String email, int age, double GPA) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.GPA = GPA;
	}

	// Hoàn thiện phương thức getFaculty
	public String getFaculty() {
		/*. Khoa của mỗi sinh viên được xác định dựa vào việc phân tích 
		 * tên miền trong địa chỉ email của sinh viên đó.
		 * Ví dụ: 
			-	Địa chỉ email quangnv@sci.hus.edu.vn: sinh viên ở khoa Khoa học tự nhiên
			-	Địa chỉ emal: hoangnv@sosci.hus.edu.vn: sinh viên ở khoa Khoa học xã hội
		 * */
		int idx1= email.indexOf("@");
		int idx2=email.indexOf(".");
		if (email.substring(idx1+1, idx2).equals("sosci")) {
			return "Khoa học xã hội";
		}
		return "Khoa học tự nhiên";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	public double getBonus() {
		return 0;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age
				+ ", GPA=" + GPA + "]";
	}
	

}
