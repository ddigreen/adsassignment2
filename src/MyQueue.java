public class MyQueue<T> {
    private MyLinkedList<T> list;

    public MyQueue() {
        list = new MyLinkedList<>();
    }

    public void enqueue(T element) {
        list.add(element);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return list.remove(0);
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return list.get(0);
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
