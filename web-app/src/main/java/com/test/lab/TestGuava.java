package com.test.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestGuava {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(8, 6, 10, 28, 20, 18, 25, 14, 30,3);
		
		//List<List<Integer>> grops=Lists.partition(list, 3);
		
		//System.out.println(grops);
		
		
	
		List<List<Integer>> list2=splitList(list, 4);
		System.out.println(list2);
		
		List<List<Integer>> list3=averageAssign(list, 7);
		System.out.println(list3);
		
		
		/*ist<List<Integer>> list5=splitList3(list, 5);
		System.out.println(list5);*/
		
		search(list,3);
	
		
	}
	
	public static <T>List<List<T>> spliListParts(List<T> list, int iParts ){
	    List<List<T>> newAlist = new ArrayList<List<T>>();
	    int N     = list.size();
	    int rem   = N / iParts;
	    int mod   = N % iParts;
	    int start = rem;

	    for( int i = 0; i < N;i += start){
	        if( mod > 0 ){
	            mod--;
	            start = rem + 1;
	        }else{
	        	start = rem;
	        }
	        newAlist.add( new ArrayList<T>(list.subList( i, Math.min( N, i + start ) ) ) );
	    }
	    return newAlist;
	}
	
	public static int search(List<Integer> list,int value) {
		
		List<List<Integer>> getSplitList= spliListParts(list, list.size());
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
	public boolean count(int a,int b) {
		boolean falg= a < b;
		return falg;
	}
	
	public static List<List<Integer>> splitList(List<Integer> list, int n) {
        List<List<Integer>> strList = new ArrayList<List<Integer>>();
        if (list == null) return strList;
        int size = list.size();
        int quotient = size / n; // 商数
        int remainder = size % n; // 余数
        int offset = 0; // 偏移量
        int len = quotient > 0 ? n : remainder; // 循环长度
        int start = 0;    // 起始下标
        int end = 0;    // 结束下标
        List<Integer> tempList = null;
        for (int i = 0; i < len; i++) {
            if (remainder != 0) {
                remainder--;
                offset = 1;
            } else {
                offset = 0;
            }
            end = start + quotient + offset;
            tempList = list.subList(start, end);
            start = end;
            strList.add(tempList);
        }
        return strList;
    }
	
	public static <T> List<List<T>> averageAssign(List<T> source, int n) {
        List<List<T>> result = new ArrayList<List<T>>();
        int remaider = source.size() % n;  //(先計算出餘數)
        int number = source.size() / n;  //然後是商
        int offset = 0;//偏移量
        for (int i = 0; i < n; i++) {
            List<T> value = null;
            if (remaider > 0) {
                value = source.subList(i * number + offset, (i + 1) * number + offset + 1);
                remaider--;
                offset++;
            } else {
                value = source.subList(i * number + offset, (i + 1) * number + offset);
            }
            result.add(value);
        }
        return result;
    }
	
	
	 public static <T> List<List<T>> splitList3(List<T> list, int pageSize) {
	        int listSize = list.size(); //list的大小
	        int page = (listSize + (pageSize-1))/ pageSize;//页数
	        List<List<T>> listArray = new ArrayList<List<T>>();//创建list数组 ,用来保存分割后的list
	        for(int i=0;i<page;i++) { //按照数组大小遍历
	            List<T> subList = new ArrayList<T>(); //数组每一位放入一个分割后的list
	            for(int j=0;j<listSize;j++) {//遍历待分割的list
	                int pageIndex = ( (j + 1) + (pageSize-1) ) / pageSize;//当前记录的页码(第几页)
	                if(pageIndex == (i + 1)) {//当前记录的页码等于要放入的页码时
	                    subList.add(list.get(j)); //放入list中的元素到分割后的list(subList)
	                }
	                if( (j + 1) == ((j + 1) * pageSize) ) {//当放满一页时退出当前循环
	                    break;
	                }
	            }
	            listArray.add(subList);//将分割后的list放入对应的数组的位中
	        }
	        return listArray;
	    }
	
}
