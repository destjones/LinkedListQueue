package queue;

//A linked list node to store a queue entry
class Node {
	int number; // integer data
	Node next; // pointer to next node

	// constructor to create a new linked list node
	public Node(int number) { // set the numbers in the node and return them
		this.number = number;
		this.next = null;
	}
}


//A linked list is an easy way to implement a queue. Two main positions: Front and Rear.
//Two main operations Enqueue and Dequeue. Enqueue will add node to the rear of the list
//Dequeue will remove the node at the front of the list.