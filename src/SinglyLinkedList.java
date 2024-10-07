import java.util.Iterator;
import java.util.NoSuchElementException;

public class SinglyLinkedList <E> implements List<E>{

    private Node<E> first;
    private int size;

    public SinglyLinkedList(){
        first = null;
        size = 0;
    }

    @Override
    public void insert(int index, E element) {
        if(index < 0 || index > size){
            throw new ArrayIndexOutOfBoundsException();
        }

        if (size == 0){
            first = new Node<>(element, null);
        }
        else {
            Node<E> current = first;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            current.next = new Node<>(element, current.next);;
        }

        size++;
    }

    @Override
    public E remove(int index) {
        if(index < 0 || index > size){
            throw new ArrayIndexOutOfBoundsException();
        }

        Node<E> current = first;
        for (int i = 0; i < index - 1; i++){
            current = current.next;
        }

        E oldValue = current.next.element;

        current.next = current.next.next;
        size--;

        return oldValue;
    }

    @Override
    public int size() {
        return size;
    }

    public String toString(){
        Iterator<E> it = iterator();

        if (!it.hasNext()){
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[" + it.next());
        while (it.hasNext()){
            sb.append(", " + it.next());
        }
        sb.append("]");

        return sb.toString();
    }

    //@Override
    public Iterator<E> iterator() {
        return new ListIterator();
    }

    private static class Node<E>{
        E element;
        Node<E> next;

        Node(E element, Node<E> next){
            this.element = element;
            this.next = next;
        }
    }

    private class ListIterator implements Iterator<E> {

        private Node<E> current;

        public ListIterator() {
            current = first;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if (!hasNext()) throw new NoSuchElementException();

            E element = current.element;
            current = current.next;

            return element;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
