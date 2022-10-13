public class LinkedStack <E> implements Stack<E>{

    private class Node{
        E data;
        Node next;
    }

    private Node top;
    private int size;

    @Override
    public void push(E element) {
        Node oldTop = top;
        top = new Node();
        top.data = element;
        top.next = oldTop;
        size++;
    }

    @Override
    public E pop() {
        E e = top.data;
        top = top.next;
        size--;

        return e;
    }

    @Override
    public E peek() {
        return top.data;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public int size() {
        return size;
    }
}
