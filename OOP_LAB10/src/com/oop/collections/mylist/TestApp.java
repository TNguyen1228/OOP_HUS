package com.oop.collections.mylist;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyList aList=new MyArrayList();
		aList.add("a", 0);
		aList.add("b");
		aList.add("c",0);
		aList.add("c", 3);
		aList.remove(3);
		System.out.println(aList.size());
		System.out.println(aList);
	}

}
