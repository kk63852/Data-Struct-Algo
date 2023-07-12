package LinkedList;
public class SingleLinkedList {
public Node head;
public Node tail;
public int size;

//creation of singleLinkedList: O(1)
public Node createSingleLinkedList(int nodeValue) {
	head = new Node();
	Node node = new Node();
	node.next=null;
	node.value=nodeValue;
	head=node;
	tail=node;
	size=1;
	return head;
}
//insertion in singleLinkedList: O(N)
public void insertLinkedList(int nodeValue, int location) {
	Node node= new Node();
	node.value=nodeValue;
	//checking if linkedlist exists or not, if not then create with above node
	if(head==null) {
		createSingleLinkedList(nodeValue);
		return;
	}
	//inserting at beginning of the linkedlist
	else if (location == 0) {
		node.next=head;//this will reference to the first node
		head=node;//head will reference to new node now
	}
	//inserting at the end since the location parameter is greater than size of the list
	else if (location >=size) {
		node.next=null;//since last node reference is always null in sLL 
		tail.next =node;//new node is now referenced at the end 
		tail =node;//tail has now reference to last node
	}
	//inserting at any given location
	else {
		Node tempNode = head;
		int index = 0;
		while(index < location -1) {
			tempNode =tempNode.next;
			index++;
			//at the end of this tempNode will refer to the after which node has to be inserted
		}
		Node nextNode = tempNode.next;
		tempNode.next=node;
		node.next=nextNode;
	}
	size++;//after inserting, we need to increase size of sLL by 1
}

//SingleLinkedList Traversal: O(N)
public void traverseSingleLinkedList() {
	if (head == null)
		System.out.println("List does not exist");
	else {
		Node tempNode = head;
		for(int i=0;i<size;i++) {
			System.out.print(tempNode.value);
			if(i!=size-1) {
				System.out.print(" --> ");
			}
			tempNode=tempNode.next;
		}
	}
	System.out.println();
}
//searching for a node: O(N)
public boolean searchNode(int nodeValue) {
	if(head!=null) {
		Node tempNode=head;
		for(int i=0;i<size;i++) {
			if(tempNode.value==nodeValue) {
				System.out.print("Found at location :" + i);
				return true;
			}
			tempNode=tempNode.next;
		}
	}
	System.out.print("Not Found");
	return false;
}

//deletion of node: O(N)
public void deletionOfNode(int location) {
	if(head == null) {
		System.out.print("SLL does not exist");
	}else if(location ==0) {
		head=head.next;
		size--;
		//if only one node exists in sLL then setting tail to null
		if(size ==0) {
			tail=null;	
		}
	}else if(location >=size) {
		Node tempNode=head;
		for(int i= 0; i< size -1;i++) {
			tempNode=tempNode.next;
		}
		if(tempNode == head) {
			tail=head=null;
			size--;
			return;
		}
		tempNode.next =null;
		tail =tempNode;
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

//deleting entire SLL: O(1)
public void deleteSingleLinkedList() {
	head=null;
	tail=null;
	System.out.println("SLL deleted sucessfully");
}

}
