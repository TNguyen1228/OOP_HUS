import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class CarManagement {
	
	// Hàm dựng
	public CarManagement(){
		super();
	}
	
	// Phương thức readData() cho phép đọc dữ liệu từ tệp văn bản
		/*
		    Thứ tự nhập như sau:
		    - Nhập số lượng xe
		    - Trong vòng lặp với mỗi loại xe:
		       - Nhập 1 số nguyên c, c = 0 là ServiceCar, c = 1 là SportCar
		       - Nhập thông tin của các xe: id, name, manufacturer, hours, price, fee (Đối với ServiceCar, tax với SportCar)
		*/
	
	public ArrayList<Car> readData(String fileName) {
		ArrayList<Car> cars=new ArrayList<>();
		try {
			Scanner scanner =new Scanner(new File(fileName));
			int n=Integer.parseInt(scanner.nextLine());
			for(int i=0; i<n; i++) {
				int c=Integer.parseInt(scanner.nextLine());
				String id =scanner.nextLine();
				String name =scanner.nextLine();
				String manufacturer=scanner.nextLine();
				double hours= Double.parseDouble(scanner.nextLine());
				double price=Double.parseDouble(scanner.nextLine());
				if (c==1) {
					double tax=Double.parseDouble(scanner.nextLine());
					SportCar spoCar=new SportCar(id, name, manufacturer, hours, price, tax);
					cars.add(new SportCar(id, name, manufacturer, hours, price, tax));
				}
				if (c==0) {
					double fee=Double.parseDouble(scanner.nextLine());
					ServiceCar serCar= new ServiceCar(id, name, manufacturer, hours, price, fee);
					cars.add(serCar);
				}
			}	
		return cars;
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;		
	}
	
	// Phương thức in danh sách thông tin liên quan các loại xe trong mảng
	public void printCars(ArrayList<Car> cars) {
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i).toString());
		}
	}
	
	// Phương thức xuất ra danh sách những xe có tên nhà sản xuất là "manuName"
	public ArrayList<Car> findCars(ArrayList<Car> cars, String manuName){
		ArrayList<Car> listCars=new ArrayList<>();
		for (int i = 0; i < cars.size(); i++) {
			if (cars.get(i).getManufacturer().equals(manuName)) {
				listCars.add(cars.get(i));
			}
		}
		return listCars;
	}
	
	// Phương thức xuất ra danh sách những xe giá thành tiền (amount) cao nhất thuộc loại typeOfCars
	
	public ArrayList<Car> getMaxAmount(ArrayList<Car> cars, String typeOfCars){
		double maxAmount=0.0;
		ArrayList<Car> maxAmountCars= new ArrayList<>();
		for (int i=0; i<cars.size(); i++) {
			if(cars.get(i).getClass().getName().equals(typeOfCars) && cars.get(i).getAmount()>maxAmount) {
				maxAmount = cars.get(i).getAmount();
			}
		}
		if (maxAmount > -1) {
			for (int i = 0; i < cars.size(); i++) {
				if(cars.get(i).getClass().getName().equals(typeOfCars) && cars.get(i).getAmount()==maxAmount) {
					maxAmountCars.add(cars.get(i));
				}
			}
		}
			
		
		return maxAmountCars;
		
	}
	
	// Phướng thức sắp xếp giá thành tiền các loại xe theo thứ tự giảm dần
	public void sortByAmount(ArrayList<Car> cars){
		//Begin editable part
			for (int i = 0; i < cars.size()-1; i++) {
				for(int j=i+1; j<cars.size(); j++) {
					if (cars.get(i).getAmount()<cars.get(j).getAmount()) {
						Car temp =cars.get(i);
						cars.set(i, cars.get(j));
						cars.set(j, temp);
					}
				}
			}
		}
	

// Hàm main
		public static void main(String[] args) {
			CarManagement carManag = new CarManagement();
			//CarManagement carManag = new CarManagement();
			ArrayList<Car> cars = carManag.readData("data.txt");
		//	carManag.printCars(cars);
			
			for (int i = 0; i < cars.size(); i++) {
				System.out.print(cars.get(i).getAmount() + " ");
			}
			System.out.println();
			ArrayList<Car> carsList = carManag.findCars(cars,"honda");
			carManag.printCars(carsList);
			
			ArrayList<Car> carsList1 = carManag.getMaxAmount(cars, "SportCar");
			carManag.printCars(carsList1);
			
			carManag.sortByAmount(cars);
			carManag.printCars(cars);
			
		}
	}