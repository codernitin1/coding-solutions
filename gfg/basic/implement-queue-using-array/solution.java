class myQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    // Constructor
    public myQueue(int n) {
        capacity = n;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Enqueue: Insert an element at the rear
    public void enqueue(int x) {
        if (isFull()) return;
        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
    }

    // Dequeue: Remove the element from the front
    public void dequeue() {
        if (isEmpty()) return;
        front = (front + 1) % capacity;
        size--;
    }

    // Get front element
    public int getFront() {
        if (isEmpty()) return -1;
        return arr[front];
    }

    // Get last element
    public int getRear() {
        if (isEmpty()) return -1;
        return arr[rear];
    }
}