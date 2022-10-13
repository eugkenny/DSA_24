public class ArrayStack <E> implements Stack<E>{

    E [] stack;
    int top;

    public ArrayStack(){
        stack = (E[]) new Object[4];
        top = 0;
    }
    @Override
    public void push(E element) {
        if (top == stack.length){
            resize(stack.length * 2);
        }
        stack[top] = element;
        top++;
    }

    @Override
    public E pop() {
        top--;
        return stack[top];
    }

    @Override
    public E peek() {
        return stack[top - 1];
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public int size() {
        return top;
    }

    private void resize(int newCapacity){
        E [] newStack = (E[]) new Object[newCapacity];

        for(int i = 0; i < stack.length; i++){
            newStack[i] = stack[i];
        }

        stack = newStack;
    }
}
