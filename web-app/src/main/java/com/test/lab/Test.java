package com.test.lab;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(NumberEnum.OThouSand.getNumbers());
		
		System.out.println(AlgothomEnmum.INSERTIONSORT);
		int[] myArray = { 3, 4, -5, 6, 2, 8, 1 }; // You can change values or extend
		int n =myArray.length;
		int elementToBeFound = 4; // Change value to search for other elements
		int secondElementToBeFound = 23; // Change value to search for other elements
		int elementIndex=SomeClass.searchElement(myArray, elementToBeFound);
		System.out.println(elementIndex);
		int elementIndex2=SomeClass.searchElement(myArray,secondElementToBeFound);
		System.out.println(elementIndex2);

	}

}
