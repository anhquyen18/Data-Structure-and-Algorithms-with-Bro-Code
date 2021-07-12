import java.util.*;
public class LinkedLists {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		/*
		linkedList.push("A");
		linkedList.push("B");
		linkedList.push("C");
		linkedList.push("D");
		linkedList.push("F");
		linkedList.pop();
		*/
		
		// LinkedList as a Queue
		linkedList.offer("A");
		linkedList.offer("B");
		linkedList.offer("C");
		linkedList.offer("D");
		linkedList.offer("F");
		//linkedList.poll();
		
		linkedList.add(4, "E");
		linkedList.remove(4);
		
		System.out.println(linkedList.peekFirst());
		System.out.println(linkedList.peekLast());
		linkedList.addFirst("0");
		linkedList.addLast("G");
		String first = linkedList.removeFirst();
		String last = linkedList.removeLast();
		
		System.out.println(first + last);
		
		System.out.println(linkedList);
		
		// LinkedList = stores Nodes in 2 parts (data + address)
		//				Nodes are in non-consecutive memory locations
		//				Elements are linked using pointers
		
		//						Singly Linked List
		//			Node				Node				Node
		//		[data | address]->	[data | address]->	[data | address]
		
		//						Doubly Linked List
		//				Node					Node
		//		[address | data | address]<->[address | data | address]
		
		// advantages
		// 1. Dynamic Data Structure (allocates needs memory while running)
		// 2. Insertion and Deletion of Nodes is easy. O(1)
		// 3. No/Low memory waste
		
		// uses?
		// 1. implement Stacks/Queues
		// 2. GPS navigation
		// 3. music playlist
	}

}
