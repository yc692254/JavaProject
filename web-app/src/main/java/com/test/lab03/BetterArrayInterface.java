package com.test.lab03;

/**
* 
* An interface for a BetterArray (improved Java array)
* 
* @author	Jacek Dzikowski
* @version	1.00.00
*/
 
public interface BetterArrayInterface {
	
	/**
	* Inserts the specified element at the specified position index in this BetterArray. Throws ArrayIndexOutOfBoundsException if the specified index is out of range (index < 0 || index >= size()).
	*
	* @param	index		new element index
	* @param	element		new element
	*/
	public void add(int index, int element) throws ArrayIndexOutOfBoundsException;

	/**
	* Appends the specified element to the end of this BetterArray.
	*
	* @param	element		new element
	*/
	public void add(int element);
	
	/**
	* Appends all of the elements in the provided otherArray to the end of this BetterArray, in the original order. Throws NullPointerException, if the specified otherArray reference is null.
	*
	* @param	otherArray	a reference to another array to be appended
	*/
	public void addAll(int [] otherArray) throws NullPointerException;


	/**
	* Inserts all of the elements in the provided otherArray into this BetterArray, starting at the specified position. Throws ArrayIndexOutOfBoundsException if the specified index is out of range (index < 0 || index >= size()). Throws NullPointerException if the specified otherArray is null. 
	*
	* @param	index		BetterArray index specifying where the otherArray elements should be inserted
	* @param	otherArray	a reference to another array to be inserted
	*/
	public void addAll(int index, int [] otherArray) throws ArrayIndexOutOfBoundsException, NullPointerException;

	/**
	* Returns true if this BetterArray contains the specified key. More formally, returns true if and only if this BetterArray contains at least one occurrence of key.
	*
	* @param	key			specified key to be found in BetterArray
	* @return	boolean		true if there is at least one occurrence of key in BetterArray, false otherwise
	*/
	public boolean contains(int key);
	
	/**
	* Returns the element at the specified position (index) in this BetterArray. Throws ArrayIndexOutOfBoundsException if the specified index is out of range (index < 0 || index >= size()).
	*
	* @param	index		BetterArray index of the element to be returned
	* @return	int			BetterArray element at position index
	*/
	public int get(int index) throws ArrayIndexOutOfBoundsException;
	
	/**
	* Returns the index in this BetterArray of the first occurrence of the specified key, or -1 if BetterArray does not contain this key.
	*
	* @param	key			specified key to be found in BetterArray
	* @return	int			index of the specified key in BetterArray or -1 if not found
	*/
	public int indexOf(int key);

	/**
	* Returns the index in this BetterArray of the last occurrence of the specified key, or -1 if BetterArray does not contain this key.
	*
	* @param	key			specified key to be found in BetterArray
	* @return	int			last index of the specified key in BetterArray or -1 if not found
	*/
	public int lastIndexOf(int key);
	
	/**
	* Removes the element at the specified position in this BetterArray. Throws ArrayIndexOutOfBoundsException if the index out is of range (index < 0 || index >= size()). BetterArray should "shrink" after this removal
	*
	* @param	index		BetterArray index of the element to be removed
	*/	
	public void remove(int index) throws ArrayIndexOutOfBoundsException;

	/**
	* Returns the number of elements in this BetterArray.
	*
	* @return	int			number elements in BetterArray
	*/
	public int size();
	
	/**
	* Lists/displays all elements in this BetterArray.
	*
	*/
	public void listAll();
}