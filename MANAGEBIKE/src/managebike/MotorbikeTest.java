package managebike;

import java.util.Scanner;
import java.util.ArrayList;

public class MotorbikeTest
{
    public static void inputMotorbike (ArrayList<Motorbike> motorbikes, int n)
	{
	    Scanner sc= new Scanner(System.in);
	    for(int i=0; i<n; i++) {
	        String id=sc.nextLine();
	        String name=sc.nextLine();
	        String manu=sc.nextLine();
	        int quantity=Integer.parseInt(sc.nextLine());
	        double price=Double.parseDouble(sc.nextLine());
	        double weight=Double.parseDouble(sc.nextLine());
	        String date=sc.nextLine();
	        Motorbike motor= new Motorbike(id, name, manu, quantity, price, weight, date);
	        motorbikes.add(motor);
	        sc.close();
	    }
	}
	public static void outputMotorbike (ArrayList<Motorbike> motorbikes)
	{
		for(int i=0; i<motorbikes.size(); i++) {
		    motorbikes.get(i).printMotorbike();
		}
	}
	public static ArrayList<Motorbike> search (String manu, ArrayList<Motorbike> motorbikes)
	{
		ArrayList<Motorbike> searchList = new ArrayList<Motorbike>();
		for(int i=0; i<motorbikes.size(); i++) {
		    if(motorbikes.get(i).getManu().equals(manu)) {
		        searchList.add(motorbikes.get(i));
		    }
		}
		return searchList;
	}
	public static ArrayList<Motorbike> maxWeight (ArrayList<Motorbike> motorbikes)
	{
		ArrayList<Motorbike> maxWeightList = new ArrayList<Motorbike>();
		double max=0.0;
		for(int i=0; i<motorbikes.size(); i++) {
		    if(max <motorbikes.get(i).getWeight()) {
		        max = motorbikes.get(i).getWeight();
		    }
		}
		for(int j=0; j<motorbikes.size(); j++) {
		    if(motorbikes.get(j).getWeight() == max) {
		        maxWeightList.add(motorbikes.get(j));
		    }
		}
		return maxWeightList;
	}
	public static ArrayList<Motorbike> minQuantity (ArrayList<Motorbike> motorbikes)
	{
		ArrayList<Motorbike> minQuantityList= new ArrayList<Motorbike>();
		
		int min=Integer.MAX_VALUE;
		for(int i=0; i<motorbikes.size(); i++) {
		    if (min>motorbikes.get(i).getQuantity()) {
		        min =motorbikes.get(i).getQuantity();
		    }
		}
		for(int j=0; j<motorbikes.size(); j++) {
	        if(motorbikes.get(j).getQuantity() == min) {
	            minQuantityList.add(motorbikes.get(j));
	        }
		}
		return minQuantityList;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		ArrayList<Motorbike> motorbikes= new ArrayList<Motorbike>();
		int c=Integer.parseInt(scan.nextLine());
		if (c==1) {
			ArrayList<Motorbike> searchList = search("Honda", motorbikes);
			outputMotorbike(searchList);
		}
		if (c==2) {
			ArrayList<Motorbike> maxWeightList = maxWeight(motorbikes);
			outputMotorbike(maxWeightList);
		}
		if (c==3) {
			ArrayList<Motorbike> minQuantityList = minQuantity(motorbikes);
			outputMotorbike(minQuantityList);
		}
	}
}