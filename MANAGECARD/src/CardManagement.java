import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CardManagement {

	
	public CardManagement()
	{
		super();
	}
	/*
    Thứ tự nhập như sau:
    - Số lượng xe
    - Trong vòng lặp để nhập thông tin mỗi thẻ: nhập số nguyên c = 0 (thẻ học sinh) hoặc 1 (thẻ nhân viên)
    - Nhập thông tin mỗi thẻ: id, years, day, price, fee (với thẻ sinh viên), và card (với thẻ học sinh)
	*/
	public ArrayList<Card> readData (String fileName)
	{
		ArrayList<Card> cards=new ArrayList<>();
		try {
			Scanner scanner =new Scanner(new File(fileName));
			int n=Integer.parseInt(scanner.nextLine());
			for (int i = 0; i < n; i++) {
				int c=Integer.parseInt(scanner.nextLine());
				String id =scanner.nextLine();
				int year=Integer.parseInt(scanner.nextLine());
				double days=Double.parseDouble(scanner.nextLine());
				double price=Double.parseDouble(scanner.nextLine());
				if (c==0) {
					double fee=Double.parseDouble(scanner.nextLine());
					StudentCard stuCard=new StudentCard(id, year, days, price, fee);
					cards.add(stuCard);
				}
				if (c==1) {
					double tax=Double.parseDouble(scanner.nextLine());
					StaffCard staffCard= new StaffCard(id, year, days, price, tax);
					cards.add(staffCard);
				}
			}
			return cards;
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
		
	}
	
	public void printArrayList(ArrayList<Card> cards) {
		for (int i =0;i<cards.size();i++)
			System.out.println(cards.get(i).toString());
	}
	// Hoan thien phuong thuc findCards de tim nhung  xe co nam san xuat la year
	
	public ArrayList<Card> findCards (ArrayList<Card> cards, int year){
		//Begin editable part
		ArrayList<Card> listFound= new ArrayList<>();
		for (int i = 0; i < cards.size(); i++) {
			if (cards.get(i).getYear()==year) {
				listFound.add(cards.get(i));
			}
		}
			
		
		return listFound;
		//End editable part
	}
	
	// Hoan thien phuong thuc getMaxAmount de tim cac xe thuoc the loai typeOfCard
	public ArrayList<Card> getMaxAmount (ArrayList<Card> cards, String typeOfCard){
		//Begin editable part
		ArrayList<Card> maxAmountList= new ArrayList<>();
		for (int i = 0; i < cards.size(); i++) {
			if (cards.get(i).getClass().getName().equals(typeOfCard)) {
				maxAmountList.add(cards.get(i));
			}
		}
		return maxAmountList;
		//End editable part
	}
	
	
	// Hoan thien phuong thuc sortByAmount de sap xep cac xe theo thu tu giam dan
	public void sortByAmount (ArrayList<Card> cards) {
		//Begin editable part
		for (int i = 0; i < cards.size()-1; i++) {
			for (int j = i+1; j < cards.size() ; j++) {
				if (cards.get(i).getAmount()<cards.get(j).getAmount()) {
					Card tmpCard=cards.get(i);
					cards.set(i, cards.get(j));
					cards.set(j, tmpCard);
				}
			}
		}
		//End editable part
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		CardManagement cardMng = new CardManagement();
		ArrayList<Card> cards = cardMng.readData("datas.txt");
		//cardMng.printArrayList(cards);
		System.out.println(cardMng.findCards(cards, 1989));	
		cardMng.sortByAmount(cards);
		cardMng.printArrayList(cards);
		}
	

}
