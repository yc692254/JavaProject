package com.test.lab03;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		


		  List<Integer> list =new ArrayList<Integer>();
		  list.add(1);
		  list.add(2);
		  list.add(1, 3);
		  list.add(2, 4);
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
			list.remove(0);
			
		 

	}

}
