
// Leetcode Problem:  https://leetcode.com/problems/design-circular-queue/description/

class Circular {
    private int[] data;
    private int head;
    private int tail;
    private int size;
    private int capacity;

    public Circular(int k) {
        this.capacity = k;
        this.data = new int[k];
        this.head = -1;
        this.tail = -1;
        this.size = 0;
    }

    public boolean enqueue(int value) {
        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            head = 0;
        }
        tail = (tail + 1) % capacity;
        data[tail] = value;
        size++;
        return true;
    }

    public boolean dequeue() {
        if (isEmpty()) {
            return false;
        }
        if (head == tail) {
            head = -1;
            tail = -1;
        } else {
            head = (head + 1) % capacity;
        }
        size--;
        return true;
    }

    public int front() {
        if (isEmpty()) {
            return -1;
        }
        return data[head];
    }

    public int rear() {
        if (isEmpty()) {
            return -1;
        }
        return data[tail];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}