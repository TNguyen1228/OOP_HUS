package com.patterns.singleton.pseudocode;

public class Database {
	private static Database instanceDatabase;

	private Database() {
	}

	public static Database getInstance() {
		if (instanceDatabase == null) {
			instanceDatabase = new Database();
		}
		return instanceDatabase;
	}

	public void query(String sql) {
		System.out.println("Execute " + sql);
	}

}
