public class ArrayList<E> implements List<E>{

    E [] list;
    public int size;
    private final int DEFAULT_CAPACITY = 10;

    public ArrayList(){
        list = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }
    @Override
    public void insert(int index, E element) {
        // is index valid
        if(index < 0 || index > size){
            throw new ArrayIndexOutOfBoundsException();
        }

        for(int i = size; i > index; i--){
            list[i] = list[i-1];
        }

        list[index] = element;
        size++;

    }

    @Override
    public E remove(int index) {
        E elem = list[index];

        for(int i = index; i < size; i++){
            list[i] = list[i + 1];
        }
        list[size] = null;
        size--;
        return elem;
    }

    @Override
    public int size() {
        return size;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++){
            sb.append(", " + list[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
