package com.test.lab03;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BetterArray betterArray = new BetterArray();

		betterArray.add(1);
		betterArray.add(2);
		betterArray.add(1, 3);
		betterArray.add(2, 4);

		//betterArray.listAll();
		
		
		int[] newarray=new int[] {11,12,13,14,15,16,17,18,19,20,21};
		int[] newarray2=new int[] {22,23,24,25,26,27,28,29,30};
		betterArray.addAll(newarray);
		betterArray.addAll(newarray);
		
		betterArray.addAll(10, newarray2);
		betterArray.listAll();

	}

}
