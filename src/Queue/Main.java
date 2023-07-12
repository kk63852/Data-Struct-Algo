package Queue;

public class Main {
	public static void main(String args[]) {
//		QueueArray newQueue=new QueueArray(5);
//		newQueue.enqueue(2);
//		newQueue.enqueue(4);
//		newQueue.enqueue(8);
//		System.out.println(newQueue.peek());
//		
//		CircularQueue cq=new CircularQueue(3);
//		System.out.println(cq.isFull());
//		cq.enqueue(1);
//		cq.enqueue(2);
//		cq.enqueue(3);
//		System.out.println(cq.peek());
		
		QueueLinkedList qll=new QueueLinkedList();
		System.out.println(qll.isEmpty());
		qll.enqueue(9);
		qll.enqueue(3);
		qll.enqueue(6);
		qll.enqueue(8);
		System.out.println(qll.dequeue());
		System.out.println(qll.peek());
		qll.deleteQueue();
	}
}
