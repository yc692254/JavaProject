package com.test.lab03;

import java.util.Arrays;


/**
 * 
 * BetterArrayInterface implementation class
 * @author Jiyang Chen
 *
 */
public class BetterArray implements BetterArrayInterface {

	private static final int DEFAULT_CAPACITY = 10;

	private transient int[] arrayData;

	private static final int[] EMPTY = {};

	private int size;

	/**
	 * @param initialCapacity
	 */
	public BetterArray(int initialCapacity) {
		if (initialCapacity > 0) {
			this.arrayData = new int[initialCapacity];
		} else if (initialCapacity == 0) {
			this.arrayData = EMPTY;
		} else {
			throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
		}
		this.size = 0;
	}

	public BetterArray() {
		this.arrayData = EMPTY;
		this.size = 0;
	}

	/**
	* Inserts the specified element at the specified position index in this BetterArray. Throws ArrayIndexOutOfBoundsException if the specified index is out of range (index < 0 || index >= size()).
	*
	* @param	index		new element index
	* @param	element		new element
	*/
	public void add(int index, int element) throws ArrayIndexOutOfBoundsException {
		if (index > size || index < 0) {
			 throw new ArrayIndexOutOfBoundsException("Index: "+index+", Size: "+size);
		}
		if (size  == this.arrayData.length) {
			arrayData = grow(size+1);
		}
		System.arraycopy(arrayData, index,
				arrayData, index + 1,
				size - index);
		arrayData[index] = element;
		size = size + 1;
           
	}

	/**
	* Appends the specified element to the end of this BetterArray.
	*
	* @param	element		new element
	*/
	public void add(int element) {
		if (size == arrayData.length) {
			arrayData = grow(size+1);
		}
		arrayData[size] = element;
		size = size + 1;
	}

	/**
	* Appends all of the elements in the provided otherArray to the end of this BetterArray, in the original order. Throws NullPointerException, if the specified otherArray reference is null.
	*
	* @param	otherArray	a reference to another array to be appended
	*/
	public void addAll(int[] otherArray) throws NullPointerException {
		if(otherArray==null || otherArray.length ==0) {
			throw new NullPointerException();
		}
		int numNew = otherArray.length;
        if (numNew > (arrayData.length - size)) {
        	arrayData = grow(size + numNew);
        }
        System.arraycopy(otherArray, 0, arrayData, size, numNew);
        size = size + numNew;

	}

	/**
	* Inserts all of the elements in the provided otherArray into this BetterArray, starting at the specified position. Throws ArrayIndexOutOfBoundsException if the specified index is out of range (index < 0 || index >= size()). Throws NullPointerException if the specified otherArray is null. 
	*
	* @param	index		BetterArray index specifying where the otherArray elements should be inserted
	* @param	otherArray	a reference to another array to be inserted
	*/
	public void addAll(int index, int[] otherArray) throws ArrayIndexOutOfBoundsException, NullPointerException {
		 if (index > size || index < 0) {
			 throw new ArrayIndexOutOfBoundsException("Index: "+index+", Size: "+size);
		 }
		 if(otherArray==null || otherArray.length ==0) {
			 throw new NullPointerException();
		 }
		 int numNew = otherArray.length;
		 if (numNew > (arrayData.length -size)) {
			 arrayData = grow(size + numNew);
		 }
		 int numMoved = size - index;
		 if (numMoved > 0) {
			 System.arraycopy(arrayData, index,
					 arrayData, index + numNew,
                     numMoved);
		 }
		 System.arraycopy(otherArray, 0, arrayData, index, numNew);
		 size = size + numNew;
	}

	/**
	* Returns true if this BetterArray contains the specified key. More formally, returns true if and only if this BetterArray contains at least one occurrence of key.
	*
	* @param	key			specified key to be found in BetterArray
	* @return	boolean		true if there is at least one occurrence of key in BetterArray, false otherwise
	*/
	public boolean contains(int key) {
		int indexOf = indexOf(key);
		return indexOf >=0;
	}

	/**
	* Returns the element at the specified position (index) in this BetterArray. Throws ArrayIndexOutOfBoundsException if the specified index is out of range (index < 0 || index >= size()).
	*
	* @param	index		BetterArray index of the element to be returned
	* @return	int			BetterArray element at position index
	*/
	public int get(int index) throws ArrayIndexOutOfBoundsException {
		if(index > size || index < 0) {
			throw new ArrayIndexOutOfBoundsException("Index: "+index+", Size: "+size);
		 }
		return arrayData[index];
	}

	/**
	* Returns the index in this BetterArray of the first occurrence of the specified key, or -1 if BetterArray does not contain this key.
	*
	* @param	key			specified key to be found in BetterArray
	* @return	int			index of the specified key in BetterArray or -1 if not found
	*/
	public int indexOf(int key) {
		
		for (int i = 0; i < size; i++) {
            if (key == arrayData[i]) {
            	return i;
            }
        }
		return -1;
	}

	/**
	* Returns the index in this BetterArray of the last occurrence of the specified key, or -1 if BetterArray does not contain this key.
	*
	* @param	key			specified key to be found in BetterArray
	* @return	int			last index of the specified key in BetterArray or -1 if not found
	*/
	public int lastIndexOf(int key) {
		
		 for (int i = size - 1; i >= 0; i--) {
			 if (key == arrayData[i]) {
	            	return i;
	            	
	            }
         }
		return -1;
	}

	/**
	* Removes the element at the specified position in this BetterArray. Throws ArrayIndexOutOfBoundsException if the index out is of range (index < 0 || index >= size()). BetterArray should "shrink" after this removal
	*
	* @param	index		BetterArray index of the element to be removed
	*/
	public void remove(int index) throws ArrayIndexOutOfBoundsException {
		if(index > size || index < 0) {
			throw new ArrayIndexOutOfBoundsException("Index: "+index+", Size: "+size);
		 }
		int newSize= size - 1;
		if(newSize < index) {
			throw new ArrayIndexOutOfBoundsException("Index: "+index+", Size: "+newSize);
		} else if (newSize > index) {
			  System.arraycopy(arrayData, index + 1, arrayData, index, newSize - index);
		}
	   size = newSize;    
	   arrayData[newSize] = 0;

	}

	/**
	* Returns the number of elements in this BetterArray.
	*
	* @return	int			number elements in BetterArray
	*/
	public int size() {
		return size;
	}

	/**
	* Lists/displays all elements in this BetterArray.
	*
	*/
	public void listAll() {
		int N = arrayData.length;
		if(N ==0) {
			System.out.println("This BetterArray is empty.");
			return;
		}
		System.out.println("Listing all BetterArray elements:");
		for (int i = 0; i < arrayData.length; i++) {
			if(arrayData[i]!=0) {
				System.out.println("Element at index "+i+":\t"+arrayData[i]);
			}
		}

	}

	/**
	 * @param minCapacity
	 * @return
	 */
	private int[] grow(int minCapacity) {
		int oldCapacity = arrayData.length;
		if (oldCapacity > 0 || arrayData != EMPTY) {
			int newCapacity = (minCapacity - oldCapacity) > oldCapacity?(minCapacity - oldCapacity):oldCapacity;
			return arrayData = Arrays.copyOf(arrayData, newCapacity*2);
		} else {
			return arrayData = new int[Math.max(DEFAULT_CAPACITY, minCapacity)];
		}
	}

}
