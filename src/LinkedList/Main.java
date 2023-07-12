package LinkedList;

import java.util.LinkedList;

class Main {
	public static void main(String args[]) {
		SingleLinkedList sLL= new SingleLinkedList();
		sLL.createSingleLinkedList(5);
		//System.out.println(sLL.head.value);
		sLL.insertLinkedList(6, 0);
		//System.out.println(sLL.head.next.value);
		sLL.insertLinkedList(7, 5);
		sLL.insertLinkedList(2, 4);
		sLL.insertLinkedList(1, 3);
		sLL.insertLinkedList(1, 3);
		sLL.insertLinkedList(1, 3);
		sLL.insertLinkedList(3, 3);
		sLL.insertLinkedList(6, 3);
		//System.out.println(sLL.head.next.next.value);
//		sLL.traverseSingleLinkedList();
//		sLL.searchNode(9);
//		sLL.deletionOfNode(0);
//		sLL.traverseSingleLinkedList();
//		sLL.deleteSingleLinkedList();
		sLL.traverseSingleLinkedList();
		
		CircularSinglyLinkedList cSLL= new CircularSinglyLinkedList();
		cSLL.createCircularSinglyLinkedList(5);
		cSLL.insertionCircularSinlgyLinkedList(3, 0);
		cSLL.insertionCircularSinlgyLinkedList(6, 1);
//		System.out.println(cSLL.head.value);
//		System.out.println(cSLL.head.next.value);
//		cSLL.traversalCSLL();
//		cSLL.searchCSLL(90);
//		cSLL.deleteNodeFromCSLL(0);
//		cSLL.traversalCSLL();
//		cSLL.deleteNodeFromCSLL(1);
//		cSLL.traversalCSLL();
//		cSLL.deleteNodeFromCSLL(2);
//		cSLL.traversalCSLL();
//		cSLL.deleteCSLL();
		
		Questions q=new Questions();
//		q.deleteDuplicate(sLL);
		sLL.traverseSingleLinkedList();
		q.returnNthFromLast(sLL, 2);
		Node n=q.nthFromLast(sLL, 2);
		System.out.println(n.value);
		
		
		
	}

}
