package DoubleLinkedList;

public class CircularlyDoublyLinkedList {
	public DoublyNode head;
	public DoublyNode tail;
	public int size;
	
	//Creation of Circular Double Linked List: O(1)
	public DoublyNode createCDLL(int nodeValue) {
		head=new DoublyNode();
		DoublyNode node=new DoublyNode();
		node.value=nodeValue;
		head=node;
		tail=node;
		node.next=node;
		node.previous=node;
		size=1;
		return head;
	}
	
	//insert method: O(N)
	public void insertCDLL(int nodeValue,int location) {
		DoublyNode newNode=new DoublyNode();
		newNode.value=nodeValue;
		if(head==null) {
			createCDLL(nodeValue);
			return;
		}else if(location==0) {
			newNode.next=head;//setting new node next ref to 1st node
			newNode.previous=tail;//setting new node previous ref to last node
			head.previous=newNode;//setting new node and 1st node ref
			tail.next=newNode;//setting last node ref to new node
			head=newNode;
		}else if(location>=size) {
			newNode.next=head;//since in CDLL last node always points to 1st node
			newNode.previous=tail;//making last node 2nd last by setting new node previous ref to tail as tail has last node ref
			head.previous=newNode;//setting backward ref of 1st node to last node as in CDLL 1st node previous ref is always last node
			tail.next=newNode;//last node now points to new node
			tail=newNode;//since tail always points to last node
		}else {
			DoublyNode tempNode=head;
			int index=0;
			while(index<location-1) {
				tempNode=tempNode.next;
				index++;
			}
			newNode.previous=tempNode;
			newNode.next=tempNode.next;
			tempNode.next=newNode;
			newNode.next.previous=newNode;
		}
		size++;
	}
	
	//traversal method: O(N)
	public void traverseCDLL() {
		if(head!=null) {
			DoublyNode tempNode=head;
			for(int i=0;i<size;i++) {
				System.out.print(tempNode.value);
				if(i!=size-1) {
					System.out.print(" --> ");
				}
				tempNode=tempNode.next;
			}
		}else {
			System.out.println("CDLL does not exist");
		}
		System.out.println("");
	}
	
	//reverse traversal method: O(N)
		public void reverseTraverseCDLL() {
			if(head!=null) {
				DoublyNode tempNode=tail;
				for(int i=0;i<size;i++) {
					System.out.print(tempNode.value);
					if(i!=size-1) {
						System.out.print(" <-- ");
					}
					tempNode=tempNode.previous;
				}
			}else {
				System.out.println("CDLL does not exist");
			}
			System.out.println("");
		}
		
		//search method: O(N)
		public boolean searchCDLL(int nodeValue) {
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
		
		//deleting a node in CDLL: O(N)
		public void deletingNodeCDLL(int location) {
			if(head==null) {
				System.out.println("CDLL does not exist");
			}else if(location==0) {
				if(size==1) {
					head.next=null;
					head.previous=null;
					head=null;
					tail=null;
					size--;
					return;
				}else {
					head=head.next;
					head.previous=tail;
					tail.next=head;
					size--;
				}
			}else if(location>=size) {
				if(size==1) {
					head.next=null;
					head.previous=null;
					head=null;
					tail=null;
					size--;
					return;
				}else {
					tail=tail.previous;
					tail.next=head;
					head.previous=tail;
					size--;
				}
			}else {
				DoublyNode tempNode=head;
				int index=0;
				while(index<location-1) {
					tempNode=tempNode.next;
					index++;
				}
				tempNode.next=tempNode.next.next;
				tempNode.next.previous=tempNode;
				size--;
			}
		}
		
		//deleting entire CDLL: O(N)
		public void deleteCDLL() {
			DoublyNode node=head;
			for(int i=0;i<size;i++) {
				node.previous=null;
				node=node.next;
			}
			head=null;
			tail=null;
			System.out.println("CDLL has been deleted");
	}
		
}
