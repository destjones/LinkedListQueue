package queue;

public class Test {
	// Creating the queue, this is my test drive
	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.dequeue();
		q.enqueue(30);
		q.dequeue();
		q.enqueue(40);
		q.enqueue(50);
		q.dequeue();
		q.dequeue();
		q.dequeue();
		System.out.println("Queue Front : " + q.front.number);
		System.out.println("Queue Rear : " + q.rear.number);
	}
}
//   40 50