package com.test.lab03;

public class BetterArrayApp {
	public static void main(String[] args) {
		BetterArray myArray = new BetterArray();
		int [] otherArray = {13, 14, 15, 16};
		int [] otherArray2 = {-2, 11, -8};
		int [] otherArray3 = null;
		int [] otherArray4 = {100, 200};
	
	
		System.out.println("Initially myArray is empty.");
		myArray.listAll();
		System.out.println("Current myArray size: " + myArray.size());
		System.out.println();
		
		System.out.println("Let's try to add element 35.");
		myArray.add(35);
		myArray.listAll();
		System.out.println("Current myArray size: " + myArray.size());
		System.out.println();
		
		System.out.println("Now, let's try to add element 81 at index 0.");
		try {
			myArray.add(0, 81);
		} catch (ArrayIndexOutOfBoundsException aobe) {
			System.out.println("Error: trying to add element at an index which is out of bounds");
		}
		myArray.listAll();
		System.out.println("Current myArray size: " + myArray.size());
		System.out.println();
		
		System.out.println("Now, let's try to add element 67 at index 5. It should cause an exception, because there is no index 5 yet.");
		try {
			myArray.add(5, 67);
		} catch (ArrayIndexOutOfBoundsException aobe) {
			System.out.println("Error: trying to add element at an index which is out of bounds");
		}
		myArray.listAll();
		System.out.println("Current myArray size: " + myArray.size());
		System.out.println();
		
		System.out.println("Let's try to append all otherArray elements to myArray.");
		try {
			myArray.addAll(otherArray);
		} catch (NullPointerException npe) {
			System.out.println("Error: trying to add elements from a null array.");
		}
		myArray.listAll();
		System.out.println("Current myArray size: " + myArray.size());
		System.out.println();

		System.out.println("Let's try to insert all otherArray4 elements into myArray at index 0.");
		try {
			myArray.addAll(0,otherArray4);
		} catch (ArrayIndexOutOfBoundsException aobe) {
			System.out.println("Error: trying to insert at a position/index that is not there.");	
		} catch (NullPointerException npe) {
			System.out.println("Error: trying to add elements from a null array.");
		}
		myArray.listAll();
		System.out.println("Current myArray size: " + myArray.size());
		System.out.println();
		
		System.out.println("Let's try to insert all otherArray4 elements again into myArray at index 5.");
		try {
			myArray.addAll(5,otherArray4);
		} catch (ArrayIndexOutOfBoundsException aobe) {
			System.out.println("Error: trying to insert at a position/index that is not there.");	
		} catch (NullPointerException npe) {
			System.out.println("Error: trying to add elements from a null array.");
		}
		myArray.listAll();
		System.out.println("Current myArray size: " + myArray.size());
		System.out.println();
		
		System.out.println("Let's try to append otherArray3 (which is null!) at the end of myArray.");
		try {
			myArray.addAll(otherArray3);
		} catch (NullPointerException npe) {
			System.out.println("Error: trying to add elements from a null array.");
		}
		myArray.listAll();
		System.out.println("Current myArray size: " + myArray.size());
		System.out.println();
		
		System.out.println("Let's try to insert all otherArray2 elements at the front of myArray.");
		try {
			myArray.addAll(0,otherArray2);
		} catch (ArrayIndexOutOfBoundsException aobe) {
			System.out.println("Error: trying to insert at a position/index that is not there.");			
		} catch (NullPointerException npe) {
			System.out.println("Error: trying to add elements from a null array.");
		}
		myArray.listAll();
		System.out.println("Current myArray size: " + myArray.size());
		System.out.println();
		
		System.out.println("Does myArray contain element 81: " + myArray.contains(81));  // should be true
		System.out.println("Does myArray contain element 82: " + myArray.contains(82));  // should be false
		
		System.out.println("Let's try to get an element at index 2 (it should be -8).");
		try {
			System.out.println("myArray element at index 2 is: " + myArray.get(2));
		} catch (ArrayIndexOutOfBoundsException aobe) {
			System.out.println("Error: trying to add element at an index which is out of bounds");
		}
		System.out.println();
		
		System.out.println("Let's try to get an element at index 100 (it should fail).");
		try {
			System.out.println("myArray element at index 100 is: " + myArray.get(100));
		} catch (ArrayIndexOutOfBoundsException aobe) {
			System.out.println("Error: trying to add element at an index which is out of bounds");
		}
		System.out.println();
		
		System.out.println("Let's try to locate some elements now. First let's list myArray elements.");
		myArray.listAll();
		System.out.println("myArray contains element 100 at index [first]: " + myArray.indexOf(100));	
		System.out.println("myArray contains element 100 at index [last]: " + myArray.lastIndexOf(100));	
		System.out.println("myArray contains element 999 at index [first] (should return -1): " + myArray.indexOf(999));	
		System.out.println("myArray contains element 999 at index [last] (should return -1): " + myArray.lastIndexOf(999));	
		System.out.println();
		
		System.out.println("Now let's try some element removals.");
		try {
			System.out.println("Trying to remove element at index 12.");
			myArray.remove(12);
		} catch (ArrayIndexOutOfBoundsException aobe) {
			System.out.println("Error: trying to remove an element from a position/index that is not there.");
		}
		myArray.listAll();
		System.out.println("Current myArray size: " + myArray.size());
		System.out.println();
		
		System.out.println("Now let's try some element removals.");
		try {
			System.out.println("Trying to remove element at index 12 again.");
			myArray.remove(12);
		} catch (ArrayIndexOutOfBoundsException aobe) {
			System.out.println("Error: trying to remove an element from a position/index that is not there.");
		}
		myArray.listAll();
		System.out.println("Current myArray size: " + myArray.size());
		System.out.println();
		
		System.out.println("Now let's try some element removals.");
		try {
			System.out.println("Trying to remove element at index 0.");
			myArray.remove(0);
		} catch (ArrayIndexOutOfBoundsException aobe) {
			System.out.println("Error: trying to remove an element from a position/index that is not there.");
		}
		myArray.listAll();
		System.out.println("Current myArray size: " + myArray.size());
		System.out.println();
		
		System.out.println("Now let's try some element removals.");
		try {
			System.out.println("Trying to remove element at index 3.");
			myArray.remove(3);
		} catch (ArrayIndexOutOfBoundsException aobe) {
			System.out.println("Error: trying to remove an element from a position/index that is not there.");
		}
		myArray.listAll();
		System.out.println("Current myArray size: " + myArray.size());
		System.out.println();
		
    }
}
	
	