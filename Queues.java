import java.util.*;
public class Queues {

	public static void main(String[] args) {
		// Queue
		// FIFO = first in first out
		
		
		Queue<String> queue = new LinkedList<String>();
		
//		System.out.println(queue.isEmpty());

		queue.offer("Karen");
		queue.offer("Chad");
		queue.offer("Steve");
		queue.offer("Harold");
		
		System.out.println(queue.contains("Steve"));
//		System.out.println(queue.size());
//		System.out.println(queue.peek());
//		queue.poll();
//		queue.poll();
		
		System.out.println(queue);
		
		// Where are queues useful?
		// 1. Keyboard buffer (letters should appear on the screen in the order they're pressed)
		// 2. Printer Queue (Print jobs should be completed in order)
		// 3. Used in LinkedLists, PriorityQueues, Breadth-first search
	}

}
