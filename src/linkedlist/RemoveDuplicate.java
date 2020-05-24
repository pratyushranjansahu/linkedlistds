package linkedlist;

import java.util.HashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {

		LinkedListNode first = new LinkedListNode(1, null, null);
		LinkedListNode head = first;
		LinkedListNode second = first;
		for (int i = 1; i < 8; i++) {
			second = new LinkedListNode(i + 2, null, null);
			first.setNext(second);
			second.setPrevious(first);
			first = second;
		}
		// adding duplicate

		LinkedListNode newNode = new LinkedListNode(8, null, null);
		second.next = newNode;
		newNode.setPrevious(second);

		System.out.println("Before Removing Duplicate");
		System.out.println(head.printForward());

		removeDuplicate(head);

		System.out.println("After Removing Duplicate");
		System.out.println(head.printForward());
	}

	private static void removeDuplicate(LinkedListNode head) {
		HashSet<Integer> set = new HashSet<>();
		LinkedListNode previous = null;
		while (head != null) {
			if (set.contains(head.data)) {
				previous.next = head.next;
			} else {
				set.add(head.data);
				previous = head;
			}
			head = head.next;
		}
	}

}
