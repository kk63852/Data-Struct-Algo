package Queue;

public class CircularQueue {
	int[] arr;
	int beginningOfQueue;
	int topOfQueue;
	int size;
	
	public CircularQueue(int size) {
		this.arr=new int[size];
		this.size=size;
		this.beginningOfQueue=-1;
		this.topOfQueue=-1;
		System.out.println("Circular queue created with size of : "+size);
	}
	
	public boolean isEmpty() {
		if(topOfQueue==-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isFull() {
		/*this condition denotes that a circle is completed and the queue is full
		as all the cell are filled and topOfQueue is behind beginningOfQueue*/
		if(topOfQueue+1==beginningOfQueue) {
			return true;
		}
		//the condition states that all cells from 0 to length of array is filled 
		else if(beginningOfQueue==0 && topOfQueue+1==size) {
			return true;
		}else {
			return false;
		}
	}
	
	public void enqueue(int value) {
		if(isFull()) {
			System.out.println("Queue is full");
		}else if(isEmpty()) {
			beginningOfQueue=0;
			topOfQueue++;
			arr[topOfQueue]=value;
			System.out.println("Inserted: "+value);
		}else {
			if(topOfQueue+1==size) {
				topOfQueue=0;
			}else {
				topOfQueue++;
			}
			arr[topOfQueue]=value;
			System.out.println("Inserted: "+value);
		}
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}else {
			int result=arr[beginningOfQueue];
			arr[beginningOfQueue]=0;//stating that the cell is free now
			//now if only one element was present topOfQueue and beginningOfQueue then circular queue is empty after dequeuing
			if(beginningOfQueue==topOfQueue) {
				beginningOfQueue=topOfQueue=-1;
			}
			//checking if beginningOfQueue has reached the length of array or not
			else if(beginningOfQueue+1==size) {
				beginningOfQueue=0;
			}else {
				beginningOfQueue++;
			}
			return result;
		}
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}else {
			return arr[beginningOfQueue];
		}
	}
}
