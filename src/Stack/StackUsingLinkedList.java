package Stack;

import LinkedList.SingleLinkedList;

public class StackUsingLinkedList {
	SingleLinkedList ll;
	
	public StackUsingLinkedList() {
		ll=new SingleLinkedList();
	}
	
	//push method:O(1) since adding an element in the beginning of linked list is O(1) time complexity
	public void push(int value) {
		ll.insertLinkedList(value, 0);
		System.out.println("Inserted: "+value);
	}
	
	//is empty method:O(1)
	public boolean isEmpty() {
		if(ll.head==null) {
			System.out.print("Stack is empty");
			return true;
		}else
			return false;
	}
	
	//pop method:O(1)
	public int pop() {
		int result=-1;
		if(isEmpty()) {
			System.out.print("Stack is empty");
		}else {
			result=ll.head.value;
			ll.deletionOfNode(0);
		}
		return result;
	}
	
	//peek method:O(1)
	public int peek() {
		if(isEmpty()) {
			System.out.print("Stack is empty");
			return -1;
		}else {
			return ll.head.value;
		}
	}
	
	//delete method:O(1)
	public void deleteStack() {
		ll.head=null;
		System.out.println("Stack is deleted");
	}
}
