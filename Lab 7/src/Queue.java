
public class Queue {
	private int[] elements;
	private int size;

	Queue() {
		elements = new int[8];
	}

	/** Adds v into the queue */
	public void enqueue(int v) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		elements[size++] = v;
	}

	/** Removes and returs the element from the queue */
	public int dequeue() {
		int v = elements[0];
		int[] temp = new int[elements.length];
		System.arraycopy(elements, 1, temp, 0, size);
		elements = temp;
		size--;
		return v;
	}

	/** Return true if queue is empty */
	public boolean empty() {
		return size == 0;
	}

	public int getSize() {
		return size;
	}
}