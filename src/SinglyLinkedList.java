public class SinglyLinkedList <E> implements List<E>{

    private Node<E> first;
    private int size;

    public SinglyLinkedList(){
        first = null;
        size = 0;
    }

    @Override
    public void insert(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    private static class Node<E>{
        E element;
        Node<E> next;

        Node(E element, Node<E> next){
            this.element = element;
            this.next = next;
        }
    }
}
