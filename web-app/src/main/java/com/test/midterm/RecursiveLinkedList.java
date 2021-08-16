package com.test.midterm;

public class RecursiveLinkedList {
	
	private static Node head;

	public static Node reverseUtil(Node curr, Node prev) {

		/* If last node mark it head */
		if (curr.next == null) {
			head = curr;
			/* Update next to prev node */
			curr.next = prev;
			return head;
		}

		/* Save curr->next node for recursive call */
		Node next = curr.next;

		/* and update next .. */
		curr.next = prev;

		reverseUtil(next, curr);
		return head;
	}

	public static void main(String[] args) {
		Node res = reverseUtil(head, null);
	}

}
