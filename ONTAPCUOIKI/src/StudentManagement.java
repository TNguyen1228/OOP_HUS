import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentManagement {

	public ArrayList<Student> readData(String fileName) {
		ArrayList<Student> students=new ArrayList<>();
		try {
		Scanner scanner =new Scanner(new File(fileName));
		int n=Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < n; i++) {
			int c=Integer.parseInt(scanner.nextLine());
			String id=scanner.nextLine();
			String name=scanner.nextLine();
			int age=Integer.parseInt(scanner.nextLine());
			String email=scanner.nextLine();
			double gpa=Double.parseDouble(scanner.nextLine());
			int np=Integer.parseInt(scanner.nextLine());
			if (c==1) {
				MasterStudent masterStudent=new MasterStudent(id, name, email, age, gpa, np);
				students.add(masterStudent);
			}
			if (c==0) {
				PhDStudent phDStudent=new PhDStudent(id, name, email, age, gpa, np);
				students.add(phDStudent);
			}
		}
		return students;
	} catch (FileNotFoundException e) {
		// TODO: handle exception
		e.printStackTrace();
	}

		return null;
	}

	public void printInforStudents(ArrayList<Student> students) {
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i).toString());
		}
	}

	public void sortByBonus(ArrayList<Student> students) {
		for (int i = 0; i < students.size()-1; i++) {
			for (int j = i+1; j < students.size(); j++) {
				if (students.get(i).getBonus()<students.get(j).getBonus()) {
					Student tempStudent=students.get(i);
					students.set(i, students.get(j));
					students.set(j, tempStudent);
					
				}
			}
		}
	}

	public ArrayList<Student> filterMS_byBonus(ArrayList<Student> students, String faculty) {
		double sum=0;
		ArrayList<Student> mStudents=new ArrayList<>();
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getClass().getName().equals("MasterStudent") && students.get(i).getFaculty().equals(faculty)) {
				mStudents.add(students.get(i));
				sum+=students.get(i).getBonus();
			}
		}
		sum=sum/mStudents.size();
		ArrayList<Student> resultList=new ArrayList<>();
		for (int i = 0; i < mStudents.size(); i++) {
			if (mStudents.get(i).getBonus()>sum) {
				resultList.add(mStudents.get(i));
			}
		}
		for (int i = 0; i < resultList.size()-1; i++) {
			for (int j = i+1; j < resultList.size(); j++) {
				if (resultList.get(i).getBonus()>resultList.get(j).getBonus()) {
					Student tempStudent=resultList.get(i);
					resultList.set(i, resultList.get(j));
					resultList.set(j, tempStudent);
					
				}
			}
		}
		
		
		return resultList;
	}

	public ArrayList<Student> filterPhD_byNoPub(ArrayList<Student> students) {
		double sum=0;
		for (int i = 0; i < students.size(); i++) {
				sum+=((PhDStudent)students.get(i)).getNo_publications();
		}
		sum=sum/students.size();
		ArrayList<Student> resultList=new ArrayList<>();
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getClass().getName().equals("PhDStudent") && ((PhDStudent)students.get(i)).getNo_publications()>sum) {
				resultList.add(students.get(i));
			}
		}
		for (int i = 0; i < resultList.size()-1; i++) {
			for (int j = i+1; j < resultList.size(); j++) {
				if (resultList.get(i).getBonus()<resultList.get(j).getBonus()) {
					Student tempStudent=resultList.get(i);
					resultList.set(i, resultList.get(j));
					resultList.set(j, tempStudent);
					
				}
			}
		}
		return resultList;
		
	}
	
	
	public static void main(String[] args) {
		StudentManagement stm = new StudentManagement();
		ArrayList<Student> students = stm.readData("student.txt");
		System.out.println(" Danh sách học viên: ");
		stm.printInforStudents(students);
		
		System.out.println("Danh sÃ¡ch há»�c viÃªn sau khi sáº¯p xáº¿p theo tiá»�n thÆ°á»Ÿng: ");
		stm.sortByBonus(students);
		stm.printInforStudents(students);
		
		System.out.println("Danh sÃ¡ch há»�c viÃªn khoa Khoa há»�c tá»± nhiÃªn cÃ³ tiá»�n thÆ°á»Ÿng lá»›n hÆ¡n má»©c trung bÃ¬nh khoa");
		ArrayList<Student> bn_master = stm.filterMS_byBonus(students, "Khoa há»�c tá»± nhiÃªn");
		stm.printInforStudents(bn_master);
		
		System.out.println("Danh sÃ¡ch nghiÃªn cá»©u sinh (NSC) cÃ³ sá»‘ cÃ´ng bá»‘ cao hÆ¡n má»©c trung bÃ¬nh cá»§a NSC");
		ArrayList<Student> pub_phd = stm.filterPhD_byNoPub(students);
		stm.printInforStudents(pub_phd);
	}

}
