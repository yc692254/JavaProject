package com.test.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumUtils {
	
	public static List<List<Integer>> spliListParts(List<Integer> list, int size ){
	    List<List<Integer>> newAlist = new ArrayList<List<Integer>>();
	    int N     = list.size();
	    int rem   = N / size;
	    int mod   = N % size;
	    int start = rem;

	    for( int i = 0; i < N;i += start){
	        if( mod > 0 ){
	            mod--;
	            start = rem + 1;
	        }else{
	        	start = rem;
	        }
	        newAlist.add( new ArrayList<Integer>(list.subList(i, Math.min(N, i + start ) ) ) );
	    }
	    return newAlist;
	}
	
	public static int search(List<Integer> list, int value) {

		List<List<Integer>> getSplitList = spliListParts(list, list.size());
		for (int i = 0; i < getSplitList.size(); i++) {
			List<Integer> getList = getSplitList.get(i);
			for (int j = 0; j < getList.size(); j++) {
				int getValue = getList.get(j);
				if (getValue == value) {
					return getValue;
				}
			}
		}
		return -1;
	}
	
	public static Map<String, Integer> existsNumSum2(List<Integer> list, int result) {
		Map<String, Integer> map = null;
		int N = list.size();
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (list.get(i) + list.get(j) == result) {
                	map=new HashMap<String, Integer>();
                	map.put("X", list.get(i));
                	map.put("Y", list.get(j));
                    return map;
                }
            }
        }
        return map;
		
	}
	
	
	public static Map<String, Integer> existsNumSum(List<Integer> list, int result) {
		Map<String, Integer> map = null;
		int I = 0;
		int J =  list.size() - 1;
		while (I < J) {
			int sum = list.get(I) + list.get(J);
	        if (sum == result) {
	        	map=new HashMap<String, Integer>();
            	map.put("X", list.get(I));
            	map.put("Y", list.get(J));
                return map;
	        } else if (sum < result) {
	            I++;
	        } else {
	            J--;
	        }
		}
        return map;
	}
	
	public static int[] twoSum(int[] numbers, int target) {
        int low = 0, high = numbers.length - 1;
        while (low < high) {
            int sum = numbers[low] + numbers[high];
            if (sum == target) {
                return new int[]{low , high};
            } else if (sum < target) {
                low++;
            } else {
                high--;
            }
        }
        return new int[]{-1, -1};
    }
	
	
	public static int binarySearch(int[] inputArray, int elementWeWantToLocate) {
		Arrays.sort(inputArray);
		int elementPosition = -1;
		int mid;
        int start = 0;
        int end = inputArray.length - 1;
        while (start <= end) {
            mid =  (start + end)/2;
            if (inputArray[mid]== elementWeWantToLocate) {
            	elementPosition = mid;
            } else if (inputArray[mid] > elementWeWantToLocate) {
            	end   = mid - 1;
            } else {
            	start = mid + 1;
            }
        }
		return elementPosition;
	}
	

	
	public static void main(String[] args) {
		
		//List<Integer> list = Arrays.asList(3,6,8,10, 14,18,20, 25,28,30,34,36);
		/*
		 * Map<String, Integer> result=existsNumSum2(list, 58);
		 * System.out.println(result);
		 */
		//List<Integer> list=new ArrayList<Integer>();
		//for (int i = 0; i < 10000; i++) {
		//	list.add(i);
		//}
		//TEST4(list);
		
		
		  List<Integer> list = Arrays.asList(3,6,8,10, 14,18,20, 25,28,30,34,36);
		  Map<String, Integer> MAP=existsNumSum(list,70);
		  System.out.println(MAP);
		 
		/*
		 * int[] numbers=new int[] {3,6,8,10, 14,18,20, 25,28,30,34,36}; int[]
		 * result=twoSum(numbers,70); System.out.println(Arrays.toString(result));
		 */
		
	}
	
	
	
	


}
