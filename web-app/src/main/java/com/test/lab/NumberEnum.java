package com.test.lab;

public enum NumberEnum {

	OThouSand("1", 1000), TThouSand("2", 2000), FThouSand("3", 4000), EThouSand("4", 8000), SIXTThouSand("5", 16000);

	private String name;

	private int numbers;

	
	private NumberEnum(String name, int num) {
		this.name = name;
		this.numbers = num;
	}

	
	public static String getName(int num) {

		for (NumberEnum c : NumberEnum.values()) {
			if (c.getNumbers() == num) {
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

	public int getNumbers() {
		return numbers;
	}

	public void setNumbers(int numbers) {
		this.numbers = numbers;
	}

}
