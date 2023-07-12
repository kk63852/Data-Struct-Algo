package LinkedList;

import java.util.HashSet;

public class Questions {
	public void deleteDuplicate(SingleLinkedList ll) {
		HashSet<Integer> hs=new HashSet();
		Node current =ll.head;
		Node prev=null;
		while(current!=null) {
			int currentValue=current.value;
			if(hs.contains(currentValue)) {
				prev.next=current.next;
				ll.size--;
			}else {
				hs.add(currentValue);
				prev=current;
			}
			current=current.next;
		}
	}
	
	//my solution
	public void returnNthFromLast(SingleLinkedList ll,int location) {
		Node tempNode=ll.head;
		int nodeLocationFromFirst=ll.size-location;
		int index=0;
		while(index<nodeLocationFromFirst) {
			tempNode=tempNode.next;
			index++;
		}
		System.out.println(tempNode.value);
	}
	
	//solution with 2 pointers
	public Node nthFromLast(SingleLinkedList ll,int n) {
		Node n1=ll.head;
		Node n2=ll.head;
		for(int i=0;i<n;i++) {
			if(n2==null)return null;
			n2=n2.next;
		}
		while(n2!=null) {
			n1=n1.next;
			n2=n2.next;
		}
		return n1;
	}

}
