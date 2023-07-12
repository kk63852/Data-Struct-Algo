package LinkedList;

public class CircularSinglyLinkedList {
	public Node head;
	public Node tail;
	public int size;
	
	
	//creation of circular singly linked list: O(1)
	public Node createCircularSinglyLinkedList(int nodeValue) {
		head=new Node();
		Node node= new Node();
		node.value=nodeValue;
		node.next=node;
		head =node;
		tail =node;
		size =1;
		return head;
	}
	
	//insertion of a node CSLL: O(1)
	public void insertionCircularSinlgyLinkedList(int nodeValue,int location) {
		Node node=new Node();
		node.value=nodeValue;
		if(head==null) {
			createCircularSinglyLinkedList(nodeValue);
			return;
		}else if(location==0) {
			node.next=head;
			head=node;
			tail.next=head;
		}else if(location >=size) {
			tail.next=node;
			tail=node;
			tail.next=head;
		}else {
			Node tempNode=head;
			int index=0;
			while(index<location-1) {
				tempNode=tempNode.next;
				index++;
			}
			node.next=tempNode.next;
			tempNode.next=node;
		}
		size++;
	}
	
	//traversal of CSLL: O(N)
	public void traversalCSLL() {
		if(head !=null) {
			Node tempNode=head;
			int index =0;
			while(index<size) {
				System.out.println(tempNode.value);
				tempNode=tempNode.next;
				index++;
			}
		}else
			System.out.println("CSLL does not exist");
	}
	
	//searching a node in CSLL: O(N)
	public boolean searchCSLL(int nodeValue) {
		if(head!=null) {
			Node tempNode=head;
			for(int i=0;i<size;i++) {
				if(tempNode.value==nodeValue) {
					System.out.println("Value found at: "+i);
					return true;
				}else
				tempNode=tempNode.next;
			}
		}
		System.out.println("Value not found");
		return false;
	}
	
	//deleting a node: O(N)
	public void deleteNodeFromCSLL(int location) {
		if(head==null) {
			System.out.println("CSLL does not exist");
		}else if(location ==0) {
			head=head.next;
			tail.next=head;
			size--;
			//if only node was present in CSLL then set the parameters as below
			if(size==0) {
				head=null;
				head.next=null;
				tail=null;
			}
		}else if(location >= size) {
			 Node tempNode=head;
			 for(int i=0;i<size-1;i++) {
				 tempNode=tempNode.next;
			 }
			//if only node was present in CSLL then set the parameters as below
			 if(tempNode==head)//this means only one node was present
			 {
				 head.next=null;
				 head=tail=null;
				 size--;
			 }
			 //otherwise if more than one node were present
			 tempNode.next=head;
			 tail=tempNode;
			 size--;
		}else {
			Node tempNode=head;
			for(int i=0;i<location-1;i++) {
				tempNode=tempNode.next;
			}
			tempNode.next=tempNode.next.next;
			size--;
		}
	}
	
	//delete CSLL: O(1)
	public void deleteCSLL() {
		if (head==null) {
			System.out.println("CSLL does not exist");
		}else {
			head=null;
			tail.next=null;
			tail=null;
			System.out.println("CSLL deleted");
		}
	}
}
