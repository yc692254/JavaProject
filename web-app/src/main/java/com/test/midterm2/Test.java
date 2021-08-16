package com.test.midterm2;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(memSec(0, 5, 5));
		
		Queue<Integer> queu =new LinkedList<Integer>();
		queu.offer(1);
		queu.offer(2);
		queu.offer(3);
		System.out.println(queu.poll());
		System.out.println(queu.poll());
		System.out.println(queu.poll());
		System.out.println(queu.size());

	}
	
	public static int memSec(int start, int d, int n) {
		if (n == 1)
			return start;
		else
			return (d + memSec(start, d, n - 1));
	} // sumSec
	
	

}
