package com.test.lab;

import java.util.ArrayList;
import java.util.List;

public class AlgothomUtils {

	private static final int maxNum = 20001;

	private static final int midNum = 10000;
	
	private static final int Count = 100;

	public static List<Integer> createRanomListByCount(int count) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < count; i++) {
			int r = (int) (Math.random() * maxNum) - midNum;
			list.add(r);
		}
		return list;
	}
	
	public static long calcAvgRunningTimeByAlgothomType(List<Integer> list, AlgothomEnmum algothomEnmum) {
		long avgtime=0;
		long sum =0;
		for (int i = 0; i < Count; i++) {
			long startTime = System.nanoTime();
			chooseAlgothomByType(list, algothomEnmum);
			long endTime     = System.nanoTime();
			long timeElapsed = endTime - startTime;
			sum += timeElapsed;
		}
		avgtime= sum/Count;
		return avgtime;
		
	}
	
	private static void chooseAlgothomByType(List<Integer> list, AlgothomEnmum algothomEnmum) {
		if (algothomEnmum.equals(AlgothomEnmum.INSERTIONSORT)) {
			InsertionSortUtils.insertionSort(list);
		} else {
			InsertionSortUtils.binaryInsertionSort(list);
		}

	}
	
	

}
