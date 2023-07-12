package Stack;

public class Stack {
	int[] arr;
	int topOfStack;
	
	//creation of stack using array
	public Stack(int size) {
		this.arr = new int[size];
		this.topOfStack = -1;
		System.out.println("created : " + size);
	}
	
	//is empty method:O(1)
	public boolean isEmpty() {
		if(topOfStack==-1) {
			return true;
		}else {
			return false;
		}
	}

	//is full method:O(1)
	public boolean isFull() {
		if(topOfStack==arr.length-1) {
			System.out.println("Stack is full");
			return true;
		}else {
			return false;
		}
	}
	
	//push method:O(1)
	public void push(int value) {
		if(isFull()) {
			System.out.println("Stack full");
		}else {
			arr[topOfStack+1]=value;
			topOfStack++;
			System.out.println("Value pushed: "+value);
		}
	}
	
	//pop method:O(1)
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}else {
			int topStack=arr[topOfStack];
			topOfStack--;
			return topStack;
		}
	}
	
	//peek method:O(1)
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}else {
			return arr[topOfStack];
		}
	}
	
	//delete stack method:O(1)
	public void deletStack() {
		topOfStack=-1;
		System.out.println("Stack is deleted");
	}
}
