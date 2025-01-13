package Practice;
import java.util.*;
import java.util.Deque;
import java.util.Queue;
public class Program8 {
	public static void main(String[] args) {
		Deque q1=new LinkedList();
		//Queue q1=new LinkedList();
		q1.add(10);
		q1.add(20);
		q1.add(10);
		q1.add(28);
		q1.add(20);
		q1.add("abc");
		System.out.println(q1.element());
		System.out.println(q1.peek());
		System.out.println(q1.poll());
		System.out.println(q1);
		System.out.println(q1.offer(q1));
}

}


