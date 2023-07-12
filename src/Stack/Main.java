package Stack;

public class Main {
	public static void main(String args[]) {
//		Stack st = new Stack(4);
//		
//		st.push(1);
//		st.push(2);
//		st.push(5);
//		st.push(7);
//		st.push(7);
//		int res=st.peek();
//		System.out.println(res);
//		st.deletStack();
//		st.pop();
//		st.push(9);
//		int r=st.pop();
//		System.out.println(r);
		
		StackUsingLinkedList sll=new StackUsingLinkedList();
		sll.push(2);
		sll.push(4);
		sll.push(7);
		System.out.println(sll.isEmpty());
		System.out.println(sll.pop());
		System.out.println(sll.peek());
		sll.deleteStack();
		System.out.println(sll.peek());
	}
}
