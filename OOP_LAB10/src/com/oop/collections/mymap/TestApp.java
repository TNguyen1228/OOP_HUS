package com.oop.collections.mymap;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMap map=new MyHashMap();
		map.put(11, "Nicolas");
		map.put(11, "Nicolas");
		map.put(21, "Maza");
		map.put(33, "Agatha");
		map.remove(21);
		System.out.println(map.contains(11));
		System.out.println(map.contains(77));
		System.out.println(map.size());
		System.out.println(map);
	}

}
