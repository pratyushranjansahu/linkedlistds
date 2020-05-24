package linkedlist;

public class LastNodeFromTheEnd {

	public static void main(String[] args) {
		LinkedListNode first = new LinkedListNode(1, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);

		LinkedListNode head = first;
		LinkedListNode second = first;
		for (int i = 1; i < 8; i++) {
			second = new LinkedListNode(i + 2, null, null);
			first.setNext(second);
			second.setPrevious(first);
			first = second;
		}
		System.out.println(head.printForward());
		lastNodeFromTheEnd(head,3);

	}
	
	private static void lastNodeFromTheEnd(LinkedListNode head,int n){
		LinkedListNode slow=head;
		LinkedListNode fast=head;
		int counter=1;
		while (counter <= n-1) {			
			fast=fast.next;
			counter++;	
		}
		while(fast.next!=null){
			fast=fast.next;
			slow=slow.next;
		}
		System.out.println(slow.data);
	}

}
