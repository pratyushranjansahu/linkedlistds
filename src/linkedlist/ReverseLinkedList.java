package linkedlist;

public class ReverseLinkedList {

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
		System.out.println("Before Reversing");
		System.out.println(head.printForward());
		System.out.println("After Reversing");
		LinkedListNode reverseHead = reverseList(head);
		System.out.println(reverseHead.printForward());

	}

	private static LinkedListNode reverseList(LinkedListNode head) {
		LinkedListNode previous = null;
		LinkedListNode next = null;
		LinkedListNode current = head;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}

		return previous;
	}

}
