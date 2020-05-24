package linkedlist;

public class DeleteNode {

	public static void main(String[] args) {

		LinkedListNode head = randomLinkedList(10, 0, 10);

		System.out.println("Before Deleting");
		System.out.println(head.printForward());
		deleteNode(head.next.next.next);
		System.out.println("After Deleting");
		System.out.println(head.printForward());

	}

	private static LinkedListNode randomLinkedList(int N, int min, int max) {
		LinkedListNode root = new LinkedListNode(randomIntInRange(min, max), null, null);
		LinkedListNode prev = root;
		for (int i = 1; i < N; i++) {
			int data = randomIntInRange(min, max);
			LinkedListNode next = new LinkedListNode(data, null, null);
			prev.setNext(next);
			prev = next;
		}
		return root;
	}

	private static int randomIntInRange(int min, int max) {
		return randomInt(max + 1 - min) + min;
	}

	private static int randomInt(int n) {
		return (int) (Math.random() * n);
	}

	private static boolean deleteNode(LinkedListNode node) {
		if (node == null || node.next == null) {
			return false;
		}
		LinkedListNode next = node.next;
		node.data = next.data;
		node.next = next.next;
		return true;

	}
}
