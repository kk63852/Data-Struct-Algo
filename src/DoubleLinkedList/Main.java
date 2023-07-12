package DoubleLinkedList;

public class Main {

	public static void main(String args[]) {
		DoubleLinkedList dll=new DoubleLinkedList();
		dll.createDoublyLinkedList(4);
		System.out.println(dll.head.value);
		dll.insertDLL(2, 1);
		dll.insertDLL(3, 2);
		dll.insertDLL(4, 3);
		dll.insertDLL(5, 4);
		dll.traverseDLL();
//		dll.reverseTraverseDLL();
		dll.searchValueInDLL(5);
		dll.deleteNodeDLL(2);
		dll.traverseDLL();
		dll.deletingDLL();
		dll.traverseDLL();
		CircularlyDoublyLinkedList cdll= new CircularlyDoublyLinkedList();
		cdll.createCDLL(7);
		System.out.println("CDLL: "+cdll.head.value);
		cdll.insertCDLL(1, 1);
		cdll.insertCDLL(3, 2);
		cdll.insertCDLL(8, 3);
		cdll.insertCDLL(5, 4);
		cdll.traverseCDLL();
		cdll.insertCDLL(9, 2);
		cdll.traverseCDLL();
		cdll.reverseTraverseCDLL();
		cdll.searchCDLL(0);
		cdll.deletingNodeCDLL(0);
		cdll.traverseCDLL();
		cdll.deleteCDLL();cdll.traverseCDLL();
		
	}
}
