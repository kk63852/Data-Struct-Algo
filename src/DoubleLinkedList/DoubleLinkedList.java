package DoubleLinkedList;

public class DoubleLinkedList {
	public DoublyNode head;
	public DoublyNode tail;
	public int size;

	// creation of DoublyLinkedList: O(1)
	public DoublyNode createDoublyLinkedList(int nodeValue) {
		head = new DoublyNode();
		DoublyNode newNode = new DoublyNode();
		newNode.value = nodeValue;
		newNode.next = null;
		newNode.previous = null;
		head = newNode;
		tail = newNode;
		size = 1;
		return head;
	}

	// insert method: O(N)
	public void insertDLL(int nodeValue, int location) {
		DoublyNode newNode = new DoublyNode();
		newNode.value = nodeValue;
		if (head == null) {
			createDoublyLinkedList(nodeValue);
			return;// to stop the method here because no need to continue as doublyLinkedList does
					// not exist
		} else if (location == 0) {
			newNode.next = head;// pointing to first node as in head we have the first node
			newNode.previous = null;// since in DLL first node prev ref should be null
			head.previous = newNode;// setting current Node prev ref to new node
			head = newNode;
		} else if (location >= size) {
			newNode.next = null;// since last node next ref is always null
			tail.next = newNode;// since current node should point to last node
			newNode.previous = tail;// setting last node prev ref to current node
			tail = newNode;// now setting tail ref to last node
		} else {
			DoublyNode tempNode = head;
			int index = 0;
			while (index < location - 1) {
				tempNode = tempNode.next;
				index++;
			}
			newNode.previous = tempNode;// setting newNode prev ref to current node
			newNode.next = tempNode.next;// setting newNode next ref to next node of current node
			tempNode.next = newNode;// current node next ref is the newNode
			newNode.next.previous = newNode;// next node after current node prev ref is set to new node
		}
		size++;
	}

	// traversal method: O(N)
	public void traverseDLL() {
		if (head != null) {
			DoublyNode node = head;
			for (int i = 0; i < size; i++) {
				System.out.print(node.value);
				if (i != size - 1) {
					System.out.print("--> ");
				}
				node = node.next;
			}
		} else {
			System.out.print("DLL does not exist");
		}
		System.out.println("\n");
	}

	// reverse traversal method: O(N)
	public void reverseTraverseDLL() {
		if (head != null) {
			DoublyNode node = tail;
			for (int i = 0; i < size; i++) {
				System.out.print(node.value);
				if (i != size - 1) {
					System.out.print("<-- ");
				}
				node = node.previous;
			}
		} else {
			System.out.print("DLL does not exist");
		}
		System.out.println("\n");
	}

	//search method: O(N)
	public boolean searchValueInDLL(int nodeValue) {
		if(head!=null) {
			DoublyNode tempNode=head;
			for(int i=0;i<size;i++) {
				if(tempNode.value==nodeValue) {
					System.out.println("Value Found at : "+i);
					return true;
				}
				tempNode=tempNode.next;
			}
		}
		System.out.println("Value not found");
		return false;
	}
	
	//deletion method: O(N)
	public void deleteNodeDLL(int location) {
		if(head==null) {
			System.out.println("DLL does not exist");
		}else if(location==0) {
			if (size==1) {
				head=null;
				tail=null;
				size--;
				return;//since size was only 1 hence returning from the method as dll does not exist now
			}else {
				head=head.next;
				head.previous=null;
				size--;
			}
		}else if(location>=size) {
			DoublyNode tempNode=tail.previous;
			if(size==1) {
				head=null;
				tail=null;
				size--;
				return;//since size was only 1 hence returning from the method as dll does not exist now
			}
			tempNode.next=null;
			tail=tempNode;
			size--;
		}else {
			DoublyNode tempNode=head;
			for(int i=0;i<location-1;i++) {
				tempNode=tempNode.next;
			}
			tempNode.next=tempNode.next.next;
			tempNode.next.previous=tempNode;
			size--;
		}
	}
	
	//delete entire DLL: O(N)
	/*for a node to be eligible for garbage collection it should not be referenced by any node
	 * so all the nodes previous reference should be set null to be eligible for garbage collection.
	 */
	public void deletingDLL() {
		DoublyNode tempNode=head;
		for(int i=0;i<size;i++) {
			tempNode.previous=null;
			tempNode=tempNode.next;
		}
		head=null;
		tail=null;
		System.out.println("DLL has been deleted");
	}
}
