package queue;

//A class to represent a queue
//The queue, front stores the front node of linked list and rear stores the
//last node of linked list
class Queue {
	Node front, rear;

	public Queue() {
		this.front = this.rear = null;
	}

	// Method to add a number to the queue. aka Enqueue
	void enqueue(int number) {

		// Create a new node
		Node temp = new Node(number);

		/// If queue is empty, then new node is front and rear both
		if (this.rear == null) {
			this.front = this.rear = temp;
			return;
		}

		// Add the new node at the end of queue and change rear
		this.rear.next = temp;
		this.rear = temp;
	}

	// Method to remove a number from queue. aka Dequeue
	void dequeue() {
		/// If queue is empty, return null
		if (this.front == null)
			return;

		// Store previous front and move front one node ahead
		Node temp = this.front;
		this.front = this.front.next;

		// If the list is empty
		if (this.front == null)
			this.rear = null;
	}
}
