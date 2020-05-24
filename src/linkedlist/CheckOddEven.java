package linkedlist;

public class CheckOddEven {

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
		System.out.println(head.printForward());
		checkOddEven(head);

	}

	private static void checkOddEven(LinkedListNode head) {
		LinkedListNode current = head;
		while (true) {
			if (current == null) {
				System.out.println("Even");
				break;
			}
			if (current.next == null) {
				System.out.println("Odd");
				break;
			}
			current = current.next.next;
		}
	}

}
