public class LinkedStackOfStrings implements StackOfStrings{

    private Node top;
    private int size;

    public LinkedStackOfStrings(){
        top = null;
    }

    private class Node{
        String data;
        Node next;
    }
    @Override
    public void push(String s) {
        Node oldTop = top;
        top = new Node();
        top.data = s;
        top.next = oldTop;
        size++;
    }

    @Override
    public String pop() {
        String s = top.data;
        top = top.next;
        size--;

        return s;
    }

    @Override
    public String peek() {
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
