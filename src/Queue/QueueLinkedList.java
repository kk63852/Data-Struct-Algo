package Queue;

import LinkedList.SingleLinkedList;

public class QueueLinkedList {
	SingleLinkedList list;

	public QueueLinkedList() {
		list = new SingleLinkedList();
		System.out.println("Queue is created using LinkedList");
	}

	public boolean isEmpty() {
		if (list.head == null) {
			return true;
		} else {
			return false;
		}
	}

	public void enqueue(int value) {
		list.insertLinkedList(value, list.size);
		System.out.println("Inserted: " + value);
	}

	public int dequeue() {
		int value = -1;
		if (isEmpty()) {
			System.out.println("Queue is empty");
		} else {
			value = list.head.value;
			list.deletionOfNode(0);
		}
		return value;
	}

	public int peek() {
		if (isEmpty()) {
			return -1;
		} else {
			return list.head.value;
		}
	}
	
	public void deleteQueue() {
		list.head=null;
		list.tail=null;
		System.out.println("Queue is deleted");
	}
}
