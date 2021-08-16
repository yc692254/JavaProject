package com.test.lab;

public enum AlgothomEnmum {

	INSERTIONSORT("insertionsort", 1), BINARYINSERTIONSORT("binaryinsertionsort", 2);

	private String name;

	private int type;

	private AlgothomEnmum(String name, int type) {
		this.name = name;
		this.type = type;
	}

	public static String getName(int type) {

		for (AlgothomEnmum c : AlgothomEnmum.values()) {
			if (c.getType() == type) {
				return c.name;
			}
		}
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
